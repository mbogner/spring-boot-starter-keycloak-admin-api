package dev.mbo.keycloak.admin.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.mbo.keycloak.admin.api.client.ApiClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.AuthorizedClientServiceReactiveOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Configuration that adds Keycloak Admin API classes to the classpath. It also created beans for calling it
 * (WebClient + ApiClient). For adding this configuration to your Spring Boot application {@link EnableKeycloakAdmin}.
 *
 * @author mbo
 */
@Configuration
@ComponentScan(basePackageClasses = KeycloakAdminApiAutoConfig.class)
public class KeycloakAdminApiAutoConfig {

    /**
     * Uses Spring Security mechanism to configure a web client to use OAuth2 authentication via configured server
     * and credentials. There can be multiple configs under <b>registration</b> and <b>provider</b>. The value below is
     * the name of the config used in this method - so "keycloak". Skipped in case you define it yourself.<br/>
     * <br/>
     * example configuration:<br/>
     * <code>@formatter:off
     * spring:
     *   security:
     *     oauth2:
     *       client:
     *         registration:
     *           keycloak:
     *             client-id: shop-admin
     *             client-secret: mkPyoHoLgU9IYYGkK9rOlS4OihCWMHqC
     *             authorization-grant-type: client_credentials
     *         provider:
     *           keycloak:
     *             token-uri: ${dev.mbo.keycloak.basePath}/realms/WhitelabelShopBackend/protocol/openid-connect/token
     * </code>@formatter:on
     *
     * @param objectMapper            Also use the Spring configured JSON mapper.
     * @param clientRegistrations     Required for OAuth2. Repository for configured clients.
     * @param authorizedClientService Required for OAuth2. Client management.
     * @return WebClient for configured client with name "keycloak".
     */
    @Bean
    @Qualifier("keycloak")
    @ConditionalOnMissingBean
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    protected WebClient webClient(
            final ObjectMapper objectMapper,
            final ReactiveClientRegistrationRepository clientRegistrations,
            final ReactiveOAuth2AuthorizedClientService authorizedClientService) {

        final var oauth = new ServerOAuth2AuthorizedClientExchangeFilterFunction(
                new AuthorizedClientServiceReactiveOAuth2AuthorizedClientManager(
                        clientRegistrations, authorizedClientService
                )
        );
        oauth.setDefaultClientRegistrationId("keycloak");

        return ApiClient.buildWebClientBuilder(objectMapper)
                .filter(WebClientLoggerBuilder.logRequest())
                .filter(oauth)
                .build();
    }

    /**
     * ApiClient used in the Keycloak Admin API calls. Skipped in case you define it yourself.
     *
     * @param webClient The web client with qualifier keycloak. It needs to be configured to use auth for the calls.
     * @param basePath  Base url of Keycloak Admin api.
     * @return ApiClient that can be used to call the Keycloak Admin API.
     */
    @Bean
    @ConditionalOnMissingBean
    protected ApiClient keycloakAdminApiClient(
            @Qualifier("keycloak") final WebClient webClient,
            @Value("${dev.mbo.keycloak.admin.api.basePath}") final String basePath) {
        final var apiClient = new ApiClient(webClient);
        assert (!basePath.isBlank());
        apiClient.setBasePath(basePath);
        return apiClient;
    }

}

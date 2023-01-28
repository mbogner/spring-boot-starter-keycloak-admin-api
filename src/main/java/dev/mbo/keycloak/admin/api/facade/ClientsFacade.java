package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.ClientsApi;
import dev.mbo.keycloak.admin.api.Parser;
import dev.mbo.keycloak.admin.api.dto.ClientRepresentationDto;
import dev.mbo.keycloak.admin.api.facade.model.RealmClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@Component
public class ClientsFacade {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final ClientsApi api;

    @Autowired
    public ClientsFacade(ClientsApi api) {
        this.api = api;
    }

    public List<RealmClient> findAll(final String realm) {
        try {
            final var map = Objects.requireNonNull(
                    api.realmClientsGet(Objects.requireNonNull(realm),
                            null,
                            null,
                            null,
                            null,
                            null,
                            null
                    ).collectList().block()
            );
            return mapAll(map);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public ClientRepresentationDto findById(
            final String realm,
            final UUID id
    ) {
        try {
            return api.realmClientsIdGet(realm, id.toString()).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public RealmClient findByClientId(final String realm, final String clientId) {
        try {
            return findAll(realm).stream()
                    .filter(it -> it.clientId().equals(Objects.requireNonNull(clientId)))
                    .findFirst()
                    .orElse(null);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public RealmClient create(final String realm, final ClientRepresentationDto dto) {
        Objects.requireNonNull(dto.getClientId());
        try {
            api.realmClientsPost(Objects.requireNonNull(realm), Objects.requireNonNull(dto)).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
        return findByClientId(realm, dto.getClientId());
    }

    public void delete(final String realm, final UUID id) {
        try {
            api.realmClientsIdDelete(realm, id.toString()).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public ClientRepresentationDto update(final String realm, final UUID id, final ClientRepresentationDto dto) {
        try {
            api.realmClientsIdPut(realm, id.toString(), dto).block();
            return findById(realm, id);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private static List<RealmClient> mapAll(List<Map> entries) {
        return entries.stream().map(it -> new RealmClient(
                Parser.toUUID(it.get("id")),
                (String) it.get("clientId"),
                (String) it.get("name"),
                (String) it.get("rootUrl"),
                (String) it.get("baseUrl"),
                (Boolean) it.get("surrogateAuthRequired"),
                (Boolean) it.get("enabled"),
                (Boolean) it.get("alwaysDisplayInConsole"),
                (String) it.get("clientAuthenticatorType"),
                (List<String>) it.get("redirectUris"),
                (List<String>) it.get("webOrigins"),
                (Integer) it.get("notBefore"),
                (Boolean) it.get("bearerOnly"),
                (Boolean) it.get("consentRequired"),
                (Boolean) it.get("standardFlowEnabled"),
                (Boolean) it.get("implicitFlowEnabled"),
                (Boolean) it.get("directAccessGrantsEnabled"),
                (Boolean) it.get("serviceAccountsEnabled"),
                (Boolean) it.get("publicClient"),
                (Boolean) it.get("frontchannelLogout"),
                (String) it.get("protocol"),
                (Map<String, Object>) it.get("attributes"),
                (Map<String, Object>) it.get("authenticationFlowBindingOverrides"),
                (Boolean) it.get("fullScopeAllowed"),
                (Integer) it.get("nodeReRegistrationTimeout"),
                (List<String>) it.get("defaultClientScopes"),
                (List<String>) it.get("optionalClientScopes"),
                (Map<String, Object>) it.get("access")
        )).toList();
    }

}

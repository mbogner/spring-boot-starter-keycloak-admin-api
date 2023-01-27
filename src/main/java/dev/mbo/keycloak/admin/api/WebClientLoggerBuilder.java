package dev.mbo.keycloak.admin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import reactor.core.publisher.Mono;

/**
 * Definition of a logger that can be used in WebClient configurations.<br/>
 * <br/>
 * Example with use of ApiClient taken from OpenApi generated code:<br/>
 * <code>@formatter:off
 * ApiClient.buildWebClientBuilder(objectMapper)
 *  .filter(WebClientLoggerBuilder.logRequest())
 *  .build();
 * </code><br/>@formatter:on
 * <br/>
 * This generated an ApiClient with use of given objectMapper and it logs all requests (method + url + headers) if
 * debug log is enabled.
 *
 * @author mbo
 */
public final class WebClientLoggerBuilder {

    private static final Logger log = LoggerFactory.getLogger(WebClientLoggerBuilder.class);

    /**
     * ExchangeFilterFunction to log requests.
     *
     * @return ExchangeFilterFunction
     */
    public static ExchangeFilterFunction logRequest() {
        return ExchangeFilterFunction.ofRequestProcessor(clientRequest -> {
            if (log.isDebugEnabled()) {
                final StringBuilder sb = new StringBuilder("Request: \n")
                        .append(clientRequest.method())
                        .append(" ")
                        .append(clientRequest.url())
                        .append("\n");
                clientRequest.headers()
                        .forEach((name, values) -> values.forEach(value ->
                                sb.append(name).append(": ").append(value).append("\n"))
                        );
                log.debug(sb.toString());
            }
            return Mono.just(clientRequest);
        });
    }

}

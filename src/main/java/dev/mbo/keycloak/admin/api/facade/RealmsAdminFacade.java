package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.RealmsAdminApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.UUID;

@Component
public class RealmsAdminFacade {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final RealmsAdminApi api;

    @Autowired
    public RealmsAdminFacade(final RealmsAdminApi api) {
        this.api = api;
    }

    public void addDefaultScope(final String realm, final UUID scopeId) {
        try {
            api.realmDefaultDefaultClientScopesClientScopeIdPut(realm, scopeId.toString()).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public void removeDefaultScope(final String realm, final UUID scopeId) {
        try {
            api.realmDefaultDefaultClientScopesClientScopeIdDelete(realm, scopeId.toString()).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public void addOptionalScope(final String realm, final UUID scopeId) {
        try {
            api.realmDefaultOptionalClientScopesClientScopeIdPut(realm, scopeId.toString()).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public void removeOptionalScope(final String realm, final UUID scopeId) {
        try {
            api.realmDefaultOptionalClientScopesClientScopeIdDelete(realm, scopeId.toString()).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

}

package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.ScopeMappingsApi;
import dev.mbo.keycloak.admin.api.dto.RoleRepresentationDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.List;
import java.util.UUID;

@Component
public class ScopeMappingsFacade {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final ScopeMappingsApi api;

    @Autowired
    public ScopeMappingsFacade(ScopeMappingsApi api) {
        this.api = api;
    }

    public void assign(final String realm, final UUID scopeId, final List<RoleRepresentationDto> roleDtos) {
        try {
            api.realmClientScopesIdScopeMappingsRealmPost(realm, scopeId.toString(), roleDtos).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public void unassign(final String realm, final UUID scopeId, final List<RoleRepresentationDto> roleDtos) {
        try {
            api.realmClientScopesIdScopeMappingsRealmDelete(realm, scopeId.toString(), roleDtos).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

}

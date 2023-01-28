package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.RoleMapperApi;
import dev.mbo.keycloak.admin.api.dto.RoleRepresentationDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.List;
import java.util.UUID;

@Component
public class RoleMapperFacade {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final RoleMapperApi api;

    @Autowired
    public RoleMapperFacade(RoleMapperApi api) {
        this.api = api;
    }

    public void assign(final String realm, final UUID groupId, final List<RoleRepresentationDto> roleDtos) {
        try {
            api.realmGroupsIdRoleMappingsRealmPost(realm, groupId.toString(), roleDtos).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public void unassign(final String realm, final UUID groupId, final List<RoleRepresentationDto> roleDtos) {
        try {
            api.realmGroupsIdRoleMappingsRealmDelete(realm, groupId.toString(), roleDtos).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

}

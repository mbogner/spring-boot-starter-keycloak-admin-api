package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.Parser;
import dev.mbo.keycloak.admin.api.RolesApi;
import dev.mbo.keycloak.admin.api.dto.RoleRepresentationDto;
import dev.mbo.keycloak.admin.api.facade.model.RealmRole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Component
public class RolesFacade {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final RolesApi api;

    @Autowired
    public RolesFacade(RolesApi api) {
        this.api = api;
    }

    public List<RealmRole> findAll(final String realm, final int page, final int pageSize) {
        try {
            final var map = Objects.requireNonNull(
                    api.realmRolesGet(Objects.requireNonNull(realm),
                                    null, page * pageSize, pageSize, null)
                            .collectList().block()
            );
            return mapAll(map);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public RoleRepresentationDto findByName(final String realm, final String name) {
        try {
            return api.realmRolesRoleNameGet(realm, name).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public RoleRepresentationDto create(final String realm, final RoleRepresentationDto dto) {
        try {
            api.realmRolesPost(realm, dto).block();
            return findByName(realm, dto.getName());
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public void deleteByName(final String realm, final String name) {
        try {
            api.realmRolesRoleNameDelete(realm, name).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public RoleRepresentationDto update(final String realm, final String name, final RoleRepresentationDto dto) {
        try {
            api.realmRolesRoleNamePut(realm, name, dto).block();
            return findByName(realm, name);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    @SuppressWarnings("rawtypes")
    private List<RealmRole> mapAll(final List<Map> map) {
        return map.stream().map(it -> new RealmRole(
                Parser.toUUID(it.get("id")),
                (String) it.get("name"),
                (String) it.get("description"),
                (Boolean) it.get("composite"),
                (Boolean) it.get("clientRole"),
                Parser.toUUID(it.get("containerId"))
        )).toList();
    }

}

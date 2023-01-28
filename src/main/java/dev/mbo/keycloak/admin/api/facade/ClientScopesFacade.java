package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.ClientScopesApi;
import dev.mbo.keycloak.admin.api.Parser;
import dev.mbo.keycloak.admin.api.dto.ClientScopeRepresentationDto;
import dev.mbo.keycloak.admin.api.facade.model.RealmClientScope;
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
public class ClientScopesFacade {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final ClientScopesApi api;
    private final RealmsAdminFacade realmsAdminFacade;

    public enum Protocol {
        OPENID_CONNECT("openid-connect");

        private final String value;

        Protocol(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum Attributes {
        INCLUDE_IN_TOKEN_SCOPE("include.in.token.scope"),
        DISPLAY_ON_CONSENT_SCREEN("display.on.consent.screen");

        private final String value;

        Attributes(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum Type {
        NONE,
        DEFAULT,
        OPTIONAL
    }

    @Autowired
    public ClientScopesFacade(ClientScopesApi api, RealmsAdminFacade realmsAdminFacade) {
        this.api = api;
        this.realmsAdminFacade = realmsAdminFacade;
    }

    public List<RealmClientScope> findAll(final String realm) {
        try {
            final var map = Objects.requireNonNull(
                    api.realmClientScopesGet(Objects.requireNonNull(realm)).collectList().block()
            );
            return mapAll(map);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public ClientScopeRepresentationDto findById(final String realm, final UUID id) {
        try {
            return api.realmClientScopesIdGet(realm, id.toString()).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public RealmClientScope findByName(final String realm, final String name) {
        try {
            return findAll(realm).stream()
                    .filter(it -> it.name().equals(Objects.requireNonNull(name)))
                    .findFirst()
                    .orElse(null);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public void delete(final String realm, final UUID id) {
        try {
            api.realmClientScopesIdDelete(realm, id.toString()).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public ClientScopeRepresentationDto update(final String realm, final UUID id, final ClientScopeRepresentationDto dto) {
        try {
            api.realmClientScopesIdPut(realm, id.toString(), dto).block();
            return findById(realm, id);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public RealmClientScope create(final String realm, Type type, final ClientScopeRepresentationDto dto) {
        try {
            if (dto.getName() == null) throw new IllegalArgumentException("name is required");
            api.realmClientScopesPost(realm, dto).block();
            final var created = findByName(realm, dto.getName());
            switch (type) {
                case DEFAULT -> realmsAdminFacade.addDefaultScope(realm, created.id());
                case OPTIONAL -> realmsAdminFacade.addOptionalScope(realm, created.id());
                default -> log.warn("no type assigned to {} in {}", created.name(), realm);
            }
            return created;
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private List<RealmClientScope> mapAll(List<Map> map) {
        return map.stream().map(it -> new RealmClientScope(
                Parser.toUUID(it.get("id")),
                (String) it.get("name"),
                (String) it.get("description"),
                (String) it.get("protocol"),
                (Map<String, String>) it.get("attributes")
        )).toList();
    }

}

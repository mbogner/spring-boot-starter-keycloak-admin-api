package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.Parser;
import dev.mbo.keycloak.admin.api.UsersApi;
import dev.mbo.keycloak.admin.api.dto.UserRepresentationDto;
import dev.mbo.keycloak.admin.api.facade.model.RealmUser;
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
public class UsersFacade {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final UsersApi api;

    @Autowired
    public UsersFacade(UsersApi api) {
        this.api = api;
    }

    public List<RealmUser> findAll(final String realm, final int page, final int pageSize) {
        try {
            final var map = Objects.requireNonNull(
                    api.realmUsersGet(Objects.requireNonNull(realm),
                            null,
                            null,
                            null,
                            null,
                            null,
                            page * pageSize,
                            null,
                            null,
                            null,
                            null,
                            pageSize,
                            null,
                            null,
                            null).collectList().block()
            );
            return mapAll(map);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public RealmUser findByUsername(
            final String realm,
            final String username
    ) {
        try {
            final var map = Objects.requireNonNull(
                    api.realmUsersGet(Objects.requireNonNull(realm),
                            null,
                            null,
                            null,
                            null,
                            true,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            Objects.requireNonNull(username)).collectList().block()
            );
            final var resultList = mapAll(map);
            if (resultList.size() > 1) throw new IllegalStateException("findByUsername has > 1 results");
            if (resultList.isEmpty()) return null;
            return resultList.get(0);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public UserRepresentationDto findById(
            final String realm,
            final UUID id
    ) {
        try {
            return api.realmUsersIdGet(realm, id.toString()).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public RealmUser create(final String realm, final UserRepresentationDto dto) {
        try {
            api.realmUsersPost(realm, dto).block();
            return findByUsername(realm, dto.getUsername());
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public void delete(final String realm, final UUID id) {
        try {
            api.realmUsersIdDelete(realm, id.toString()).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public UserRepresentationDto updateRealmUser(final String realm, final UUID id, final UserRepresentationDto dto) {
        try {
            api.realmUsersIdPut(realm, id.toString(), dto).block();
            return findById(realm, id);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private static List<RealmUser> mapAll(List<Map> entries) {
        return entries.stream().map(it -> new RealmUser(
                Parser.toUUID(it.get("id")),
                Parser.toInstant(it.get("createdTimestamp")),
                (String) it.get("username"),
                (Boolean) it.get("enabled"),
                (Boolean) it.get("totp"),
                (Boolean) it.get("emailVerified"),
                (String) it.get("firstName"),
                (String) it.get("lastName"),
                (Map<String, String>) it.get("attributes"),
                (List<Object>) it.get("disableableCredentialTypes"),
                (List<String>) it.get("requiredActions"),
                (Integer) it.get("notBefore"),
                (Map<String, Boolean>) it.get("access")
        )).toList();
    }

}

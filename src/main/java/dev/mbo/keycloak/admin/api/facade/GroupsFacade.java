package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.GroupsApi;
import dev.mbo.keycloak.admin.api.Parser;
import dev.mbo.keycloak.admin.api.dto.GroupRepresentationDto;
import dev.mbo.keycloak.admin.api.facade.model.RealmGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.*;

@Component
public class GroupsFacade {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final GroupsApi api;

    @Autowired
    public GroupsFacade(GroupsApi api) {
        this.api = api;
    }


    public List<RealmGroup> findAll(final String realm, final int page, final int pageSize) {
        try {
            final var map = Objects.requireNonNull(api.realmGroupsGet(Objects.requireNonNull(realm),
                            null, null, page * pageSize, pageSize, null, null)
                    .collectList().block());
            return mapAll(map);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public GroupRepresentationDto findById(final String realm, final UUID id) {
        try {
            return api.realmGroupsIdGet(realm, id.toString()).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public List<RealmGroup> findAllBy(
            final String realm, final Boolean exact, final String search, final int page, final int pageSize
    ) {
        try {
            final var map = api.realmGroupsGet(realm, null, exact, page * pageSize, pageSize, null, search)
                    .collectList().block();
            return mapAll(map);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public RealmGroup create(final String realm, final GroupRepresentationDto dto) {
        try {
            api.realmGroupsPost(realm, dto).block();
            final var page = findAllBy(realm, true, dto.getName(), 0, 100);
            if (page.size() != 1) throw new IllegalStateException("creation failed");
            return page.get(0);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    /**
     * @return parent
     */
    public GroupRepresentationDto createSubGroup(final String realm, final UUID parentId, final GroupRepresentationDto dto) {
        try {
            api.realmGroupsIdChildrenPost(realm, parentId.toString(), dto).block();
            return findById(realm, parentId);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public void delete(final String realm, final UUID id) {
        try {
            api.realmGroupsIdDelete(realm, id.toString()).block();
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    public GroupRepresentationDto update(final String realm, final UUID id, final GroupRepresentationDto dto) {
        try {
            api.realmGroupsIdPut(realm, id.toString(), dto).block();
            return findById(realm, id);
        } catch (WebClientResponseException exc) {
            log.error("request failed, response body: {}", exc.getResponseBodyAsString(), exc);
            throw exc;
        }
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static List<RealmGroup> mapAll(final List<Map> entries) {
        if (entries == null) return Collections.emptyList();
        return entries.stream().map(it -> new RealmGroup(
                Parser.toUUID(it.get("id")),
                (String) it.get("name"),
                (String) it.get("path"),
                mapAll((List<Map>) it.get("subGroups")))
        ).toList();
    }

}

package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.dto.UserRepresentationDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@Disabled("no container available - local test only")
@SpringBootTest
public class ApiTest {

    private static final String REALM = "WhitelabelShopBackend";
    private static final String MAIL_DOMAIN = "mbo.dev";

    private final UsersApi usersApi;
    private final RolesApi rolesApi;
    private final GroupsApi groupsApi;
    private final ClientScopesApi clientScopesApi;

    @Autowired
    private ApiTest(final UsersApi usersApi, RolesApi rolesApi, GroupsApi groupsApi, ClientScopesApi clientScopesApi) {
        this.usersApi = usersApi;
        this.rolesApi = rolesApi;
        this.groupsApi = groupsApi;
        this.clientScopesApi = clientScopesApi;
    }

    @Test
    void testUserApi() {
        final var responseMono = usersApi.realmUsersCountGet(REALM,
                null,
                null,
                null,
                null,
                null,
                null,
                null
        );
        final var response = responseMono.block();
        assertThat(response).isNotNull();
    }

    @Test
    void createUser() {
        final var allRealmRoles = rolesApi.realmRolesGet(REALM, null, null, null, null)
                .collectList().block();
        assertThat(allRealmRoles).isNotNull();
        assertThat(allRealmRoles).hasSizeGreaterThan(0);

        final var allRealmGroups = groupsApi
                .realmGroupsGet(REALM, null, null, null, null, null, null)
                .collectList().block();
        assertThat(allRealmGroups).isNotNull();
        assertThat(allRealmGroups).hasSizeGreaterThan(0);

        final var allClientScopesApi = clientScopesApi.realmClientScopesGet(REALM).collectList().block();
        assertThat(allClientScopesApi).isNotNull();
        assertThat(allClientScopesApi).hasSizeGreaterThan(0);

//        final var adminUser = usersApi.realmUsersIdGet(REALM, "596e40fb-23d0-456e-9bf8-6589e00d96ce").block();
//        assertThat(adminUser).isNotNull();
//        assertThat(adminUser.getId()).isEqualTo("596e40fb-23d0-456e-9bf8-6589e00d96ce");
//
//        final var userUser = usersApi.realmUsersIdGet(REALM, "dddaeedf-39f5-4153-bae7-889cab3f3f2d").block();
//        assertThat(userUser).isNotNull();
//        assertThat(userUser.getId()).isEqualTo("dddaeedf-39f5-4153-bae7-889cab3f3f2d");

        final var username = "test" + UUID.randomUUID().toString().substring(0, 8);
        usersApi.realmUsersPost(REALM, new UserRepresentationDto()
                .username(username)
                .email(username + "@" + MAIL_DOMAIN)
                .emailVerified(true)
                .firstName(username)
                .lastName(username)
                .enabled(true)
        ).block();
        final var createdUserResultMap = usersApi.realmUsersGet(REALM,
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
                username).collectList().block();
        assertThat(createdUserResultMap).isNotNull();
        assertThat(createdUserResultMap).hasSize(1);
        final var createdUser = createdUserResultMap.get(0);

        usersApi.realmUsersIdDelete(REALM, (String) createdUser.get("id")).block();
        assertThat(true).isTrue();
    }

}

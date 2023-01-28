package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.ApiTest;
import dev.mbo.keycloak.admin.api.dto.UserRepresentationDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class UserFacadeTest extends ApiTest {

    private final UsersFacade facade;

    @Autowired
    UserFacadeTest(UsersFacade facade) {
        this.facade = facade;
    }

    @Test
    void all() {
        if (!enabled) return;

        final var result = facade.findAll(REALM, 0, 100);
        assertThat(result).isNotEmpty();
    }

    @Test
    void crud() {
        if (!enabled) return;

        final var adminSearch = facade.findByUsername(REALM, "admin");
        assertThat(adminSearch).isNotNull();

        // create
        final var username = "test" + UUID.randomUUID().toString().substring(0, 8);
        final var created = facade.create(REALM, new UserRepresentationDto()
                .username(username)
                .email(username + "@" + ApiTest.MAIL_DOMAIN)
                .emailVerified(true)
                .firstName(username)
                .lastName(username)
                .enabled(true)
        );
        assertThat(created).isNotNull();

        // read
        final var dto = facade.findById(REALM, created.id());
        assertThat(dto).isNotNull();
        assertThat(dto.getId()).isEqualTo(created.id().toString());

        // update
        final var updatedFirstName = UUID.randomUUID().toString().substring(0, 8);
        final var updatedLastName = UUID.randomUUID().toString().substring(0, 8);

        dto.setFirstName(updatedFirstName);
        dto.setLastName(updatedLastName);

        final var updated = facade.updateRealmUser(REALM, created.id(), dto);
        assertThat(updated).isNotNull();
        assertThat(updated.getId()).isEqualTo(dto.getId());
        assertThat(updated.getFirstName()).isEqualTo(updatedFirstName);
        assertThat(updated.getLastName()).isEqualTo(updatedLastName);

        // delete
        facade.delete(REALM, created.id());
    }

}
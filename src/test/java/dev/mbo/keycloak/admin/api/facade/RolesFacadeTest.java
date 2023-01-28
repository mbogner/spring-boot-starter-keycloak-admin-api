package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.ApiTest;
import dev.mbo.keycloak.admin.api.dto.RoleRepresentationDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class RolesFacadeTest extends ApiTest {

    private final RolesFacade facade;

    @Autowired
    RolesFacadeTest(RolesFacade facade) {
        this.facade = facade;
    }

    @Test
    void all() {
        if (!enabled) return;

        final var result = facade.findAll(ApiTest.REALM, 0, 100);
        assertThat(result).isNotEmpty();
    }

    @Test
    void crud() {
        if (!enabled) return;

        // create
        final var name = "role" + UUID.randomUUID().toString().substring(0, 8);
        final var created = facade.create(REALM, new RoleRepresentationDto()
                .name(name)
                .description(UUID.randomUUID().toString())
        );
        assertThat(created).isNotNull();

        // read
        final var read = facade.findByName(REALM, created.getName());
        assertThat(read).isNotNull();

        // update
        read.setDescription(UUID.randomUUID().toString());
        final var updated = facade.update(REALM, created.getName(), read);
        assertThat(updated).isNotNull();
        assertThat(updated.getDescription()).isEqualTo(read.getDescription());

        // delete
        facade.deleteByName(REALM, read.getName());
    }
}
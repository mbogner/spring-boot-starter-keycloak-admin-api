package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.ApiTest;
import dev.mbo.keycloak.admin.api.dto.ClientRepresentationDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class ClientsFacadeTest extends ApiTest {

    private final ClientsFacade facade;

    @Autowired
    ClientsFacadeTest(ClientsFacade facade) {
        this.facade = facade;
    }

    @Test
    void all() {
        if (!enabled) return;

        final var result = facade.findAll(REALM);
        assertThat(result).isNotEmpty();
    }

    @Test
    void crud() {
        if (!enabled) return;

        // create
        final var clientId = "client" + UUID.randomUUID().toString().substring(0, 8);
        final var created = facade.create(REALM, new ClientRepresentationDto()
                .clientId(clientId)
        );
        assertThat(created).isNotNull();

        // read
        final var read = facade.findById(REALM, created.id());
        assertThat(read).isNotNull();
        final var read2 = facade.findByClientId(REALM, clientId);
        assertThat(read2).isNotNull();
        assertThat(read.getId()).isEqualTo(read2.id().toString());

        // update
        read.setDescription(UUID.randomUUID().toString());
        final var updated = facade.update(REALM, created.id(), read);
        assertThat(updated).isNotNull();
        assertThat(updated.getDescription()).isEqualTo(read.getDescription());

        // delete
        facade.delete(REALM, created.id());
    }

}
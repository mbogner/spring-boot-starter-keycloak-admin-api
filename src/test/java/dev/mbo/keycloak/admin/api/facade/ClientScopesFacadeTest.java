package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.ApiTest;
import dev.mbo.keycloak.admin.api.dto.ClientScopeRepresentationDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class ClientScopesFacadeTest extends ApiTest {

    private final ClientScopesFacade facade;

    @Autowired
    ClientScopesFacadeTest(ClientScopesFacade facade) {
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
        final var name = "scope" + UUID.randomUUID().toString().substring(0, 8);
        final var created = facade.create(REALM, ClientScopesFacade.Type.DEFAULT,
                new ClientScopeRepresentationDto()
                        .name(name)
                        .protocol(ClientScopesFacade.Protocol.OPENID_CONNECT.getValue())
                        .attributes(
                                Map.of(
                                        ClientScopesFacade.Attributes.INCLUDE_IN_TOKEN_SCOPE.getValue(), "true",
                                        ClientScopesFacade.Attributes.DISPLAY_ON_CONSENT_SCREEN.getValue(), "true"
                                )
                        )
        );

        // read
        final var read = facade.findById(REALM, created.id());
        final var read2 = facade.findByName(REALM, name);
        assertThat(read).isNotNull();
        assertThat(read.getId()).isEqualTo(read2.id().toString());

        // update
        read.setDescription(UUID.randomUUID().toString());
        facade.update(REALM, created.id(), read);
        final var updated = facade.findById(REALM, created.id());
        assertThat(updated).isNotNull();
        assertThat(updated.getDescription()).isEqualTo(updated.getDescription());

        // delete
        facade.delete(REALM, created.id());
    }
}
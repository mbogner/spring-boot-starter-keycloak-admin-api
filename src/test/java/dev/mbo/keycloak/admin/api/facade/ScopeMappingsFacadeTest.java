package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.ApiTest;
import dev.mbo.keycloak.admin.api.dto.ClientScopeRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.RoleRepresentationDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.UUID;


class ScopeMappingsFacadeTest extends ApiTest {

    private final ScopeMappingsFacade scopeMappingsFacade;
    private final RolesFacade rolesFacade;
    private final ClientScopesFacade clientScopesFacade;

    @Autowired
    ScopeMappingsFacadeTest(
            ScopeMappingsFacade scopeMappingsFacade, RolesFacade rolesFacade, ClientScopesFacade clientScopesFacade) {
        this.scopeMappingsFacade = scopeMappingsFacade;
        this.rolesFacade = rolesFacade;
        this.clientScopesFacade = clientScopesFacade;
    }

    @Test
    void assignment() {
        if (!enabled) return;

        final var role = rolesFacade.create(REALM,
                new RoleRepresentationDto()
                        .name("scope_assign_role" + UUID.randomUUID().toString().substring(0, 8))
                        .description(UUID.randomUUID().toString())
        );
        final var scope = clientScopesFacade.create(REALM, ClientScopesFacade.Type.DEFAULT,
                new ClientScopeRepresentationDto()
                        .name("scope_assign_scope" + UUID.randomUUID().toString().substring(0, 8))
                        .protocol(ClientScopesFacade.Protocol.OPENID_CONNECT.getValue())
                        .attributes(
                                Map.of(
                                        ClientScopesFacade.Attributes.INCLUDE_IN_TOKEN_SCOPE.getValue(), "true",
                                        ClientScopesFacade.Attributes.DISPLAY_ON_CONSENT_SCREEN.getValue(), "false"
                                )
                        )
        );
        try {
            scopeMappingsFacade.assign(REALM, scope.id(), List.of(role));
            scopeMappingsFacade.unassign(REALM, scope.id(), List.of(role));
        } finally {
            rolesFacade.deleteByName(REALM, role.getName());
            clientScopesFacade.delete(REALM, scope.id());
        }
    }

}
package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.ApiTest;
import dev.mbo.keycloak.admin.api.dto.GroupRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.RoleRepresentationDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

class RoleMapperFacadeTest extends ApiTest {

    private final RoleMapperFacade roleMapperFacade;
    private final GroupsFacade groupsFacade;
    private final RolesFacade rolesFacade;

    @Autowired
    RoleMapperFacadeTest(
            final RoleMapperFacade roleMapperFacade,
            final GroupsFacade groupsFacade,
            final RolesFacade rolesFacade
    ) {
        this.roleMapperFacade = roleMapperFacade;
        this.groupsFacade = groupsFacade;
        this.rolesFacade = rolesFacade;
    }

    @Test
    void assignment() {
        if(!enabled) return;

        final var role = rolesFacade.create(REALM, new RoleRepresentationDto().name("assign_role" + UUID.randomUUID().toString().substring(0, 8)));
        final var group = groupsFacade.create(REALM, new GroupRepresentationDto().name("assign_group" + UUID.randomUUID().toString().substring(0, 8)));

        roleMapperFacade.assign(REALM, group.id(), List.of(role));
        roleMapperFacade.unassign(REALM, group.id(), List.of(role));

        rolesFacade.deleteByName(REALM, role.getName());
        groupsFacade.delete(REALM, group.id());
    }

}
package dev.mbo.keycloak.admin.api.facade;

import dev.mbo.keycloak.admin.api.ApiTest;
import dev.mbo.keycloak.admin.api.dto.GroupRepresentationDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class GroupsFacadeTest extends ApiTest {

    private final GroupsFacade facade;

    @Autowired
    GroupsFacadeTest(GroupsFacade facade) {
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

        // create
        final String name = "group" + UUID.randomUUID().toString().substring(0, 8);
        final var created = facade.create(REALM, new GroupRepresentationDto()
                .name(name)
                .attributes(Map.of("tenant_id", List.of(UUID.randomUUID().toString())))
        );
        assertThat(created).isNotNull();
        // create subgroups
        var createdDto = facade.createSubGroup(REALM, created.id(), new GroupRepresentationDto().name("sub1"));
        assertThat(createdDto).isNotNull();
        assertThat(createdDto.getSubGroups()).hasSize(1);
        createdDto = facade.createSubGroup(REALM, created.id(), new GroupRepresentationDto().name("sub2"));
        assertThat(createdDto).isNotNull();
        assertThat(createdDto.getSubGroups()).hasSize(2);

        // read
        final var read = facade.findById(REALM, created.id());
        assertThat(read).isNotNull();

        // update
        read.setName("changed" + UUID.randomUUID().toString().substring(0, 8));
        facade.update(REALM, created.id(), read);
        final var updated = facade.findById(REALM, created.id());
        assertThat(updated).isNotNull();
        assertThat(updated.getName()).isEqualTo(read.getName());

        // delete
        facade.delete(REALM, created.id());
    }
}
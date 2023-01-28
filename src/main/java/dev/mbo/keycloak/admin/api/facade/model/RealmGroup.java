package dev.mbo.keycloak.admin.api.facade.model;

import java.util.List;
import java.util.UUID;

public record RealmGroup(
        UUID id,
        String name,
        String path,
        List<RealmGroup> subGroups
) {
}
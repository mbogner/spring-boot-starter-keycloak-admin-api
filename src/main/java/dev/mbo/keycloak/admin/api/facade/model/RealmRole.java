package dev.mbo.keycloak.admin.api.facade.model;

import java.util.UUID;

public record RealmRole(
        UUID id,
        String name,
        String description,
        Boolean composite,
        Boolean clientRole,
        UUID containerId
) {
}
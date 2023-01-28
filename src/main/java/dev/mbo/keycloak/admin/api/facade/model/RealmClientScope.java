package dev.mbo.keycloak.admin.api.facade.model;

import java.util.Map;
import java.util.UUID;

public record RealmClientScope(
        UUID id,
        String name,
        String description,
        String protocol,
        Map<String, String> attributes
) {
}
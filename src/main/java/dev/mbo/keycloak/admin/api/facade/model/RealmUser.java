package dev.mbo.keycloak.admin.api.facade.model;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public record RealmUser(
        UUID id,
        Instant createdTimestamp,
        String username,
        Boolean enabled,
        Boolean totp,
        Boolean emailVerified,
        String firstName,
        String lastName,
        Map<String, String> attributes,
        List<Object> disableableCredentialTypes,
        List<String> requiredActions,
        Integer notBefore,
        Map<String, Boolean> access
) {
}
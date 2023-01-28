package dev.mbo.keycloak.admin.api;

import java.time.Instant;
import java.util.UUID;

public final class Parser {

    public static UUID toUUID(final Object obj) {
        if (null == obj) return null;
        if (obj instanceof String) return UUID.fromString((String) obj);
        throw new IllegalStateException("not supported: " + obj.getClass().getName());
    }

    public static Instant toInstant(final Object obj) {
        if (null == obj) return null;
        if (obj instanceof Long) return Instant.ofEpochMilli((Long) obj);
        throw new IllegalStateException("not supported: " + obj.getClass().getName());
    }

    private Parser() {
        throw new IllegalAccessError();
    }
}

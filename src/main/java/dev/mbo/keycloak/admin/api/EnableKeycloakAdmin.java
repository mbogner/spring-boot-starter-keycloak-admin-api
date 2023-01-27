package dev.mbo.keycloak.admin.api;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation adds {@link KeycloakAdminApiAutoConfig} to the classpath.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Import(KeycloakAdminApiAutoConfig.class)
public @interface EnableKeycloakAdmin {
}

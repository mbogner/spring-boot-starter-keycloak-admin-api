package dev.mbo.keycloak.admin.api;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApiTest {

    public static final String REALM = "WhitelabelShopBackend";
    public static final String MAIL_DOMAIN = "mbo.dev";

    // setting this to false skips all keycloak container based tests which are only working in local test env.
    public static final boolean enabled = false;

}

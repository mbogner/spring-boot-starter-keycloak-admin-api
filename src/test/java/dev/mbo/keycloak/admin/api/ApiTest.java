package dev.mbo.keycloak.admin.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ApiTest {

    private final UsersApi api;

    @Autowired
    private ApiTest(final UsersApi api) {
        this.api = api;
    }

    @Test
    void testUserApi() {
        final var responseMono = api.realmUsersCountGet("WhitelabelShopBackend",
                null,
                null,
                null,
                null,
                null,
                null,
                null
        );
        final var response = responseMono.block();
        assertThat(response).isNotNull();
    }

}

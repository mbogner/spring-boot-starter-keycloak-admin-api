# spring-boot-starter-keycloak-admin-api

This is a Keycloak Admin API client for Spring Boot 3 based applications. If uses an OpenAPI specification to generate
a WebClient based API client which is capable of using OAuth2. For using the admin API with a service account (
client_credentials) you need to create a client with "Service account roles" enabled and to that service account (
created in users) you have to assign required realm-management roles. In Keycloak 20.0.3 these roles are only displayed
if you use "Filter by clients".

The API specification is based on https://github.com/mbogner/keycloak-openapi which is a fork
of https://github.com/ccouzens/keycloak-openapi. Some calls were commented out to make swagger editor happy and
openapi-generator able to create the client code from the spec.

## Configuration

Here a sample configuration with placeholders that you can use in your applications.yml:

```yaml
dev.mbo.keycloak:
  basePath: https://<your.keycloak.url>
  admin:
    api:
      basePath: ${dev.mbo.keycloak.basePath}/admin/realms

spring:
  security:
    oauth2:
      client:
        registration:
          keycloak:
            client-id: <your-client-id>
            client-secret: <your-client-secret>
            authorization-grant-type: client_credentials
        provider:
          keycloak:
            token-uri: ${dev.mbo.keycloak.basePath}/realms/<your-realm>/protocol/openid-connect/token
```

With this in place you should be able to add `@EnableKeycloakAdmin` to one of your Spring Boot configuration classes.
This enabled the creation of an ApiClient for "keycloak" configuration mapped from the oauth2 client config.

You can then simply inject the clients. Here an example for UsersApi:

```java

@Component
public class Example {

    private final UsersApi api;

    @Autowired
    private ApiTest(final UsersApi api) {
        this.api = api;
    }

    public String callApi() {
        final var mono = api.executeCall();
        return mono.block();
    }
}
```

As you can see no further config is needed in the classes using the clients. WebClient is async by default. So you can
use this client in async and sync applications. Simply make the calls blocking if you don't want to work async.
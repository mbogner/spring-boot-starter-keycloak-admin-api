package dev.mbo.keycloak.admin.api.facade.model;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public record RealmClient(
        UUID id,
        String clientId,
        String name,
        String rootUrl,
        String baseUrl,
        Boolean surrogateAuthRequired,
        Boolean enabled,
        Boolean alwaysDisplayInConsole,
        String clientAuthenticatorType,
        List<String> redirectUris,
        List<String> webOrigins,
        Integer notBefore,
        Boolean bearerOnly,
        Boolean consentRequired,
        Boolean standardFlowEnabled,
        Boolean implicitFlowEnabled,
        Boolean directAccessGrantsEnabled,
        Boolean serviceAccountsEnabled,
        Boolean publicClient,
        Boolean frontchannelLogout,
        String protocol,
        Map<String, Object> attributes,
        Map<String, Object> authenticationFlowBindingOverrides,
        Boolean fullScopeAllowed,
        Integer nodeReRegistrationTimeout,
        List<String> defaultClientScopes,
        List<String> optionalClientScopes,
        Map<String, Object> access
) {
}
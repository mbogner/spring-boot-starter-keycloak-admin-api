package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.CredentialRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.FederatedIdentityRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.UserRepresentationDto;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

import org.springframework.stereotype.Component;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@Component
public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(new ApiClient());
    }

    @Autowired
    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns the number of users that match the given criteria.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param email email filter
     * @param emailVerified The emailVerified parameter
     * @param enabled Boolean representing if user is enabled or not
     * @param firstName first name filter
     * @param lastName last name filter
     * @param search arbitrary search string for all the fields below
     * @param username username filter
     * @return Integer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersCountGetRequestCreation(String realm, String email, Boolean emailVerified, Boolean enabled, String firstName, String lastName, String search, String username) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersCountGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "email", email));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "emailVerified", emailVerified));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enabled", enabled));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstName", firstName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastName", lastName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "username", username));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI("/{realm}/users/count", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns the number of users that match the given criteria.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param email email filter
     * @param emailVerified The emailVerified parameter
     * @param enabled Boolean representing if user is enabled or not
     * @param firstName first name filter
     * @param lastName last name filter
     * @param search arbitrary search string for all the fields below
     * @param username username filter
     * @return Integer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Integer> realmUsersCountGet(String realm, String email, Boolean emailVerified, Boolean enabled, String firstName, String lastName, String search, String username) throws WebClientResponseException {
        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return realmUsersCountGetRequestCreation(realm, email, emailVerified, enabled, firstName, lastName, search, username).bodyToMono(localVarReturnType);
    }

    /**
     * Returns the number of users that match the given criteria.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param email email filter
     * @param emailVerified The emailVerified parameter
     * @param enabled Boolean representing if user is enabled or not
     * @param firstName first name filter
     * @param lastName last name filter
     * @param search arbitrary search string for all the fields below
     * @param username username filter
     * @return ResponseEntity&lt;Integer&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Integer>> realmUsersCountGetWithHttpInfo(String realm, String email, Boolean emailVerified, Boolean enabled, String firstName, String lastName, String search, String username) throws WebClientResponseException {
        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return realmUsersCountGetRequestCreation(realm, email, emailVerified, enabled, firstName, lastName, search, username).toEntity(localVarReturnType);
    }

    /**
     * Returns the number of users that match the given criteria.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param email email filter
     * @param emailVerified The emailVerified parameter
     * @param enabled Boolean representing if user is enabled or not
     * @param firstName first name filter
     * @param lastName last name filter
     * @param search arbitrary search string for all the fields below
     * @param username username filter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersCountGetWithResponseSpec(String realm, String email, Boolean emailVerified, Boolean enabled, String firstName, String lastName, String search, String username) throws WebClientResponseException {
        return realmUsersCountGetRequestCreation(realm, email, emailVerified, enabled, firstName, lastName, search, username);
    }
    /**
     * Get users   Returns a stream of users, filtered according to query parameters.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param briefRepresentation Boolean which defines whether brief representations are returned (default: false)
     * @param email A String contained in email, or the complete email, if param \&quot;exact\&quot; is true
     * @param emailVerified whether the email has been verified
     * @param enabled Boolean representing if user is enabled or not
     * @param exact Boolean which defines whether the params \&quot;last\&quot;, \&quot;first\&quot;, \&quot;email\&quot; and \&quot;username\&quot; must match exactly
     * @param first Pagination offset
     * @param firstName A String contained in firstName, or the complete firstName, if param \&quot;exact\&quot; is true
     * @param idpAlias The alias of an Identity Provider linked to the user
     * @param idpUserId The userId at an Identity Provider linked to the user
     * @param lastName A String contained in lastName, or the complete lastName, if param \&quot;exact\&quot; is true
     * @param max Maximum results size (defaults to 100)
     * @param q A query to search for custom attributes, in the format &#39;key1:value2 key2:value2&#39;
     * @param search A String contained in username, first or last name, or email
     * @param username A String contained in username, or the complete username, if param \&quot;exact\&quot; is true
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersGetRequestCreation(String realm, Boolean briefRepresentation, String email, Boolean emailVerified, Boolean enabled, Boolean exact, Integer first, String firstName, String idpAlias, String idpUserId, String lastName, Integer max, String q, String search, String username) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "briefRepresentation", briefRepresentation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "email", email));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "emailVerified", emailVerified));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enabled", enabled));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exact", exact));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "first", first));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstName", firstName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idpAlias", idpAlias));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idpUserId", idpUserId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastName", lastName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "username", username));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/users", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get users   Returns a stream of users, filtered according to query parameters.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param briefRepresentation Boolean which defines whether brief representations are returned (default: false)
     * @param email A String contained in email, or the complete email, if param \&quot;exact\&quot; is true
     * @param emailVerified whether the email has been verified
     * @param enabled Boolean representing if user is enabled or not
     * @param exact Boolean which defines whether the params \&quot;last\&quot;, \&quot;first\&quot;, \&quot;email\&quot; and \&quot;username\&quot; must match exactly
     * @param first Pagination offset
     * @param firstName A String contained in firstName, or the complete firstName, if param \&quot;exact\&quot; is true
     * @param idpAlias The alias of an Identity Provider linked to the user
     * @param idpUserId The userId at an Identity Provider linked to the user
     * @param lastName A String contained in lastName, or the complete lastName, if param \&quot;exact\&quot; is true
     * @param max Maximum results size (defaults to 100)
     * @param q A query to search for custom attributes, in the format &#39;key1:value2 key2:value2&#39;
     * @param search A String contained in username, first or last name, or email
     * @param username A String contained in username, or the complete username, if param \&quot;exact\&quot; is true
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersGet(String realm, Boolean briefRepresentation, String email, Boolean emailVerified, Boolean enabled, Boolean exact, Integer first, String firstName, String idpAlias, String idpUserId, String lastName, Integer max, String q, String search, String username) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersGetRequestCreation(realm, briefRepresentation, email, emailVerified, enabled, exact, first, firstName, idpAlias, idpUserId, lastName, max, q, search, username).bodyToFlux(localVarReturnType);
    }

    /**
     * Get users   Returns a stream of users, filtered according to query parameters.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param briefRepresentation Boolean which defines whether brief representations are returned (default: false)
     * @param email A String contained in email, or the complete email, if param \&quot;exact\&quot; is true
     * @param emailVerified whether the email has been verified
     * @param enabled Boolean representing if user is enabled or not
     * @param exact Boolean which defines whether the params \&quot;last\&quot;, \&quot;first\&quot;, \&quot;email\&quot; and \&quot;username\&quot; must match exactly
     * @param first Pagination offset
     * @param firstName A String contained in firstName, or the complete firstName, if param \&quot;exact\&quot; is true
     * @param idpAlias The alias of an Identity Provider linked to the user
     * @param idpUserId The userId at an Identity Provider linked to the user
     * @param lastName A String contained in lastName, or the complete lastName, if param \&quot;exact\&quot; is true
     * @param max Maximum results size (defaults to 100)
     * @param q A query to search for custom attributes, in the format &#39;key1:value2 key2:value2&#39;
     * @param search A String contained in username, first or last name, or email
     * @param username A String contained in username, or the complete username, if param \&quot;exact\&quot; is true
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersGetWithHttpInfo(String realm, Boolean briefRepresentation, String email, Boolean emailVerified, Boolean enabled, Boolean exact, Integer first, String firstName, String idpAlias, String idpUserId, String lastName, Integer max, String q, String search, String username) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersGetRequestCreation(realm, briefRepresentation, email, emailVerified, enabled, exact, first, firstName, idpAlias, idpUserId, lastName, max, q, search, username).toEntityList(localVarReturnType);
    }

    /**
     * Get users   Returns a stream of users, filtered according to query parameters.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param briefRepresentation Boolean which defines whether brief representations are returned (default: false)
     * @param email A String contained in email, or the complete email, if param \&quot;exact\&quot; is true
     * @param emailVerified whether the email has been verified
     * @param enabled Boolean representing if user is enabled or not
     * @param exact Boolean which defines whether the params \&quot;last\&quot;, \&quot;first\&quot;, \&quot;email\&quot; and \&quot;username\&quot; must match exactly
     * @param first Pagination offset
     * @param firstName A String contained in firstName, or the complete firstName, if param \&quot;exact\&quot; is true
     * @param idpAlias The alias of an Identity Provider linked to the user
     * @param idpUserId The userId at an Identity Provider linked to the user
     * @param lastName A String contained in lastName, or the complete lastName, if param \&quot;exact\&quot; is true
     * @param max Maximum results size (defaults to 100)
     * @param q A query to search for custom attributes, in the format &#39;key1:value2 key2:value2&#39;
     * @param search A String contained in username, first or last name, or email
     * @param username A String contained in username, or the complete username, if param \&quot;exact\&quot; is true
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersGetWithResponseSpec(String realm, Boolean briefRepresentation, String email, Boolean emailVerified, Boolean enabled, Boolean exact, Integer first, String firstName, String idpAlias, String idpUserId, String lastName, Integer max, String q, String search, String username) throws WebClientResponseException {
        return realmUsersGetRequestCreation(realm, briefRepresentation, email, emailVerified, enabled, exact, first, firstName, idpAlias, idpUserId, lastName, max, q, search, username);
    }
    /**
     * Return credential types, which are provided by the user storage where user is stored.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdConfiguredUserStorageCredentialTypesGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdConfiguredUserStorageCredentialTypesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdConfiguredUserStorageCredentialTypesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/configured-user-storage-credential-types", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return credential types, which are provided by the user storage where user is stored.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersIdConfiguredUserStorageCredentialTypesGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdConfiguredUserStorageCredentialTypesGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Return credential types, which are provided by the user storage where user is stored.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersIdConfiguredUserStorageCredentialTypesGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdConfiguredUserStorageCredentialTypesGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Return credential types, which are provided by the user storage where user is stored.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdConfiguredUserStorageCredentialTypesGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmUsersIdConfiguredUserStorageCredentialTypesGetRequestCreation(realm, id);
    }
    /**
     * Revoke consent and offline tokens for particular client from user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client Client id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdConsentsClientDeleteRequestCreation(String realm, String id, String client) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdConsentsClientDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdConsentsClientDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmUsersIdConsentsClientDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("client", client);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/consents/{client}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Revoke consent and offline tokens for particular client from user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client Client id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdConsentsClientDelete(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdConsentsClientDeleteRequestCreation(realm, id, client).bodyToMono(localVarReturnType);
    }

    /**
     * Revoke consent and offline tokens for particular client from user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client Client id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdConsentsClientDeleteWithHttpInfo(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdConsentsClientDeleteRequestCreation(realm, id, client).toEntity(localVarReturnType);
    }

    /**
     * Revoke consent and offline tokens for particular client from user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client Client id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdConsentsClientDeleteWithResponseSpec(String realm, String id, String client) throws WebClientResponseException {
        return realmUsersIdConsentsClientDeleteRequestCreation(realm, id, client);
    }
    /**
     * Get consents granted by the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdConsentsGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdConsentsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdConsentsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/consents", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get consents granted by the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersIdConsentsGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdConsentsGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get consents granted by the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersIdConsentsGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdConsentsGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get consents granted by the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdConsentsGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmUsersIdConsentsGetRequestCreation(realm, id);
    }
    /**
     * Remove a credential for a user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credentialId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdCredentialsCredentialIdDeleteRequestCreation(String realm, String id, String credentialId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdCredentialsCredentialIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdCredentialsCredentialIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'credentialId' is set
        if (credentialId == null) {
            throw new WebClientResponseException("Missing the required parameter 'credentialId' when calling realmUsersIdCredentialsCredentialIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("credentialId", credentialId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/credentials/{credentialId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove a credential for a user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credentialId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdCredentialsCredentialIdDelete(String realm, String id, String credentialId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdCredentialsCredentialIdDeleteRequestCreation(realm, id, credentialId).bodyToMono(localVarReturnType);
    }

    /**
     * Remove a credential for a user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credentialId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdCredentialsCredentialIdDeleteWithHttpInfo(String realm, String id, String credentialId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdCredentialsCredentialIdDeleteRequestCreation(realm, id, credentialId).toEntity(localVarReturnType);
    }

    /**
     * Remove a credential for a user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credentialId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdCredentialsCredentialIdDeleteWithResponseSpec(String realm, String id, String credentialId) throws WebClientResponseException {
        return realmUsersIdCredentialsCredentialIdDeleteRequestCreation(realm, id, credentialId);
    }
    /**
     * Move a credential to a position behind another credential
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credential to move
     * @param newPreviousCredentialId The credential that will be the previous element in the list. If set to null, the moved credential will be the first element in the list.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdCredentialsCredentialIdMoveAfterNewPreviousCredentialIdPostRequestCreation(String realm, String id, String credentialId, String newPreviousCredentialId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdCredentialsCredentialIdMoveAfterNewPreviousCredentialIdPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdCredentialsCredentialIdMoveAfterNewPreviousCredentialIdPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'credentialId' is set
        if (credentialId == null) {
            throw new WebClientResponseException("Missing the required parameter 'credentialId' when calling realmUsersIdCredentialsCredentialIdMoveAfterNewPreviousCredentialIdPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'newPreviousCredentialId' is set
        if (newPreviousCredentialId == null) {
            throw new WebClientResponseException("Missing the required parameter 'newPreviousCredentialId' when calling realmUsersIdCredentialsCredentialIdMoveAfterNewPreviousCredentialIdPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("credentialId", credentialId);
        pathParams.put("newPreviousCredentialId", newPreviousCredentialId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/credentials/{credentialId}/moveAfter/{newPreviousCredentialId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Move a credential to a position behind another credential
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credential to move
     * @param newPreviousCredentialId The credential that will be the previous element in the list. If set to null, the moved credential will be the first element in the list.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdCredentialsCredentialIdMoveAfterNewPreviousCredentialIdPost(String realm, String id, String credentialId, String newPreviousCredentialId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdCredentialsCredentialIdMoveAfterNewPreviousCredentialIdPostRequestCreation(realm, id, credentialId, newPreviousCredentialId).bodyToMono(localVarReturnType);
    }

    /**
     * Move a credential to a position behind another credential
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credential to move
     * @param newPreviousCredentialId The credential that will be the previous element in the list. If set to null, the moved credential will be the first element in the list.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdCredentialsCredentialIdMoveAfterNewPreviousCredentialIdPostWithHttpInfo(String realm, String id, String credentialId, String newPreviousCredentialId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdCredentialsCredentialIdMoveAfterNewPreviousCredentialIdPostRequestCreation(realm, id, credentialId, newPreviousCredentialId).toEntity(localVarReturnType);
    }

    /**
     * Move a credential to a position behind another credential
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credential to move
     * @param newPreviousCredentialId The credential that will be the previous element in the list. If set to null, the moved credential will be the first element in the list.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdCredentialsCredentialIdMoveAfterNewPreviousCredentialIdPostWithResponseSpec(String realm, String id, String credentialId, String newPreviousCredentialId) throws WebClientResponseException {
        return realmUsersIdCredentialsCredentialIdMoveAfterNewPreviousCredentialIdPostRequestCreation(realm, id, credentialId, newPreviousCredentialId);
    }
    /**
     * Move a credential to a first position in the credentials list of the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credential to move
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdCredentialsCredentialIdMoveToFirstPostRequestCreation(String realm, String id, String credentialId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdCredentialsCredentialIdMoveToFirstPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdCredentialsCredentialIdMoveToFirstPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'credentialId' is set
        if (credentialId == null) {
            throw new WebClientResponseException("Missing the required parameter 'credentialId' when calling realmUsersIdCredentialsCredentialIdMoveToFirstPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("credentialId", credentialId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/credentials/{credentialId}/moveToFirst", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Move a credential to a first position in the credentials list of the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credential to move
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdCredentialsCredentialIdMoveToFirstPost(String realm, String id, String credentialId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdCredentialsCredentialIdMoveToFirstPostRequestCreation(realm, id, credentialId).bodyToMono(localVarReturnType);
    }

    /**
     * Move a credential to a first position in the credentials list of the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credential to move
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdCredentialsCredentialIdMoveToFirstPostWithHttpInfo(String realm, String id, String credentialId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdCredentialsCredentialIdMoveToFirstPostRequestCreation(realm, id, credentialId).toEntity(localVarReturnType);
    }

    /**
     * Move a credential to a first position in the credentials list of the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credential to move
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdCredentialsCredentialIdMoveToFirstPostWithResponseSpec(String realm, String id, String credentialId) throws WebClientResponseException {
        return realmUsersIdCredentialsCredentialIdMoveToFirstPostRequestCreation(realm, id, credentialId);
    }
    /**
     * Update a credential label for a user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credentialId parameter
     * @param body The body parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdCredentialsCredentialIdUserLabelPutRequestCreation(String realm, String id, String credentialId, String body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdCredentialsCredentialIdUserLabelPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdCredentialsCredentialIdUserLabelPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'credentialId' is set
        if (credentialId == null) {
            throw new WebClientResponseException("Missing the required parameter 'credentialId' when calling realmUsersIdCredentialsCredentialIdUserLabelPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling realmUsersIdCredentialsCredentialIdUserLabelPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("credentialId", credentialId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "text/plain"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/credentials/{credentialId}/userLabel", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a credential label for a user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credentialId parameter
     * @param body The body parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdCredentialsCredentialIdUserLabelPut(String realm, String id, String credentialId, String body) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdCredentialsCredentialIdUserLabelPutRequestCreation(realm, id, credentialId, body).bodyToMono(localVarReturnType);
    }

    /**
     * Update a credential label for a user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credentialId parameter
     * @param body The body parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdCredentialsCredentialIdUserLabelPutWithHttpInfo(String realm, String id, String credentialId, String body) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdCredentialsCredentialIdUserLabelPutRequestCreation(realm, id, credentialId, body).toEntity(localVarReturnType);
    }

    /**
     * Update a credential label for a user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialId The credentialId parameter
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdCredentialsCredentialIdUserLabelPutWithResponseSpec(String realm, String id, String credentialId, String body) throws WebClientResponseException {
        return realmUsersIdCredentialsCredentialIdUserLabelPutRequestCreation(realm, id, credentialId, body);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdCredentialsGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdCredentialsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdCredentialsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/credentials", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersIdCredentialsGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdCredentialsGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersIdCredentialsGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdCredentialsGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdCredentialsGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmUsersIdCredentialsGetRequestCreation(realm, id);
    }
    /**
     * Delete the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdDeleteRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdDelete(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdDeleteRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdDeleteWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdDeleteRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Delete the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdDeleteWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmUsersIdDeleteRequestCreation(realm, id);
    }
    /**
     * Disable all credentials for a user of a specific type
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdDisableCredentialTypesPutRequestCreation(String realm, String id, List<String> requestBody) throws WebClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdDisableCredentialTypesPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdDisableCredentialTypesPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new WebClientResponseException("Missing the required parameter 'requestBody' when calling realmUsersIdDisableCredentialTypesPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/disable-credential-types", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Disable all credentials for a user of a specific type
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdDisableCredentialTypesPut(String realm, String id, List<String> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdDisableCredentialTypesPutRequestCreation(realm, id, requestBody).bodyToMono(localVarReturnType);
    }

    /**
     * Disable all credentials for a user of a specific type
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdDisableCredentialTypesPutWithHttpInfo(String realm, String id, List<String> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdDisableCredentialTypesPutRequestCreation(realm, id, requestBody).toEntity(localVarReturnType);
    }

    /**
     * Disable all credentials for a user of a specific type
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param requestBody The requestBody parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdDisableCredentialTypesPutWithResponseSpec(String realm, String id, List<String> requestBody) throws WebClientResponseException {
        return realmUsersIdDisableCredentialTypesPutRequestCreation(realm, id, requestBody);
    }
    /**
     * Send a update account email to the user   An email contains a link the user can click to perform a set of required actions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param requestBody required actions the user needs to complete
     * @param clientId Client id
     * @param lifespan Number of seconds after which the generated token expires
     * @param redirectUri Redirect uri
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdExecuteActionsEmailPutRequestCreation(String realm, String id, List<String> requestBody, String clientId, Integer lifespan, String redirectUri) throws WebClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdExecuteActionsEmailPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdExecuteActionsEmailPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new WebClientResponseException("Missing the required parameter 'requestBody' when calling realmUsersIdExecuteActionsEmailPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "client_id", clientId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lifespan", lifespan));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "redirect_uri", redirectUri));

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/execute-actions-email", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Send a update account email to the user   An email contains a link the user can click to perform a set of required actions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param requestBody required actions the user needs to complete
     * @param clientId Client id
     * @param lifespan Number of seconds after which the generated token expires
     * @param redirectUri Redirect uri
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdExecuteActionsEmailPut(String realm, String id, List<String> requestBody, String clientId, Integer lifespan, String redirectUri) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdExecuteActionsEmailPutRequestCreation(realm, id, requestBody, clientId, lifespan, redirectUri).bodyToMono(localVarReturnType);
    }

    /**
     * Send a update account email to the user   An email contains a link the user can click to perform a set of required actions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param requestBody required actions the user needs to complete
     * @param clientId Client id
     * @param lifespan Number of seconds after which the generated token expires
     * @param redirectUri Redirect uri
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdExecuteActionsEmailPutWithHttpInfo(String realm, String id, List<String> requestBody, String clientId, Integer lifespan, String redirectUri) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdExecuteActionsEmailPutRequestCreation(realm, id, requestBody, clientId, lifespan, redirectUri).toEntity(localVarReturnType);
    }

    /**
     * Send a update account email to the user   An email contains a link the user can click to perform a set of required actions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param requestBody required actions the user needs to complete
     * @param clientId Client id
     * @param lifespan Number of seconds after which the generated token expires
     * @param redirectUri Redirect uri
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdExecuteActionsEmailPutWithResponseSpec(String realm, String id, List<String> requestBody, String clientId, Integer lifespan, String redirectUri) throws WebClientResponseException {
        return realmUsersIdExecuteActionsEmailPutRequestCreation(realm, id, requestBody, clientId, lifespan, redirectUri);
    }
    /**
     * Get social logins associated with the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdFederatedIdentityGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdFederatedIdentityGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdFederatedIdentityGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/federated-identity", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get social logins associated with the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersIdFederatedIdentityGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdFederatedIdentityGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get social logins associated with the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersIdFederatedIdentityGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdFederatedIdentityGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get social logins associated with the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdFederatedIdentityGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmUsersIdFederatedIdentityGetRequestCreation(realm, id);
    }
    /**
     * Remove a social login provider from user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param provider Social login provider id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdFederatedIdentityProviderDeleteRequestCreation(String realm, String id, String provider) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdFederatedIdentityProviderDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdFederatedIdentityProviderDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'provider' is set
        if (provider == null) {
            throw new WebClientResponseException("Missing the required parameter 'provider' when calling realmUsersIdFederatedIdentityProviderDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("provider", provider);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/federated-identity/{provider}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove a social login provider from user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param provider Social login provider id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdFederatedIdentityProviderDelete(String realm, String id, String provider) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdFederatedIdentityProviderDeleteRequestCreation(realm, id, provider).bodyToMono(localVarReturnType);
    }

    /**
     * Remove a social login provider from user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param provider Social login provider id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdFederatedIdentityProviderDeleteWithHttpInfo(String realm, String id, String provider) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdFederatedIdentityProviderDeleteRequestCreation(realm, id, provider).toEntity(localVarReturnType);
    }

    /**
     * Remove a social login provider from user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param provider Social login provider id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdFederatedIdentityProviderDeleteWithResponseSpec(String realm, String id, String provider) throws WebClientResponseException {
        return realmUsersIdFederatedIdentityProviderDeleteRequestCreation(realm, id, provider);
    }
    /**
     * Add a social login provider to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param provider Social login provider id
     * @param federatedIdentityRepresentationDto The federatedIdentityRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdFederatedIdentityProviderPostRequestCreation(String realm, String id, String provider, FederatedIdentityRepresentationDto federatedIdentityRepresentationDto) throws WebClientResponseException {
        Object postBody = federatedIdentityRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdFederatedIdentityProviderPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdFederatedIdentityProviderPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'provider' is set
        if (provider == null) {
            throw new WebClientResponseException("Missing the required parameter 'provider' when calling realmUsersIdFederatedIdentityProviderPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'federatedIdentityRepresentationDto' is set
        if (federatedIdentityRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'federatedIdentityRepresentationDto' when calling realmUsersIdFederatedIdentityProviderPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("provider", provider);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/federated-identity/{provider}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add a social login provider to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param provider Social login provider id
     * @param federatedIdentityRepresentationDto The federatedIdentityRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdFederatedIdentityProviderPost(String realm, String id, String provider, FederatedIdentityRepresentationDto federatedIdentityRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdFederatedIdentityProviderPostRequestCreation(realm, id, provider, federatedIdentityRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Add a social login provider to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param provider Social login provider id
     * @param federatedIdentityRepresentationDto The federatedIdentityRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdFederatedIdentityProviderPostWithHttpInfo(String realm, String id, String provider, FederatedIdentityRepresentationDto federatedIdentityRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdFederatedIdentityProviderPostRequestCreation(realm, id, provider, federatedIdentityRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Add a social login provider to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param provider Social login provider id
     * @param federatedIdentityRepresentationDto The federatedIdentityRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdFederatedIdentityProviderPostWithResponseSpec(String realm, String id, String provider, FederatedIdentityRepresentationDto federatedIdentityRepresentationDto) throws WebClientResponseException {
        return realmUsersIdFederatedIdentityProviderPostRequestCreation(realm, id, provider, federatedIdentityRepresentationDto);
    }
    /**
     * Get representation of the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return UserRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<UserRepresentationDto> localVarReturnType = new ParameterizedTypeReference<UserRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get representation of the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return UserRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserRepresentationDto> realmUsersIdGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<UserRepresentationDto> localVarReturnType = new ParameterizedTypeReference<UserRepresentationDto>() {};
        return realmUsersIdGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get representation of the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseEntity&lt;UserRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UserRepresentationDto>> realmUsersIdGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<UserRepresentationDto> localVarReturnType = new ParameterizedTypeReference<UserRepresentationDto>() {};
        return realmUsersIdGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Get representation of the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmUsersIdGetRequestCreation(realm, id);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param search The search parameter
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdGroupsCountGetRequestCreation(String realm, String id, String search) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdGroupsCountGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdGroupsCountGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/groups/count", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param search The search parameter
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, Object>> realmUsersIdGroupsCountGet(String realm, String id, String search) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmUsersIdGroupsCountGetRequestCreation(realm, id, search).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param search The search parameter
     * @return ResponseEntity&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Map<String, Object>>> realmUsersIdGroupsCountGetWithHttpInfo(String realm, String id, String search) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmUsersIdGroupsCountGetRequestCreation(realm, id, search).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param search The search parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdGroupsCountGetWithResponseSpec(String realm, String id, String search) throws WebClientResponseException {
        return realmUsersIdGroupsCountGetRequestCreation(realm, id, search);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param briefRepresentation The briefRepresentation parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdGroupsGetRequestCreation(String realm, String id, Boolean briefRepresentation, Integer first, Integer max, String search) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdGroupsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdGroupsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "briefRepresentation", briefRepresentation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "first", first));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/groups", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param briefRepresentation The briefRepresentation parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersIdGroupsGet(String realm, String id, Boolean briefRepresentation, Integer first, Integer max, String search) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdGroupsGetRequestCreation(realm, id, briefRepresentation, first, max, search).bodyToFlux(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param briefRepresentation The briefRepresentation parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersIdGroupsGetWithHttpInfo(String realm, String id, Boolean briefRepresentation, Integer first, Integer max, String search) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdGroupsGetRequestCreation(realm, id, briefRepresentation, first, max, search).toEntityList(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param briefRepresentation The briefRepresentation parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdGroupsGetWithResponseSpec(String realm, String id, Boolean briefRepresentation, Integer first, Integer max, String search) throws WebClientResponseException {
        return realmUsersIdGroupsGetRequestCreation(realm, id, briefRepresentation, first, max, search);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param groupId The groupId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdGroupsGroupIdDeleteRequestCreation(String realm, String id, String groupId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdGroupsGroupIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdGroupsGroupIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new WebClientResponseException("Missing the required parameter 'groupId' when calling realmUsersIdGroupsGroupIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("groupId", groupId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/groups/{groupId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param groupId The groupId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdGroupsGroupIdDelete(String realm, String id, String groupId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdGroupsGroupIdDeleteRequestCreation(realm, id, groupId).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param groupId The groupId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdGroupsGroupIdDeleteWithHttpInfo(String realm, String id, String groupId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdGroupsGroupIdDeleteRequestCreation(realm, id, groupId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param groupId The groupId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdGroupsGroupIdDeleteWithResponseSpec(String realm, String id, String groupId) throws WebClientResponseException {
        return realmUsersIdGroupsGroupIdDeleteRequestCreation(realm, id, groupId);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param groupId The groupId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdGroupsGroupIdPutRequestCreation(String realm, String id, String groupId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdGroupsGroupIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdGroupsGroupIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new WebClientResponseException("Missing the required parameter 'groupId' when calling realmUsersIdGroupsGroupIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("groupId", groupId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/groups/{groupId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param groupId The groupId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdGroupsGroupIdPut(String realm, String id, String groupId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdGroupsGroupIdPutRequestCreation(realm, id, groupId).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param groupId The groupId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdGroupsGroupIdPutWithHttpInfo(String realm, String id, String groupId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdGroupsGroupIdPutRequestCreation(realm, id, groupId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param groupId The groupId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdGroupsGroupIdPutWithResponseSpec(String realm, String id, String groupId) throws WebClientResponseException {
        return realmUsersIdGroupsGroupIdPutRequestCreation(realm, id, groupId);
    }
    /**
     * Impersonate the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdImpersonationPostRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdImpersonationPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdImpersonationPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/impersonation", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Impersonate the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, Object>> realmUsersIdImpersonationPost(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmUsersIdImpersonationPostRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Impersonate the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseEntity&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Map<String, Object>>> realmUsersIdImpersonationPostWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmUsersIdImpersonationPostRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Impersonate the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdImpersonationPostWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmUsersIdImpersonationPostRequestCreation(realm, id);
    }
    /**
     * Remove all user sessions associated with the user   Also send notification to all clients that have an admin URL to invalidate the sessions for the particular user.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdLogoutPostRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdLogoutPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdLogoutPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/logout", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove all user sessions associated with the user   Also send notification to all clients that have an admin URL to invalidate the sessions for the particular user.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdLogoutPost(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdLogoutPostRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Remove all user sessions associated with the user   Also send notification to all clients that have an admin URL to invalidate the sessions for the particular user.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdLogoutPostWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdLogoutPostRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Remove all user sessions associated with the user   Also send notification to all clients that have an admin URL to invalidate the sessions for the particular user.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdLogoutPostWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmUsersIdLogoutPostRequestCreation(realm, id);
    }
    /**
     * Get offline sessions associated with the user and client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param clientUuid The clientUuid parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdOfflineSessionsClientUuidGetRequestCreation(String realm, String id, String clientUuid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdOfflineSessionsClientUuidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdOfflineSessionsClientUuidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientUuid' is set
        if (clientUuid == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientUuid' when calling realmUsersIdOfflineSessionsClientUuidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("clientUuid", clientUuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/offline-sessions/{clientUuid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get offline sessions associated with the user and client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param clientUuid The clientUuid parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersIdOfflineSessionsClientUuidGet(String realm, String id, String clientUuid) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdOfflineSessionsClientUuidGetRequestCreation(realm, id, clientUuid).bodyToFlux(localVarReturnType);
    }

    /**
     * Get offline sessions associated with the user and client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param clientUuid The clientUuid parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersIdOfflineSessionsClientUuidGetWithHttpInfo(String realm, String id, String clientUuid) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdOfflineSessionsClientUuidGetRequestCreation(realm, id, clientUuid).toEntityList(localVarReturnType);
    }

    /**
     * Get offline sessions associated with the user and client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param clientUuid The clientUuid parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdOfflineSessionsClientUuidGetWithResponseSpec(String realm, String id, String clientUuid) throws WebClientResponseException {
        return realmUsersIdOfflineSessionsClientUuidGetRequestCreation(realm, id, clientUuid);
    }
    /**
     * Update the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param userRepresentationDto The userRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdPutRequestCreation(String realm, String id, UserRepresentationDto userRepresentationDto) throws WebClientResponseException {
        Object postBody = userRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'userRepresentationDto' is set
        if (userRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'userRepresentationDto' when calling realmUsersIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param userRepresentationDto The userRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdPut(String realm, String id, UserRepresentationDto userRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdPutRequestCreation(realm, id, userRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param userRepresentationDto The userRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdPutWithHttpInfo(String realm, String id, UserRepresentationDto userRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdPutRequestCreation(realm, id, userRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param userRepresentationDto The userRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdPutWithResponseSpec(String realm, String id, UserRepresentationDto userRepresentationDto) throws WebClientResponseException {
        return realmUsersIdPutRequestCreation(realm, id, userRepresentationDto);
    }
    /**
     * Set up a new password for the user.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialRepresentationDto The representation must contain a rawPassword with the plain-text password
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdResetPasswordPutRequestCreation(String realm, String id, CredentialRepresentationDto credentialRepresentationDto) throws WebClientResponseException {
        Object postBody = credentialRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdResetPasswordPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdResetPasswordPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'credentialRepresentationDto' is set
        if (credentialRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'credentialRepresentationDto' when calling realmUsersIdResetPasswordPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/reset-password", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set up a new password for the user.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialRepresentationDto The representation must contain a rawPassword with the plain-text password
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdResetPasswordPut(String realm, String id, CredentialRepresentationDto credentialRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdResetPasswordPutRequestCreation(realm, id, credentialRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Set up a new password for the user.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialRepresentationDto The representation must contain a rawPassword with the plain-text password
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdResetPasswordPutWithHttpInfo(String realm, String id, CredentialRepresentationDto credentialRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdResetPasswordPutRequestCreation(realm, id, credentialRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Set up a new password for the user.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param credentialRepresentationDto The representation must contain a rawPassword with the plain-text password
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdResetPasswordPutWithResponseSpec(String realm, String id, CredentialRepresentationDto credentialRepresentationDto) throws WebClientResponseException {
        return realmUsersIdResetPasswordPutRequestCreation(realm, id, credentialRepresentationDto);
    }
    /**
     * Send an email-verification email to the user   An email contains a link the user can click to verify their email address.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param clientId Client id
     * @param redirectUri Redirect uri
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdSendVerifyEmailPutRequestCreation(String realm, String id, String clientId, String redirectUri) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdSendVerifyEmailPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdSendVerifyEmailPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "client_id", clientId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "redirect_uri", redirectUri));

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/send-verify-email", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Send an email-verification email to the user   An email contains a link the user can click to verify their email address.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param clientId Client id
     * @param redirectUri Redirect uri
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdSendVerifyEmailPut(String realm, String id, String clientId, String redirectUri) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdSendVerifyEmailPutRequestCreation(realm, id, clientId, redirectUri).bodyToMono(localVarReturnType);
    }

    /**
     * Send an email-verification email to the user   An email contains a link the user can click to verify their email address.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param clientId Client id
     * @param redirectUri Redirect uri
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdSendVerifyEmailPutWithHttpInfo(String realm, String id, String clientId, String redirectUri) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdSendVerifyEmailPutRequestCreation(realm, id, clientId, redirectUri).toEntity(localVarReturnType);
    }

    /**
     * Send an email-verification email to the user   An email contains a link the user can click to verify their email address.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param clientId Client id
     * @param redirectUri Redirect uri
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdSendVerifyEmailPutWithResponseSpec(String realm, String id, String clientId, String redirectUri) throws WebClientResponseException {
        return realmUsersIdSendVerifyEmailPutRequestCreation(realm, id, clientId, redirectUri);
    }
    /**
     * Get sessions associated with the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdSessionsGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdSessionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdSessionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/sessions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get sessions associated with the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersIdSessionsGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdSessionsGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get sessions associated with the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersIdSessionsGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdSessionsGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get sessions associated with the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdSessionsGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmUsersIdSessionsGetRequestCreation(realm, id);
    }
    /**
     * Create a new user   Username must be unique.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param userRepresentationDto The userRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersPostRequestCreation(String realm, UserRepresentationDto userRepresentationDto) throws WebClientResponseException {
        Object postBody = userRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'userRepresentationDto' is set
        if (userRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'userRepresentationDto' when calling realmUsersPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new user   Username must be unique.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param userRepresentationDto The userRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersPost(String realm, UserRepresentationDto userRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersPostRequestCreation(realm, userRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Create a new user   Username must be unique.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param userRepresentationDto The userRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersPostWithHttpInfo(String realm, UserRepresentationDto userRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersPostRequestCreation(realm, userRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Create a new user   Username must be unique.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param userRepresentationDto The userRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersPostWithResponseSpec(String realm, UserRepresentationDto userRepresentationDto) throws WebClientResponseException {
        return realmUsersPostRequestCreation(realm, userRepresentationDto);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return String
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersProfileGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersProfileGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/{realm}/users/profile", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return String
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<String> realmUsersProfileGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return realmUsersProfileGetRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;String&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<String>> realmUsersProfileGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return realmUsersProfileGetRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersProfileGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmUsersProfileGetRequestCreation(realm);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param body The body parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersProfilePutRequestCreation(String realm, String body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersProfilePut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling realmUsersProfilePut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/users/profile", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param body The body parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersProfilePut(String realm, String body) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersProfilePutRequestCreation(realm, body).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param body The body parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersProfilePutWithHttpInfo(String realm, String body) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersProfilePutRequestCreation(realm, body).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersProfilePutWithResponseSpec(String realm, String body) throws WebClientResponseException {
        return realmUsersProfilePutRequestCreation(realm, body);
    }
}

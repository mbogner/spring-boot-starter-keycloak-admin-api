package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.RoleRepresentationDto;

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
public class ScopeMappingsApi {
    private ApiClient apiClient;

    public ScopeMappingsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ScopeMappingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * The available client-level roles   Returns the roles for the client that can be associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdScopeMappingsClientsClientAvailableGetRequestCreation(String realm, String id, String client) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdScopeMappingsClientsClientAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdScopeMappingsClientsClientAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmClientScopesIdScopeMappingsClientsClientAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}/scope-mappings/clients/{client}/available", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * The available client-level roles   Returns the roles for the client that can be associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientScopesIdScopeMappingsClientsClientAvailableGet(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdScopeMappingsClientsClientAvailableGetRequestCreation(realm, id, client).bodyToFlux(localVarReturnType);
    }

    /**
     * The available client-level roles   Returns the roles for the client that can be associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientScopesIdScopeMappingsClientsClientAvailableGetWithHttpInfo(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdScopeMappingsClientsClientAvailableGetRequestCreation(realm, id, client).toEntityList(localVarReturnType);
    }

    /**
     * The available client-level roles   Returns the roles for the client that can be associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdScopeMappingsClientsClientAvailableGetWithResponseSpec(String realm, String id, String client) throws WebClientResponseException {
        return realmClientScopesIdScopeMappingsClientsClientAvailableGetRequestCreation(realm, id, client);
    }
    /**
     * Get effective client roles   Returns the roles for the client that are associated with the client’s scope.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdScopeMappingsClientsClientCompositeGetRequestCreation(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdScopeMappingsClientsClientCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdScopeMappingsClientsClientCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmClientScopesIdScopeMappingsClientsClientCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "briefRepresentation", briefRepresentation));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}/scope-mappings/clients/{client}/composite", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get effective client roles   Returns the roles for the client that are associated with the client’s scope.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientScopesIdScopeMappingsClientsClientCompositeGet(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdScopeMappingsClientsClientCompositeGetRequestCreation(realm, id, client, briefRepresentation).bodyToFlux(localVarReturnType);
    }

    /**
     * Get effective client roles   Returns the roles for the client that are associated with the client’s scope.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientScopesIdScopeMappingsClientsClientCompositeGetWithHttpInfo(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdScopeMappingsClientsClientCompositeGetRequestCreation(realm, id, client, briefRepresentation).toEntityList(localVarReturnType);
    }

    /**
     * Get effective client roles   Returns the roles for the client that are associated with the client’s scope.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdScopeMappingsClientsClientCompositeGetWithResponseSpec(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        return realmClientScopesIdScopeMappingsClientsClientCompositeGetRequestCreation(realm, id, client, briefRepresentation);
    }
    /**
     * Get the roles associated with a client’s scope   Returns roles for the client.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdScopeMappingsClientsClientGetRequestCreation(String realm, String id, String client) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdScopeMappingsClientsClientGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdScopeMappingsClientsClientGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmClientScopesIdScopeMappingsClientsClientGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}/scope-mappings/clients/{client}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the roles associated with a client’s scope   Returns roles for the client.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientScopesIdScopeMappingsClientsClientGet(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdScopeMappingsClientsClientGetRequestCreation(realm, id, client).bodyToFlux(localVarReturnType);
    }

    /**
     * Get the roles associated with a client’s scope   Returns roles for the client.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientScopesIdScopeMappingsClientsClientGetWithHttpInfo(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdScopeMappingsClientsClientGetRequestCreation(realm, id, client).toEntityList(localVarReturnType);
    }

    /**
     * Get the roles associated with a client’s scope   Returns roles for the client.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdScopeMappingsClientsClientGetWithResponseSpec(String realm, String id, String client) throws WebClientResponseException {
        return realmClientScopesIdScopeMappingsClientsClientGetRequestCreation(realm, id, client);
    }
    /**
     * Add client-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdScopeMappingsClientsClientPostRequestCreation(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdScopeMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdScopeMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmClientScopesIdScopeMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmClientScopesIdScopeMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}/scope-mappings/clients/{client}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add client-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientScopesIdScopeMappingsClientsClientPost(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesIdScopeMappingsClientsClientPostRequestCreation(realm, id, client, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Add client-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientScopesIdScopeMappingsClientsClientPostWithHttpInfo(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesIdScopeMappingsClientsClientPostRequestCreation(realm, id, client, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Add client-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdScopeMappingsClientsClientPostWithResponseSpec(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmClientScopesIdScopeMappingsClientsClientPostRequestCreation(realm, id, client, roleRepresentationDto);
    }
    /**
     * Get realm-level roles that are available to attach to this client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdScopeMappingsRealmAvailableGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdScopeMappingsRealmAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdScopeMappingsRealmAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}/scope-mappings/realm/available", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get realm-level roles that are available to attach to this client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientScopesIdScopeMappingsRealmAvailableGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdScopeMappingsRealmAvailableGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get realm-level roles that are available to attach to this client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientScopesIdScopeMappingsRealmAvailableGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdScopeMappingsRealmAvailableGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get realm-level roles that are available to attach to this client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdScopeMappingsRealmAvailableGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientScopesIdScopeMappingsRealmAvailableGetRequestCreation(realm, id);
    }
    /**
     * Get effective realm-level roles associated with the client’s scope   What this does is recurse  any composite roles associated with the client’s scope and adds the roles to this lists.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdScopeMappingsRealmCompositeGetRequestCreation(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdScopeMappingsRealmCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdScopeMappingsRealmCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}/scope-mappings/realm/composite", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get effective realm-level roles associated with the client’s scope   What this does is recurse  any composite roles associated with the client’s scope and adds the roles to this lists.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientScopesIdScopeMappingsRealmCompositeGet(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdScopeMappingsRealmCompositeGetRequestCreation(realm, id, briefRepresentation).bodyToFlux(localVarReturnType);
    }

    /**
     * Get effective realm-level roles associated with the client’s scope   What this does is recurse  any composite roles associated with the client’s scope and adds the roles to this lists.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientScopesIdScopeMappingsRealmCompositeGetWithHttpInfo(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdScopeMappingsRealmCompositeGetRequestCreation(realm, id, briefRepresentation).toEntityList(localVarReturnType);
    }

    /**
     * Get effective realm-level roles associated with the client’s scope   What this does is recurse  any composite roles associated with the client’s scope and adds the roles to this lists.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdScopeMappingsRealmCompositeGetWithResponseSpec(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        return realmClientScopesIdScopeMappingsRealmCompositeGetRequestCreation(realm, id, briefRepresentation);
    }
    /**
     * Get realm-level roles associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdScopeMappingsRealmGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdScopeMappingsRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdScopeMappingsRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}/scope-mappings/realm", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get realm-level roles associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientScopesIdScopeMappingsRealmGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdScopeMappingsRealmGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get realm-level roles associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientScopesIdScopeMappingsRealmGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdScopeMappingsRealmGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get realm-level roles associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdScopeMappingsRealmGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientScopesIdScopeMappingsRealmGetRequestCreation(realm, id);
    }
    /**
     * Add a set of realm-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdScopeMappingsRealmPostRequestCreation(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdScopeMappingsRealmPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdScopeMappingsRealmPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmClientScopesIdScopeMappingsRealmPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}/scope-mappings/realm", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add a set of realm-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientScopesIdScopeMappingsRealmPost(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesIdScopeMappingsRealmPostRequestCreation(realm, id, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Add a set of realm-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientScopesIdScopeMappingsRealmPostWithHttpInfo(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesIdScopeMappingsRealmPostRequestCreation(realm, id, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Add a set of realm-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdScopeMappingsRealmPostWithResponseSpec(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmClientScopesIdScopeMappingsRealmPostRequestCreation(realm, id, roleRepresentationDto);
    }
    /**
     * The available client-level roles   Returns the roles for the client that can be associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdScopeMappingsClientsClientAvailableGetRequestCreation(String realm, String id, String client) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdScopeMappingsClientsClientAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdScopeMappingsClientsClientAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmClientsIdScopeMappingsClientsClientAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/scope-mappings/clients/{client}/available", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * The available client-level roles   Returns the roles for the client that can be associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdScopeMappingsClientsClientAvailableGet(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdScopeMappingsClientsClientAvailableGetRequestCreation(realm, id, client).bodyToFlux(localVarReturnType);
    }

    /**
     * The available client-level roles   Returns the roles for the client that can be associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdScopeMappingsClientsClientAvailableGetWithHttpInfo(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdScopeMappingsClientsClientAvailableGetRequestCreation(realm, id, client).toEntityList(localVarReturnType);
    }

    /**
     * The available client-level roles   Returns the roles for the client that can be associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdScopeMappingsClientsClientAvailableGetWithResponseSpec(String realm, String id, String client) throws WebClientResponseException {
        return realmClientsIdScopeMappingsClientsClientAvailableGetRequestCreation(realm, id, client);
    }
    /**
     * Get effective client roles   Returns the roles for the client that are associated with the client’s scope.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdScopeMappingsClientsClientCompositeGetRequestCreation(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdScopeMappingsClientsClientCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdScopeMappingsClientsClientCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmClientsIdScopeMappingsClientsClientCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "briefRepresentation", briefRepresentation));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/scope-mappings/clients/{client}/composite", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get effective client roles   Returns the roles for the client that are associated with the client’s scope.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdScopeMappingsClientsClientCompositeGet(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdScopeMappingsClientsClientCompositeGetRequestCreation(realm, id, client, briefRepresentation).bodyToFlux(localVarReturnType);
    }

    /**
     * Get effective client roles   Returns the roles for the client that are associated with the client’s scope.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdScopeMappingsClientsClientCompositeGetWithHttpInfo(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdScopeMappingsClientsClientCompositeGetRequestCreation(realm, id, client, briefRepresentation).toEntityList(localVarReturnType);
    }

    /**
     * Get effective client roles   Returns the roles for the client that are associated with the client’s scope.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdScopeMappingsClientsClientCompositeGetWithResponseSpec(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        return realmClientsIdScopeMappingsClientsClientCompositeGetRequestCreation(realm, id, client, briefRepresentation);
    }
    /**
     * Get the roles associated with a client’s scope   Returns roles for the client.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdScopeMappingsClientsClientGetRequestCreation(String realm, String id, String client) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdScopeMappingsClientsClientGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdScopeMappingsClientsClientGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmClientsIdScopeMappingsClientsClientGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/scope-mappings/clients/{client}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the roles associated with a client’s scope   Returns roles for the client.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdScopeMappingsClientsClientGet(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdScopeMappingsClientsClientGetRequestCreation(realm, id, client).bodyToFlux(localVarReturnType);
    }

    /**
     * Get the roles associated with a client’s scope   Returns roles for the client.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdScopeMappingsClientsClientGetWithHttpInfo(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdScopeMappingsClientsClientGetRequestCreation(realm, id, client).toEntityList(localVarReturnType);
    }

    /**
     * Get the roles associated with a client’s scope   Returns roles for the client.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdScopeMappingsClientsClientGetWithResponseSpec(String realm, String id, String client) throws WebClientResponseException {
        return realmClientsIdScopeMappingsClientsClientGetRequestCreation(realm, id, client);
    }
    /**
     * Add client-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdScopeMappingsClientsClientPostRequestCreation(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdScopeMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdScopeMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmClientsIdScopeMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmClientsIdScopeMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/scope-mappings/clients/{client}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add client-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdScopeMappingsClientsClientPost(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdScopeMappingsClientsClientPostRequestCreation(realm, id, client, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Add client-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdScopeMappingsClientsClientPostWithHttpInfo(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdScopeMappingsClientsClientPostRequestCreation(realm, id, client, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Add client-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdScopeMappingsClientsClientPostWithResponseSpec(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmClientsIdScopeMappingsClientsClientPostRequestCreation(realm, id, client, roleRepresentationDto);
    }
    /**
     * Get realm-level roles that are available to attach to this client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdScopeMappingsRealmAvailableGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdScopeMappingsRealmAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdScopeMappingsRealmAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/scope-mappings/realm/available", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get realm-level roles that are available to attach to this client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdScopeMappingsRealmAvailableGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdScopeMappingsRealmAvailableGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get realm-level roles that are available to attach to this client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdScopeMappingsRealmAvailableGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdScopeMappingsRealmAvailableGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get realm-level roles that are available to attach to this client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdScopeMappingsRealmAvailableGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdScopeMappingsRealmAvailableGetRequestCreation(realm, id);
    }
    /**
     * Get effective realm-level roles associated with the client’s scope   What this does is recurse  any composite roles associated with the client’s scope and adds the roles to this lists.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdScopeMappingsRealmCompositeGetRequestCreation(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdScopeMappingsRealmCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdScopeMappingsRealmCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/scope-mappings/realm/composite", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get effective realm-level roles associated with the client’s scope   What this does is recurse  any composite roles associated with the client’s scope and adds the roles to this lists.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdScopeMappingsRealmCompositeGet(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdScopeMappingsRealmCompositeGetRequestCreation(realm, id, briefRepresentation).bodyToFlux(localVarReturnType);
    }

    /**
     * Get effective realm-level roles associated with the client’s scope   What this does is recurse  any composite roles associated with the client’s scope and adds the roles to this lists.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdScopeMappingsRealmCompositeGetWithHttpInfo(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdScopeMappingsRealmCompositeGetRequestCreation(realm, id, briefRepresentation).toEntityList(localVarReturnType);
    }

    /**
     * Get effective realm-level roles associated with the client’s scope   What this does is recurse  any composite roles associated with the client’s scope and adds the roles to this lists.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdScopeMappingsRealmCompositeGetWithResponseSpec(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        return realmClientsIdScopeMappingsRealmCompositeGetRequestCreation(realm, id, briefRepresentation);
    }
    /**
     * Get realm-level roles associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdScopeMappingsRealmGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdScopeMappingsRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdScopeMappingsRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/scope-mappings/realm", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get realm-level roles associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdScopeMappingsRealmGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdScopeMappingsRealmGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get realm-level roles associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdScopeMappingsRealmGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdScopeMappingsRealmGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get realm-level roles associated with the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdScopeMappingsRealmGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdScopeMappingsRealmGetRequestCreation(realm, id);
    }
    /**
     * Add a set of realm-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdScopeMappingsRealmPostRequestCreation(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdScopeMappingsRealmPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdScopeMappingsRealmPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmClientsIdScopeMappingsRealmPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/scope-mappings/realm", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add a set of realm-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdScopeMappingsRealmPost(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdScopeMappingsRealmPostRequestCreation(realm, id, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Add a set of realm-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdScopeMappingsRealmPostWithHttpInfo(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdScopeMappingsRealmPostRequestCreation(realm, id, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Add a set of realm-level roles to the client’s scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdScopeMappingsRealmPostWithResponseSpec(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmClientsIdScopeMappingsRealmPostRequestCreation(realm, id, roleRepresentationDto);
    }
}

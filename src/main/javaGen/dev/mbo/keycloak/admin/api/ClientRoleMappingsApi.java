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
public class ClientRoleMappingsApi {
    private ApiClient apiClient;

    public ClientRoleMappingsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ClientRoleMappingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get available client-level roles that can be mapped to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdRoleMappingsClientsClientAvailableGetRequestCreation(String realm, String id, String client) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdRoleMappingsClientsClientAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdRoleMappingsClientsClientAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmGroupsIdRoleMappingsClientsClientAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/groups/{id}/role-mappings/clients/{client}/available", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get available client-level roles that can be mapped to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmGroupsIdRoleMappingsClientsClientAvailableGet(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdRoleMappingsClientsClientAvailableGetRequestCreation(realm, id, client).bodyToFlux(localVarReturnType);
    }

    /**
     * Get available client-level roles that can be mapped to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmGroupsIdRoleMappingsClientsClientAvailableGetWithHttpInfo(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdRoleMappingsClientsClientAvailableGetRequestCreation(realm, id, client).toEntityList(localVarReturnType);
    }

    /**
     * Get available client-level roles that can be mapped to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdRoleMappingsClientsClientAvailableGetWithResponseSpec(String realm, String id, String client) throws WebClientResponseException {
        return realmGroupsIdRoleMappingsClientsClientAvailableGetRequestCreation(realm, id, client);
    }
    /**
     * Get effective client-level role mappings   This recurses any composite roles
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdRoleMappingsClientsClientCompositeGetRequestCreation(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdRoleMappingsClientsClientCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdRoleMappingsClientsClientCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmGroupsIdRoleMappingsClientsClientCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/groups/{id}/role-mappings/clients/{client}/composite", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get effective client-level role mappings   This recurses any composite roles
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmGroupsIdRoleMappingsClientsClientCompositeGet(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdRoleMappingsClientsClientCompositeGetRequestCreation(realm, id, client, briefRepresentation).bodyToFlux(localVarReturnType);
    }

    /**
     * Get effective client-level role mappings   This recurses any composite roles
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmGroupsIdRoleMappingsClientsClientCompositeGetWithHttpInfo(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdRoleMappingsClientsClientCompositeGetRequestCreation(realm, id, client, briefRepresentation).toEntityList(localVarReturnType);
    }

    /**
     * Get effective client-level role mappings   This recurses any composite roles
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdRoleMappingsClientsClientCompositeGetWithResponseSpec(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        return realmGroupsIdRoleMappingsClientsClientCompositeGetRequestCreation(realm, id, client, briefRepresentation);
    }
    /**
     * Delete client-level roles from user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdRoleMappingsClientsClientDeleteRequestCreation(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdRoleMappingsClientsClientDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdRoleMappingsClientsClientDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmGroupsIdRoleMappingsClientsClientDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmGroupsIdRoleMappingsClientsClientDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/groups/{id}/role-mappings/clients/{client}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete client-level roles from user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmGroupsIdRoleMappingsClientsClientDelete(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsIdRoleMappingsClientsClientDeleteRequestCreation(realm, id, client, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Delete client-level roles from user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmGroupsIdRoleMappingsClientsClientDeleteWithHttpInfo(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsIdRoleMappingsClientsClientDeleteRequestCreation(realm, id, client, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Delete client-level roles from user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdRoleMappingsClientsClientDeleteWithResponseSpec(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmGroupsIdRoleMappingsClientsClientDeleteRequestCreation(realm, id, client, roleRepresentationDto);
    }
    /**
     * Get client-level role mappings for the user, and the app
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdRoleMappingsClientsClientGetRequestCreation(String realm, String id, String client) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdRoleMappingsClientsClientGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdRoleMappingsClientsClientGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmGroupsIdRoleMappingsClientsClientGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/groups/{id}/role-mappings/clients/{client}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get client-level role mappings for the user, and the app
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmGroupsIdRoleMappingsClientsClientGet(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdRoleMappingsClientsClientGetRequestCreation(realm, id, client).bodyToFlux(localVarReturnType);
    }

    /**
     * Get client-level role mappings for the user, and the app
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmGroupsIdRoleMappingsClientsClientGetWithHttpInfo(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdRoleMappingsClientsClientGetRequestCreation(realm, id, client).toEntityList(localVarReturnType);
    }

    /**
     * Get client-level role mappings for the user, and the app
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdRoleMappingsClientsClientGetWithResponseSpec(String realm, String id, String client) throws WebClientResponseException {
        return realmGroupsIdRoleMappingsClientsClientGetRequestCreation(realm, id, client);
    }
    /**
     * Add client-level roles to the user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdRoleMappingsClientsClientPostRequestCreation(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdRoleMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdRoleMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmGroupsIdRoleMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmGroupsIdRoleMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/groups/{id}/role-mappings/clients/{client}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add client-level roles to the user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmGroupsIdRoleMappingsClientsClientPost(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsIdRoleMappingsClientsClientPostRequestCreation(realm, id, client, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Add client-level roles to the user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmGroupsIdRoleMappingsClientsClientPostWithHttpInfo(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsIdRoleMappingsClientsClientPostRequestCreation(realm, id, client, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Add client-level roles to the user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdRoleMappingsClientsClientPostWithResponseSpec(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmGroupsIdRoleMappingsClientsClientPostRequestCreation(realm, id, client, roleRepresentationDto);
    }
    /**
     * Get available client-level roles that can be mapped to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdRoleMappingsClientsClientAvailableGetRequestCreation(String realm, String id, String client) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdRoleMappingsClientsClientAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdRoleMappingsClientsClientAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmUsersIdRoleMappingsClientsClientAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/users/{id}/role-mappings/clients/{client}/available", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get available client-level roles that can be mapped to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersIdRoleMappingsClientsClientAvailableGet(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdRoleMappingsClientsClientAvailableGetRequestCreation(realm, id, client).bodyToFlux(localVarReturnType);
    }

    /**
     * Get available client-level roles that can be mapped to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersIdRoleMappingsClientsClientAvailableGetWithHttpInfo(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdRoleMappingsClientsClientAvailableGetRequestCreation(realm, id, client).toEntityList(localVarReturnType);
    }

    /**
     * Get available client-level roles that can be mapped to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdRoleMappingsClientsClientAvailableGetWithResponseSpec(String realm, String id, String client) throws WebClientResponseException {
        return realmUsersIdRoleMappingsClientsClientAvailableGetRequestCreation(realm, id, client);
    }
    /**
     * Get effective client-level role mappings   This recurses any composite roles
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdRoleMappingsClientsClientCompositeGetRequestCreation(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdRoleMappingsClientsClientCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdRoleMappingsClientsClientCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmUsersIdRoleMappingsClientsClientCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/users/{id}/role-mappings/clients/{client}/composite", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get effective client-level role mappings   This recurses any composite roles
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersIdRoleMappingsClientsClientCompositeGet(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdRoleMappingsClientsClientCompositeGetRequestCreation(realm, id, client, briefRepresentation).bodyToFlux(localVarReturnType);
    }

    /**
     * Get effective client-level role mappings   This recurses any composite roles
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersIdRoleMappingsClientsClientCompositeGetWithHttpInfo(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdRoleMappingsClientsClientCompositeGetRequestCreation(realm, id, client, briefRepresentation).toEntityList(localVarReturnType);
    }

    /**
     * Get effective client-level role mappings   This recurses any composite roles
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdRoleMappingsClientsClientCompositeGetWithResponseSpec(String realm, String id, String client, Boolean briefRepresentation) throws WebClientResponseException {
        return realmUsersIdRoleMappingsClientsClientCompositeGetRequestCreation(realm, id, client, briefRepresentation);
    }
    /**
     * Delete client-level roles from user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdRoleMappingsClientsClientDeleteRequestCreation(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdRoleMappingsClientsClientDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdRoleMappingsClientsClientDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmUsersIdRoleMappingsClientsClientDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmUsersIdRoleMappingsClientsClientDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/users/{id}/role-mappings/clients/{client}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete client-level roles from user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdRoleMappingsClientsClientDelete(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdRoleMappingsClientsClientDeleteRequestCreation(realm, id, client, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Delete client-level roles from user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdRoleMappingsClientsClientDeleteWithHttpInfo(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdRoleMappingsClientsClientDeleteRequestCreation(realm, id, client, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Delete client-level roles from user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdRoleMappingsClientsClientDeleteWithResponseSpec(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmUsersIdRoleMappingsClientsClientDeleteRequestCreation(realm, id, client, roleRepresentationDto);
    }
    /**
     * Get client-level role mappings for the user, and the app
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdRoleMappingsClientsClientGetRequestCreation(String realm, String id, String client) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdRoleMappingsClientsClientGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdRoleMappingsClientsClientGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmUsersIdRoleMappingsClientsClientGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/users/{id}/role-mappings/clients/{client}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get client-level role mappings for the user, and the app
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersIdRoleMappingsClientsClientGet(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdRoleMappingsClientsClientGetRequestCreation(realm, id, client).bodyToFlux(localVarReturnType);
    }

    /**
     * Get client-level role mappings for the user, and the app
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersIdRoleMappingsClientsClientGetWithHttpInfo(String realm, String id, String client) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdRoleMappingsClientsClientGetRequestCreation(realm, id, client).toEntityList(localVarReturnType);
    }

    /**
     * Get client-level role mappings for the user, and the app
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdRoleMappingsClientsClientGetWithResponseSpec(String realm, String id, String client) throws WebClientResponseException {
        return realmUsersIdRoleMappingsClientsClientGetRequestCreation(realm, id, client);
    }
    /**
     * Add client-level roles to the user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdRoleMappingsClientsClientPostRequestCreation(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdRoleMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdRoleMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new WebClientResponseException("Missing the required parameter 'client' when calling realmUsersIdRoleMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmUsersIdRoleMappingsClientsClientPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/users/{id}/role-mappings/clients/{client}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add client-level roles to the user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdRoleMappingsClientsClientPost(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdRoleMappingsClientsClientPostRequestCreation(realm, id, client, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Add client-level roles to the user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdRoleMappingsClientsClientPostWithHttpInfo(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdRoleMappingsClientsClientPostRequestCreation(realm, id, client, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Add client-level roles to the user role mapping
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param client The client parameter
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdRoleMappingsClientsClientPostWithResponseSpec(String realm, String id, String client, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmUsersIdRoleMappingsClientsClientPostRequestCreation(realm, id, client, roleRepresentationDto);
    }
}

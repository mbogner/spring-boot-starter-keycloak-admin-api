package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.ManagementPermissionReferenceDto;
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
public class RolesApi {
    private ApiClient apiClient;

    public RolesApi() {
        this(new ApiClient());
    }

    @Autowired
    public RolesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all roles for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param briefRepresentation The briefRepresentation parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesGetRequestCreation(String realm, String id, Boolean briefRepresentation, Integer first, Integer max, String search) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all roles for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param briefRepresentation The briefRepresentation parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdRolesGet(String realm, String id, Boolean briefRepresentation, Integer first, Integer max, String search) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdRolesGetRequestCreation(realm, id, briefRepresentation, first, max, search).bodyToFlux(localVarReturnType);
    }

    /**
     * Get all roles for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param briefRepresentation The briefRepresentation parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdRolesGetWithHttpInfo(String realm, String id, Boolean briefRepresentation, Integer first, Integer max, String search) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdRolesGetRequestCreation(realm, id, briefRepresentation, first, max, search).toEntityList(localVarReturnType);
    }

    /**
     * Get all roles for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param briefRepresentation The briefRepresentation parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesGetWithResponseSpec(String realm, String id, Boolean briefRepresentation, Integer first, Integer max, String search) throws WebClientResponseException {
        return realmClientsIdRolesGetRequestCreation(realm, id, briefRepresentation, first, max, search);
    }
    /**
     * Create a new role for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesPostRequestCreation(String realm, String id, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmClientsIdRolesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new role for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdRolesPost(String realm, String id, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdRolesPostRequestCreation(realm, id, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Create a new role for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdRolesPostWithHttpInfo(String realm, String id, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdRolesPostRequestCreation(realm, id, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Create a new role for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesPostWithResponseSpec(String realm, String id, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        return realmClientsIdRolesPostRequestCreation(realm, id, roleRepresentationDto);
    }
    /**
     * Get client-level roles for the client that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param clientUuid The clientUuid parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesRoleNameCompositesClientsClientUuidGetRequestCreation(String realm, String id, String roleName, String clientUuid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesRoleNameCompositesClientsClientUuidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesRoleNameCompositesClientsClientUuidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmClientsIdRolesRoleNameCompositesClientsClientUuidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientUuid' is set
        if (clientUuid == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientUuid' when calling realmClientsIdRolesRoleNameCompositesClientsClientUuidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("role-name", roleName);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles/{role-name}/composites/clients/{clientUuid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get client-level roles for the client that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param clientUuid The clientUuid parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdRolesRoleNameCompositesClientsClientUuidGet(String realm, String id, String roleName, String clientUuid) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdRolesRoleNameCompositesClientsClientUuidGetRequestCreation(realm, id, roleName, clientUuid).bodyToFlux(localVarReturnType);
    }

    /**
     * Get client-level roles for the client that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param clientUuid The clientUuid parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdRolesRoleNameCompositesClientsClientUuidGetWithHttpInfo(String realm, String id, String roleName, String clientUuid) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdRolesRoleNameCompositesClientsClientUuidGetRequestCreation(realm, id, roleName, clientUuid).toEntityList(localVarReturnType);
    }

    /**
     * Get client-level roles for the client that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param clientUuid The clientUuid parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesRoleNameCompositesClientsClientUuidGetWithResponseSpec(String realm, String id, String roleName, String clientUuid) throws WebClientResponseException {
        return realmClientsIdRolesRoleNameCompositesClientsClientUuidGetRequestCreation(realm, id, roleName, clientUuid);
    }
    /**
     * Remove roles from the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto roles to remove
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesRoleNameCompositesDeleteRequestCreation(String realm, String id, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesRoleNameCompositesDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesRoleNameCompositesDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmClientsIdRolesRoleNameCompositesDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmClientsIdRolesRoleNameCompositesDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("role-name", roleName);

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
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles/{role-name}/composites", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove roles from the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto roles to remove
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdRolesRoleNameCompositesDelete(String realm, String id, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdRolesRoleNameCompositesDeleteRequestCreation(realm, id, roleName, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Remove roles from the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto roles to remove
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdRolesRoleNameCompositesDeleteWithHttpInfo(String realm, String id, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdRolesRoleNameCompositesDeleteRequestCreation(realm, id, roleName, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Remove roles from the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto roles to remove
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesRoleNameCompositesDeleteWithResponseSpec(String realm, String id, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmClientsIdRolesRoleNameCompositesDeleteRequestCreation(realm, id, roleName, roleRepresentationDto);
    }
    /**
     * Get composites of the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesRoleNameCompositesGetRequestCreation(String realm, String id, String roleName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesRoleNameCompositesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesRoleNameCompositesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmClientsIdRolesRoleNameCompositesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("role-name", roleName);

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
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles/{role-name}/composites", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get composites of the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdRolesRoleNameCompositesGet(String realm, String id, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdRolesRoleNameCompositesGetRequestCreation(realm, id, roleName).bodyToFlux(localVarReturnType);
    }

    /**
     * Get composites of the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdRolesRoleNameCompositesGetWithHttpInfo(String realm, String id, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdRolesRoleNameCompositesGetRequestCreation(realm, id, roleName).toEntityList(localVarReturnType);
    }

    /**
     * Get composites of the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesRoleNameCompositesGetWithResponseSpec(String realm, String id, String roleName) throws WebClientResponseException {
        return realmClientsIdRolesRoleNameCompositesGetRequestCreation(realm, id, roleName);
    }
    /**
     * Add a composite to the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesRoleNameCompositesPostRequestCreation(String realm, String id, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesRoleNameCompositesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesRoleNameCompositesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmClientsIdRolesRoleNameCompositesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmClientsIdRolesRoleNameCompositesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("role-name", roleName);

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
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles/{role-name}/composites", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add a composite to the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdRolesRoleNameCompositesPost(String realm, String id, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdRolesRoleNameCompositesPostRequestCreation(realm, id, roleName, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Add a composite to the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdRolesRoleNameCompositesPostWithHttpInfo(String realm, String id, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdRolesRoleNameCompositesPostRequestCreation(realm, id, roleName, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Add a composite to the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesRoleNameCompositesPostWithResponseSpec(String realm, String id, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmClientsIdRolesRoleNameCompositesPostRequestCreation(realm, id, roleName, roleRepresentationDto);
    }
    /**
     * Get realm-level roles of the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesRoleNameCompositesRealmGetRequestCreation(String realm, String id, String roleName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesRoleNameCompositesRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesRoleNameCompositesRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmClientsIdRolesRoleNameCompositesRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("role-name", roleName);

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
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles/{role-name}/composites/realm", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get realm-level roles of the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdRolesRoleNameCompositesRealmGet(String realm, String id, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdRolesRoleNameCompositesRealmGetRequestCreation(realm, id, roleName).bodyToFlux(localVarReturnType);
    }

    /**
     * Get realm-level roles of the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdRolesRoleNameCompositesRealmGetWithHttpInfo(String realm, String id, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdRolesRoleNameCompositesRealmGetRequestCreation(realm, id, roleName).toEntityList(localVarReturnType);
    }

    /**
     * Get realm-level roles of the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesRoleNameCompositesRealmGetWithResponseSpec(String realm, String id, String roleName) throws WebClientResponseException {
        return realmClientsIdRolesRoleNameCompositesRealmGetRequestCreation(realm, id, roleName);
    }
    /**
     * Delete a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesRoleNameDeleteRequestCreation(String realm, String id, String roleName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesRoleNameDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesRoleNameDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmClientsIdRolesRoleNameDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("role-name", roleName);

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
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles/{role-name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdRolesRoleNameDelete(String realm, String id, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdRolesRoleNameDeleteRequestCreation(realm, id, roleName).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdRolesRoleNameDeleteWithHttpInfo(String realm, String id, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdRolesRoleNameDeleteRequestCreation(realm, id, roleName).toEntity(localVarReturnType);
    }

    /**
     * Delete a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesRoleNameDeleteWithResponseSpec(String realm, String id, String roleName) throws WebClientResponseException {
        return realmClientsIdRolesRoleNameDeleteRequestCreation(realm, id, roleName);
    }
    /**
     * Get a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @return RoleRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesRoleNameGetRequestCreation(String realm, String id, String roleName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesRoleNameGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesRoleNameGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmClientsIdRolesRoleNameGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("role-name", roleName);

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

        ParameterizedTypeReference<RoleRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RoleRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles/{role-name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @return RoleRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RoleRepresentationDto> realmClientsIdRolesRoleNameGet(String realm, String id, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<RoleRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RoleRepresentationDto>() {};
        return realmClientsIdRolesRoleNameGetRequestCreation(realm, id, roleName).bodyToMono(localVarReturnType);
    }

    /**
     * Get a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @return ResponseEntity&lt;RoleRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RoleRepresentationDto>> realmClientsIdRolesRoleNameGetWithHttpInfo(String realm, String id, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<RoleRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RoleRepresentationDto>() {};
        return realmClientsIdRolesRoleNameGetRequestCreation(realm, id, roleName).toEntity(localVarReturnType);
    }

    /**
     * Get a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesRoleNameGetWithResponseSpec(String realm, String id, String roleName) throws WebClientResponseException {
        return realmClientsIdRolesRoleNameGetRequestCreation(realm, id, roleName);
    }
    /**
     * Returns a stream of groups that have the specified role name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName the role name.
     * @param briefRepresentation if false, return a full representation of the {@code GroupRepresentation} objects.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesRoleNameGroupsGetRequestCreation(String realm, String id, String roleName, Boolean briefRepresentation, Integer first, Integer max) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesRoleNameGroupsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesRoleNameGroupsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmClientsIdRolesRoleNameGroupsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("role-name", roleName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "briefRepresentation", briefRepresentation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "first", first));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles/{role-name}/groups", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a stream of groups that have the specified role name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName the role name.
     * @param briefRepresentation if false, return a full representation of the {@code GroupRepresentation} objects.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdRolesRoleNameGroupsGet(String realm, String id, String roleName, Boolean briefRepresentation, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdRolesRoleNameGroupsGetRequestCreation(realm, id, roleName, briefRepresentation, first, max).bodyToFlux(localVarReturnType);
    }

    /**
     * Returns a stream of groups that have the specified role name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName the role name.
     * @param briefRepresentation if false, return a full representation of the {@code GroupRepresentation} objects.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdRolesRoleNameGroupsGetWithHttpInfo(String realm, String id, String roleName, Boolean briefRepresentation, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdRolesRoleNameGroupsGetRequestCreation(realm, id, roleName, briefRepresentation, first, max).toEntityList(localVarReturnType);
    }

    /**
     * Returns a stream of groups that have the specified role name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName the role name.
     * @param briefRepresentation if false, return a full representation of the {@code GroupRepresentation} objects.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesRoleNameGroupsGetWithResponseSpec(String realm, String id, String roleName, Boolean briefRepresentation, Integer first, Integer max) throws WebClientResponseException {
        return realmClientsIdRolesRoleNameGroupsGetRequestCreation(realm, id, roleName, briefRepresentation, first, max);
    }
    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName The roleName parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesRoleNameManagementPermissionsGetRequestCreation(String realm, String id, String roleName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesRoleNameManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesRoleNameManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmClientsIdRolesRoleNameManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("role-name", roleName);

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

        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles/{role-name}/management/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName The roleName parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmClientsIdRolesRoleNameManagementPermissionsGet(String realm, String id, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmClientsIdRolesRoleNameManagementPermissionsGetRequestCreation(realm, id, roleName).bodyToMono(localVarReturnType);
    }

    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName The roleName parameter
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmClientsIdRolesRoleNameManagementPermissionsGetWithHttpInfo(String realm, String id, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmClientsIdRolesRoleNameManagementPermissionsGetRequestCreation(realm, id, roleName).toEntity(localVarReturnType);
    }

    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName The roleName parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesRoleNameManagementPermissionsGetWithResponseSpec(String realm, String id, String roleName) throws WebClientResponseException {
        return realmClientsIdRolesRoleNameManagementPermissionsGetRequestCreation(realm, id, roleName);
    }
    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName The roleName parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesRoleNameManagementPermissionsPutRequestCreation(String realm, String id, String roleName, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        Object postBody = managementPermissionReferenceDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesRoleNameManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesRoleNameManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmClientsIdRolesRoleNameManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'managementPermissionReferenceDto' is set
        if (managementPermissionReferenceDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'managementPermissionReferenceDto' when calling realmClientsIdRolesRoleNameManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("role-name", roleName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles/{role-name}/management/permissions", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName The roleName parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmClientsIdRolesRoleNameManagementPermissionsPut(String realm, String id, String roleName, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmClientsIdRolesRoleNameManagementPermissionsPutRequestCreation(realm, id, roleName, managementPermissionReferenceDto).bodyToMono(localVarReturnType);
    }

    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName The roleName parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmClientsIdRolesRoleNameManagementPermissionsPutWithHttpInfo(String realm, String id, String roleName, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmClientsIdRolesRoleNameManagementPermissionsPutRequestCreation(realm, id, roleName, managementPermissionReferenceDto).toEntity(localVarReturnType);
    }

    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName The roleName parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesRoleNameManagementPermissionsPutWithResponseSpec(String realm, String id, String roleName, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        return realmClientsIdRolesRoleNameManagementPermissionsPutRequestCreation(realm, id, roleName, managementPermissionReferenceDto);
    }
    /**
     * Update a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesRoleNamePutRequestCreation(String realm, String id, String roleName, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesRoleNamePut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesRoleNamePut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmClientsIdRolesRoleNamePut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmClientsIdRolesRoleNamePut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("role-name", roleName);

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
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles/{role-name}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdRolesRoleNamePut(String realm, String id, String roleName, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdRolesRoleNamePutRequestCreation(realm, id, roleName, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdRolesRoleNamePutWithHttpInfo(String realm, String id, String roleName, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdRolesRoleNamePutRequestCreation(realm, id, roleName, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesRoleNamePutWithResponseSpec(String realm, String id, String roleName, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        return realmClientsIdRolesRoleNamePutRequestCreation(realm, id, roleName, roleRepresentationDto);
    }
    /**
     * Returns a stream of users that have the specified role name.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName the role name.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRolesRoleNameUsersGetRequestCreation(String realm, String id, String roleName, Integer first, Integer max) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRolesRoleNameUsersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRolesRoleNameUsersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmClientsIdRolesRoleNameUsersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("role-name", roleName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "first", first));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/roles/{role-name}/users", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a stream of users that have the specified role name.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName the role name.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdRolesRoleNameUsersGet(String realm, String id, String roleName, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdRolesRoleNameUsersGetRequestCreation(realm, id, roleName, first, max).bodyToFlux(localVarReturnType);
    }

    /**
     * Returns a stream of users that have the specified role name.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName the role name.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdRolesRoleNameUsersGetWithHttpInfo(String realm, String id, String roleName, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdRolesRoleNameUsersGetRequestCreation(realm, id, roleName, first, max).toEntityList(localVarReturnType);
    }

    /**
     * Returns a stream of users that have the specified role name.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleName the role name.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRolesRoleNameUsersGetWithResponseSpec(String realm, String id, String roleName, Integer first, Integer max) throws WebClientResponseException {
        return realmClientsIdRolesRoleNameUsersGetRequestCreation(realm, id, roleName, first, max);
    }
    /**
     * Get all roles for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param briefRepresentation The briefRepresentation parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesGetRequestCreation(String realm, Boolean briefRepresentation, Integer first, Integer max, String search) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

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
        return apiClient.invokeAPI("/{realm}/roles", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all roles for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param briefRepresentation The briefRepresentation parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmRolesGet(String realm, Boolean briefRepresentation, Integer first, Integer max, String search) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesGetRequestCreation(realm, briefRepresentation, first, max, search).bodyToFlux(localVarReturnType);
    }

    /**
     * Get all roles for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param briefRepresentation The briefRepresentation parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmRolesGetWithHttpInfo(String realm, Boolean briefRepresentation, Integer first, Integer max, String search) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesGetRequestCreation(realm, briefRepresentation, first, max, search).toEntityList(localVarReturnType);
    }

    /**
     * Get all roles for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param briefRepresentation The briefRepresentation parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesGetWithResponseSpec(String realm, Boolean briefRepresentation, Integer first, Integer max, String search) throws WebClientResponseException {
        return realmRolesGetRequestCreation(realm, briefRepresentation, first, max, search);
    }
    /**
     * Create a new role for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesPostRequestCreation(String realm, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmRolesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/roles", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new role for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmRolesPost(String realm, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesPostRequestCreation(realm, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Create a new role for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmRolesPostWithHttpInfo(String realm, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesPostRequestCreation(realm, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Create a new role for the realm or client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesPostWithResponseSpec(String realm, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        return realmRolesPostRequestCreation(realm, roleRepresentationDto);
    }
    /**
     * Get client-level roles for the client that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param clientUuid The clientUuid parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesRoleNameCompositesClientsClientUuidGetRequestCreation(String realm, String roleName, String clientUuid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesRoleNameCompositesClientsClientUuidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmRolesRoleNameCompositesClientsClientUuidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientUuid' is set
        if (clientUuid == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientUuid' when calling realmRolesRoleNameCompositesClientsClientUuidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-name", roleName);
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
        return apiClient.invokeAPI("/{realm}/roles/{role-name}/composites/clients/{clientUuid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get client-level roles for the client that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param clientUuid The clientUuid parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmRolesRoleNameCompositesClientsClientUuidGet(String realm, String roleName, String clientUuid) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesRoleNameCompositesClientsClientUuidGetRequestCreation(realm, roleName, clientUuid).bodyToFlux(localVarReturnType);
    }

    /**
     * Get client-level roles for the client that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param clientUuid The clientUuid parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmRolesRoleNameCompositesClientsClientUuidGetWithHttpInfo(String realm, String roleName, String clientUuid) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesRoleNameCompositesClientsClientUuidGetRequestCreation(realm, roleName, clientUuid).toEntityList(localVarReturnType);
    }

    /**
     * Get client-level roles for the client that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param clientUuid The clientUuid parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesRoleNameCompositesClientsClientUuidGetWithResponseSpec(String realm, String roleName, String clientUuid) throws WebClientResponseException {
        return realmRolesRoleNameCompositesClientsClientUuidGetRequestCreation(realm, roleName, clientUuid);
    }
    /**
     * Remove roles from the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto roles to remove
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesRoleNameCompositesDeleteRequestCreation(String realm, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesRoleNameCompositesDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmRolesRoleNameCompositesDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmRolesRoleNameCompositesDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-name", roleName);

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
        return apiClient.invokeAPI("/{realm}/roles/{role-name}/composites", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove roles from the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto roles to remove
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmRolesRoleNameCompositesDelete(String realm, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesRoleNameCompositesDeleteRequestCreation(realm, roleName, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Remove roles from the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto roles to remove
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmRolesRoleNameCompositesDeleteWithHttpInfo(String realm, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesRoleNameCompositesDeleteRequestCreation(realm, roleName, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Remove roles from the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto roles to remove
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesRoleNameCompositesDeleteWithResponseSpec(String realm, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmRolesRoleNameCompositesDeleteRequestCreation(realm, roleName, roleRepresentationDto);
    }
    /**
     * Get composites of the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesRoleNameCompositesGetRequestCreation(String realm, String roleName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesRoleNameCompositesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmRolesRoleNameCompositesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-name", roleName);

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
        return apiClient.invokeAPI("/{realm}/roles/{role-name}/composites", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get composites of the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmRolesRoleNameCompositesGet(String realm, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesRoleNameCompositesGetRequestCreation(realm, roleName).bodyToFlux(localVarReturnType);
    }

    /**
     * Get composites of the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmRolesRoleNameCompositesGetWithHttpInfo(String realm, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesRoleNameCompositesGetRequestCreation(realm, roleName).toEntityList(localVarReturnType);
    }

    /**
     * Get composites of the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesRoleNameCompositesGetWithResponseSpec(String realm, String roleName) throws WebClientResponseException {
        return realmRolesRoleNameCompositesGetRequestCreation(realm, roleName);
    }
    /**
     * Add a composite to the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesRoleNameCompositesPostRequestCreation(String realm, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesRoleNameCompositesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmRolesRoleNameCompositesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmRolesRoleNameCompositesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-name", roleName);

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
        return apiClient.invokeAPI("/{realm}/roles/{role-name}/composites", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add a composite to the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmRolesRoleNameCompositesPost(String realm, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesRoleNameCompositesPostRequestCreation(realm, roleName, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Add a composite to the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmRolesRoleNameCompositesPostWithHttpInfo(String realm, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesRoleNameCompositesPostRequestCreation(realm, roleName, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Add a composite to the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesRoleNameCompositesPostWithResponseSpec(String realm, String roleName, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmRolesRoleNameCompositesPostRequestCreation(realm, roleName, roleRepresentationDto);
    }
    /**
     * Get realm-level roles of the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesRoleNameCompositesRealmGetRequestCreation(String realm, String roleName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesRoleNameCompositesRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmRolesRoleNameCompositesRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-name", roleName);

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
        return apiClient.invokeAPI("/{realm}/roles/{role-name}/composites/realm", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get realm-level roles of the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmRolesRoleNameCompositesRealmGet(String realm, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesRoleNameCompositesRealmGetRequestCreation(realm, roleName).bodyToFlux(localVarReturnType);
    }

    /**
     * Get realm-level roles of the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmRolesRoleNameCompositesRealmGetWithHttpInfo(String realm, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesRoleNameCompositesRealmGetRequestCreation(realm, roleName).toEntityList(localVarReturnType);
    }

    /**
     * Get realm-level roles of the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesRoleNameCompositesRealmGetWithResponseSpec(String realm, String roleName) throws WebClientResponseException {
        return realmRolesRoleNameCompositesRealmGetRequestCreation(realm, roleName);
    }
    /**
     * Delete a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesRoleNameDeleteRequestCreation(String realm, String roleName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesRoleNameDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmRolesRoleNameDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-name", roleName);

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
        return apiClient.invokeAPI("/{realm}/roles/{role-name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmRolesRoleNameDelete(String realm, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesRoleNameDeleteRequestCreation(realm, roleName).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmRolesRoleNameDeleteWithHttpInfo(String realm, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesRoleNameDeleteRequestCreation(realm, roleName).toEntity(localVarReturnType);
    }

    /**
     * Delete a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesRoleNameDeleteWithResponseSpec(String realm, String roleName) throws WebClientResponseException {
        return realmRolesRoleNameDeleteRequestCreation(realm, roleName);
    }
    /**
     * Get a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @return RoleRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesRoleNameGetRequestCreation(String realm, String roleName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesRoleNameGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmRolesRoleNameGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-name", roleName);

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

        ParameterizedTypeReference<RoleRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RoleRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/roles/{role-name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @return RoleRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RoleRepresentationDto> realmRolesRoleNameGet(String realm, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<RoleRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RoleRepresentationDto>() {};
        return realmRolesRoleNameGetRequestCreation(realm, roleName).bodyToMono(localVarReturnType);
    }

    /**
     * Get a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @return ResponseEntity&lt;RoleRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RoleRepresentationDto>> realmRolesRoleNameGetWithHttpInfo(String realm, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<RoleRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RoleRepresentationDto>() {};
        return realmRolesRoleNameGetRequestCreation(realm, roleName).toEntity(localVarReturnType);
    }

    /**
     * Get a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesRoleNameGetWithResponseSpec(String realm, String roleName) throws WebClientResponseException {
        return realmRolesRoleNameGetRequestCreation(realm, roleName);
    }
    /**
     * Returns a stream of groups that have the specified role name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName the role name.
     * @param briefRepresentation if false, return a full representation of the {@code GroupRepresentation} objects.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesRoleNameGroupsGetRequestCreation(String realm, String roleName, Boolean briefRepresentation, Integer first, Integer max) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesRoleNameGroupsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmRolesRoleNameGroupsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-name", roleName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "briefRepresentation", briefRepresentation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "first", first));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/roles/{role-name}/groups", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a stream of groups that have the specified role name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName the role name.
     * @param briefRepresentation if false, return a full representation of the {@code GroupRepresentation} objects.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmRolesRoleNameGroupsGet(String realm, String roleName, Boolean briefRepresentation, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesRoleNameGroupsGetRequestCreation(realm, roleName, briefRepresentation, first, max).bodyToFlux(localVarReturnType);
    }

    /**
     * Returns a stream of groups that have the specified role name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName the role name.
     * @param briefRepresentation if false, return a full representation of the {@code GroupRepresentation} objects.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmRolesRoleNameGroupsGetWithHttpInfo(String realm, String roleName, Boolean briefRepresentation, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesRoleNameGroupsGetRequestCreation(realm, roleName, briefRepresentation, first, max).toEntityList(localVarReturnType);
    }

    /**
     * Returns a stream of groups that have the specified role name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName the role name.
     * @param briefRepresentation if false, return a full representation of the {@code GroupRepresentation} objects.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesRoleNameGroupsGetWithResponseSpec(String realm, String roleName, Boolean briefRepresentation, Integer first, Integer max) throws WebClientResponseException {
        return realmRolesRoleNameGroupsGetRequestCreation(realm, roleName, briefRepresentation, first, max);
    }
    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName The roleName parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesRoleNameManagementPermissionsGetRequestCreation(String realm, String roleName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesRoleNameManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmRolesRoleNameManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-name", roleName);

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

        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return apiClient.invokeAPI("/{realm}/roles/{role-name}/management/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName The roleName parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmRolesRoleNameManagementPermissionsGet(String realm, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmRolesRoleNameManagementPermissionsGetRequestCreation(realm, roleName).bodyToMono(localVarReturnType);
    }

    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName The roleName parameter
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmRolesRoleNameManagementPermissionsGetWithHttpInfo(String realm, String roleName) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmRolesRoleNameManagementPermissionsGetRequestCreation(realm, roleName).toEntity(localVarReturnType);
    }

    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName The roleName parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesRoleNameManagementPermissionsGetWithResponseSpec(String realm, String roleName) throws WebClientResponseException {
        return realmRolesRoleNameManagementPermissionsGetRequestCreation(realm, roleName);
    }
    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName The roleName parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesRoleNameManagementPermissionsPutRequestCreation(String realm, String roleName, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        Object postBody = managementPermissionReferenceDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesRoleNameManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmRolesRoleNameManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'managementPermissionReferenceDto' is set
        if (managementPermissionReferenceDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'managementPermissionReferenceDto' when calling realmRolesRoleNameManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-name", roleName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return apiClient.invokeAPI("/{realm}/roles/{role-name}/management/permissions", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName The roleName parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmRolesRoleNameManagementPermissionsPut(String realm, String roleName, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmRolesRoleNameManagementPermissionsPutRequestCreation(realm, roleName, managementPermissionReferenceDto).bodyToMono(localVarReturnType);
    }

    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName The roleName parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmRolesRoleNameManagementPermissionsPutWithHttpInfo(String realm, String roleName, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmRolesRoleNameManagementPermissionsPutRequestCreation(realm, roleName, managementPermissionReferenceDto).toEntity(localVarReturnType);
    }

    /**
     * Return object stating whether role Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName The roleName parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesRoleNameManagementPermissionsPutWithResponseSpec(String realm, String roleName, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        return realmRolesRoleNameManagementPermissionsPutRequestCreation(realm, roleName, managementPermissionReferenceDto);
    }
    /**
     * Update a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesRoleNamePutRequestCreation(String realm, String roleName, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesRoleNamePut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmRolesRoleNamePut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmRolesRoleNamePut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-name", roleName);

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
        return apiClient.invokeAPI("/{realm}/roles/{role-name}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmRolesRoleNamePut(String realm, String roleName, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesRoleNamePutRequestCreation(realm, roleName, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmRolesRoleNamePutWithHttpInfo(String realm, String roleName, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesRoleNamePutRequestCreation(realm, roleName, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update a role by name
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName role’s name (not id!)
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesRoleNamePutWithResponseSpec(String realm, String roleName, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        return realmRolesRoleNamePutRequestCreation(realm, roleName, roleRepresentationDto);
    }
    /**
     * Returns a stream of users that have the specified role name.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName the role name.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesRoleNameUsersGetRequestCreation(String realm, String roleName, Integer first, Integer max) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesRoleNameUsersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleName' when calling realmRolesRoleNameUsersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-name", roleName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "first", first));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/roles/{role-name}/users", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a stream of users that have the specified role name.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName the role name.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmRolesRoleNameUsersGet(String realm, String roleName, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesRoleNameUsersGetRequestCreation(realm, roleName, first, max).bodyToFlux(localVarReturnType);
    }

    /**
     * Returns a stream of users that have the specified role name.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName the role name.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmRolesRoleNameUsersGetWithHttpInfo(String realm, String roleName, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesRoleNameUsersGetRequestCreation(realm, roleName, first, max).toEntityList(localVarReturnType);
    }

    /**
     * Returns a stream of users that have the specified role name.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleName the role name.
     * @param first first result to return. Ignored if negative or {@code null}.
     * @param max maximum number of results to return. Ignored if negative or {@code null}.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesRoleNameUsersGetWithResponseSpec(String realm, String roleName, Integer first, Integer max) throws WebClientResponseException {
        return realmRolesRoleNameUsersGetRequestCreation(realm, roleName, first, max);
    }
}

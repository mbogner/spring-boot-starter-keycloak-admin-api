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
public class RolesByIdApi {
    private ApiClient apiClient;

    public RolesByIdApi() {
        this(new ApiClient());
    }

    @Autowired
    public RolesByIdApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get client-level roles for the client that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @param clientUuid The clientUuid parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesByIdRoleIdCompositesClientsClientUuidGetRequestCreation(String realm, String roleId, String clientUuid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesByIdRoleIdCompositesClientsClientUuidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleId' when calling realmRolesByIdRoleIdCompositesClientsClientUuidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientUuid' is set
        if (clientUuid == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientUuid' when calling realmRolesByIdRoleIdCompositesClientsClientUuidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-id", roleId);
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
        return apiClient.invokeAPI("/{realm}/roles-by-id/{role-id}/composites/clients/{clientUuid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get client-level roles for the client that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @param clientUuid The clientUuid parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmRolesByIdRoleIdCompositesClientsClientUuidGet(String realm, String roleId, String clientUuid) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesByIdRoleIdCompositesClientsClientUuidGetRequestCreation(realm, roleId, clientUuid).bodyToFlux(localVarReturnType);
    }

    /**
     * Get client-level roles for the client that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @param clientUuid The clientUuid parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmRolesByIdRoleIdCompositesClientsClientUuidGetWithHttpInfo(String realm, String roleId, String clientUuid) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesByIdRoleIdCompositesClientsClientUuidGetRequestCreation(realm, roleId, clientUuid).toEntityList(localVarReturnType);
    }

    /**
     * Get client-level roles for the client that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @param clientUuid The clientUuid parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesByIdRoleIdCompositesClientsClientUuidGetWithResponseSpec(String realm, String roleId, String clientUuid) throws WebClientResponseException {
        return realmRolesByIdRoleIdCompositesClientsClientUuidGetRequestCreation(realm, roleId, clientUuid);
    }
    /**
     * Remove a set of roles from the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId Role id
     * @param roleRepresentationDto A set of roles to be removed
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesByIdRoleIdCompositesDeleteRequestCreation(String realm, String roleId, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesByIdRoleIdCompositesDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleId' when calling realmRolesByIdRoleIdCompositesDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmRolesByIdRoleIdCompositesDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-id", roleId);

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
        return apiClient.invokeAPI("/{realm}/roles-by-id/{role-id}/composites", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove a set of roles from the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId Role id
     * @param roleRepresentationDto A set of roles to be removed
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmRolesByIdRoleIdCompositesDelete(String realm, String roleId, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesByIdRoleIdCompositesDeleteRequestCreation(realm, roleId, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Remove a set of roles from the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId Role id
     * @param roleRepresentationDto A set of roles to be removed
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmRolesByIdRoleIdCompositesDeleteWithHttpInfo(String realm, String roleId, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesByIdRoleIdCompositesDeleteRequestCreation(realm, roleId, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Remove a set of roles from the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId Role id
     * @param roleRepresentationDto A set of roles to be removed
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesByIdRoleIdCompositesDeleteWithResponseSpec(String realm, String roleId, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmRolesByIdRoleIdCompositesDeleteRequestCreation(realm, roleId, roleRepresentationDto);
    }
    /**
     * Get role’s children   Returns a set of role’s children provided the role is a composite.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId Role id
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesByIdRoleIdCompositesGetRequestCreation(String realm, String roleId, Integer first, Integer max, String search) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesByIdRoleIdCompositesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleId' when calling realmRolesByIdRoleIdCompositesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-id", roleId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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
        return apiClient.invokeAPI("/{realm}/roles-by-id/{role-id}/composites", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get role’s children   Returns a set of role’s children provided the role is a composite.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId Role id
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmRolesByIdRoleIdCompositesGet(String realm, String roleId, Integer first, Integer max, String search) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesByIdRoleIdCompositesGetRequestCreation(realm, roleId, first, max, search).bodyToFlux(localVarReturnType);
    }

    /**
     * Get role’s children   Returns a set of role’s children provided the role is a composite.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId Role id
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmRolesByIdRoleIdCompositesGetWithHttpInfo(String realm, String roleId, Integer first, Integer max, String search) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesByIdRoleIdCompositesGetRequestCreation(realm, roleId, first, max, search).toEntityList(localVarReturnType);
    }

    /**
     * Get role’s children   Returns a set of role’s children provided the role is a composite.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId Role id
     * @param first The first parameter
     * @param max The max parameter
     * @param search The search parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesByIdRoleIdCompositesGetWithResponseSpec(String realm, String roleId, Integer first, Integer max, String search) throws WebClientResponseException {
        return realmRolesByIdRoleIdCompositesGetRequestCreation(realm, roleId, first, max, search);
    }
    /**
     * Make the role a composite role by associating some child roles
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId Role id
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesByIdRoleIdCompositesPostRequestCreation(String realm, String roleId, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesByIdRoleIdCompositesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleId' when calling realmRolesByIdRoleIdCompositesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmRolesByIdRoleIdCompositesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-id", roleId);

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
        return apiClient.invokeAPI("/{realm}/roles-by-id/{role-id}/composites", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Make the role a composite role by associating some child roles
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId Role id
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmRolesByIdRoleIdCompositesPost(String realm, String roleId, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesByIdRoleIdCompositesPostRequestCreation(realm, roleId, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Make the role a composite role by associating some child roles
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId Role id
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmRolesByIdRoleIdCompositesPostWithHttpInfo(String realm, String roleId, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesByIdRoleIdCompositesPostRequestCreation(realm, roleId, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Make the role a composite role by associating some child roles
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId Role id
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesByIdRoleIdCompositesPostWithResponseSpec(String realm, String roleId, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmRolesByIdRoleIdCompositesPostRequestCreation(realm, roleId, roleRepresentationDto);
    }
    /**
     * Get realm-level roles that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesByIdRoleIdCompositesRealmGetRequestCreation(String realm, String roleId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesByIdRoleIdCompositesRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleId' when calling realmRolesByIdRoleIdCompositesRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-id", roleId);

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
        return apiClient.invokeAPI("/{realm}/roles-by-id/{role-id}/composites/realm", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get realm-level roles that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmRolesByIdRoleIdCompositesRealmGet(String realm, String roleId) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesByIdRoleIdCompositesRealmGetRequestCreation(realm, roleId).bodyToFlux(localVarReturnType);
    }

    /**
     * Get realm-level roles that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmRolesByIdRoleIdCompositesRealmGetWithHttpInfo(String realm, String roleId) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmRolesByIdRoleIdCompositesRealmGetRequestCreation(realm, roleId).toEntityList(localVarReturnType);
    }

    /**
     * Get realm-level roles that are in the role’s composite
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesByIdRoleIdCompositesRealmGetWithResponseSpec(String realm, String roleId) throws WebClientResponseException {
        return realmRolesByIdRoleIdCompositesRealmGetRequestCreation(realm, roleId);
    }
    /**
     * Delete the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId id of role
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesByIdRoleIdDeleteRequestCreation(String realm, String roleId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesByIdRoleIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleId' when calling realmRolesByIdRoleIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-id", roleId);

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
        return apiClient.invokeAPI("/{realm}/roles-by-id/{role-id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId id of role
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmRolesByIdRoleIdDelete(String realm, String roleId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesByIdRoleIdDeleteRequestCreation(realm, roleId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId id of role
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmRolesByIdRoleIdDeleteWithHttpInfo(String realm, String roleId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesByIdRoleIdDeleteRequestCreation(realm, roleId).toEntity(localVarReturnType);
    }

    /**
     * Delete the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId id of role
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesByIdRoleIdDeleteWithResponseSpec(String realm, String roleId) throws WebClientResponseException {
        return realmRolesByIdRoleIdDeleteRequestCreation(realm, roleId);
    }
    /**
     * Get a specific role’s representation
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId id of role
     * @return RoleRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesByIdRoleIdGetRequestCreation(String realm, String roleId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesByIdRoleIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleId' when calling realmRolesByIdRoleIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-id", roleId);

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
        return apiClient.invokeAPI("/{realm}/roles-by-id/{role-id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a specific role’s representation
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId id of role
     * @return RoleRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RoleRepresentationDto> realmRolesByIdRoleIdGet(String realm, String roleId) throws WebClientResponseException {
        ParameterizedTypeReference<RoleRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RoleRepresentationDto>() {};
        return realmRolesByIdRoleIdGetRequestCreation(realm, roleId).bodyToMono(localVarReturnType);
    }

    /**
     * Get a specific role’s representation
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId id of role
     * @return ResponseEntity&lt;RoleRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RoleRepresentationDto>> realmRolesByIdRoleIdGetWithHttpInfo(String realm, String roleId) throws WebClientResponseException {
        ParameterizedTypeReference<RoleRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RoleRepresentationDto>() {};
        return realmRolesByIdRoleIdGetRequestCreation(realm, roleId).toEntity(localVarReturnType);
    }

    /**
     * Get a specific role’s representation
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId id of role
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesByIdRoleIdGetWithResponseSpec(String realm, String roleId) throws WebClientResponseException {
        return realmRolesByIdRoleIdGetRequestCreation(realm, roleId);
    }
    /**
     * Return object stating whether role Authoirzation permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesByIdRoleIdManagementPermissionsGetRequestCreation(String realm, String roleId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesByIdRoleIdManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleId' when calling realmRolesByIdRoleIdManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-id", roleId);

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
        return apiClient.invokeAPI("/{realm}/roles-by-id/{role-id}/management/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return object stating whether role Authoirzation permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmRolesByIdRoleIdManagementPermissionsGet(String realm, String roleId) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmRolesByIdRoleIdManagementPermissionsGetRequestCreation(realm, roleId).bodyToMono(localVarReturnType);
    }

    /**
     * Return object stating whether role Authoirzation permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmRolesByIdRoleIdManagementPermissionsGetWithHttpInfo(String realm, String roleId) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmRolesByIdRoleIdManagementPermissionsGetRequestCreation(realm, roleId).toEntity(localVarReturnType);
    }

    /**
     * Return object stating whether role Authoirzation permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesByIdRoleIdManagementPermissionsGetWithResponseSpec(String realm, String roleId) throws WebClientResponseException {
        return realmRolesByIdRoleIdManagementPermissionsGetRequestCreation(realm, roleId);
    }
    /**
     * Return object stating whether role Authoirzation permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesByIdRoleIdManagementPermissionsPutRequestCreation(String realm, String roleId, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        Object postBody = managementPermissionReferenceDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesByIdRoleIdManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleId' when calling realmRolesByIdRoleIdManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'managementPermissionReferenceDto' is set
        if (managementPermissionReferenceDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'managementPermissionReferenceDto' when calling realmRolesByIdRoleIdManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-id", roleId);

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
        return apiClient.invokeAPI("/{realm}/roles-by-id/{role-id}/management/permissions", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return object stating whether role Authoirzation permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmRolesByIdRoleIdManagementPermissionsPut(String realm, String roleId, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmRolesByIdRoleIdManagementPermissionsPutRequestCreation(realm, roleId, managementPermissionReferenceDto).bodyToMono(localVarReturnType);
    }

    /**
     * Return object stating whether role Authoirzation permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmRolesByIdRoleIdManagementPermissionsPutWithHttpInfo(String realm, String roleId, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmRolesByIdRoleIdManagementPermissionsPutRequestCreation(realm, roleId, managementPermissionReferenceDto).toEntity(localVarReturnType);
    }

    /**
     * Return object stating whether role Authoirzation permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId The roleId parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesByIdRoleIdManagementPermissionsPutWithResponseSpec(String realm, String roleId, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        return realmRolesByIdRoleIdManagementPermissionsPutRequestCreation(realm, roleId, managementPermissionReferenceDto);
    }
    /**
     * Update the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId id of role
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmRolesByIdRoleIdPutRequestCreation(String realm, String roleId, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmRolesByIdRoleIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleId' when calling realmRolesByIdRoleIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmRolesByIdRoleIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("role-id", roleId);

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
        return apiClient.invokeAPI("/{realm}/roles-by-id/{role-id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId id of role
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmRolesByIdRoleIdPut(String realm, String roleId, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesByIdRoleIdPutRequestCreation(realm, roleId, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId id of role
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmRolesByIdRoleIdPutWithHttpInfo(String realm, String roleId, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmRolesByIdRoleIdPutRequestCreation(realm, roleId, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update the role
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param roleId id of role
     * @param roleRepresentationDto The roleRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmRolesByIdRoleIdPutWithResponseSpec(String realm, String roleId, RoleRepresentationDto roleRepresentationDto) throws WebClientResponseException {
        return realmRolesByIdRoleIdPutRequestCreation(realm, roleId, roleRepresentationDto);
    }
}

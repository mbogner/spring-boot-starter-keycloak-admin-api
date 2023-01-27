package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.GroupRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.ManagementPermissionReferenceDto;

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
public class GroupsApi {
    private ApiClient apiClient;

    public GroupsApi() {
        this(new ApiClient());
    }

    @Autowired
    public GroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns the groups counts.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param search The search parameter
     * @param top The top parameter
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsCountGetRequestCreation(String realm, String search, Boolean top) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsCountGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "top", top));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return apiClient.invokeAPI("/{realm}/groups/count", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns the groups counts.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param search The search parameter
     * @param top The top parameter
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, Object>> realmGroupsCountGet(String realm, String search, Boolean top) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmGroupsCountGetRequestCreation(realm, search, top).bodyToMono(localVarReturnType);
    }

    /**
     * Returns the groups counts.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param search The search parameter
     * @param top The top parameter
     * @return ResponseEntity&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Map<String, Object>>> realmGroupsCountGetWithHttpInfo(String realm, String search, Boolean top) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmGroupsCountGetRequestCreation(realm, search, top).toEntity(localVarReturnType);
    }

    /**
     * Returns the groups counts.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param search The search parameter
     * @param top The top parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsCountGetWithResponseSpec(String realm, String search, Boolean top) throws WebClientResponseException {
        return realmGroupsCountGetRequestCreation(realm, search, top);
    }
    /**
     * Get group hierarchy.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param briefRepresentation The briefRepresentation parameter
     * @param exact The exact parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param q The q parameter
     * @param search The search parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsGetRequestCreation(String realm, Boolean briefRepresentation, Boolean exact, Integer first, Integer max, String q, String search) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "briefRepresentation", briefRepresentation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exact", exact));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "first", first));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/groups", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get group hierarchy.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param briefRepresentation The briefRepresentation parameter
     * @param exact The exact parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param q The q parameter
     * @param search The search parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmGroupsGet(String realm, Boolean briefRepresentation, Boolean exact, Integer first, Integer max, String q, String search) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsGetRequestCreation(realm, briefRepresentation, exact, first, max, q, search).bodyToFlux(localVarReturnType);
    }

    /**
     * Get group hierarchy.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param briefRepresentation The briefRepresentation parameter
     * @param exact The exact parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param q The q parameter
     * @param search The search parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmGroupsGetWithHttpInfo(String realm, Boolean briefRepresentation, Boolean exact, Integer first, Integer max, String q, String search) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsGetRequestCreation(realm, briefRepresentation, exact, first, max, q, search).toEntityList(localVarReturnType);
    }

    /**
     * Get group hierarchy.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param briefRepresentation The briefRepresentation parameter
     * @param exact The exact parameter
     * @param first The first parameter
     * @param max The max parameter
     * @param q The q parameter
     * @param search The search parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsGetWithResponseSpec(String realm, Boolean briefRepresentation, Boolean exact, Integer first, Integer max, String q, String search) throws WebClientResponseException {
        return realmGroupsGetRequestCreation(realm, briefRepresentation, exact, first, max, q, search);
    }
    /**
     * Set or create child.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param groupRepresentationDto The groupRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdChildrenPostRequestCreation(String realm, String id, GroupRepresentationDto groupRepresentationDto) throws WebClientResponseException {
        Object postBody = groupRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdChildrenPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdChildrenPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'groupRepresentationDto' is set
        if (groupRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'groupRepresentationDto' when calling realmGroupsIdChildrenPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/groups/{id}/children", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set or create child.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param groupRepresentationDto The groupRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmGroupsIdChildrenPost(String realm, String id, GroupRepresentationDto groupRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsIdChildrenPostRequestCreation(realm, id, groupRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Set or create child.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param groupRepresentationDto The groupRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmGroupsIdChildrenPostWithHttpInfo(String realm, String id, GroupRepresentationDto groupRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsIdChildrenPostRequestCreation(realm, id, groupRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Set or create child.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param groupRepresentationDto The groupRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdChildrenPostWithResponseSpec(String realm, String id, GroupRepresentationDto groupRepresentationDto) throws WebClientResponseException {
        return realmGroupsIdChildrenPostRequestCreation(realm, id, groupRepresentationDto);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdDeleteRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/groups/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmGroupsIdDelete(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsIdDeleteRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmGroupsIdDeleteWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsIdDeleteRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdDeleteWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmGroupsIdDeleteRequestCreation(realm, id);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return GroupRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GroupRepresentationDto> localVarReturnType = new ParameterizedTypeReference<GroupRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/groups/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return GroupRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GroupRepresentationDto> realmGroupsIdGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<GroupRepresentationDto> localVarReturnType = new ParameterizedTypeReference<GroupRepresentationDto>() {};
        return realmGroupsIdGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ResponseEntity&lt;GroupRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GroupRepresentationDto>> realmGroupsIdGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<GroupRepresentationDto> localVarReturnType = new ParameterizedTypeReference<GroupRepresentationDto>() {};
        return realmGroupsIdGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmGroupsIdGetRequestCreation(realm, id);
    }
    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdManagementPermissionsGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return apiClient.invokeAPI("/{realm}/groups/{id}/management/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmGroupsIdManagementPermissionsGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmGroupsIdManagementPermissionsGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmGroupsIdManagementPermissionsGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmGroupsIdManagementPermissionsGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdManagementPermissionsGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmGroupsIdManagementPermissionsGetRequestCreation(realm, id);
    }
    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdManagementPermissionsPutRequestCreation(String realm, String id, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        Object postBody = managementPermissionReferenceDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'managementPermissionReferenceDto' is set
        if (managementPermissionReferenceDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'managementPermissionReferenceDto' when calling realmGroupsIdManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return apiClient.invokeAPI("/{realm}/groups/{id}/management/permissions", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmGroupsIdManagementPermissionsPut(String realm, String id, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmGroupsIdManagementPermissionsPutRequestCreation(realm, id, managementPermissionReferenceDto).bodyToMono(localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmGroupsIdManagementPermissionsPutWithHttpInfo(String realm, String id, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmGroupsIdManagementPermissionsPutRequestCreation(realm, id, managementPermissionReferenceDto).toEntity(localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdManagementPermissionsPutWithResponseSpec(String realm, String id, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        return realmGroupsIdManagementPermissionsPutRequestCreation(realm, id, managementPermissionReferenceDto);
    }
    /**
     * Get users   Returns a stream of users, filtered according to query parameters
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param briefRepresentation Only return basic information (only guaranteed to return id, username, created, first and last name,  email, enabled state, email verification state, federation link, and access.  Note that it means that namely user attributes, required actions, and not before are not returned.)
     * @param first Pagination offset
     * @param max Maximum results size (defaults to 100)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdMembersGetRequestCreation(String realm, String id, Boolean briefRepresentation, Integer first, Integer max) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdMembersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdMembersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/groups/{id}/members", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get users   Returns a stream of users, filtered according to query parameters
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param briefRepresentation Only return basic information (only guaranteed to return id, username, created, first and last name,  email, enabled state, email verification state, federation link, and access.  Note that it means that namely user attributes, required actions, and not before are not returned.)
     * @param first Pagination offset
     * @param max Maximum results size (defaults to 100)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmGroupsIdMembersGet(String realm, String id, Boolean briefRepresentation, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdMembersGetRequestCreation(realm, id, briefRepresentation, first, max).bodyToFlux(localVarReturnType);
    }

    /**
     * Get users   Returns a stream of users, filtered according to query parameters
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param briefRepresentation Only return basic information (only guaranteed to return id, username, created, first and last name,  email, enabled state, email verification state, federation link, and access.  Note that it means that namely user attributes, required actions, and not before are not returned.)
     * @param first Pagination offset
     * @param max Maximum results size (defaults to 100)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmGroupsIdMembersGetWithHttpInfo(String realm, String id, Boolean briefRepresentation, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdMembersGetRequestCreation(realm, id, briefRepresentation, first, max).toEntityList(localVarReturnType);
    }

    /**
     * Get users   Returns a stream of users, filtered according to query parameters
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param briefRepresentation Only return basic information (only guaranteed to return id, username, created, first and last name,  email, enabled state, email verification state, federation link, and access.  Note that it means that namely user attributes, required actions, and not before are not returned.)
     * @param first Pagination offset
     * @param max Maximum results size (defaults to 100)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdMembersGetWithResponseSpec(String realm, String id, Boolean briefRepresentation, Integer first, Integer max) throws WebClientResponseException {
        return realmGroupsIdMembersGetRequestCreation(realm, id, briefRepresentation, first, max);
    }
    /**
     * Update group, ignores subgroups.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param groupRepresentationDto The groupRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdPutRequestCreation(String realm, String id, GroupRepresentationDto groupRepresentationDto) throws WebClientResponseException {
        Object postBody = groupRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'groupRepresentationDto' is set
        if (groupRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'groupRepresentationDto' when calling realmGroupsIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/groups/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update group, ignores subgroups.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param groupRepresentationDto The groupRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmGroupsIdPut(String realm, String id, GroupRepresentationDto groupRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsIdPutRequestCreation(realm, id, groupRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update group, ignores subgroups.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param groupRepresentationDto The groupRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmGroupsIdPutWithHttpInfo(String realm, String id, GroupRepresentationDto groupRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsIdPutRequestCreation(realm, id, groupRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update group, ignores subgroups.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param groupRepresentationDto The groupRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdPutWithResponseSpec(String realm, String id, GroupRepresentationDto groupRepresentationDto) throws WebClientResponseException {
        return realmGroupsIdPutRequestCreation(realm, id, groupRepresentationDto);
    }
    /**
     * create or add a top level realm groupSet or create child.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param groupRepresentationDto The groupRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsPostRequestCreation(String realm, GroupRepresentationDto groupRepresentationDto) throws WebClientResponseException {
        Object postBody = groupRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'groupRepresentationDto' is set
        if (groupRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'groupRepresentationDto' when calling realmGroupsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/groups", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * create or add a top level realm groupSet or create child.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param groupRepresentationDto The groupRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmGroupsPost(String realm, GroupRepresentationDto groupRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsPostRequestCreation(realm, groupRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * create or add a top level realm groupSet or create child.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param groupRepresentationDto The groupRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmGroupsPostWithHttpInfo(String realm, GroupRepresentationDto groupRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsPostRequestCreation(realm, groupRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * create or add a top level realm groupSet or create child.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param groupRepresentationDto The groupRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsPostWithResponseSpec(String realm, GroupRepresentationDto groupRepresentationDto) throws WebClientResponseException {
        return realmGroupsPostRequestCreation(realm, groupRepresentationDto);
    }
}

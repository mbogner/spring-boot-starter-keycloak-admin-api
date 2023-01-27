package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.MappingsRepresentationDto;
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
public class RoleMapperApi {
    private ApiClient apiClient;

    public RoleMapperApi() {
        this(new ApiClient());
    }

    @Autowired
    public RoleMapperApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return MappingsRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdRoleMappingsGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdRoleMappingsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdRoleMappingsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<MappingsRepresentationDto> localVarReturnType = new ParameterizedTypeReference<MappingsRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/groups/{id}/role-mappings", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return MappingsRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MappingsRepresentationDto> realmGroupsIdRoleMappingsGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<MappingsRepresentationDto> localVarReturnType = new ParameterizedTypeReference<MappingsRepresentationDto>() {};
        return realmGroupsIdRoleMappingsGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ResponseEntity&lt;MappingsRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MappingsRepresentationDto>> realmGroupsIdRoleMappingsGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<MappingsRepresentationDto> localVarReturnType = new ParameterizedTypeReference<MappingsRepresentationDto>() {};
        return realmGroupsIdRoleMappingsGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Get role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdRoleMappingsGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmGroupsIdRoleMappingsGetRequestCreation(realm, id);
    }
    /**
     * Get realm-level roles that can be mapped
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdRoleMappingsRealmAvailableGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdRoleMappingsRealmAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdRoleMappingsRealmAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/groups/{id}/role-mappings/realm/available", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get realm-level roles that can be mapped
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmGroupsIdRoleMappingsRealmAvailableGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdRoleMappingsRealmAvailableGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get realm-level roles that can be mapped
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmGroupsIdRoleMappingsRealmAvailableGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdRoleMappingsRealmAvailableGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get realm-level roles that can be mapped
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdRoleMappingsRealmAvailableGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmGroupsIdRoleMappingsRealmAvailableGetRequestCreation(realm, id);
    }
    /**
     * Get effective realm-level role mappings   This will recurse all composite roles to get the result.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdRoleMappingsRealmCompositeGetRequestCreation(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdRoleMappingsRealmCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdRoleMappingsRealmCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/groups/{id}/role-mappings/realm/composite", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get effective realm-level role mappings   This will recurse all composite roles to get the result.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmGroupsIdRoleMappingsRealmCompositeGet(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdRoleMappingsRealmCompositeGetRequestCreation(realm, id, briefRepresentation).bodyToFlux(localVarReturnType);
    }

    /**
     * Get effective realm-level role mappings   This will recurse all composite roles to get the result.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmGroupsIdRoleMappingsRealmCompositeGetWithHttpInfo(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdRoleMappingsRealmCompositeGetRequestCreation(realm, id, briefRepresentation).toEntityList(localVarReturnType);
    }

    /**
     * Get effective realm-level role mappings   This will recurse all composite roles to get the result.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdRoleMappingsRealmCompositeGetWithResponseSpec(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        return realmGroupsIdRoleMappingsRealmCompositeGetRequestCreation(realm, id, briefRepresentation);
    }
    /**
     * Get realm-level role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdRoleMappingsRealmGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdRoleMappingsRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdRoleMappingsRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/groups/{id}/role-mappings/realm", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get realm-level role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmGroupsIdRoleMappingsRealmGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdRoleMappingsRealmGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get realm-level role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmGroupsIdRoleMappingsRealmGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmGroupsIdRoleMappingsRealmGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get realm-level role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdRoleMappingsRealmGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmGroupsIdRoleMappingsRealmGetRequestCreation(realm, id);
    }
    /**
     * Add realm-level role mappings to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param roleRepresentationDto Roles to add
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupsIdRoleMappingsRealmPostRequestCreation(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupsIdRoleMappingsRealmPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmGroupsIdRoleMappingsRealmPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmGroupsIdRoleMappingsRealmPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/groups/{id}/role-mappings/realm", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add realm-level role mappings to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param roleRepresentationDto Roles to add
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmGroupsIdRoleMappingsRealmPost(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsIdRoleMappingsRealmPostRequestCreation(realm, id, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Add realm-level role mappings to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param roleRepresentationDto Roles to add
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmGroupsIdRoleMappingsRealmPostWithHttpInfo(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmGroupsIdRoleMappingsRealmPostRequestCreation(realm, id, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Add realm-level role mappings to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param roleRepresentationDto Roles to add
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupsIdRoleMappingsRealmPostWithResponseSpec(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmGroupsIdRoleMappingsRealmPostRequestCreation(realm, id, roleRepresentationDto);
    }
    /**
     * Get role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return MappingsRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdRoleMappingsGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdRoleMappingsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdRoleMappingsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<MappingsRepresentationDto> localVarReturnType = new ParameterizedTypeReference<MappingsRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/users/{id}/role-mappings", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return MappingsRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MappingsRepresentationDto> realmUsersIdRoleMappingsGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<MappingsRepresentationDto> localVarReturnType = new ParameterizedTypeReference<MappingsRepresentationDto>() {};
        return realmUsersIdRoleMappingsGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseEntity&lt;MappingsRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MappingsRepresentationDto>> realmUsersIdRoleMappingsGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<MappingsRepresentationDto> localVarReturnType = new ParameterizedTypeReference<MappingsRepresentationDto>() {};
        return realmUsersIdRoleMappingsGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Get role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdRoleMappingsGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmUsersIdRoleMappingsGetRequestCreation(realm, id);
    }
    /**
     * Get realm-level roles that can be mapped
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdRoleMappingsRealmAvailableGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdRoleMappingsRealmAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdRoleMappingsRealmAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/users/{id}/role-mappings/realm/available", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get realm-level roles that can be mapped
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersIdRoleMappingsRealmAvailableGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdRoleMappingsRealmAvailableGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get realm-level roles that can be mapped
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersIdRoleMappingsRealmAvailableGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdRoleMappingsRealmAvailableGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get realm-level roles that can be mapped
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdRoleMappingsRealmAvailableGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmUsersIdRoleMappingsRealmAvailableGetRequestCreation(realm, id);
    }
    /**
     * Get effective realm-level role mappings   This will recurse all composite roles to get the result.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdRoleMappingsRealmCompositeGetRequestCreation(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdRoleMappingsRealmCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdRoleMappingsRealmCompositeGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/users/{id}/role-mappings/realm/composite", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get effective realm-level role mappings   This will recurse all composite roles to get the result.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param briefRepresentation if false, return roles with their attributes
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersIdRoleMappingsRealmCompositeGet(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdRoleMappingsRealmCompositeGetRequestCreation(realm, id, briefRepresentation).bodyToFlux(localVarReturnType);
    }

    /**
     * Get effective realm-level role mappings   This will recurse all composite roles to get the result.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersIdRoleMappingsRealmCompositeGetWithHttpInfo(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdRoleMappingsRealmCompositeGetRequestCreation(realm, id, briefRepresentation).toEntityList(localVarReturnType);
    }

    /**
     * Get effective realm-level role mappings   This will recurse all composite roles to get the result.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param briefRepresentation if false, return roles with their attributes
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdRoleMappingsRealmCompositeGetWithResponseSpec(String realm, String id, Boolean briefRepresentation) throws WebClientResponseException {
        return realmUsersIdRoleMappingsRealmCompositeGetRequestCreation(realm, id, briefRepresentation);
    }
    /**
     * Get realm-level role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdRoleMappingsRealmGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdRoleMappingsRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdRoleMappingsRealmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/users/{id}/role-mappings/realm", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get realm-level role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmUsersIdRoleMappingsRealmGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdRoleMappingsRealmGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get realm-level role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmUsersIdRoleMappingsRealmGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmUsersIdRoleMappingsRealmGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get realm-level role mappings
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdRoleMappingsRealmGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmUsersIdRoleMappingsRealmGetRequestCreation(realm, id);
    }
    /**
     * Add realm-level role mappings to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param roleRepresentationDto Roles to add
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersIdRoleMappingsRealmPostRequestCreation(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        Object postBody = roleRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersIdRoleMappingsRealmPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmUsersIdRoleMappingsRealmPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleRepresentationDto' is set
        if (roleRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleRepresentationDto' when calling realmUsersIdRoleMappingsRealmPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/users/{id}/role-mappings/realm", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add realm-level role mappings to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param roleRepresentationDto Roles to add
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmUsersIdRoleMappingsRealmPost(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdRoleMappingsRealmPostRequestCreation(realm, id, roleRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Add realm-level role mappings to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param roleRepresentationDto Roles to add
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmUsersIdRoleMappingsRealmPostWithHttpInfo(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmUsersIdRoleMappingsRealmPostRequestCreation(realm, id, roleRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Add realm-level role mappings to the user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id User id
     * @param roleRepresentationDto Roles to add
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersIdRoleMappingsRealmPostWithResponseSpec(String realm, String id, List<RoleRepresentationDto> roleRepresentationDto) throws WebClientResponseException {
        return realmUsersIdRoleMappingsRealmPostRequestCreation(realm, id, roleRepresentationDto);
    }
}

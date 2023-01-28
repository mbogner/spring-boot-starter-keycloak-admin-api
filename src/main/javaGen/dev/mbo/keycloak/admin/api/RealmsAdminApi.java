package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.ClientPoliciesRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.ClientProfilesRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.ClientRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.GlobalRequestResultDto;
import dev.mbo.keycloak.admin.api.dto.GroupRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.ManagementPermissionReferenceDto;
import dev.mbo.keycloak.admin.api.dto.PartialImportRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.RealmEventsConfigRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.RealmRepresentationDto;

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
public class RealmsAdminApi {
    private ApiClient apiClient;

    public RealmsAdminApi() {
        this(new ApiClient());
    }

    @Autowired
    public RealmsAdminApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete all admin events
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAdminEventsDeleteRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAdminEventsDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/admin-events", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete all admin events
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAdminEventsDelete(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAdminEventsDeleteRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * Delete all admin events
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAdminEventsDeleteWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAdminEventsDeleteRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * Delete all admin events
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAdminEventsDeleteWithResponseSpec(String realm) throws WebClientResponseException {
        return realmAdminEventsDeleteRequestCreation(realm);
    }
    /**
     * Get admin events   Returns all admin events, or filters events based on URL query parameters listed here
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param authClient The authClient parameter
     * @param authIpAddress The authIpAddress parameter
     * @param authRealm The authRealm parameter
     * @param authUser user id
     * @param dateFrom The dateFrom parameter
     * @param dateTo The dateTo parameter
     * @param first The first parameter
     * @param max Maximum results size (defaults to 100)
     * @param operationTypes The operationTypes parameter
     * @param resourcePath The resourcePath parameter
     * @param resourceTypes The resourceTypes parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAdminEventsGetRequestCreation(String realm, String authClient, String authIpAddress, String authRealm, String authUser, String dateFrom, String dateTo, Integer first, Integer max, List<String> operationTypes, String resourcePath, List<String> resourceTypes) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAdminEventsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "authClient", authClient));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "authIpAddress", authIpAddress));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "authRealm", authRealm));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "authUser", authUser));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateFrom", dateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateTo", dateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "first", first));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "operationTypes", operationTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resourcePath", resourcePath));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "resourceTypes", resourceTypes));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/admin-events", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get admin events   Returns all admin events, or filters events based on URL query parameters listed here
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param authClient The authClient parameter
     * @param authIpAddress The authIpAddress parameter
     * @param authRealm The authRealm parameter
     * @param authUser user id
     * @param dateFrom The dateFrom parameter
     * @param dateTo The dateTo parameter
     * @param first The first parameter
     * @param max Maximum results size (defaults to 100)
     * @param operationTypes The operationTypes parameter
     * @param resourcePath The resourcePath parameter
     * @param resourceTypes The resourceTypes parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmAdminEventsGet(String realm, String authClient, String authIpAddress, String authRealm, String authUser, String dateFrom, String dateTo, Integer first, Integer max, List<String> operationTypes, String resourcePath, List<String> resourceTypes) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAdminEventsGetRequestCreation(realm, authClient, authIpAddress, authRealm, authUser, dateFrom, dateTo, first, max, operationTypes, resourcePath, resourceTypes).bodyToFlux(localVarReturnType);
    }

    /**
     * Get admin events   Returns all admin events, or filters events based on URL query parameters listed here
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param authClient The authClient parameter
     * @param authIpAddress The authIpAddress parameter
     * @param authRealm The authRealm parameter
     * @param authUser user id
     * @param dateFrom The dateFrom parameter
     * @param dateTo The dateTo parameter
     * @param first The first parameter
     * @param max Maximum results size (defaults to 100)
     * @param operationTypes The operationTypes parameter
     * @param resourcePath The resourcePath parameter
     * @param resourceTypes The resourceTypes parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmAdminEventsGetWithHttpInfo(String realm, String authClient, String authIpAddress, String authRealm, String authUser, String dateFrom, String dateTo, Integer first, Integer max, List<String> operationTypes, String resourcePath, List<String> resourceTypes) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAdminEventsGetRequestCreation(realm, authClient, authIpAddress, authRealm, authUser, dateFrom, dateTo, first, max, operationTypes, resourcePath, resourceTypes).toEntityList(localVarReturnType);
    }

    /**
     * Get admin events   Returns all admin events, or filters events based on URL query parameters listed here
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param authClient The authClient parameter
     * @param authIpAddress The authIpAddress parameter
     * @param authRealm The authRealm parameter
     * @param authUser user id
     * @param dateFrom The dateFrom parameter
     * @param dateTo The dateTo parameter
     * @param first The first parameter
     * @param max Maximum results size (defaults to 100)
     * @param operationTypes The operationTypes parameter
     * @param resourcePath The resourcePath parameter
     * @param resourceTypes The resourceTypes parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAdminEventsGetWithResponseSpec(String realm, String authClient, String authIpAddress, String authRealm, String authUser, String dateFrom, String dateTo, Integer first, Integer max, List<String> operationTypes, String resourcePath, List<String> resourceTypes) throws WebClientResponseException {
        return realmAdminEventsGetRequestCreation(realm, authClient, authIpAddress, authRealm, authUser, dateFrom, dateTo, first, max, operationTypes, resourcePath, resourceTypes);
    }
    /**
     * Base path for importing clients under this realm.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param body The body parameter
     * @return ClientRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientDescriptionConverterPostRequestCreation(String realm, String body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientDescriptionConverterPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling realmClientDescriptionConverterPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "text/plain"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<ClientRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/client-description-converter", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Base path for importing clients under this realm.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param body The body parameter
     * @return ClientRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ClientRepresentationDto> realmClientDescriptionConverterPost(String realm, String body) throws WebClientResponseException {
        ParameterizedTypeReference<ClientRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientRepresentationDto>() {};
        return realmClientDescriptionConverterPostRequestCreation(realm, body).bodyToMono(localVarReturnType);
    }

    /**
     * Base path for importing clients under this realm.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param body The body parameter
     * @return ResponseEntity&lt;ClientRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ClientRepresentationDto>> realmClientDescriptionConverterPostWithHttpInfo(String realm, String body) throws WebClientResponseException {
        ParameterizedTypeReference<ClientRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientRepresentationDto>() {};
        return realmClientDescriptionConverterPostRequestCreation(realm, body).toEntity(localVarReturnType);
    }

    /**
     * Base path for importing clients under this realm.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientDescriptionConverterPostWithResponseSpec(String realm, String body) throws WebClientResponseException {
        return realmClientDescriptionConverterPostRequestCreation(realm, body);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ClientPoliciesRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientPoliciesPoliciesGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientPoliciesPoliciesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ClientPoliciesRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientPoliciesRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/client-policies/policies", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ClientPoliciesRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ClientPoliciesRepresentationDto> realmClientPoliciesPoliciesGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<ClientPoliciesRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientPoliciesRepresentationDto>() {};
        return realmClientPoliciesPoliciesGetRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;ClientPoliciesRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ClientPoliciesRepresentationDto>> realmClientPoliciesPoliciesGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<ClientPoliciesRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientPoliciesRepresentationDto>() {};
        return realmClientPoliciesPoliciesGetRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientPoliciesPoliciesGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmClientPoliciesPoliciesGetRequestCreation(realm);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientPoliciesRepresentationDto The clientPoliciesRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientPoliciesPoliciesPutRequestCreation(String realm, ClientPoliciesRepresentationDto clientPoliciesRepresentationDto) throws WebClientResponseException {
        Object postBody = clientPoliciesRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientPoliciesPoliciesPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientPoliciesRepresentationDto' is set
        if (clientPoliciesRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientPoliciesRepresentationDto' when calling realmClientPoliciesPoliciesPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/client-policies/policies", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientPoliciesRepresentationDto The clientPoliciesRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientPoliciesPoliciesPut(String realm, ClientPoliciesRepresentationDto clientPoliciesRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientPoliciesPoliciesPutRequestCreation(realm, clientPoliciesRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientPoliciesRepresentationDto The clientPoliciesRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientPoliciesPoliciesPutWithHttpInfo(String realm, ClientPoliciesRepresentationDto clientPoliciesRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientPoliciesPoliciesPutRequestCreation(realm, clientPoliciesRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientPoliciesRepresentationDto The clientPoliciesRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientPoliciesPoliciesPutWithResponseSpec(String realm, ClientPoliciesRepresentationDto clientPoliciesRepresentationDto) throws WebClientResponseException {
        return realmClientPoliciesPoliciesPutRequestCreation(realm, clientPoliciesRepresentationDto);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param includeGlobalProfiles The includeGlobalProfiles parameter
     * @return ClientProfilesRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientPoliciesProfilesGetRequestCreation(String realm, Boolean includeGlobalProfiles) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientPoliciesProfilesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-global-profiles", includeGlobalProfiles));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<ClientProfilesRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientProfilesRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/client-policies/profiles", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param includeGlobalProfiles The includeGlobalProfiles parameter
     * @return ClientProfilesRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ClientProfilesRepresentationDto> realmClientPoliciesProfilesGet(String realm, Boolean includeGlobalProfiles) throws WebClientResponseException {
        ParameterizedTypeReference<ClientProfilesRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientProfilesRepresentationDto>() {};
        return realmClientPoliciesProfilesGetRequestCreation(realm, includeGlobalProfiles).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param includeGlobalProfiles The includeGlobalProfiles parameter
     * @return ResponseEntity&lt;ClientProfilesRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ClientProfilesRepresentationDto>> realmClientPoliciesProfilesGetWithHttpInfo(String realm, Boolean includeGlobalProfiles) throws WebClientResponseException {
        ParameterizedTypeReference<ClientProfilesRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientProfilesRepresentationDto>() {};
        return realmClientPoliciesProfilesGetRequestCreation(realm, includeGlobalProfiles).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param includeGlobalProfiles The includeGlobalProfiles parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientPoliciesProfilesGetWithResponseSpec(String realm, Boolean includeGlobalProfiles) throws WebClientResponseException {
        return realmClientPoliciesProfilesGetRequestCreation(realm, includeGlobalProfiles);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientProfilesRepresentationDto The clientProfilesRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientPoliciesProfilesPutRequestCreation(String realm, ClientProfilesRepresentationDto clientProfilesRepresentationDto) throws WebClientResponseException {
        Object postBody = clientProfilesRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientPoliciesProfilesPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientProfilesRepresentationDto' is set
        if (clientProfilesRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientProfilesRepresentationDto' when calling realmClientPoliciesProfilesPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/client-policies/profiles", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientProfilesRepresentationDto The clientProfilesRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientPoliciesProfilesPut(String realm, ClientProfilesRepresentationDto clientProfilesRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientPoliciesProfilesPutRequestCreation(realm, clientProfilesRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientProfilesRepresentationDto The clientProfilesRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientPoliciesProfilesPutWithHttpInfo(String realm, ClientProfilesRepresentationDto clientProfilesRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientPoliciesProfilesPutRequestCreation(realm, clientProfilesRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientProfilesRepresentationDto The clientProfilesRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientPoliciesProfilesPutWithResponseSpec(String realm, ClientProfilesRepresentationDto clientProfilesRepresentationDto) throws WebClientResponseException {
        return realmClientPoliciesProfilesPutRequestCreation(realm, clientProfilesRepresentationDto);
    }
    /**
     * Get client session stats   Returns a JSON map.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientSessionStatsGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientSessionStatsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/client-session-stats", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get client session stats   Returns a JSON map.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientSessionStatsGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientSessionStatsGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * Get client session stats   Returns a JSON map.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientSessionStatsGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientSessionStatsGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * Get client session stats   Returns a JSON map.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientSessionStatsGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmClientSessionStatsGetRequestCreation(realm);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmCredentialRegistratorsGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmCredentialRegistratorsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/credential-registrators", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmCredentialRegistratorsGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmCredentialRegistratorsGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmCredentialRegistratorsGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmCredentialRegistratorsGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmCredentialRegistratorsGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmCredentialRegistratorsGetRequestCreation(realm);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmDefaultDefaultClientScopesClientScopeIdDeleteRequestCreation(String realm, String clientScopeId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmDefaultDefaultClientScopesClientScopeIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientScopeId' is set
        if (clientScopeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientScopeId' when calling realmDefaultDefaultClientScopesClientScopeIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("clientScopeId", clientScopeId);

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
        return apiClient.invokeAPI("/{realm}/default-default-client-scopes/{clientScopeId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmDefaultDefaultClientScopesClientScopeIdDelete(String realm, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDefaultDefaultClientScopesClientScopeIdDeleteRequestCreation(realm, clientScopeId).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmDefaultDefaultClientScopesClientScopeIdDeleteWithHttpInfo(String realm, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDefaultDefaultClientScopesClientScopeIdDeleteRequestCreation(realm, clientScopeId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmDefaultDefaultClientScopesClientScopeIdDeleteWithResponseSpec(String realm, String clientScopeId) throws WebClientResponseException {
        return realmDefaultDefaultClientScopesClientScopeIdDeleteRequestCreation(realm, clientScopeId);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmDefaultDefaultClientScopesClientScopeIdPutRequestCreation(String realm, String clientScopeId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmDefaultDefaultClientScopesClientScopeIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientScopeId' is set
        if (clientScopeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientScopeId' when calling realmDefaultDefaultClientScopesClientScopeIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("clientScopeId", clientScopeId);

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
        return apiClient.invokeAPI("/{realm}/default-default-client-scopes/{clientScopeId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmDefaultDefaultClientScopesClientScopeIdPut(String realm, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDefaultDefaultClientScopesClientScopeIdPutRequestCreation(realm, clientScopeId).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmDefaultDefaultClientScopesClientScopeIdPutWithHttpInfo(String realm, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDefaultDefaultClientScopesClientScopeIdPutRequestCreation(realm, clientScopeId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmDefaultDefaultClientScopesClientScopeIdPutWithResponseSpec(String realm, String clientScopeId) throws WebClientResponseException {
        return realmDefaultDefaultClientScopesClientScopeIdPutRequestCreation(realm, clientScopeId);
    }
    /**
     * Get realm default client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmDefaultDefaultClientScopesGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmDefaultDefaultClientScopesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/default-default-client-scopes", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get realm default client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmDefaultDefaultClientScopesGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmDefaultDefaultClientScopesGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * Get realm default client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmDefaultDefaultClientScopesGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmDefaultDefaultClientScopesGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * Get realm default client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmDefaultDefaultClientScopesGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmDefaultDefaultClientScopesGetRequestCreation(realm);
    }
    /**
     * Get group hierarchy.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmDefaultGroupsGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmDefaultGroupsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/default-groups", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get group hierarchy.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmDefaultGroupsGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmDefaultGroupsGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * Get group hierarchy.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmDefaultGroupsGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmDefaultGroupsGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * Get group hierarchy.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmDefaultGroupsGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmDefaultGroupsGetRequestCreation(realm);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param groupId The groupId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmDefaultGroupsGroupIdDeleteRequestCreation(String realm, String groupId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmDefaultGroupsGroupIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new WebClientResponseException("Missing the required parameter 'groupId' when calling realmDefaultGroupsGroupIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
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
        return apiClient.invokeAPI("/{realm}/default-groups/{groupId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param groupId The groupId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmDefaultGroupsGroupIdDelete(String realm, String groupId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDefaultGroupsGroupIdDeleteRequestCreation(realm, groupId).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param groupId The groupId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmDefaultGroupsGroupIdDeleteWithHttpInfo(String realm, String groupId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDefaultGroupsGroupIdDeleteRequestCreation(realm, groupId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param groupId The groupId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmDefaultGroupsGroupIdDeleteWithResponseSpec(String realm, String groupId) throws WebClientResponseException {
        return realmDefaultGroupsGroupIdDeleteRequestCreation(realm, groupId);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param groupId The groupId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmDefaultGroupsGroupIdPutRequestCreation(String realm, String groupId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmDefaultGroupsGroupIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new WebClientResponseException("Missing the required parameter 'groupId' when calling realmDefaultGroupsGroupIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
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
        return apiClient.invokeAPI("/{realm}/default-groups/{groupId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param groupId The groupId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmDefaultGroupsGroupIdPut(String realm, String groupId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDefaultGroupsGroupIdPutRequestCreation(realm, groupId).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param groupId The groupId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmDefaultGroupsGroupIdPutWithHttpInfo(String realm, String groupId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDefaultGroupsGroupIdPutRequestCreation(realm, groupId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param groupId The groupId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmDefaultGroupsGroupIdPutWithResponseSpec(String realm, String groupId) throws WebClientResponseException {
        return realmDefaultGroupsGroupIdPutRequestCreation(realm, groupId);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmDefaultOptionalClientScopesClientScopeIdDeleteRequestCreation(String realm, String clientScopeId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmDefaultOptionalClientScopesClientScopeIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientScopeId' is set
        if (clientScopeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientScopeId' when calling realmDefaultOptionalClientScopesClientScopeIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("clientScopeId", clientScopeId);

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
        return apiClient.invokeAPI("/{realm}/default-optional-client-scopes/{clientScopeId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmDefaultOptionalClientScopesClientScopeIdDelete(String realm, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDefaultOptionalClientScopesClientScopeIdDeleteRequestCreation(realm, clientScopeId).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmDefaultOptionalClientScopesClientScopeIdDeleteWithHttpInfo(String realm, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDefaultOptionalClientScopesClientScopeIdDeleteRequestCreation(realm, clientScopeId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmDefaultOptionalClientScopesClientScopeIdDeleteWithResponseSpec(String realm, String clientScopeId) throws WebClientResponseException {
        return realmDefaultOptionalClientScopesClientScopeIdDeleteRequestCreation(realm, clientScopeId);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmDefaultOptionalClientScopesClientScopeIdPutRequestCreation(String realm, String clientScopeId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmDefaultOptionalClientScopesClientScopeIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientScopeId' is set
        if (clientScopeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientScopeId' when calling realmDefaultOptionalClientScopesClientScopeIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("clientScopeId", clientScopeId);

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
        return apiClient.invokeAPI("/{realm}/default-optional-client-scopes/{clientScopeId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmDefaultOptionalClientScopesClientScopeIdPut(String realm, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDefaultOptionalClientScopesClientScopeIdPutRequestCreation(realm, clientScopeId).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmDefaultOptionalClientScopesClientScopeIdPutWithHttpInfo(String realm, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDefaultOptionalClientScopesClientScopeIdPutRequestCreation(realm, clientScopeId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeId The clientScopeId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmDefaultOptionalClientScopesClientScopeIdPutWithResponseSpec(String realm, String clientScopeId) throws WebClientResponseException {
        return realmDefaultOptionalClientScopesClientScopeIdPutRequestCreation(realm, clientScopeId);
    }
    /**
     * Get realm optional client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmDefaultOptionalClientScopesGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmDefaultOptionalClientScopesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/default-optional-client-scopes", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get realm optional client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmDefaultOptionalClientScopesGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmDefaultOptionalClientScopesGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * Get realm optional client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmDefaultOptionalClientScopesGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmDefaultOptionalClientScopesGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * Get realm optional client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmDefaultOptionalClientScopesGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmDefaultOptionalClientScopesGetRequestCreation(realm);
    }
    /**
     * Delete the realm
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmDeleteRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the realm
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmDelete(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDeleteRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * Delete the realm
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmDeleteWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmDeleteRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * Delete the realm
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmDeleteWithResponseSpec(String realm) throws WebClientResponseException {
        return realmDeleteRequestCreation(realm);
    }
    /**
     * Get the events provider configuration   Returns JSON object with events provider configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return RealmEventsConfigRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmEventsConfigGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmEventsConfigGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RealmEventsConfigRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RealmEventsConfigRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/events/config", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the events provider configuration   Returns JSON object with events provider configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return RealmEventsConfigRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RealmEventsConfigRepresentationDto> realmEventsConfigGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<RealmEventsConfigRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RealmEventsConfigRepresentationDto>() {};
        return realmEventsConfigGetRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * Get the events provider configuration   Returns JSON object with events provider configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;RealmEventsConfigRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RealmEventsConfigRepresentationDto>> realmEventsConfigGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<RealmEventsConfigRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RealmEventsConfigRepresentationDto>() {};
        return realmEventsConfigGetRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * Get the events provider configuration   Returns JSON object with events provider configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmEventsConfigGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmEventsConfigGetRequestCreation(realm);
    }
    /**
     * Update the events provider   Change the events provider and/or its configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param realmEventsConfigRepresentationDto The realmEventsConfigRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmEventsConfigPutRequestCreation(String realm, RealmEventsConfigRepresentationDto realmEventsConfigRepresentationDto) throws WebClientResponseException {
        Object postBody = realmEventsConfigRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmEventsConfigPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'realmEventsConfigRepresentationDto' is set
        if (realmEventsConfigRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'realmEventsConfigRepresentationDto' when calling realmEventsConfigPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/events/config", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the events provider   Change the events provider and/or its configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param realmEventsConfigRepresentationDto The realmEventsConfigRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmEventsConfigPut(String realm, RealmEventsConfigRepresentationDto realmEventsConfigRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmEventsConfigPutRequestCreation(realm, realmEventsConfigRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update the events provider   Change the events provider and/or its configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param realmEventsConfigRepresentationDto The realmEventsConfigRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmEventsConfigPutWithHttpInfo(String realm, RealmEventsConfigRepresentationDto realmEventsConfigRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmEventsConfigPutRequestCreation(realm, realmEventsConfigRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update the events provider   Change the events provider and/or its configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param realmEventsConfigRepresentationDto The realmEventsConfigRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmEventsConfigPutWithResponseSpec(String realm, RealmEventsConfigRepresentationDto realmEventsConfigRepresentationDto) throws WebClientResponseException {
        return realmEventsConfigPutRequestCreation(realm, realmEventsConfigRepresentationDto);
    }
    /**
     * Delete all events
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmEventsDeleteRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmEventsDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/events", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete all events
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmEventsDelete(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmEventsDeleteRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * Delete all events
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmEventsDeleteWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmEventsDeleteRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * Delete all events
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmEventsDeleteWithResponseSpec(String realm) throws WebClientResponseException {
        return realmEventsDeleteRequestCreation(realm);
    }
    /**
     * Get events   Returns all events, or filters them based on URL query parameters listed here
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param client App or oauth client name
     * @param dateFrom From date
     * @param dateTo To date
     * @param first Paging offset
     * @param ipAddress IP address
     * @param max Maximum results size (defaults to 100)
     * @param type The types of events to return
     * @param user User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmEventsGetRequestCreation(String realm, String client, String dateFrom, String dateTo, Integer first, String ipAddress, Integer max, List<String> type, String user) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmEventsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "client", client));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateFrom", dateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateTo", dateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "first", first));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ipAddress", ipAddress));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "user", user));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/events", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get events   Returns all events, or filters them based on URL query parameters listed here
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param client App or oauth client name
     * @param dateFrom From date
     * @param dateTo To date
     * @param first Paging offset
     * @param ipAddress IP address
     * @param max Maximum results size (defaults to 100)
     * @param type The types of events to return
     * @param user User id
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmEventsGet(String realm, String client, String dateFrom, String dateTo, Integer first, String ipAddress, Integer max, List<String> type, String user) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmEventsGetRequestCreation(realm, client, dateFrom, dateTo, first, ipAddress, max, type, user).bodyToFlux(localVarReturnType);
    }

    /**
     * Get events   Returns all events, or filters them based on URL query parameters listed here
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param client App or oauth client name
     * @param dateFrom From date
     * @param dateTo To date
     * @param first Paging offset
     * @param ipAddress IP address
     * @param max Maximum results size (defaults to 100)
     * @param type The types of events to return
     * @param user User id
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmEventsGetWithHttpInfo(String realm, String client, String dateFrom, String dateTo, Integer first, String ipAddress, Integer max, List<String> type, String user) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmEventsGetRequestCreation(realm, client, dateFrom, dateTo, first, ipAddress, max, type, user).toEntityList(localVarReturnType);
    }

    /**
     * Get events   Returns all events, or filters them based on URL query parameters listed here
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param client App or oauth client name
     * @param dateFrom From date
     * @param dateTo To date
     * @param first Paging offset
     * @param ipAddress IP address
     * @param max Maximum results size (defaults to 100)
     * @param type The types of events to return
     * @param user User id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmEventsGetWithResponseSpec(String realm, String client, String dateFrom, String dateTo, Integer first, String ipAddress, Integer max, List<String> type, String user) throws WebClientResponseException {
        return realmEventsGetRequestCreation(realm, client, dateFrom, dateTo, first, ipAddress, max, type, user);
    }
    /**
     * Get the top-level representation of the realm   It will not include nested information like User and Client representations.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return RealmRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RealmRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RealmRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the top-level representation of the realm   It will not include nested information like User and Client representations.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return RealmRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RealmRepresentationDto> realmGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<RealmRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RealmRepresentationDto>() {};
        return realmGetRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * Get the top-level representation of the realm   It will not include nested information like User and Client representations.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;RealmRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RealmRepresentationDto>> realmGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<RealmRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RealmRepresentationDto>() {};
        return realmGetRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * Get the top-level representation of the realm   It will not include nested information like User and Client representations.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmGetRequestCreation(realm);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param path The path parameter
     * @return GroupRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmGroupByPathPathGetRequestCreation(String realm, String path) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmGroupByPathPathGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new WebClientResponseException("Missing the required parameter 'path' when calling realmGroupByPathPathGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("path", path);

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
        return apiClient.invokeAPI("/{realm}/group-by-path/{path}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param path The path parameter
     * @return GroupRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GroupRepresentationDto> realmGroupByPathPathGet(String realm, String path) throws WebClientResponseException {
        ParameterizedTypeReference<GroupRepresentationDto> localVarReturnType = new ParameterizedTypeReference<GroupRepresentationDto>() {};
        return realmGroupByPathPathGetRequestCreation(realm, path).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param path The path parameter
     * @return ResponseEntity&lt;GroupRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GroupRepresentationDto>> realmGroupByPathPathGetWithHttpInfo(String realm, String path) throws WebClientResponseException {
        ParameterizedTypeReference<GroupRepresentationDto> localVarReturnType = new ParameterizedTypeReference<GroupRepresentationDto>() {};
        return realmGroupByPathPathGetRequestCreation(realm, path).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param path The path parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmGroupByPathPathGetWithResponseSpec(String realm, String path) throws WebClientResponseException {
        return realmGroupByPathPathGetRequestCreation(realm, path);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmLocalizationGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmLocalizationGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/localization", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmLocalizationGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmLocalizationGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmLocalizationGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmLocalizationGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmLocalizationGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmLocalizationGetRequestCreation(realm);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmLocalizationLocaleDeleteRequestCreation(String realm, String locale) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmLocalizationLocaleDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new WebClientResponseException("Missing the required parameter 'locale' when calling realmLocalizationLocaleDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("locale", locale);

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
        return apiClient.invokeAPI("/{realm}/localization/{locale}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmLocalizationLocaleDelete(String realm, String locale) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmLocalizationLocaleDeleteRequestCreation(realm, locale).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmLocalizationLocaleDeleteWithHttpInfo(String realm, String locale) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmLocalizationLocaleDeleteRequestCreation(realm, locale).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmLocalizationLocaleDeleteWithResponseSpec(String realm, String locale) throws WebClientResponseException {
        return realmLocalizationLocaleDeleteRequestCreation(realm, locale);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param useRealmDefaultLocaleFallback The useRealmDefaultLocaleFallback parameter
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmLocalizationLocaleGetRequestCreation(String realm, String locale, Boolean useRealmDefaultLocaleFallback) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmLocalizationLocaleGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new WebClientResponseException("Missing the required parameter 'locale' when calling realmLocalizationLocaleGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("locale", locale);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "useRealmDefaultLocaleFallback", useRealmDefaultLocaleFallback));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return apiClient.invokeAPI("/{realm}/localization/{locale}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param useRealmDefaultLocaleFallback The useRealmDefaultLocaleFallback parameter
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, Object>> realmLocalizationLocaleGet(String realm, String locale, Boolean useRealmDefaultLocaleFallback) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmLocalizationLocaleGetRequestCreation(realm, locale, useRealmDefaultLocaleFallback).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param useRealmDefaultLocaleFallback The useRealmDefaultLocaleFallback parameter
     * @return ResponseEntity&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Map<String, Object>>> realmLocalizationLocaleGetWithHttpInfo(String realm, String locale, Boolean useRealmDefaultLocaleFallback) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmLocalizationLocaleGetRequestCreation(realm, locale, useRealmDefaultLocaleFallback).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param useRealmDefaultLocaleFallback The useRealmDefaultLocaleFallback parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmLocalizationLocaleGetWithResponseSpec(String realm, String locale, Boolean useRealmDefaultLocaleFallback) throws WebClientResponseException {
        return realmLocalizationLocaleGetRequestCreation(realm, locale, useRealmDefaultLocaleFallback);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param key The key parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmLocalizationLocaleKeyDeleteRequestCreation(String realm, String locale, String key) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmLocalizationLocaleKeyDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new WebClientResponseException("Missing the required parameter 'locale' when calling realmLocalizationLocaleKeyDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new WebClientResponseException("Missing the required parameter 'key' when calling realmLocalizationLocaleKeyDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("locale", locale);
        pathParams.put("key", key);

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
        return apiClient.invokeAPI("/{realm}/localization/{locale}/{key}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param key The key parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmLocalizationLocaleKeyDelete(String realm, String locale, String key) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmLocalizationLocaleKeyDeleteRequestCreation(realm, locale, key).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param key The key parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmLocalizationLocaleKeyDeleteWithHttpInfo(String realm, String locale, String key) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmLocalizationLocaleKeyDeleteRequestCreation(realm, locale, key).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param key The key parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmLocalizationLocaleKeyDeleteWithResponseSpec(String realm, String locale, String key) throws WebClientResponseException {
        return realmLocalizationLocaleKeyDeleteRequestCreation(realm, locale, key);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param key The key parameter
     * @return String
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmLocalizationLocaleKeyGetRequestCreation(String realm, String locale, String key) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmLocalizationLocaleKeyGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new WebClientResponseException("Missing the required parameter 'locale' when calling realmLocalizationLocaleKeyGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new WebClientResponseException("Missing the required parameter 'key' when calling realmLocalizationLocaleKeyGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("locale", locale);
        pathParams.put("key", key);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/{realm}/localization/{locale}/{key}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param key The key parameter
     * @return String
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<String> realmLocalizationLocaleKeyGet(String realm, String locale, String key) throws WebClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return realmLocalizationLocaleKeyGetRequestCreation(realm, locale, key).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param key The key parameter
     * @return ResponseEntity&lt;String&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<String>> realmLocalizationLocaleKeyGetWithHttpInfo(String realm, String locale, String key) throws WebClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return realmLocalizationLocaleKeyGetRequestCreation(realm, locale, key).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param key The key parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmLocalizationLocaleKeyGetWithResponseSpec(String realm, String locale, String key) throws WebClientResponseException {
        return realmLocalizationLocaleKeyGetRequestCreation(realm, locale, key);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param key The key parameter
     * @param body The body parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmLocalizationLocaleKeyPutRequestCreation(String realm, String locale, String key, String body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmLocalizationLocaleKeyPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new WebClientResponseException("Missing the required parameter 'locale' when calling realmLocalizationLocaleKeyPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new WebClientResponseException("Missing the required parameter 'key' when calling realmLocalizationLocaleKeyPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling realmLocalizationLocaleKeyPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("locale", locale);
        pathParams.put("key", key);

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
        return apiClient.invokeAPI("/{realm}/localization/{locale}/{key}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param key The key parameter
     * @param body The body parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmLocalizationLocaleKeyPut(String realm, String locale, String key, String body) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmLocalizationLocaleKeyPutRequestCreation(realm, locale, key, body).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param key The key parameter
     * @param body The body parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmLocalizationLocaleKeyPutWithHttpInfo(String realm, String locale, String key, String body) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmLocalizationLocaleKeyPutRequestCreation(realm, locale, key, body).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param key The key parameter
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmLocalizationLocaleKeyPutWithResponseSpec(String realm, String locale, String key, String body) throws WebClientResponseException {
        return realmLocalizationLocaleKeyPutRequestCreation(realm, locale, key, body);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmLocalizationLocalePostRequestCreation(String realm, String locale, Map<String, Object> requestBody) throws WebClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmLocalizationLocalePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new WebClientResponseException("Missing the required parameter 'locale' when calling realmLocalizationLocalePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new WebClientResponseException("Missing the required parameter 'requestBody' when calling realmLocalizationLocalePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("locale", locale);

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
        return apiClient.invokeAPI("/{realm}/localization/{locale}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmLocalizationLocalePost(String realm, String locale, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmLocalizationLocalePostRequestCreation(realm, locale, requestBody).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmLocalizationLocalePostWithHttpInfo(String realm, String locale, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmLocalizationLocalePostRequestCreation(realm, locale, requestBody).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param locale The locale parameter
     * @param requestBody The requestBody parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmLocalizationLocalePostWithResponseSpec(String realm, String locale, Map<String, Object> requestBody) throws WebClientResponseException {
        return realmLocalizationLocalePostRequestCreation(realm, locale, requestBody);
    }
    /**
     * Removes all user sessions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return GlobalRequestResultDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmLogoutAllPostRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmLogoutAllPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GlobalRequestResultDto> localVarReturnType = new ParameterizedTypeReference<GlobalRequestResultDto>() {};
        return apiClient.invokeAPI("/{realm}/logout-all", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Removes all user sessions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return GlobalRequestResultDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GlobalRequestResultDto> realmLogoutAllPost(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<GlobalRequestResultDto> localVarReturnType = new ParameterizedTypeReference<GlobalRequestResultDto>() {};
        return realmLogoutAllPostRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * Removes all user sessions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;GlobalRequestResultDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GlobalRequestResultDto>> realmLogoutAllPostWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<GlobalRequestResultDto> localVarReturnType = new ParameterizedTypeReference<GlobalRequestResultDto>() {};
        return realmLogoutAllPostRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * Removes all user sessions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmLogoutAllPostWithResponseSpec(String realm) throws WebClientResponseException {
        return realmLogoutAllPostRequestCreation(realm);
    }
    /**
     * Partial export of existing realm into a JSON file.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param exportClients The exportClients parameter
     * @param exportGroupsAndRoles The exportGroupsAndRoles parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmPartialExportPostRequestCreation(String realm, Boolean exportClients, Boolean exportGroupsAndRoles) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmPartialExportPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exportClients", exportClients));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exportGroupsAndRoles", exportGroupsAndRoles));

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/partial-export", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Partial export of existing realm into a JSON file.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param exportClients The exportClients parameter
     * @param exportGroupsAndRoles The exportGroupsAndRoles parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmPartialExportPost(String realm, Boolean exportClients, Boolean exportGroupsAndRoles) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmPartialExportPostRequestCreation(realm, exportClients, exportGroupsAndRoles).bodyToMono(localVarReturnType);
    }

    /**
     * Partial export of existing realm into a JSON file.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param exportClients The exportClients parameter
     * @param exportGroupsAndRoles The exportGroupsAndRoles parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmPartialExportPostWithHttpInfo(String realm, Boolean exportClients, Boolean exportGroupsAndRoles) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmPartialExportPostRequestCreation(realm, exportClients, exportGroupsAndRoles).toEntity(localVarReturnType);
    }

    /**
     * Partial export of existing realm into a JSON file.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param exportClients The exportClients parameter
     * @param exportGroupsAndRoles The exportGroupsAndRoles parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmPartialExportPostWithResponseSpec(String realm, Boolean exportClients, Boolean exportGroupsAndRoles) throws WebClientResponseException {
        return realmPartialExportPostRequestCreation(realm, exportClients, exportGroupsAndRoles);
    }
    /**
     * Partial import from a JSON file to an existing realm.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param partialImportRepresentationDto The partialImportRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmPartialImportPostRequestCreation(String realm, PartialImportRepresentationDto partialImportRepresentationDto) throws WebClientResponseException {
        Object postBody = partialImportRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmPartialImportPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'partialImportRepresentationDto' is set
        if (partialImportRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'partialImportRepresentationDto' when calling realmPartialImportPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/partialImport", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Partial import from a JSON file to an existing realm.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param partialImportRepresentationDto The partialImportRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmPartialImportPost(String realm, PartialImportRepresentationDto partialImportRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmPartialImportPostRequestCreation(realm, partialImportRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Partial import from a JSON file to an existing realm.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param partialImportRepresentationDto The partialImportRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmPartialImportPostWithHttpInfo(String realm, PartialImportRepresentationDto partialImportRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmPartialImportPostRequestCreation(realm, partialImportRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Partial import from a JSON file to an existing realm.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param partialImportRepresentationDto The partialImportRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmPartialImportPostWithResponseSpec(String realm, PartialImportRepresentationDto partialImportRepresentationDto) throws WebClientResponseException {
        return realmPartialImportPostRequestCreation(realm, partialImportRepresentationDto);
    }
    /**
     * Push the realm’s revocation policy to any client that has an admin url associated with it.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmPushRevocationPostRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmPushRevocationPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/push-revocation", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Push the realm’s revocation policy to any client that has an admin url associated with it.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmPushRevocationPost(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmPushRevocationPostRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * Push the realm’s revocation policy to any client that has an admin url associated with it.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmPushRevocationPostWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmPushRevocationPostRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * Push the realm’s revocation policy to any client that has an admin url associated with it.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmPushRevocationPostWithResponseSpec(String realm) throws WebClientResponseException {
        return realmPushRevocationPostRequestCreation(realm);
    }
    /**
     * Update the top-level information of the realm   Any user, roles or client information in the representation  will be ignored.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param realmRepresentationDto The realmRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmPutRequestCreation(String realm, RealmRepresentationDto realmRepresentationDto) throws WebClientResponseException {
        Object postBody = realmRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'realmRepresentationDto' is set
        if (realmRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'realmRepresentationDto' when calling realmPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the top-level information of the realm   Any user, roles or client information in the representation  will be ignored.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param realmRepresentationDto The realmRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmPut(String realm, RealmRepresentationDto realmRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmPutRequestCreation(realm, realmRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update the top-level information of the realm   Any user, roles or client information in the representation  will be ignored.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param realmRepresentationDto The realmRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmPutWithHttpInfo(String realm, RealmRepresentationDto realmRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmPutRequestCreation(realm, realmRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update the top-level information of the realm   Any user, roles or client information in the representation  will be ignored.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param realmRepresentationDto The realmRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmPutWithResponseSpec(String realm, RealmRepresentationDto realmRepresentationDto) throws WebClientResponseException {
        return realmPutRequestCreation(realm, realmRepresentationDto);
    }
    /**
     * Remove a specific user session.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param session The session parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmSessionsSessionDeleteRequestCreation(String realm, String session) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmSessionsSessionDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'session' is set
        if (session == null) {
            throw new WebClientResponseException("Missing the required parameter 'session' when calling realmSessionsSessionDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("session", session);

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
        return apiClient.invokeAPI("/{realm}/sessions/{session}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove a specific user session.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param session The session parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmSessionsSessionDelete(String realm, String session) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmSessionsSessionDeleteRequestCreation(realm, session).bodyToMono(localVarReturnType);
    }

    /**
     * Remove a specific user session.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param session The session parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmSessionsSessionDeleteWithHttpInfo(String realm, String session) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmSessionsSessionDeleteRequestCreation(realm, session).toEntity(localVarReturnType);
    }

    /**
     * Remove a specific user session.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param session The session parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmSessionsSessionDeleteWithResponseSpec(String realm, String session) throws WebClientResponseException {
        return realmSessionsSessionDeleteRequestCreation(realm, session);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmTestSMTPConnectionPostRequestCreation(String realm, Map<String, Object> requestBody) throws WebClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmTestSMTPConnectionPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new WebClientResponseException("Missing the required parameter 'requestBody' when calling realmTestSMTPConnectionPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/testSMTPConnection", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmTestSMTPConnectionPost(String realm, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmTestSMTPConnectionPostRequestCreation(realm, requestBody).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmTestSMTPConnectionPostWithHttpInfo(String realm, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmTestSMTPConnectionPostRequestCreation(realm, requestBody).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param requestBody The requestBody parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmTestSMTPConnectionPostWithResponseSpec(String realm, Map<String, Object> requestBody) throws WebClientResponseException {
        return realmTestSMTPConnectionPostRequestCreation(realm, requestBody);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersManagementPermissionsGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return apiClient.invokeAPI("/{realm}/users-management-permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmUsersManagementPermissionsGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmUsersManagementPermissionsGetRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmUsersManagementPermissionsGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmUsersManagementPermissionsGetRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersManagementPermissionsGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmUsersManagementPermissionsGetRequestCreation(realm);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmUsersManagementPermissionsPutRequestCreation(String realm, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        Object postBody = managementPermissionReferenceDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmUsersManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'managementPermissionReferenceDto' is set
        if (managementPermissionReferenceDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'managementPermissionReferenceDto' when calling realmUsersManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return apiClient.invokeAPI("/{realm}/users-management-permissions", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmUsersManagementPermissionsPut(String realm, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmUsersManagementPermissionsPutRequestCreation(realm, managementPermissionReferenceDto).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmUsersManagementPermissionsPutWithHttpInfo(String realm, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmUsersManagementPermissionsPutRequestCreation(realm, managementPermissionReferenceDto).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmUsersManagementPermissionsPutWithResponseSpec(String realm, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        return realmUsersManagementPermissionsPutRequestCreation(realm, managementPermissionReferenceDto);
    }
    /**
     * Import a realm.
     * 
     * <p><b>2XX</b> - success
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec rootPostRequestCreation(List<Map<String, Object>> requestBody) throws WebClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new WebClientResponseException("Missing the required parameter 'requestBody' when calling rootPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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
        return apiClient.invokeAPI("/", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Import a realm.
     * 
     * <p><b>2XX</b> - success
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> rootPost(List<Map<String, Object>> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return rootPostRequestCreation(requestBody).bodyToMono(localVarReturnType);
    }

    /**
     * Import a realm.
     * 
     * <p><b>2XX</b> - success
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> rootPostWithHttpInfo(List<Map<String, Object>> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return rootPostRequestCreation(requestBody).toEntity(localVarReturnType);
    }

    /**
     * Import a realm.
     * 
     * <p><b>2XX</b> - success
     * @param requestBody The requestBody parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec rootPostWithResponseSpec(List<Map<String, Object>> requestBody) throws WebClientResponseException {
        return rootPostRequestCreation(requestBody);
    }
}

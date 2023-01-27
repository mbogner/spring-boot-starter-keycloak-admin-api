package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.AccessTokenDto;
import dev.mbo.keycloak.admin.api.dto.ClientRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.CredentialRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.GlobalRequestResultDto;
import dev.mbo.keycloak.admin.api.dto.IDTokenDto;
import dev.mbo.keycloak.admin.api.dto.ManagementPermissionReferenceDto;
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
public class ClientsApi {
    private ApiClient apiClient;

    public ClientsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ClientsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get clients belonging to the realm.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientId filter by clientId
     * @param first the first result
     * @param max the max results to return
     * @param q The q parameter
     * @param search whether this is a search query or a getClientById query
     * @param viewableOnly filter clients that cannot be viewed in full by admin
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsGetRequestCreation(String realm, String clientId, Integer first, Integer max, String q, Boolean search, Boolean viewableOnly) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "clientId", clientId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "first", first));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "viewableOnly", viewableOnly));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/clients", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get clients belonging to the realm.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientId filter by clientId
     * @param first the first result
     * @param max the max results to return
     * @param q The q parameter
     * @param search whether this is a search query or a getClientById query
     * @param viewableOnly filter clients that cannot be viewed in full by admin
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsGet(String realm, String clientId, Integer first, Integer max, String q, Boolean search, Boolean viewableOnly) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsGetRequestCreation(realm, clientId, first, max, q, search, viewableOnly).bodyToFlux(localVarReturnType);
    }

    /**
     * Get clients belonging to the realm.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientId filter by clientId
     * @param first the first result
     * @param max the max results to return
     * @param q The q parameter
     * @param search whether this is a search query or a getClientById query
     * @param viewableOnly filter clients that cannot be viewed in full by admin
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsGetWithHttpInfo(String realm, String clientId, Integer first, Integer max, String q, Boolean search, Boolean viewableOnly) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsGetRequestCreation(realm, clientId, first, max, q, search, viewableOnly).toEntityList(localVarReturnType);
    }

    /**
     * Get clients belonging to the realm.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientId filter by clientId
     * @param first the first result
     * @param max the max results to return
     * @param q The q parameter
     * @param search whether this is a search query or a getClientById query
     * @param viewableOnly filter clients that cannot be viewed in full by admin
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsGetWithResponseSpec(String realm, String clientId, Integer first, Integer max, String q, Boolean search, Boolean viewableOnly) throws WebClientResponseException {
        return realmClientsGetRequestCreation(realm, clientId, first, max, q, search, viewableOnly);
    }
    /**
     * Get the client secret
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return CredentialRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdClientSecretGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdClientSecretGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdClientSecretGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CredentialRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CredentialRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/client-secret", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the client secret
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return CredentialRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CredentialRepresentationDto> realmClientsIdClientSecretGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<CredentialRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CredentialRepresentationDto>() {};
        return realmClientsIdClientSecretGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get the client secret
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;CredentialRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CredentialRepresentationDto>> realmClientsIdClientSecretGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<CredentialRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CredentialRepresentationDto>() {};
        return realmClientsIdClientSecretGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Get the client secret
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdClientSecretGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdClientSecretGetRequestCreation(realm, id);
    }
    /**
     * Generate a new secret for the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return CredentialRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdClientSecretPostRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdClientSecretPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdClientSecretPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CredentialRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CredentialRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/client-secret", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Generate a new secret for the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return CredentialRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CredentialRepresentationDto> realmClientsIdClientSecretPost(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<CredentialRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CredentialRepresentationDto>() {};
        return realmClientsIdClientSecretPostRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Generate a new secret for the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;CredentialRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CredentialRepresentationDto>> realmClientsIdClientSecretPostWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<CredentialRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CredentialRepresentationDto>() {};
        return realmClientsIdClientSecretPostRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Generate a new secret for the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdClientSecretPostWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdClientSecretPostRequestCreation(realm, id);
    }
    /**
     * Invalidate the rotated secret for the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdClientSecretRotatedDeleteRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdClientSecretRotatedDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdClientSecretRotatedDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/client-secret/rotated", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Invalidate the rotated secret for the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdClientSecretRotatedDelete(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdClientSecretRotatedDeleteRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Invalidate the rotated secret for the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdClientSecretRotatedDeleteWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdClientSecretRotatedDeleteRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Invalidate the rotated secret for the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdClientSecretRotatedDeleteWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdClientSecretRotatedDeleteRequestCreation(realm, id);
    }
    /**
     * Get the rotated client secret
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return CredentialRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdClientSecretRotatedGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdClientSecretRotatedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdClientSecretRotatedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CredentialRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CredentialRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/client-secret/rotated", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the rotated client secret
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return CredentialRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CredentialRepresentationDto> realmClientsIdClientSecretRotatedGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<CredentialRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CredentialRepresentationDto>() {};
        return realmClientsIdClientSecretRotatedGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get the rotated client secret
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;CredentialRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CredentialRepresentationDto>> realmClientsIdClientSecretRotatedGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<CredentialRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CredentialRepresentationDto>() {};
        return realmClientsIdClientSecretRotatedGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Get the rotated client secret
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdClientSecretRotatedGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdClientSecretRotatedGetRequestCreation(realm, id);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdDefaultClientScopesClientScopeIdDeleteRequestCreation(String realm, String id, String clientScopeId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdDefaultClientScopesClientScopeIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdDefaultClientScopesClientScopeIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientScopeId' is set
        if (clientScopeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientScopeId' when calling realmClientsIdDefaultClientScopesClientScopeIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/default-client-scopes/{clientScopeId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdDefaultClientScopesClientScopeIdDelete(String realm, String id, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdDefaultClientScopesClientScopeIdDeleteRequestCreation(realm, id, clientScopeId).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdDefaultClientScopesClientScopeIdDeleteWithHttpInfo(String realm, String id, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdDefaultClientScopesClientScopeIdDeleteRequestCreation(realm, id, clientScopeId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdDefaultClientScopesClientScopeIdDeleteWithResponseSpec(String realm, String id, String clientScopeId) throws WebClientResponseException {
        return realmClientsIdDefaultClientScopesClientScopeIdDeleteRequestCreation(realm, id, clientScopeId);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdDefaultClientScopesClientScopeIdPutRequestCreation(String realm, String id, String clientScopeId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdDefaultClientScopesClientScopeIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdDefaultClientScopesClientScopeIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientScopeId' is set
        if (clientScopeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientScopeId' when calling realmClientsIdDefaultClientScopesClientScopeIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/default-client-scopes/{clientScopeId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdDefaultClientScopesClientScopeIdPut(String realm, String id, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdDefaultClientScopesClientScopeIdPutRequestCreation(realm, id, clientScopeId).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdDefaultClientScopesClientScopeIdPutWithHttpInfo(String realm, String id, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdDefaultClientScopesClientScopeIdPutRequestCreation(realm, id, clientScopeId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdDefaultClientScopesClientScopeIdPutWithResponseSpec(String realm, String id, String clientScopeId) throws WebClientResponseException {
        return realmClientsIdDefaultClientScopesClientScopeIdPutRequestCreation(realm, id, clientScopeId);
    }
    /**
     * Get default client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdDefaultClientScopesGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdDefaultClientScopesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdDefaultClientScopesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/default-client-scopes", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get default client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdDefaultClientScopesGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdDefaultClientScopesGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get default client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdDefaultClientScopesGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdDefaultClientScopesGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get default client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdDefaultClientScopesGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdDefaultClientScopesGetRequestCreation(realm, id);
    }
    /**
     * Delete the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdDeleteRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdDelete(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdDeleteRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdDeleteWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdDeleteRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Delete the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdDeleteWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdDeleteRequestCreation(realm, id);
    }
    /**
     * Create JSON with payload of example access token
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @param userId The userId parameter
     * @return AccessTokenDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdEvaluateScopesGenerateExampleAccessTokenGetRequestCreation(String realm, String id, String scope, String userId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdEvaluateScopesGenerateExampleAccessTokenGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdEvaluateScopesGenerateExampleAccessTokenGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<AccessTokenDto> localVarReturnType = new ParameterizedTypeReference<AccessTokenDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/evaluate-scopes/generate-example-access-token", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create JSON with payload of example access token
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @param userId The userId parameter
     * @return AccessTokenDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AccessTokenDto> realmClientsIdEvaluateScopesGenerateExampleAccessTokenGet(String realm, String id, String scope, String userId) throws WebClientResponseException {
        ParameterizedTypeReference<AccessTokenDto> localVarReturnType = new ParameterizedTypeReference<AccessTokenDto>() {};
        return realmClientsIdEvaluateScopesGenerateExampleAccessTokenGetRequestCreation(realm, id, scope, userId).bodyToMono(localVarReturnType);
    }

    /**
     * Create JSON with payload of example access token
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @param userId The userId parameter
     * @return ResponseEntity&lt;AccessTokenDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AccessTokenDto>> realmClientsIdEvaluateScopesGenerateExampleAccessTokenGetWithHttpInfo(String realm, String id, String scope, String userId) throws WebClientResponseException {
        ParameterizedTypeReference<AccessTokenDto> localVarReturnType = new ParameterizedTypeReference<AccessTokenDto>() {};
        return realmClientsIdEvaluateScopesGenerateExampleAccessTokenGetRequestCreation(realm, id, scope, userId).toEntity(localVarReturnType);
    }

    /**
     * Create JSON with payload of example access token
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @param userId The userId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdEvaluateScopesGenerateExampleAccessTokenGetWithResponseSpec(String realm, String id, String scope, String userId) throws WebClientResponseException {
        return realmClientsIdEvaluateScopesGenerateExampleAccessTokenGetRequestCreation(realm, id, scope, userId);
    }
    /**
     * Create JSON with payload of example id token
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @param userId The userId parameter
     * @return IDTokenDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdEvaluateScopesGenerateExampleIdTokenGetRequestCreation(String realm, String id, String scope, String userId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdEvaluateScopesGenerateExampleIdTokenGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdEvaluateScopesGenerateExampleIdTokenGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<IDTokenDto> localVarReturnType = new ParameterizedTypeReference<IDTokenDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/evaluate-scopes/generate-example-id-token", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create JSON with payload of example id token
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @param userId The userId parameter
     * @return IDTokenDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<IDTokenDto> realmClientsIdEvaluateScopesGenerateExampleIdTokenGet(String realm, String id, String scope, String userId) throws WebClientResponseException {
        ParameterizedTypeReference<IDTokenDto> localVarReturnType = new ParameterizedTypeReference<IDTokenDto>() {};
        return realmClientsIdEvaluateScopesGenerateExampleIdTokenGetRequestCreation(realm, id, scope, userId).bodyToMono(localVarReturnType);
    }

    /**
     * Create JSON with payload of example id token
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @param userId The userId parameter
     * @return ResponseEntity&lt;IDTokenDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<IDTokenDto>> realmClientsIdEvaluateScopesGenerateExampleIdTokenGetWithHttpInfo(String realm, String id, String scope, String userId) throws WebClientResponseException {
        ParameterizedTypeReference<IDTokenDto> localVarReturnType = new ParameterizedTypeReference<IDTokenDto>() {};
        return realmClientsIdEvaluateScopesGenerateExampleIdTokenGetRequestCreation(realm, id, scope, userId).toEntity(localVarReturnType);
    }

    /**
     * Create JSON with payload of example id token
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @param userId The userId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdEvaluateScopesGenerateExampleIdTokenGetWithResponseSpec(String realm, String id, String scope, String userId) throws WebClientResponseException {
        return realmClientsIdEvaluateScopesGenerateExampleIdTokenGetRequestCreation(realm, id, scope, userId);
    }
    /**
     * Create JSON with payload of example user info
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @param userId The userId parameter
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdEvaluateScopesGenerateExampleUserinfoGetRequestCreation(String realm, String id, String scope, String userId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdEvaluateScopesGenerateExampleUserinfoGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdEvaluateScopesGenerateExampleUserinfoGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/evaluate-scopes/generate-example-userinfo", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create JSON with payload of example user info
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @param userId The userId parameter
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, Object>> realmClientsIdEvaluateScopesGenerateExampleUserinfoGet(String realm, String id, String scope, String userId) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmClientsIdEvaluateScopesGenerateExampleUserinfoGetRequestCreation(realm, id, scope, userId).bodyToMono(localVarReturnType);
    }

    /**
     * Create JSON with payload of example user info
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @param userId The userId parameter
     * @return ResponseEntity&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Map<String, Object>>> realmClientsIdEvaluateScopesGenerateExampleUserinfoGetWithHttpInfo(String realm, String id, String scope, String userId) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmClientsIdEvaluateScopesGenerateExampleUserinfoGetRequestCreation(realm, id, scope, userId).toEntity(localVarReturnType);
    }

    /**
     * Create JSON with payload of example user info
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @param userId The userId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdEvaluateScopesGenerateExampleUserinfoGetWithResponseSpec(String realm, String id, String scope, String userId) throws WebClientResponseException {
        return realmClientsIdEvaluateScopesGenerateExampleUserinfoGetRequestCreation(realm, id, scope, userId);
    }
    /**
     * Return list of all protocol mappers, which will be used when generating tokens issued for particular client.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdEvaluateScopesProtocolMappersGetRequestCreation(String realm, String id, String scope) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdEvaluateScopesProtocolMappersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdEvaluateScopesProtocolMappersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/evaluate-scopes/protocol-mappers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return list of all protocol mappers, which will be used when generating tokens issued for particular client.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdEvaluateScopesProtocolMappersGet(String realm, String id, String scope) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdEvaluateScopesProtocolMappersGetRequestCreation(realm, id, scope).bodyToFlux(localVarReturnType);
    }

    /**
     * Return list of all protocol mappers, which will be used when generating tokens issued for particular client.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdEvaluateScopesProtocolMappersGetWithHttpInfo(String realm, String id, String scope) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdEvaluateScopesProtocolMappersGetRequestCreation(realm, id, scope).toEntityList(localVarReturnType);
    }

    /**
     * Return list of all protocol mappers, which will be used when generating tokens issued for particular client.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param scope The scope parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdEvaluateScopesProtocolMappersGetWithResponseSpec(String realm, String id, String scope) throws WebClientResponseException {
        return realmClientsIdEvaluateScopesProtocolMappersGetRequestCreation(realm, id, scope);
    }
    /**
     * Get effective scope mapping of all roles of particular role container, which this client is defacto allowed to have in the accessToken issued for him.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleContainerId either realm name OR client UUID
     * @param scope The scope parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdGrantedGetRequestCreation(String realm, String id, String roleContainerId, String scope) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdGrantedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdGrantedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleContainerId' is set
        if (roleContainerId == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleContainerId' when calling realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdGrantedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("roleContainerId", roleContainerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/evaluate-scopes/scope-mappings/{roleContainerId}/granted", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get effective scope mapping of all roles of particular role container, which this client is defacto allowed to have in the accessToken issued for him.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleContainerId either realm name OR client UUID
     * @param scope The scope parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdGrantedGet(String realm, String id, String roleContainerId, String scope) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdGrantedGetRequestCreation(realm, id, roleContainerId, scope).bodyToFlux(localVarReturnType);
    }

    /**
     * Get effective scope mapping of all roles of particular role container, which this client is defacto allowed to have in the accessToken issued for him.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleContainerId either realm name OR client UUID
     * @param scope The scope parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdGrantedGetWithHttpInfo(String realm, String id, String roleContainerId, String scope) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdGrantedGetRequestCreation(realm, id, roleContainerId, scope).toEntityList(localVarReturnType);
    }

    /**
     * Get effective scope mapping of all roles of particular role container, which this client is defacto allowed to have in the accessToken issued for him.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleContainerId either realm name OR client UUID
     * @param scope The scope parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdGrantedGetWithResponseSpec(String realm, String id, String roleContainerId, String scope) throws WebClientResponseException {
        return realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdGrantedGetRequestCreation(realm, id, roleContainerId, scope);
    }
    /**
     * Get roles, which this client doesn’t have scope for and can’t have them in the accessToken issued for him.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleContainerId either realm name OR client UUID
     * @param scope The scope parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdNotGrantedGetRequestCreation(String realm, String id, String roleContainerId, String scope) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdNotGrantedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdNotGrantedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleContainerId' is set
        if (roleContainerId == null) {
            throw new WebClientResponseException("Missing the required parameter 'roleContainerId' when calling realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdNotGrantedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("roleContainerId", roleContainerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/evaluate-scopes/scope-mappings/{roleContainerId}/not-granted", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get roles, which this client doesn’t have scope for and can’t have them in the accessToken issued for him.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleContainerId either realm name OR client UUID
     * @param scope The scope parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdNotGrantedGet(String realm, String id, String roleContainerId, String scope) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdNotGrantedGetRequestCreation(realm, id, roleContainerId, scope).bodyToFlux(localVarReturnType);
    }

    /**
     * Get roles, which this client doesn’t have scope for and can’t have them in the accessToken issued for him.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleContainerId either realm name OR client UUID
     * @param scope The scope parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdNotGrantedGetWithHttpInfo(String realm, String id, String roleContainerId, String scope) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdNotGrantedGetRequestCreation(realm, id, roleContainerId, scope).toEntityList(localVarReturnType);
    }

    /**
     * Get roles, which this client doesn’t have scope for and can’t have them in the accessToken issued for him.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param roleContainerId either realm name OR client UUID
     * @param scope The scope parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdNotGrantedGetWithResponseSpec(String realm, String id, String roleContainerId, String scope) throws WebClientResponseException {
        return realmClientsIdEvaluateScopesScopeMappingsRoleContainerIdNotGrantedGetRequestCreation(realm, id, roleContainerId, scope);
    }
    /**
     * Get representation of the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ClientRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ClientRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get representation of the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ClientRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ClientRepresentationDto> realmClientsIdGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<ClientRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientRepresentationDto>() {};
        return realmClientsIdGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get representation of the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;ClientRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ClientRepresentationDto>> realmClientsIdGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<ClientRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientRepresentationDto>() {};
        return realmClientsIdGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Get representation of the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdGetRequestCreation(realm, id);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param providerId The providerId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdInstallationProvidersProviderIdGetRequestCreation(String realm, String id, String providerId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdInstallationProvidersProviderIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdInstallationProvidersProviderIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new WebClientResponseException("Missing the required parameter 'providerId' when calling realmClientsIdInstallationProvidersProviderIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("providerId", providerId);

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
        return apiClient.invokeAPI("/{realm}/clients/{id}/installation/providers/{providerId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param providerId The providerId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdInstallationProvidersProviderIdGet(String realm, String id, String providerId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdInstallationProvidersProviderIdGetRequestCreation(realm, id, providerId).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param providerId The providerId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdInstallationProvidersProviderIdGetWithHttpInfo(String realm, String id, String providerId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdInstallationProvidersProviderIdGetRequestCreation(realm, id, providerId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param providerId The providerId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdInstallationProvidersProviderIdGetWithResponseSpec(String realm, String id, String providerId) throws WebClientResponseException {
        return realmClientsIdInstallationProvidersProviderIdGetRequestCreation(realm, id, providerId);
    }
    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdManagementPermissionsGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/management/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmClientsIdManagementPermissionsGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmClientsIdManagementPermissionsGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmClientsIdManagementPermissionsGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmClientsIdManagementPermissionsGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdManagementPermissionsGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdManagementPermissionsGetRequestCreation(realm, id);
    }
    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdManagementPermissionsPutRequestCreation(String realm, String id, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        Object postBody = managementPermissionReferenceDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'managementPermissionReferenceDto' is set
        if (managementPermissionReferenceDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'managementPermissionReferenceDto' when calling realmClientsIdManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/management/permissions", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmClientsIdManagementPermissionsPut(String realm, String id, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmClientsIdManagementPermissionsPutRequestCreation(realm, id, managementPermissionReferenceDto).bodyToMono(localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmClientsIdManagementPermissionsPutWithHttpInfo(String realm, String id, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmClientsIdManagementPermissionsPutRequestCreation(realm, id, managementPermissionReferenceDto).toEntity(localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdManagementPermissionsPutWithResponseSpec(String realm, String id, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        return realmClientsIdManagementPermissionsPutRequestCreation(realm, id, managementPermissionReferenceDto);
    }
    /**
     * Unregister a cluster node from the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param node The node parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdNodesNodeDeleteRequestCreation(String realm, String id, String node) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdNodesNodeDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdNodesNodeDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'node' is set
        if (node == null) {
            throw new WebClientResponseException("Missing the required parameter 'node' when calling realmClientsIdNodesNodeDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("node", node);

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
        return apiClient.invokeAPI("/{realm}/clients/{id}/nodes/{node}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Unregister a cluster node from the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param node The node parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdNodesNodeDelete(String realm, String id, String node) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdNodesNodeDeleteRequestCreation(realm, id, node).bodyToMono(localVarReturnType);
    }

    /**
     * Unregister a cluster node from the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param node The node parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdNodesNodeDeleteWithHttpInfo(String realm, String id, String node) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdNodesNodeDeleteRequestCreation(realm, id, node).toEntity(localVarReturnType);
    }

    /**
     * Unregister a cluster node from the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param node The node parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdNodesNodeDeleteWithResponseSpec(String realm, String id, String node) throws WebClientResponseException {
        return realmClientsIdNodesNodeDeleteRequestCreation(realm, id, node);
    }
    /**
     * Register a cluster node with the client   Manually register cluster node to this client - usually it’s not needed to call this directly as adapter should handle  by sending registration request to Keycloak
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdNodesPostRequestCreation(String realm, String id, Map<String, Object> requestBody) throws WebClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdNodesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdNodesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new WebClientResponseException("Missing the required parameter 'requestBody' when calling realmClientsIdNodesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/nodes", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Register a cluster node with the client   Manually register cluster node to this client - usually it’s not needed to call this directly as adapter should handle  by sending registration request to Keycloak
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdNodesPost(String realm, String id, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdNodesPostRequestCreation(realm, id, requestBody).bodyToMono(localVarReturnType);
    }

    /**
     * Register a cluster node with the client   Manually register cluster node to this client - usually it’s not needed to call this directly as adapter should handle  by sending registration request to Keycloak
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param requestBody The requestBody parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdNodesPostWithHttpInfo(String realm, String id, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdNodesPostRequestCreation(realm, id, requestBody).toEntity(localVarReturnType);
    }

    /**
     * Register a cluster node with the client   Manually register cluster node to this client - usually it’s not needed to call this directly as adapter should handle  by sending registration request to Keycloak
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param requestBody The requestBody parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdNodesPostWithResponseSpec(String realm, String id, Map<String, Object> requestBody) throws WebClientResponseException {
        return realmClientsIdNodesPostRequestCreation(realm, id, requestBody);
    }
    /**
     * Get application offline session count   Returns a number of offline user sessions associated with this client   {      \&quot;count\&quot;: number  }
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdOfflineSessionCountGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdOfflineSessionCountGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdOfflineSessionCountGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/offline-session-count", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get application offline session count   Returns a number of offline user sessions associated with this client   {      \&quot;count\&quot;: number  }
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, Object>> realmClientsIdOfflineSessionCountGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmClientsIdOfflineSessionCountGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get application offline session count   Returns a number of offline user sessions associated with this client   {      \&quot;count\&quot;: number  }
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Map<String, Object>>> realmClientsIdOfflineSessionCountGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmClientsIdOfflineSessionCountGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Get application offline session count   Returns a number of offline user sessions associated with this client   {      \&quot;count\&quot;: number  }
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdOfflineSessionCountGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdOfflineSessionCountGetRequestCreation(realm, id);
    }
    /**
     * Get offline sessions for client   Returns a list of offline user sessions associated with this client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param first Paging offset
     * @param max Maximum results size (defaults to 100)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdOfflineSessionsGetRequestCreation(String realm, String id, Integer first, Integer max) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdOfflineSessionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdOfflineSessionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

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
        return apiClient.invokeAPI("/{realm}/clients/{id}/offline-sessions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get offline sessions for client   Returns a list of offline user sessions associated with this client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param first Paging offset
     * @param max Maximum results size (defaults to 100)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdOfflineSessionsGet(String realm, String id, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdOfflineSessionsGetRequestCreation(realm, id, first, max).bodyToFlux(localVarReturnType);
    }

    /**
     * Get offline sessions for client   Returns a list of offline user sessions associated with this client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param first Paging offset
     * @param max Maximum results size (defaults to 100)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdOfflineSessionsGetWithHttpInfo(String realm, String id, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdOfflineSessionsGetRequestCreation(realm, id, first, max).toEntityList(localVarReturnType);
    }

    /**
     * Get offline sessions for client   Returns a list of offline user sessions associated with this client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param first Paging offset
     * @param max Maximum results size (defaults to 100)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdOfflineSessionsGetWithResponseSpec(String realm, String id, Integer first, Integer max) throws WebClientResponseException {
        return realmClientsIdOfflineSessionsGetRequestCreation(realm, id, first, max);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdOptionalClientScopesClientScopeIdDeleteRequestCreation(String realm, String id, String clientScopeId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdOptionalClientScopesClientScopeIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdOptionalClientScopesClientScopeIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientScopeId' is set
        if (clientScopeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientScopeId' when calling realmClientsIdOptionalClientScopesClientScopeIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/optional-client-scopes/{clientScopeId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdOptionalClientScopesClientScopeIdDelete(String realm, String id, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdOptionalClientScopesClientScopeIdDeleteRequestCreation(realm, id, clientScopeId).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdOptionalClientScopesClientScopeIdDeleteWithHttpInfo(String realm, String id, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdOptionalClientScopesClientScopeIdDeleteRequestCreation(realm, id, clientScopeId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdOptionalClientScopesClientScopeIdDeleteWithResponseSpec(String realm, String id, String clientScopeId) throws WebClientResponseException {
        return realmClientsIdOptionalClientScopesClientScopeIdDeleteRequestCreation(realm, id, clientScopeId);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdOptionalClientScopesClientScopeIdPutRequestCreation(String realm, String id, String clientScopeId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdOptionalClientScopesClientScopeIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdOptionalClientScopesClientScopeIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientScopeId' is set
        if (clientScopeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientScopeId' when calling realmClientsIdOptionalClientScopesClientScopeIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/optional-client-scopes/{clientScopeId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdOptionalClientScopesClientScopeIdPut(String realm, String id, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdOptionalClientScopesClientScopeIdPutRequestCreation(realm, id, clientScopeId).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdOptionalClientScopesClientScopeIdPutWithHttpInfo(String realm, String id, String clientScopeId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdOptionalClientScopesClientScopeIdPutRequestCreation(realm, id, clientScopeId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientScopeId The clientScopeId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdOptionalClientScopesClientScopeIdPutWithResponseSpec(String realm, String id, String clientScopeId) throws WebClientResponseException {
        return realmClientsIdOptionalClientScopesClientScopeIdPutRequestCreation(realm, id, clientScopeId);
    }
    /**
     * Get optional client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdOptionalClientScopesGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdOptionalClientScopesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdOptionalClientScopesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/optional-client-scopes", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get optional client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdOptionalClientScopesGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdOptionalClientScopesGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get optional client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdOptionalClientScopesGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdOptionalClientScopesGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get optional client scopes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdOptionalClientScopesGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdOptionalClientScopesGetRequestCreation(realm, id);
    }
    /**
     * Push the client’s revocation policy to its admin URL   If the client has an admin URL, push revocation policy to it.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return GlobalRequestResultDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdPushRevocationPostRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdPushRevocationPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdPushRevocationPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GlobalRequestResultDto> localVarReturnType = new ParameterizedTypeReference<GlobalRequestResultDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/push-revocation", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Push the client’s revocation policy to its admin URL   If the client has an admin URL, push revocation policy to it.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return GlobalRequestResultDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GlobalRequestResultDto> realmClientsIdPushRevocationPost(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<GlobalRequestResultDto> localVarReturnType = new ParameterizedTypeReference<GlobalRequestResultDto>() {};
        return realmClientsIdPushRevocationPostRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Push the client’s revocation policy to its admin URL   If the client has an admin URL, push revocation policy to it.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;GlobalRequestResultDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GlobalRequestResultDto>> realmClientsIdPushRevocationPostWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<GlobalRequestResultDto> localVarReturnType = new ParameterizedTypeReference<GlobalRequestResultDto>() {};
        return realmClientsIdPushRevocationPostRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Push the client’s revocation policy to its admin URL   If the client has an admin URL, push revocation policy to it.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdPushRevocationPostWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdPushRevocationPostRequestCreation(realm, id);
    }
    /**
     * Update the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientRepresentationDto The clientRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdPutRequestCreation(String realm, String id, ClientRepresentationDto clientRepresentationDto) throws WebClientResponseException {
        Object postBody = clientRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientRepresentationDto' is set
        if (clientRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientRepresentationDto' when calling realmClientsIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientRepresentationDto The clientRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdPut(String realm, String id, ClientRepresentationDto clientRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdPutRequestCreation(realm, id, clientRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientRepresentationDto The clientRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdPutWithHttpInfo(String realm, String id, ClientRepresentationDto clientRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdPutRequestCreation(realm, id, clientRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param clientRepresentationDto The clientRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdPutWithResponseSpec(String realm, String id, ClientRepresentationDto clientRepresentationDto) throws WebClientResponseException {
        return realmClientsIdPutRequestCreation(realm, id, clientRepresentationDto);
    }
    /**
     * Generate a new registration access token for the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ClientRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdRegistrationAccessTokenPostRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdRegistrationAccessTokenPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdRegistrationAccessTokenPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ClientRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/registration-access-token", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Generate a new registration access token for the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ClientRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ClientRepresentationDto> realmClientsIdRegistrationAccessTokenPost(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<ClientRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientRepresentationDto>() {};
        return realmClientsIdRegistrationAccessTokenPostRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Generate a new registration access token for the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;ClientRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ClientRepresentationDto>> realmClientsIdRegistrationAccessTokenPostWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<ClientRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientRepresentationDto>() {};
        return realmClientsIdRegistrationAccessTokenPostRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Generate a new registration access token for the client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdRegistrationAccessTokenPostWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdRegistrationAccessTokenPostRequestCreation(realm, id);
    }
    /**
     * Get a user dedicated to the service account
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return UserRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdServiceAccountUserGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdServiceAccountUserGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdServiceAccountUserGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/service-account-user", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a user dedicated to the service account
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return UserRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserRepresentationDto> realmClientsIdServiceAccountUserGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<UserRepresentationDto> localVarReturnType = new ParameterizedTypeReference<UserRepresentationDto>() {};
        return realmClientsIdServiceAccountUserGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get a user dedicated to the service account
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;UserRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UserRepresentationDto>> realmClientsIdServiceAccountUserGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<UserRepresentationDto> localVarReturnType = new ParameterizedTypeReference<UserRepresentationDto>() {};
        return realmClientsIdServiceAccountUserGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Get a user dedicated to the service account
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdServiceAccountUserGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdServiceAccountUserGetRequestCreation(realm, id);
    }
    /**
     * Get application session count   Returns a number of user sessions associated with this client   {      \&quot;count\&quot;: number  }
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdSessionCountGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdSessionCountGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdSessionCountGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/session-count", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get application session count   Returns a number of user sessions associated with this client   {      \&quot;count\&quot;: number  }
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, Object>> realmClientsIdSessionCountGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmClientsIdSessionCountGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get application session count   Returns a number of user sessions associated with this client   {      \&quot;count\&quot;: number  }
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Map<String, Object>>> realmClientsIdSessionCountGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmClientsIdSessionCountGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Get application session count   Returns a number of user sessions associated with this client   {      \&quot;count\&quot;: number  }
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdSessionCountGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdSessionCountGetRequestCreation(realm, id);
    }
    /**
     * Test if registered cluster nodes are available   Tests availability by sending &#39;ping&#39; request to all cluster nodes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return GlobalRequestResultDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdTestNodesAvailableGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdTestNodesAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdTestNodesAvailableGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GlobalRequestResultDto> localVarReturnType = new ParameterizedTypeReference<GlobalRequestResultDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/test-nodes-available", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Test if registered cluster nodes are available   Tests availability by sending &#39;ping&#39; request to all cluster nodes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return GlobalRequestResultDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GlobalRequestResultDto> realmClientsIdTestNodesAvailableGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<GlobalRequestResultDto> localVarReturnType = new ParameterizedTypeReference<GlobalRequestResultDto>() {};
        return realmClientsIdTestNodesAvailableGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Test if registered cluster nodes are available   Tests availability by sending &#39;ping&#39; request to all cluster nodes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;GlobalRequestResultDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GlobalRequestResultDto>> realmClientsIdTestNodesAvailableGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<GlobalRequestResultDto> localVarReturnType = new ParameterizedTypeReference<GlobalRequestResultDto>() {};
        return realmClientsIdTestNodesAvailableGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Test if registered cluster nodes are available   Tests availability by sending &#39;ping&#39; request to all cluster nodes.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdTestNodesAvailableGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdTestNodesAvailableGetRequestCreation(realm, id);
    }
    /**
     * Get user sessions for client   Returns a list of user sessions associated with this client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param first Paging offset
     * @param max Maximum results size (defaults to 100)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdUserSessionsGetRequestCreation(String realm, String id, Integer first, Integer max) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdUserSessionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdUserSessionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

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
        return apiClient.invokeAPI("/{realm}/clients/{id}/user-sessions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get user sessions for client   Returns a list of user sessions associated with this client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param first Paging offset
     * @param max Maximum results size (defaults to 100)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdUserSessionsGet(String realm, String id, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdUserSessionsGetRequestCreation(realm, id, first, max).bodyToFlux(localVarReturnType);
    }

    /**
     * Get user sessions for client   Returns a list of user sessions associated with this client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param first Paging offset
     * @param max Maximum results size (defaults to 100)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdUserSessionsGetWithHttpInfo(String realm, String id, Integer first, Integer max) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdUserSessionsGetRequestCreation(realm, id, first, max).toEntityList(localVarReturnType);
    }

    /**
     * Get user sessions for client   Returns a list of user sessions associated with this client
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param first Paging offset
     * @param max Maximum results size (defaults to 100)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdUserSessionsGetWithResponseSpec(String realm, String id, Integer first, Integer max) throws WebClientResponseException {
        return realmClientsIdUserSessionsGetRequestCreation(realm, id, first, max);
    }
    /**
     * Create a new client   Client’s client_id must be unique!
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientRepresentationDto The clientRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsPostRequestCreation(String realm, ClientRepresentationDto clientRepresentationDto) throws WebClientResponseException {
        Object postBody = clientRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientRepresentationDto' is set
        if (clientRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientRepresentationDto' when calling realmClientsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new client   Client’s client_id must be unique!
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientRepresentationDto The clientRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsPost(String realm, ClientRepresentationDto clientRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsPostRequestCreation(realm, clientRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Create a new client   Client’s client_id must be unique!
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientRepresentationDto The clientRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsPostWithHttpInfo(String realm, ClientRepresentationDto clientRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsPostRequestCreation(realm, clientRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Create a new client   Client’s client_id must be unique!
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientRepresentationDto The clientRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsPostWithResponseSpec(String realm, ClientRepresentationDto clientRepresentationDto) throws WebClientResponseException {
        return realmClientsPostRequestCreation(realm, clientRepresentationDto);
    }
}

package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.ClientScopeRepresentationDto;

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
public class ClientScopesApi {
    private ApiClient apiClient;

    public ClientScopesApi() {
        this(new ApiClient());
    }

    @Autowired
    public ClientScopesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get client scopes belonging to the realm   Returns a list of client scopes belonging to the realm
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/client-scopes", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get client scopes belonging to the realm   Returns a list of client scopes belonging to the realm
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientScopesGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * Get client scopes belonging to the realm   Returns a list of client scopes belonging to the realm
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientScopesGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * Get client scopes belonging to the realm   Returns a list of client scopes belonging to the realm
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmClientScopesGetRequestCreation(realm);
    }
    /**
     * Delete the client scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdDeleteRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the client scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientScopesIdDelete(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesIdDeleteRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete the client scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientScopesIdDeleteWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesIdDeleteRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Delete the client scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdDeleteWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientScopesIdDeleteRequestCreation(realm, id);
    }
    /**
     * Get representation of the client scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return ClientScopeRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ClientScopeRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientScopeRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get representation of the client scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return ClientScopeRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ClientScopeRepresentationDto> realmClientScopesIdGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<ClientScopeRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientScopeRepresentationDto>() {};
        return realmClientScopesIdGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get representation of the client scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return ResponseEntity&lt;ClientScopeRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ClientScopeRepresentationDto>> realmClientScopesIdGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<ClientScopeRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientScopeRepresentationDto>() {};
        return realmClientScopesIdGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Get representation of the client scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientScopesIdGetRequestCreation(realm, id);
    }
    /**
     * Update the client scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param clientScopeRepresentationDto The clientScopeRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdPutRequestCreation(String realm, String id, ClientScopeRepresentationDto clientScopeRepresentationDto) throws WebClientResponseException {
        Object postBody = clientScopeRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientScopeRepresentationDto' is set
        if (clientScopeRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientScopeRepresentationDto' when calling realmClientScopesIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the client scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param clientScopeRepresentationDto The clientScopeRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientScopesIdPut(String realm, String id, ClientScopeRepresentationDto clientScopeRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesIdPutRequestCreation(realm, id, clientScopeRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update the client scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param clientScopeRepresentationDto The clientScopeRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientScopesIdPutWithHttpInfo(String realm, String id, ClientScopeRepresentationDto clientScopeRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesIdPutRequestCreation(realm, id, clientScopeRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update the client scope
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param clientScopeRepresentationDto The clientScopeRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdPutWithResponseSpec(String realm, String id, ClientScopeRepresentationDto clientScopeRepresentationDto) throws WebClientResponseException {
        return realmClientScopesIdPutRequestCreation(realm, id, clientScopeRepresentationDto);
    }
    /**
     * Create a new client scope   Client Scope’s name must be unique!
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeRepresentationDto The clientScopeRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesPostRequestCreation(String realm, ClientScopeRepresentationDto clientScopeRepresentationDto) throws WebClientResponseException {
        Object postBody = clientScopeRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientScopeRepresentationDto' is set
        if (clientScopeRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientScopeRepresentationDto' when calling realmClientScopesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/client-scopes", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new client scope   Client Scope’s name must be unique!
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeRepresentationDto The clientScopeRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientScopesPost(String realm, ClientScopeRepresentationDto clientScopeRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesPostRequestCreation(realm, clientScopeRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Create a new client scope   Client Scope’s name must be unique!
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeRepresentationDto The clientScopeRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientScopesPostWithHttpInfo(String realm, ClientScopeRepresentationDto clientScopeRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesPostRequestCreation(realm, clientScopeRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Create a new client scope   Client Scope’s name must be unique!
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientScopeRepresentationDto The clientScopeRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesPostWithResponseSpec(String realm, ClientScopeRepresentationDto clientScopeRepresentationDto) throws WebClientResponseException {
        return realmClientScopesPostRequestCreation(realm, clientScopeRepresentationDto);
    }
}

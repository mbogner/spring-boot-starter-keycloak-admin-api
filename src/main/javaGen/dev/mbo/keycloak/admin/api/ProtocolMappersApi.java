package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.ProtocolMapperRepresentationDto;

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
public class ProtocolMappersApi {
    private ApiClient apiClient;

    public ProtocolMappersApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProtocolMappersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesId1ProtocolMappersModelsId2DeleteRequestCreation(String realm, String id1, String id2) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesId1ProtocolMappersModelsId2Delete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id1' is set
        if (id1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'id1' when calling realmClientScopesId1ProtocolMappersModelsId2Delete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id2' is set
        if (id2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'id2' when calling realmClientScopesId1ProtocolMappersModelsId2Delete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id1", id1);
        pathParams.put("id2", id2);

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
        return apiClient.invokeAPI("/{realm}/client-scopes/{id1}/protocol-mappers/models/{id2}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientScopesId1ProtocolMappersModelsId2Delete(String realm, String id1, String id2) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesId1ProtocolMappersModelsId2DeleteRequestCreation(realm, id1, id2).bodyToMono(localVarReturnType);
    }

    /**
     * Delete the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientScopesId1ProtocolMappersModelsId2DeleteWithHttpInfo(String realm, String id1, String id2) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesId1ProtocolMappersModelsId2DeleteRequestCreation(realm, id1, id2).toEntity(localVarReturnType);
    }

    /**
     * Delete the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesId1ProtocolMappersModelsId2DeleteWithResponseSpec(String realm, String id1, String id2) throws WebClientResponseException {
        return realmClientScopesId1ProtocolMappersModelsId2DeleteRequestCreation(realm, id1, id2);
    }
    /**
     * Get mapper by id
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @return ProtocolMapperRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesId1ProtocolMappersModelsId2GetRequestCreation(String realm, String id1, String id2) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesId1ProtocolMappersModelsId2Get", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id1' is set
        if (id1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'id1' when calling realmClientScopesId1ProtocolMappersModelsId2Get", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id2' is set
        if (id2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'id2' when calling realmClientScopesId1ProtocolMappersModelsId2Get", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id1", id1);
        pathParams.put("id2", id2);

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

        ParameterizedTypeReference<ProtocolMapperRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ProtocolMapperRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/client-scopes/{id1}/protocol-mappers/models/{id2}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get mapper by id
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @return ProtocolMapperRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ProtocolMapperRepresentationDto> realmClientScopesId1ProtocolMappersModelsId2Get(String realm, String id1, String id2) throws WebClientResponseException {
        ParameterizedTypeReference<ProtocolMapperRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ProtocolMapperRepresentationDto>() {};
        return realmClientScopesId1ProtocolMappersModelsId2GetRequestCreation(realm, id1, id2).bodyToMono(localVarReturnType);
    }

    /**
     * Get mapper by id
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @return ResponseEntity&lt;ProtocolMapperRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ProtocolMapperRepresentationDto>> realmClientScopesId1ProtocolMappersModelsId2GetWithHttpInfo(String realm, String id1, String id2) throws WebClientResponseException {
        ParameterizedTypeReference<ProtocolMapperRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ProtocolMapperRepresentationDto>() {};
        return realmClientScopesId1ProtocolMappersModelsId2GetRequestCreation(realm, id1, id2).toEntity(localVarReturnType);
    }

    /**
     * Get mapper by id
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesId1ProtocolMappersModelsId2GetWithResponseSpec(String realm, String id1, String id2) throws WebClientResponseException {
        return realmClientScopesId1ProtocolMappersModelsId2GetRequestCreation(realm, id1, id2);
    }
    /**
     * Update the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesId1ProtocolMappersModelsId2PutRequestCreation(String realm, String id1, String id2, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        Object postBody = protocolMapperRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesId1ProtocolMappersModelsId2Put", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id1' is set
        if (id1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'id1' when calling realmClientScopesId1ProtocolMappersModelsId2Put", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id2' is set
        if (id2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'id2' when calling realmClientScopesId1ProtocolMappersModelsId2Put", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'protocolMapperRepresentationDto' is set
        if (protocolMapperRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'protocolMapperRepresentationDto' when calling realmClientScopesId1ProtocolMappersModelsId2Put", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id1", id1);
        pathParams.put("id2", id2);

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
        return apiClient.invokeAPI("/{realm}/client-scopes/{id1}/protocol-mappers/models/{id2}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientScopesId1ProtocolMappersModelsId2Put(String realm, String id1, String id2, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesId1ProtocolMappersModelsId2PutRequestCreation(realm, id1, id2, protocolMapperRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientScopesId1ProtocolMappersModelsId2PutWithHttpInfo(String realm, String id1, String id2, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesId1ProtocolMappersModelsId2PutRequestCreation(realm, id1, id2, protocolMapperRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesId1ProtocolMappersModelsId2PutWithResponseSpec(String realm, String id1, String id2, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        return realmClientScopesId1ProtocolMappersModelsId2PutRequestCreation(realm, id1, id2, protocolMapperRepresentationDto);
    }
    /**
     * Create multiple mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdProtocolMappersAddModelsPostRequestCreation(String realm, String id, List<ProtocolMapperRepresentationDto> protocolMapperRepresentationDto) throws WebClientResponseException {
        Object postBody = protocolMapperRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdProtocolMappersAddModelsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdProtocolMappersAddModelsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'protocolMapperRepresentationDto' is set
        if (protocolMapperRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'protocolMapperRepresentationDto' when calling realmClientScopesIdProtocolMappersAddModelsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}/protocol-mappers/add-models", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create multiple mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientScopesIdProtocolMappersAddModelsPost(String realm, String id, List<ProtocolMapperRepresentationDto> protocolMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesIdProtocolMappersAddModelsPostRequestCreation(realm, id, protocolMapperRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Create multiple mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientScopesIdProtocolMappersAddModelsPostWithHttpInfo(String realm, String id, List<ProtocolMapperRepresentationDto> protocolMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesIdProtocolMappersAddModelsPostRequestCreation(realm, id, protocolMapperRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Create multiple mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdProtocolMappersAddModelsPostWithResponseSpec(String realm, String id, List<ProtocolMapperRepresentationDto> protocolMapperRepresentationDto) throws WebClientResponseException {
        return realmClientScopesIdProtocolMappersAddModelsPostRequestCreation(realm, id, protocolMapperRepresentationDto);
    }
    /**
     * Get mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdProtocolMappersModelsGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdProtocolMappersModelsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdProtocolMappersModelsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}/protocol-mappers/models", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientScopesIdProtocolMappersModelsGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdProtocolMappersModelsGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientScopesIdProtocolMappersModelsGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdProtocolMappersModelsGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdProtocolMappersModelsGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientScopesIdProtocolMappersModelsGetRequestCreation(realm, id);
    }
    /**
     * Create a mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdProtocolMappersModelsPostRequestCreation(String realm, String id, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        Object postBody = protocolMapperRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdProtocolMappersModelsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdProtocolMappersModelsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'protocolMapperRepresentationDto' is set
        if (protocolMapperRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'protocolMapperRepresentationDto' when calling realmClientScopesIdProtocolMappersModelsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}/protocol-mappers/models", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientScopesIdProtocolMappersModelsPost(String realm, String id, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesIdProtocolMappersModelsPostRequestCreation(realm, id, protocolMapperRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Create a mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientScopesIdProtocolMappersModelsPostWithHttpInfo(String realm, String id, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientScopesIdProtocolMappersModelsPostRequestCreation(realm, id, protocolMapperRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Create a mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdProtocolMappersModelsPostWithResponseSpec(String realm, String id, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        return realmClientScopesIdProtocolMappersModelsPostRequestCreation(realm, id, protocolMapperRepresentationDto);
    }
    /**
     * Get mappers by name for a specific protocol
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param protocol The protocol parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientScopesIdProtocolMappersProtocolProtocolGetRequestCreation(String realm, String id, String protocol) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientScopesIdProtocolMappersProtocolProtocolGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientScopesIdProtocolMappersProtocolProtocolGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'protocol' is set
        if (protocol == null) {
            throw new WebClientResponseException("Missing the required parameter 'protocol' when calling realmClientScopesIdProtocolMappersProtocolProtocolGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("protocol", protocol);

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
        return apiClient.invokeAPI("/{realm}/client-scopes/{id}/protocol-mappers/protocol/{protocol}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get mappers by name for a specific protocol
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param protocol The protocol parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientScopesIdProtocolMappersProtocolProtocolGet(String realm, String id, String protocol) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdProtocolMappersProtocolProtocolGetRequestCreation(realm, id, protocol).bodyToFlux(localVarReturnType);
    }

    /**
     * Get mappers by name for a specific protocol
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param protocol The protocol parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientScopesIdProtocolMappersProtocolProtocolGetWithHttpInfo(String realm, String id, String protocol) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientScopesIdProtocolMappersProtocolProtocolGetRequestCreation(realm, id, protocol).toEntityList(localVarReturnType);
    }

    /**
     * Get mappers by name for a specific protocol
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client scope (not name)
     * @param protocol The protocol parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientScopesIdProtocolMappersProtocolProtocolGetWithResponseSpec(String realm, String id, String protocol) throws WebClientResponseException {
        return realmClientScopesIdProtocolMappersProtocolProtocolGetRequestCreation(realm, id, protocol);
    }
    /**
     * Delete the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsId1ProtocolMappersModelsId2DeleteRequestCreation(String realm, String id1, String id2) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsId1ProtocolMappersModelsId2Delete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id1' is set
        if (id1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'id1' when calling realmClientsId1ProtocolMappersModelsId2Delete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id2' is set
        if (id2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'id2' when calling realmClientsId1ProtocolMappersModelsId2Delete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id1", id1);
        pathParams.put("id2", id2);

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
        return apiClient.invokeAPI("/{realm}/clients/{id1}/protocol-mappers/models/{id2}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsId1ProtocolMappersModelsId2Delete(String realm, String id1, String id2) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsId1ProtocolMappersModelsId2DeleteRequestCreation(realm, id1, id2).bodyToMono(localVarReturnType);
    }

    /**
     * Delete the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsId1ProtocolMappersModelsId2DeleteWithHttpInfo(String realm, String id1, String id2) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsId1ProtocolMappersModelsId2DeleteRequestCreation(realm, id1, id2).toEntity(localVarReturnType);
    }

    /**
     * Delete the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsId1ProtocolMappersModelsId2DeleteWithResponseSpec(String realm, String id1, String id2) throws WebClientResponseException {
        return realmClientsId1ProtocolMappersModelsId2DeleteRequestCreation(realm, id1, id2);
    }
    /**
     * Get mapper by id
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @return ProtocolMapperRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsId1ProtocolMappersModelsId2GetRequestCreation(String realm, String id1, String id2) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsId1ProtocolMappersModelsId2Get", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id1' is set
        if (id1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'id1' when calling realmClientsId1ProtocolMappersModelsId2Get", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id2' is set
        if (id2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'id2' when calling realmClientsId1ProtocolMappersModelsId2Get", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id1", id1);
        pathParams.put("id2", id2);

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

        ParameterizedTypeReference<ProtocolMapperRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ProtocolMapperRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id1}/protocol-mappers/models/{id2}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get mapper by id
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @return ProtocolMapperRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ProtocolMapperRepresentationDto> realmClientsId1ProtocolMappersModelsId2Get(String realm, String id1, String id2) throws WebClientResponseException {
        ParameterizedTypeReference<ProtocolMapperRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ProtocolMapperRepresentationDto>() {};
        return realmClientsId1ProtocolMappersModelsId2GetRequestCreation(realm, id1, id2).bodyToMono(localVarReturnType);
    }

    /**
     * Get mapper by id
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @return ResponseEntity&lt;ProtocolMapperRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ProtocolMapperRepresentationDto>> realmClientsId1ProtocolMappersModelsId2GetWithHttpInfo(String realm, String id1, String id2) throws WebClientResponseException {
        ParameterizedTypeReference<ProtocolMapperRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ProtocolMapperRepresentationDto>() {};
        return realmClientsId1ProtocolMappersModelsId2GetRequestCreation(realm, id1, id2).toEntity(localVarReturnType);
    }

    /**
     * Get mapper by id
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsId1ProtocolMappersModelsId2GetWithResponseSpec(String realm, String id1, String id2) throws WebClientResponseException {
        return realmClientsId1ProtocolMappersModelsId2GetRequestCreation(realm, id1, id2);
    }
    /**
     * Update the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsId1ProtocolMappersModelsId2PutRequestCreation(String realm, String id1, String id2, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        Object postBody = protocolMapperRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsId1ProtocolMappersModelsId2Put", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id1' is set
        if (id1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'id1' when calling realmClientsId1ProtocolMappersModelsId2Put", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id2' is set
        if (id2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'id2' when calling realmClientsId1ProtocolMappersModelsId2Put", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'protocolMapperRepresentationDto' is set
        if (protocolMapperRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'protocolMapperRepresentationDto' when calling realmClientsId1ProtocolMappersModelsId2Put", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id1", id1);
        pathParams.put("id2", id2);

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
        return apiClient.invokeAPI("/{realm}/clients/{id1}/protocol-mappers/models/{id2}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsId1ProtocolMappersModelsId2Put(String realm, String id1, String id2, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsId1ProtocolMappersModelsId2PutRequestCreation(realm, id1, id2, protocolMapperRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsId1ProtocolMappersModelsId2PutWithHttpInfo(String realm, String id1, String id2, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsId1ProtocolMappersModelsId2PutRequestCreation(realm, id1, id2, protocolMapperRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update the mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id1 The id1 parameter
     * @param id2 The id2 parameter
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsId1ProtocolMappersModelsId2PutWithResponseSpec(String realm, String id1, String id2, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        return realmClientsId1ProtocolMappersModelsId2PutRequestCreation(realm, id1, id2, protocolMapperRepresentationDto);
    }
    /**
     * Create multiple mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdProtocolMappersAddModelsPostRequestCreation(String realm, String id, List<ProtocolMapperRepresentationDto> protocolMapperRepresentationDto) throws WebClientResponseException {
        Object postBody = protocolMapperRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdProtocolMappersAddModelsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdProtocolMappersAddModelsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'protocolMapperRepresentationDto' is set
        if (protocolMapperRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'protocolMapperRepresentationDto' when calling realmClientsIdProtocolMappersAddModelsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/protocol-mappers/add-models", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create multiple mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdProtocolMappersAddModelsPost(String realm, String id, List<ProtocolMapperRepresentationDto> protocolMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdProtocolMappersAddModelsPostRequestCreation(realm, id, protocolMapperRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Create multiple mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdProtocolMappersAddModelsPostWithHttpInfo(String realm, String id, List<ProtocolMapperRepresentationDto> protocolMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdProtocolMappersAddModelsPostRequestCreation(realm, id, protocolMapperRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Create multiple mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdProtocolMappersAddModelsPostWithResponseSpec(String realm, String id, List<ProtocolMapperRepresentationDto> protocolMapperRepresentationDto) throws WebClientResponseException {
        return realmClientsIdProtocolMappersAddModelsPostRequestCreation(realm, id, protocolMapperRepresentationDto);
    }
    /**
     * Get mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdProtocolMappersModelsGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdProtocolMappersModelsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdProtocolMappersModelsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/protocol-mappers/models", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdProtocolMappersModelsGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdProtocolMappersModelsGetRequestCreation(realm, id).bodyToFlux(localVarReturnType);
    }

    /**
     * Get mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdProtocolMappersModelsGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdProtocolMappersModelsGetRequestCreation(realm, id).toEntityList(localVarReturnType);
    }

    /**
     * Get mappers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdProtocolMappersModelsGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsIdProtocolMappersModelsGetRequestCreation(realm, id);
    }
    /**
     * Create a mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdProtocolMappersModelsPostRequestCreation(String realm, String id, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        Object postBody = protocolMapperRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdProtocolMappersModelsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdProtocolMappersModelsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'protocolMapperRepresentationDto' is set
        if (protocolMapperRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'protocolMapperRepresentationDto' when calling realmClientsIdProtocolMappersModelsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients/{id}/protocol-mappers/models", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsIdProtocolMappersModelsPost(String realm, String id, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdProtocolMappersModelsPostRequestCreation(realm, id, protocolMapperRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Create a mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsIdProtocolMappersModelsPostWithHttpInfo(String realm, String id, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsIdProtocolMappersModelsPostRequestCreation(realm, id, protocolMapperRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Create a mapper
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param protocolMapperRepresentationDto The protocolMapperRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdProtocolMappersModelsPostWithResponseSpec(String realm, String id, ProtocolMapperRepresentationDto protocolMapperRepresentationDto) throws WebClientResponseException {
        return realmClientsIdProtocolMappersModelsPostRequestCreation(realm, id, protocolMapperRepresentationDto);
    }
    /**
     * Get mappers by name for a specific protocol
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param protocol The protocol parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdProtocolMappersProtocolProtocolGetRequestCreation(String realm, String id, String protocol) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdProtocolMappersProtocolProtocolGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdProtocolMappersProtocolProtocolGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'protocol' is set
        if (protocol == null) {
            throw new WebClientResponseException("Missing the required parameter 'protocol' when calling realmClientsIdProtocolMappersProtocolProtocolGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("protocol", protocol);

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
        return apiClient.invokeAPI("/{realm}/clients/{id}/protocol-mappers/protocol/{protocol}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get mappers by name for a specific protocol
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param protocol The protocol parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsIdProtocolMappersProtocolProtocolGet(String realm, String id, String protocol) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdProtocolMappersProtocolProtocolGetRequestCreation(realm, id, protocol).bodyToFlux(localVarReturnType);
    }

    /**
     * Get mappers by name for a specific protocol
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param protocol The protocol parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsIdProtocolMappersProtocolProtocolGetWithHttpInfo(String realm, String id, String protocol) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsIdProtocolMappersProtocolProtocolGetRequestCreation(realm, id, protocol).toEntityList(localVarReturnType);
    }

    /**
     * Get mappers by name for a specific protocol
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param protocol The protocol parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdProtocolMappersProtocolProtocolGetWithResponseSpec(String realm, String id, String protocol) throws WebClientResponseException {
        return realmClientsIdProtocolMappersProtocolProtocolGetRequestCreation(realm, id, protocol);
    }
}

package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.AuthenticationExecutionInfoRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.AuthenticationExecutionRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.AuthenticationFlowRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.AuthenticatorConfigInfoRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.AuthenticatorConfigRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.RequiredActionProviderRepresentationDto;

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
public class AuthenticationManagementApi {
    private ApiClient apiClient;

    public AuthenticationManagementApi() {
        this(new ApiClient());
    }

    @Autowired
    public AuthenticationManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get authenticator providers   Returns a stream of authenticator providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationAuthenticatorProvidersGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationAuthenticatorProvidersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/authenticator-providers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get authenticator providers   Returns a stream of authenticator providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmAuthenticationAuthenticatorProvidersGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationAuthenticatorProvidersGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * Get authenticator providers   Returns a stream of authenticator providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmAuthenticationAuthenticatorProvidersGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationAuthenticatorProvidersGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * Get authenticator providers   Returns a stream of authenticator providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationAuthenticatorProvidersGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmAuthenticationAuthenticatorProvidersGetRequestCreation(realm);
    }
    /**
     * Get client authenticator providers   Returns a stream of client authenticator providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationClientAuthenticatorProvidersGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationClientAuthenticatorProvidersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/client-authenticator-providers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get client authenticator providers   Returns a stream of client authenticator providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmAuthenticationClientAuthenticatorProvidersGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationClientAuthenticatorProvidersGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * Get client authenticator providers   Returns a stream of client authenticator providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmAuthenticationClientAuthenticatorProvidersGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationClientAuthenticatorProvidersGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * Get client authenticator providers   Returns a stream of client authenticator providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationClientAuthenticatorProvidersGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmAuthenticationClientAuthenticatorProvidersGetRequestCreation(realm);
    }
    /**
     * Get authenticator provider’s configuration description
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param providerId The providerId parameter
     * @return AuthenticatorConfigInfoRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationConfigDescriptionProviderIdGetRequestCreation(String realm, String providerId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationConfigDescriptionProviderIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new WebClientResponseException("Missing the required parameter 'providerId' when calling realmAuthenticationConfigDescriptionProviderIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("providerId", providerId);

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

        ParameterizedTypeReference<AuthenticatorConfigInfoRepresentationDto> localVarReturnType = new ParameterizedTypeReference<AuthenticatorConfigInfoRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/authentication/config-description/{providerId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get authenticator provider’s configuration description
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param providerId The providerId parameter
     * @return AuthenticatorConfigInfoRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AuthenticatorConfigInfoRepresentationDto> realmAuthenticationConfigDescriptionProviderIdGet(String realm, String providerId) throws WebClientResponseException {
        ParameterizedTypeReference<AuthenticatorConfigInfoRepresentationDto> localVarReturnType = new ParameterizedTypeReference<AuthenticatorConfigInfoRepresentationDto>() {};
        return realmAuthenticationConfigDescriptionProviderIdGetRequestCreation(realm, providerId).bodyToMono(localVarReturnType);
    }

    /**
     * Get authenticator provider’s configuration description
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param providerId The providerId parameter
     * @return ResponseEntity&lt;AuthenticatorConfigInfoRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AuthenticatorConfigInfoRepresentationDto>> realmAuthenticationConfigDescriptionProviderIdGetWithHttpInfo(String realm, String providerId) throws WebClientResponseException {
        ParameterizedTypeReference<AuthenticatorConfigInfoRepresentationDto> localVarReturnType = new ParameterizedTypeReference<AuthenticatorConfigInfoRepresentationDto>() {};
        return realmAuthenticationConfigDescriptionProviderIdGetRequestCreation(realm, providerId).toEntity(localVarReturnType);
    }

    /**
     * Get authenticator provider’s configuration description
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param providerId The providerId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationConfigDescriptionProviderIdGetWithResponseSpec(String realm, String providerId) throws WebClientResponseException {
        return realmAuthenticationConfigDescriptionProviderIdGetRequestCreation(realm, providerId);
    }
    /**
     * Delete authenticator configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Configuration id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationConfigIdDeleteRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationConfigIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmAuthenticationConfigIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/config/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete authenticator configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Configuration id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationConfigIdDelete(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationConfigIdDeleteRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete authenticator configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Configuration id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationConfigIdDeleteWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationConfigIdDeleteRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Delete authenticator configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Configuration id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationConfigIdDeleteWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmAuthenticationConfigIdDeleteRequestCreation(realm, id);
    }
    /**
     * Get authenticator configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Configuration id
     * @return AuthenticatorConfigRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationConfigIdGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationConfigIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmAuthenticationConfigIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AuthenticatorConfigRepresentationDto> localVarReturnType = new ParameterizedTypeReference<AuthenticatorConfigRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/authentication/config/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get authenticator configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Configuration id
     * @return AuthenticatorConfigRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AuthenticatorConfigRepresentationDto> realmAuthenticationConfigIdGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<AuthenticatorConfigRepresentationDto> localVarReturnType = new ParameterizedTypeReference<AuthenticatorConfigRepresentationDto>() {};
        return realmAuthenticationConfigIdGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get authenticator configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Configuration id
     * @return ResponseEntity&lt;AuthenticatorConfigRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AuthenticatorConfigRepresentationDto>> realmAuthenticationConfigIdGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<AuthenticatorConfigRepresentationDto> localVarReturnType = new ParameterizedTypeReference<AuthenticatorConfigRepresentationDto>() {};
        return realmAuthenticationConfigIdGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Get authenticator configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Configuration id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationConfigIdGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmAuthenticationConfigIdGetRequestCreation(realm, id);
    }
    /**
     * Update authenticator configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Configuration id
     * @param authenticatorConfigRepresentationDto JSON describing new state of authenticator configuration
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationConfigIdPutRequestCreation(String realm, String id, AuthenticatorConfigRepresentationDto authenticatorConfigRepresentationDto) throws WebClientResponseException {
        Object postBody = authenticatorConfigRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationConfigIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmAuthenticationConfigIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'authenticatorConfigRepresentationDto' is set
        if (authenticatorConfigRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'authenticatorConfigRepresentationDto' when calling realmAuthenticationConfigIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/config/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update authenticator configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Configuration id
     * @param authenticatorConfigRepresentationDto JSON describing new state of authenticator configuration
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationConfigIdPut(String realm, String id, AuthenticatorConfigRepresentationDto authenticatorConfigRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationConfigIdPutRequestCreation(realm, id, authenticatorConfigRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update authenticator configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Configuration id
     * @param authenticatorConfigRepresentationDto JSON describing new state of authenticator configuration
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationConfigIdPutWithHttpInfo(String realm, String id, AuthenticatorConfigRepresentationDto authenticatorConfigRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationConfigIdPutRequestCreation(realm, id, authenticatorConfigRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update authenticator configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Configuration id
     * @param authenticatorConfigRepresentationDto JSON describing new state of authenticator configuration
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationConfigIdPutWithResponseSpec(String realm, String id, AuthenticatorConfigRepresentationDto authenticatorConfigRepresentationDto) throws WebClientResponseException {
        return realmAuthenticationConfigIdPutRequestCreation(realm, id, authenticatorConfigRepresentationDto);
    }
    /**
     * Update execution with new configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @param authenticatorConfigRepresentationDto JSON with new configuration
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationExecutionsExecutionIdConfigPostRequestCreation(String realm, String executionId, AuthenticatorConfigRepresentationDto authenticatorConfigRepresentationDto) throws WebClientResponseException {
        Object postBody = authenticatorConfigRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationExecutionsExecutionIdConfigPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new WebClientResponseException("Missing the required parameter 'executionId' when calling realmAuthenticationExecutionsExecutionIdConfigPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'authenticatorConfigRepresentationDto' is set
        if (authenticatorConfigRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'authenticatorConfigRepresentationDto' when calling realmAuthenticationExecutionsExecutionIdConfigPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("executionId", executionId);

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
        return apiClient.invokeAPI("/{realm}/authentication/executions/{executionId}/config", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update execution with new configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @param authenticatorConfigRepresentationDto JSON with new configuration
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationExecutionsExecutionIdConfigPost(String realm, String executionId, AuthenticatorConfigRepresentationDto authenticatorConfigRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationExecutionsExecutionIdConfigPostRequestCreation(realm, executionId, authenticatorConfigRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update execution with new configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @param authenticatorConfigRepresentationDto JSON with new configuration
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationExecutionsExecutionIdConfigPostWithHttpInfo(String realm, String executionId, AuthenticatorConfigRepresentationDto authenticatorConfigRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationExecutionsExecutionIdConfigPostRequestCreation(realm, executionId, authenticatorConfigRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update execution with new configuration
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @param authenticatorConfigRepresentationDto JSON with new configuration
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationExecutionsExecutionIdConfigPostWithResponseSpec(String realm, String executionId, AuthenticatorConfigRepresentationDto authenticatorConfigRepresentationDto) throws WebClientResponseException {
        return realmAuthenticationExecutionsExecutionIdConfigPostRequestCreation(realm, executionId, authenticatorConfigRepresentationDto);
    }
    /**
     * Delete execution
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationExecutionsExecutionIdDeleteRequestCreation(String realm, String executionId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationExecutionsExecutionIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new WebClientResponseException("Missing the required parameter 'executionId' when calling realmAuthenticationExecutionsExecutionIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("executionId", executionId);

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
        return apiClient.invokeAPI("/{realm}/authentication/executions/{executionId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete execution
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationExecutionsExecutionIdDelete(String realm, String executionId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationExecutionsExecutionIdDeleteRequestCreation(realm, executionId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete execution
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationExecutionsExecutionIdDeleteWithHttpInfo(String realm, String executionId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationExecutionsExecutionIdDeleteRequestCreation(realm, executionId).toEntity(localVarReturnType);
    }

    /**
     * Delete execution
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationExecutionsExecutionIdDeleteWithResponseSpec(String realm, String executionId) throws WebClientResponseException {
        return realmAuthenticationExecutionsExecutionIdDeleteRequestCreation(realm, executionId);
    }
    /**
     * Get Single Execution
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationExecutionsExecutionIdGetRequestCreation(String realm, String executionId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationExecutionsExecutionIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new WebClientResponseException("Missing the required parameter 'executionId' when calling realmAuthenticationExecutionsExecutionIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("executionId", executionId);

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
        return apiClient.invokeAPI("/{realm}/authentication/executions/{executionId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Single Execution
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationExecutionsExecutionIdGet(String realm, String executionId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationExecutionsExecutionIdGetRequestCreation(realm, executionId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Single Execution
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationExecutionsExecutionIdGetWithHttpInfo(String realm, String executionId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationExecutionsExecutionIdGetRequestCreation(realm, executionId).toEntity(localVarReturnType);
    }

    /**
     * Get Single Execution
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationExecutionsExecutionIdGetWithResponseSpec(String realm, String executionId) throws WebClientResponseException {
        return realmAuthenticationExecutionsExecutionIdGetRequestCreation(realm, executionId);
    }
    /**
     * Lower execution’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationExecutionsExecutionIdLowerPriorityPostRequestCreation(String realm, String executionId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationExecutionsExecutionIdLowerPriorityPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new WebClientResponseException("Missing the required parameter 'executionId' when calling realmAuthenticationExecutionsExecutionIdLowerPriorityPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("executionId", executionId);

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
        return apiClient.invokeAPI("/{realm}/authentication/executions/{executionId}/lower-priority", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Lower execution’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationExecutionsExecutionIdLowerPriorityPost(String realm, String executionId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationExecutionsExecutionIdLowerPriorityPostRequestCreation(realm, executionId).bodyToMono(localVarReturnType);
    }

    /**
     * Lower execution’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationExecutionsExecutionIdLowerPriorityPostWithHttpInfo(String realm, String executionId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationExecutionsExecutionIdLowerPriorityPostRequestCreation(realm, executionId).toEntity(localVarReturnType);
    }

    /**
     * Lower execution’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationExecutionsExecutionIdLowerPriorityPostWithResponseSpec(String realm, String executionId) throws WebClientResponseException {
        return realmAuthenticationExecutionsExecutionIdLowerPriorityPostRequestCreation(realm, executionId);
    }
    /**
     * Raise execution’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationExecutionsExecutionIdRaisePriorityPostRequestCreation(String realm, String executionId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationExecutionsExecutionIdRaisePriorityPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new WebClientResponseException("Missing the required parameter 'executionId' when calling realmAuthenticationExecutionsExecutionIdRaisePriorityPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("executionId", executionId);

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
        return apiClient.invokeAPI("/{realm}/authentication/executions/{executionId}/raise-priority", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Raise execution’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationExecutionsExecutionIdRaisePriorityPost(String realm, String executionId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationExecutionsExecutionIdRaisePriorityPostRequestCreation(realm, executionId).bodyToMono(localVarReturnType);
    }

    /**
     * Raise execution’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationExecutionsExecutionIdRaisePriorityPostWithHttpInfo(String realm, String executionId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationExecutionsExecutionIdRaisePriorityPostRequestCreation(realm, executionId).toEntity(localVarReturnType);
    }

    /**
     * Raise execution’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param executionId Execution id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationExecutionsExecutionIdRaisePriorityPostWithResponseSpec(String realm, String executionId) throws WebClientResponseException {
        return realmAuthenticationExecutionsExecutionIdRaisePriorityPostRequestCreation(realm, executionId);
    }
    /**
     * Add new authentication execution
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param authenticationExecutionRepresentationDto JSON model describing authentication execution
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationExecutionsPostRequestCreation(String realm, AuthenticationExecutionRepresentationDto authenticationExecutionRepresentationDto) throws WebClientResponseException {
        Object postBody = authenticationExecutionRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationExecutionsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'authenticationExecutionRepresentationDto' is set
        if (authenticationExecutionRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'authenticationExecutionRepresentationDto' when calling realmAuthenticationExecutionsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/executions", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add new authentication execution
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param authenticationExecutionRepresentationDto JSON model describing authentication execution
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationExecutionsPost(String realm, AuthenticationExecutionRepresentationDto authenticationExecutionRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationExecutionsPostRequestCreation(realm, authenticationExecutionRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Add new authentication execution
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param authenticationExecutionRepresentationDto JSON model describing authentication execution
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationExecutionsPostWithHttpInfo(String realm, AuthenticationExecutionRepresentationDto authenticationExecutionRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationExecutionsPostRequestCreation(realm, authenticationExecutionRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Add new authentication execution
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param authenticationExecutionRepresentationDto JSON model describing authentication execution
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationExecutionsPostWithResponseSpec(String realm, AuthenticationExecutionRepresentationDto authenticationExecutionRepresentationDto) throws WebClientResponseException {
        return realmAuthenticationExecutionsPostRequestCreation(realm, authenticationExecutionRepresentationDto);
    }
    /**
     * Copy existing authentication flow under a new name   The new name is given as &#39;newName&#39; attribute of the passed JSON object
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Name of the existing authentication flow
     * @param requestBody JSON containing &#39;newName&#39; attribute
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationFlowsFlowAliasCopyPostRequestCreation(String realm, String flowAlias, Map<String, Object> requestBody) throws WebClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationFlowsFlowAliasCopyPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'flowAlias' is set
        if (flowAlias == null) {
            throw new WebClientResponseException("Missing the required parameter 'flowAlias' when calling realmAuthenticationFlowsFlowAliasCopyPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new WebClientResponseException("Missing the required parameter 'requestBody' when calling realmAuthenticationFlowsFlowAliasCopyPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("flowAlias", flowAlias);

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
        return apiClient.invokeAPI("/{realm}/authentication/flows/{flowAlias}/copy", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Copy existing authentication flow under a new name   The new name is given as &#39;newName&#39; attribute of the passed JSON object
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Name of the existing authentication flow
     * @param requestBody JSON containing &#39;newName&#39; attribute
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationFlowsFlowAliasCopyPost(String realm, String flowAlias, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsFlowAliasCopyPostRequestCreation(realm, flowAlias, requestBody).bodyToMono(localVarReturnType);
    }

    /**
     * Copy existing authentication flow under a new name   The new name is given as &#39;newName&#39; attribute of the passed JSON object
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Name of the existing authentication flow
     * @param requestBody JSON containing &#39;newName&#39; attribute
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationFlowsFlowAliasCopyPostWithHttpInfo(String realm, String flowAlias, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsFlowAliasCopyPostRequestCreation(realm, flowAlias, requestBody).toEntity(localVarReturnType);
    }

    /**
     * Copy existing authentication flow under a new name   The new name is given as &#39;newName&#39; attribute of the passed JSON object
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Name of the existing authentication flow
     * @param requestBody JSON containing &#39;newName&#39; attribute
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationFlowsFlowAliasCopyPostWithResponseSpec(String realm, String flowAlias, Map<String, Object> requestBody) throws WebClientResponseException {
        return realmAuthenticationFlowsFlowAliasCopyPostRequestCreation(realm, flowAlias, requestBody);
    }
    /**
     * Add new authentication execution to a flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Alias of parent flow
     * @param requestBody New execution JSON data containing &#39;provider&#39; attribute
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationFlowsFlowAliasExecutionsExecutionPostRequestCreation(String realm, String flowAlias, Map<String, Object> requestBody) throws WebClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationFlowsFlowAliasExecutionsExecutionPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'flowAlias' is set
        if (flowAlias == null) {
            throw new WebClientResponseException("Missing the required parameter 'flowAlias' when calling realmAuthenticationFlowsFlowAliasExecutionsExecutionPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new WebClientResponseException("Missing the required parameter 'requestBody' when calling realmAuthenticationFlowsFlowAliasExecutionsExecutionPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("flowAlias", flowAlias);

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
        return apiClient.invokeAPI("/{realm}/authentication/flows/{flowAlias}/executions/execution", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add new authentication execution to a flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Alias of parent flow
     * @param requestBody New execution JSON data containing &#39;provider&#39; attribute
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationFlowsFlowAliasExecutionsExecutionPost(String realm, String flowAlias, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsFlowAliasExecutionsExecutionPostRequestCreation(realm, flowAlias, requestBody).bodyToMono(localVarReturnType);
    }

    /**
     * Add new authentication execution to a flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Alias of parent flow
     * @param requestBody New execution JSON data containing &#39;provider&#39; attribute
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationFlowsFlowAliasExecutionsExecutionPostWithHttpInfo(String realm, String flowAlias, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsFlowAliasExecutionsExecutionPostRequestCreation(realm, flowAlias, requestBody).toEntity(localVarReturnType);
    }

    /**
     * Add new authentication execution to a flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Alias of parent flow
     * @param requestBody New execution JSON data containing &#39;provider&#39; attribute
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationFlowsFlowAliasExecutionsExecutionPostWithResponseSpec(String realm, String flowAlias, Map<String, Object> requestBody) throws WebClientResponseException {
        return realmAuthenticationFlowsFlowAliasExecutionsExecutionPostRequestCreation(realm, flowAlias, requestBody);
    }
    /**
     * Add new flow with new execution to existing flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Alias of parent authentication flow
     * @param requestBody New authentication flow / execution JSON data containing &#39;alias&#39;, &#39;type&#39;, &#39;provider&#39;, and &#39;description&#39; attributes
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationFlowsFlowAliasExecutionsFlowPostRequestCreation(String realm, String flowAlias, Map<String, Object> requestBody) throws WebClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationFlowsFlowAliasExecutionsFlowPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'flowAlias' is set
        if (flowAlias == null) {
            throw new WebClientResponseException("Missing the required parameter 'flowAlias' when calling realmAuthenticationFlowsFlowAliasExecutionsFlowPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new WebClientResponseException("Missing the required parameter 'requestBody' when calling realmAuthenticationFlowsFlowAliasExecutionsFlowPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("flowAlias", flowAlias);

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
        return apiClient.invokeAPI("/{realm}/authentication/flows/{flowAlias}/executions/flow", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add new flow with new execution to existing flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Alias of parent authentication flow
     * @param requestBody New authentication flow / execution JSON data containing &#39;alias&#39;, &#39;type&#39;, &#39;provider&#39;, and &#39;description&#39; attributes
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationFlowsFlowAliasExecutionsFlowPost(String realm, String flowAlias, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsFlowAliasExecutionsFlowPostRequestCreation(realm, flowAlias, requestBody).bodyToMono(localVarReturnType);
    }

    /**
     * Add new flow with new execution to existing flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Alias of parent authentication flow
     * @param requestBody New authentication flow / execution JSON data containing &#39;alias&#39;, &#39;type&#39;, &#39;provider&#39;, and &#39;description&#39; attributes
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationFlowsFlowAliasExecutionsFlowPostWithHttpInfo(String realm, String flowAlias, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsFlowAliasExecutionsFlowPostRequestCreation(realm, flowAlias, requestBody).toEntity(localVarReturnType);
    }

    /**
     * Add new flow with new execution to existing flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Alias of parent authentication flow
     * @param requestBody New authentication flow / execution JSON data containing &#39;alias&#39;, &#39;type&#39;, &#39;provider&#39;, and &#39;description&#39; attributes
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationFlowsFlowAliasExecutionsFlowPostWithResponseSpec(String realm, String flowAlias, Map<String, Object> requestBody) throws WebClientResponseException {
        return realmAuthenticationFlowsFlowAliasExecutionsFlowPostRequestCreation(realm, flowAlias, requestBody);
    }
    /**
     * Get authentication executions for a flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Flow alias
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationFlowsFlowAliasExecutionsGetRequestCreation(String realm, String flowAlias) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationFlowsFlowAliasExecutionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'flowAlias' is set
        if (flowAlias == null) {
            throw new WebClientResponseException("Missing the required parameter 'flowAlias' when calling realmAuthenticationFlowsFlowAliasExecutionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("flowAlias", flowAlias);

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
        return apiClient.invokeAPI("/{realm}/authentication/flows/{flowAlias}/executions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get authentication executions for a flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Flow alias
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationFlowsFlowAliasExecutionsGet(String realm, String flowAlias) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsFlowAliasExecutionsGetRequestCreation(realm, flowAlias).bodyToMono(localVarReturnType);
    }

    /**
     * Get authentication executions for a flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Flow alias
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationFlowsFlowAliasExecutionsGetWithHttpInfo(String realm, String flowAlias) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsFlowAliasExecutionsGetRequestCreation(realm, flowAlias).toEntity(localVarReturnType);
    }

    /**
     * Get authentication executions for a flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Flow alias
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationFlowsFlowAliasExecutionsGetWithResponseSpec(String realm, String flowAlias) throws WebClientResponseException {
        return realmAuthenticationFlowsFlowAliasExecutionsGetRequestCreation(realm, flowAlias);
    }
    /**
     * Update authentication executions of a Flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Flow alias
     * @param authenticationExecutionInfoRepresentationDto AuthenticationExecutionInfoRepresentation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationFlowsFlowAliasExecutionsPutRequestCreation(String realm, String flowAlias, AuthenticationExecutionInfoRepresentationDto authenticationExecutionInfoRepresentationDto) throws WebClientResponseException {
        Object postBody = authenticationExecutionInfoRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationFlowsFlowAliasExecutionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'flowAlias' is set
        if (flowAlias == null) {
            throw new WebClientResponseException("Missing the required parameter 'flowAlias' when calling realmAuthenticationFlowsFlowAliasExecutionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'authenticationExecutionInfoRepresentationDto' is set
        if (authenticationExecutionInfoRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'authenticationExecutionInfoRepresentationDto' when calling realmAuthenticationFlowsFlowAliasExecutionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("flowAlias", flowAlias);

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
        return apiClient.invokeAPI("/{realm}/authentication/flows/{flowAlias}/executions", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update authentication executions of a Flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Flow alias
     * @param authenticationExecutionInfoRepresentationDto AuthenticationExecutionInfoRepresentation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationFlowsFlowAliasExecutionsPut(String realm, String flowAlias, AuthenticationExecutionInfoRepresentationDto authenticationExecutionInfoRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsFlowAliasExecutionsPutRequestCreation(realm, flowAlias, authenticationExecutionInfoRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update authentication executions of a Flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Flow alias
     * @param authenticationExecutionInfoRepresentationDto AuthenticationExecutionInfoRepresentation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationFlowsFlowAliasExecutionsPutWithHttpInfo(String realm, String flowAlias, AuthenticationExecutionInfoRepresentationDto authenticationExecutionInfoRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsFlowAliasExecutionsPutRequestCreation(realm, flowAlias, authenticationExecutionInfoRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update authentication executions of a Flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param flowAlias Flow alias
     * @param authenticationExecutionInfoRepresentationDto AuthenticationExecutionInfoRepresentation
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationFlowsFlowAliasExecutionsPutWithResponseSpec(String realm, String flowAlias, AuthenticationExecutionInfoRepresentationDto authenticationExecutionInfoRepresentationDto) throws WebClientResponseException {
        return realmAuthenticationFlowsFlowAliasExecutionsPutRequestCreation(realm, flowAlias, authenticationExecutionInfoRepresentationDto);
    }
    /**
     * Get authentication flows   Returns a stream of authentication flows.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationFlowsGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationFlowsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/flows", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get authentication flows   Returns a stream of authentication flows.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmAuthenticationFlowsGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationFlowsGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * Get authentication flows   Returns a stream of authentication flows.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmAuthenticationFlowsGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationFlowsGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * Get authentication flows   Returns a stream of authentication flows.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationFlowsGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmAuthenticationFlowsGetRequestCreation(realm);
    }
    /**
     * Delete an authentication flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Flow id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationFlowsIdDeleteRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationFlowsIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmAuthenticationFlowsIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/flows/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete an authentication flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Flow id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationFlowsIdDelete(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsIdDeleteRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete an authentication flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Flow id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationFlowsIdDeleteWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsIdDeleteRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Delete an authentication flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Flow id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationFlowsIdDeleteWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmAuthenticationFlowsIdDeleteRequestCreation(realm, id);
    }
    /**
     * Get authentication flow for id
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Flow id
     * @return AuthenticationFlowRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationFlowsIdGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationFlowsIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmAuthenticationFlowsIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AuthenticationFlowRepresentationDto> localVarReturnType = new ParameterizedTypeReference<AuthenticationFlowRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/authentication/flows/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get authentication flow for id
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Flow id
     * @return AuthenticationFlowRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AuthenticationFlowRepresentationDto> realmAuthenticationFlowsIdGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<AuthenticationFlowRepresentationDto> localVarReturnType = new ParameterizedTypeReference<AuthenticationFlowRepresentationDto>() {};
        return realmAuthenticationFlowsIdGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get authentication flow for id
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Flow id
     * @return ResponseEntity&lt;AuthenticationFlowRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AuthenticationFlowRepresentationDto>> realmAuthenticationFlowsIdGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<AuthenticationFlowRepresentationDto> localVarReturnType = new ParameterizedTypeReference<AuthenticationFlowRepresentationDto>() {};
        return realmAuthenticationFlowsIdGetRequestCreation(realm, id).toEntity(localVarReturnType);
    }

    /**
     * Get authentication flow for id
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Flow id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationFlowsIdGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmAuthenticationFlowsIdGetRequestCreation(realm, id);
    }
    /**
     * Update an authentication flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Flow id
     * @param authenticationFlowRepresentationDto Authentication flow representation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationFlowsIdPutRequestCreation(String realm, String id, AuthenticationFlowRepresentationDto authenticationFlowRepresentationDto) throws WebClientResponseException {
        Object postBody = authenticationFlowRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationFlowsIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmAuthenticationFlowsIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'authenticationFlowRepresentationDto' is set
        if (authenticationFlowRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'authenticationFlowRepresentationDto' when calling realmAuthenticationFlowsIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/flows/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update an authentication flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Flow id
     * @param authenticationFlowRepresentationDto Authentication flow representation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationFlowsIdPut(String realm, String id, AuthenticationFlowRepresentationDto authenticationFlowRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsIdPutRequestCreation(realm, id, authenticationFlowRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update an authentication flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Flow id
     * @param authenticationFlowRepresentationDto Authentication flow representation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationFlowsIdPutWithHttpInfo(String realm, String id, AuthenticationFlowRepresentationDto authenticationFlowRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsIdPutRequestCreation(realm, id, authenticationFlowRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update an authentication flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id Flow id
     * @param authenticationFlowRepresentationDto Authentication flow representation
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationFlowsIdPutWithResponseSpec(String realm, String id, AuthenticationFlowRepresentationDto authenticationFlowRepresentationDto) throws WebClientResponseException {
        return realmAuthenticationFlowsIdPutRequestCreation(realm, id, authenticationFlowRepresentationDto);
    }
    /**
     * Create a new authentication flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param authenticationFlowRepresentationDto Authentication flow representation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationFlowsPostRequestCreation(String realm, AuthenticationFlowRepresentationDto authenticationFlowRepresentationDto) throws WebClientResponseException {
        Object postBody = authenticationFlowRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationFlowsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'authenticationFlowRepresentationDto' is set
        if (authenticationFlowRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'authenticationFlowRepresentationDto' when calling realmAuthenticationFlowsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/flows", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new authentication flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param authenticationFlowRepresentationDto Authentication flow representation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationFlowsPost(String realm, AuthenticationFlowRepresentationDto authenticationFlowRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsPostRequestCreation(realm, authenticationFlowRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Create a new authentication flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param authenticationFlowRepresentationDto Authentication flow representation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationFlowsPostWithHttpInfo(String realm, AuthenticationFlowRepresentationDto authenticationFlowRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationFlowsPostRequestCreation(realm, authenticationFlowRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Create a new authentication flow
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param authenticationFlowRepresentationDto Authentication flow representation
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationFlowsPostWithResponseSpec(String realm, AuthenticationFlowRepresentationDto authenticationFlowRepresentationDto) throws WebClientResponseException {
        return realmAuthenticationFlowsPostRequestCreation(realm, authenticationFlowRepresentationDto);
    }
    /**
     * Get form action providers   Returns a stream of form action providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationFormActionProvidersGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationFormActionProvidersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/form-action-providers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get form action providers   Returns a stream of form action providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmAuthenticationFormActionProvidersGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationFormActionProvidersGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * Get form action providers   Returns a stream of form action providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmAuthenticationFormActionProvidersGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationFormActionProvidersGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * Get form action providers   Returns a stream of form action providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationFormActionProvidersGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmAuthenticationFormActionProvidersGetRequestCreation(realm);
    }
    /**
     * Get form providers   Returns a stream of form providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationFormProvidersGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationFormProvidersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/form-providers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get form providers   Returns a stream of form providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmAuthenticationFormProvidersGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationFormProvidersGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * Get form providers   Returns a stream of form providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmAuthenticationFormProvidersGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationFormProvidersGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * Get form providers   Returns a stream of form providers.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationFormProvidersGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmAuthenticationFormProvidersGetRequestCreation(realm);
    }
    /**
     * Get configuration descriptions for all clients
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationPerClientConfigDescriptionGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationPerClientConfigDescriptionGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return apiClient.invokeAPI("/{realm}/authentication/per-client-config-description", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get configuration descriptions for all clients
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, Object>> realmAuthenticationPerClientConfigDescriptionGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmAuthenticationPerClientConfigDescriptionGetRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * Get configuration descriptions for all clients
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Map<String, Object>>> realmAuthenticationPerClientConfigDescriptionGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmAuthenticationPerClientConfigDescriptionGetRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * Get configuration descriptions for all clients
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationPerClientConfigDescriptionGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmAuthenticationPerClientConfigDescriptionGetRequestCreation(realm);
    }
    /**
     * Register a new required actions
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param requestBody JSON containing &#39;providerId&#39;, and &#39;name&#39; attributes.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationRegisterRequiredActionPostRequestCreation(String realm, Map<String, Object> requestBody) throws WebClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationRegisterRequiredActionPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new WebClientResponseException("Missing the required parameter 'requestBody' when calling realmAuthenticationRegisterRequiredActionPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/register-required-action", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Register a new required actions
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param requestBody JSON containing &#39;providerId&#39;, and &#39;name&#39; attributes.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationRegisterRequiredActionPost(String realm, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationRegisterRequiredActionPostRequestCreation(realm, requestBody).bodyToMono(localVarReturnType);
    }

    /**
     * Register a new required actions
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param requestBody JSON containing &#39;providerId&#39;, and &#39;name&#39; attributes.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationRegisterRequiredActionPostWithHttpInfo(String realm, Map<String, Object> requestBody) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationRegisterRequiredActionPostRequestCreation(realm, requestBody).toEntity(localVarReturnType);
    }

    /**
     * Register a new required actions
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param requestBody JSON containing &#39;providerId&#39;, and &#39;name&#39; attributes.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationRegisterRequiredActionPostWithResponseSpec(String realm, Map<String, Object> requestBody) throws WebClientResponseException {
        return realmAuthenticationRegisterRequiredActionPostRequestCreation(realm, requestBody);
    }
    /**
     * Delete required action
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationRequiredActionsAliasDeleteRequestCreation(String realm, String alias) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationRequiredActionsAliasDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmAuthenticationRequiredActionsAliasDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("alias", alias);

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
        return apiClient.invokeAPI("/{realm}/authentication/required-actions/{alias}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete required action
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationRequiredActionsAliasDelete(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationRequiredActionsAliasDeleteRequestCreation(realm, alias).bodyToMono(localVarReturnType);
    }

    /**
     * Delete required action
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationRequiredActionsAliasDeleteWithHttpInfo(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationRequiredActionsAliasDeleteRequestCreation(realm, alias).toEntity(localVarReturnType);
    }

    /**
     * Delete required action
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationRequiredActionsAliasDeleteWithResponseSpec(String realm, String alias) throws WebClientResponseException {
        return realmAuthenticationRequiredActionsAliasDeleteRequestCreation(realm, alias);
    }
    /**
     * Get required action for alias
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @return RequiredActionProviderRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationRequiredActionsAliasGetRequestCreation(String realm, String alias) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationRequiredActionsAliasGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmAuthenticationRequiredActionsAliasGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("alias", alias);

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

        ParameterizedTypeReference<RequiredActionProviderRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RequiredActionProviderRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/authentication/required-actions/{alias}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get required action for alias
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @return RequiredActionProviderRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RequiredActionProviderRepresentationDto> realmAuthenticationRequiredActionsAliasGet(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<RequiredActionProviderRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RequiredActionProviderRepresentationDto>() {};
        return realmAuthenticationRequiredActionsAliasGetRequestCreation(realm, alias).bodyToMono(localVarReturnType);
    }

    /**
     * Get required action for alias
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @return ResponseEntity&lt;RequiredActionProviderRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RequiredActionProviderRepresentationDto>> realmAuthenticationRequiredActionsAliasGetWithHttpInfo(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<RequiredActionProviderRepresentationDto> localVarReturnType = new ParameterizedTypeReference<RequiredActionProviderRepresentationDto>() {};
        return realmAuthenticationRequiredActionsAliasGetRequestCreation(realm, alias).toEntity(localVarReturnType);
    }

    /**
     * Get required action for alias
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationRequiredActionsAliasGetWithResponseSpec(String realm, String alias) throws WebClientResponseException {
        return realmAuthenticationRequiredActionsAliasGetRequestCreation(realm, alias);
    }
    /**
     * Lower required action’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationRequiredActionsAliasLowerPriorityPostRequestCreation(String realm, String alias) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationRequiredActionsAliasLowerPriorityPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmAuthenticationRequiredActionsAliasLowerPriorityPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("alias", alias);

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
        return apiClient.invokeAPI("/{realm}/authentication/required-actions/{alias}/lower-priority", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Lower required action’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationRequiredActionsAliasLowerPriorityPost(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationRequiredActionsAliasLowerPriorityPostRequestCreation(realm, alias).bodyToMono(localVarReturnType);
    }

    /**
     * Lower required action’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationRequiredActionsAliasLowerPriorityPostWithHttpInfo(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationRequiredActionsAliasLowerPriorityPostRequestCreation(realm, alias).toEntity(localVarReturnType);
    }

    /**
     * Lower required action’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationRequiredActionsAliasLowerPriorityPostWithResponseSpec(String realm, String alias) throws WebClientResponseException {
        return realmAuthenticationRequiredActionsAliasLowerPriorityPostRequestCreation(realm, alias);
    }
    /**
     * Update required action
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @param requiredActionProviderRepresentationDto JSON describing new state of required action
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationRequiredActionsAliasPutRequestCreation(String realm, String alias, RequiredActionProviderRepresentationDto requiredActionProviderRepresentationDto) throws WebClientResponseException {
        Object postBody = requiredActionProviderRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationRequiredActionsAliasPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmAuthenticationRequiredActionsAliasPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requiredActionProviderRepresentationDto' is set
        if (requiredActionProviderRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'requiredActionProviderRepresentationDto' when calling realmAuthenticationRequiredActionsAliasPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("alias", alias);

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
        return apiClient.invokeAPI("/{realm}/authentication/required-actions/{alias}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update required action
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @param requiredActionProviderRepresentationDto JSON describing new state of required action
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationRequiredActionsAliasPut(String realm, String alias, RequiredActionProviderRepresentationDto requiredActionProviderRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationRequiredActionsAliasPutRequestCreation(realm, alias, requiredActionProviderRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update required action
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @param requiredActionProviderRepresentationDto JSON describing new state of required action
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationRequiredActionsAliasPutWithHttpInfo(String realm, String alias, RequiredActionProviderRepresentationDto requiredActionProviderRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationRequiredActionsAliasPutRequestCreation(realm, alias, requiredActionProviderRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update required action
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @param requiredActionProviderRepresentationDto JSON describing new state of required action
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationRequiredActionsAliasPutWithResponseSpec(String realm, String alias, RequiredActionProviderRepresentationDto requiredActionProviderRepresentationDto) throws WebClientResponseException {
        return realmAuthenticationRequiredActionsAliasPutRequestCreation(realm, alias, requiredActionProviderRepresentationDto);
    }
    /**
     * Raise required action’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationRequiredActionsAliasRaisePriorityPostRequestCreation(String realm, String alias) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationRequiredActionsAliasRaisePriorityPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmAuthenticationRequiredActionsAliasRaisePriorityPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("alias", alias);

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
        return apiClient.invokeAPI("/{realm}/authentication/required-actions/{alias}/raise-priority", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Raise required action’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAuthenticationRequiredActionsAliasRaisePriorityPost(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationRequiredActionsAliasRaisePriorityPostRequestCreation(realm, alias).bodyToMono(localVarReturnType);
    }

    /**
     * Raise required action’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAuthenticationRequiredActionsAliasRaisePriorityPostWithHttpInfo(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAuthenticationRequiredActionsAliasRaisePriorityPostRequestCreation(realm, alias).toEntity(localVarReturnType);
    }

    /**
     * Raise required action’s priority
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias Alias of required action
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationRequiredActionsAliasRaisePriorityPostWithResponseSpec(String realm, String alias) throws WebClientResponseException {
        return realmAuthenticationRequiredActionsAliasRaisePriorityPostRequestCreation(realm, alias);
    }
    /**
     * Get required actions   Returns a stream of required actions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationRequiredActionsGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationRequiredActionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/required-actions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get required actions   Returns a stream of required actions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmAuthenticationRequiredActionsGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationRequiredActionsGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * Get required actions   Returns a stream of required actions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmAuthenticationRequiredActionsGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationRequiredActionsGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * Get required actions   Returns a stream of required actions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationRequiredActionsGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmAuthenticationRequiredActionsGetRequestCreation(realm);
    }
    /**
     * Get unregistered required actions   Returns a stream of unregistered required actions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAuthenticationUnregisteredRequiredActionsGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAuthenticationUnregisteredRequiredActionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/authentication/unregistered-required-actions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get unregistered required actions   Returns a stream of unregistered required actions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmAuthenticationUnregisteredRequiredActionsGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationUnregisteredRequiredActionsGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * Get unregistered required actions   Returns a stream of unregistered required actions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmAuthenticationUnregisteredRequiredActionsGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmAuthenticationUnregisteredRequiredActionsGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * Get unregistered required actions   Returns a stream of unregistered required actions.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAuthenticationUnregisteredRequiredActionsGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmAuthenticationUnregisteredRequiredActionsGetRequestCreation(realm);
    }
}

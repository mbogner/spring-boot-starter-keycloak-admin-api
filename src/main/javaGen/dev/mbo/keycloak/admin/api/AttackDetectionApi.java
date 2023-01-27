package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;


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
public class AttackDetectionApi {
    private ApiClient apiClient;

    public AttackDetectionApi() {
        this(new ApiClient());
    }

    @Autowired
    public AttackDetectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Clear any user login failures for all users   This can release temporary disabled users
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAttackDetectionBruteForceUsersDeleteRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAttackDetectionBruteForceUsersDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/attack-detection/brute-force/users", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Clear any user login failures for all users   This can release temporary disabled users
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAttackDetectionBruteForceUsersDelete(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAttackDetectionBruteForceUsersDeleteRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * Clear any user login failures for all users   This can release temporary disabled users
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAttackDetectionBruteForceUsersDeleteWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAttackDetectionBruteForceUsersDeleteRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * Clear any user login failures for all users   This can release temporary disabled users
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAttackDetectionBruteForceUsersDeleteWithResponseSpec(String realm) throws WebClientResponseException {
        return realmAttackDetectionBruteForceUsersDeleteRequestCreation(realm);
    }
    /**
     * Clear any user login failures for the user   This can release temporary disabled user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param userId The userId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAttackDetectionBruteForceUsersUserIdDeleteRequestCreation(String realm, String userId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAttackDetectionBruteForceUsersUserIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling realmAttackDetectionBruteForceUsersUserIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("userId", userId);

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
        return apiClient.invokeAPI("/{realm}/attack-detection/brute-force/users/{userId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Clear any user login failures for the user   This can release temporary disabled user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param userId The userId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmAttackDetectionBruteForceUsersUserIdDelete(String realm, String userId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAttackDetectionBruteForceUsersUserIdDeleteRequestCreation(realm, userId).bodyToMono(localVarReturnType);
    }

    /**
     * Clear any user login failures for the user   This can release temporary disabled user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param userId The userId parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmAttackDetectionBruteForceUsersUserIdDeleteWithHttpInfo(String realm, String userId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmAttackDetectionBruteForceUsersUserIdDeleteRequestCreation(realm, userId).toEntity(localVarReturnType);
    }

    /**
     * Clear any user login failures for the user   This can release temporary disabled user
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param userId The userId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAttackDetectionBruteForceUsersUserIdDeleteWithResponseSpec(String realm, String userId) throws WebClientResponseException {
        return realmAttackDetectionBruteForceUsersUserIdDeleteRequestCreation(realm, userId);
    }
    /**
     * Get status of a username in brute force detection
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param userId The userId parameter
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmAttackDetectionBruteForceUsersUserIdGetRequestCreation(String realm, String userId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmAttackDetectionBruteForceUsersUserIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling realmAttackDetectionBruteForceUsersUserIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("userId", userId);

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
        return apiClient.invokeAPI("/{realm}/attack-detection/brute-force/users/{userId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get status of a username in brute force detection
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param userId The userId parameter
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, Object>> realmAttackDetectionBruteForceUsersUserIdGet(String realm, String userId) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmAttackDetectionBruteForceUsersUserIdGetRequestCreation(realm, userId).bodyToMono(localVarReturnType);
    }

    /**
     * Get status of a username in brute force detection
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param userId The userId parameter
     * @return ResponseEntity&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Map<String, Object>>> realmAttackDetectionBruteForceUsersUserIdGetWithHttpInfo(String realm, String userId) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmAttackDetectionBruteForceUsersUserIdGetRequestCreation(realm, userId).toEntity(localVarReturnType);
    }

    /**
     * Get status of a username in brute force detection
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param userId The userId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmAttackDetectionBruteForceUsersUserIdGetWithResponseSpec(String realm, String userId) throws WebClientResponseException {
        return realmAttackDetectionBruteForceUsersUserIdGetRequestCreation(realm, userId);
    }
}

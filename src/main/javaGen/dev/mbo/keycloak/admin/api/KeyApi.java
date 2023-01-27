package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.KeysMetadataRepresentationDto;

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
public class KeyApi {
    private ApiClient apiClient;

    public KeyApi() {
        this(new ApiClient());
    }

    @Autowired
    public KeyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return KeysMetadataRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmKeysGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmKeysGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<KeysMetadataRepresentationDto> localVarReturnType = new ParameterizedTypeReference<KeysMetadataRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/keys", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return KeysMetadataRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<KeysMetadataRepresentationDto> realmKeysGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<KeysMetadataRepresentationDto> localVarReturnType = new ParameterizedTypeReference<KeysMetadataRepresentationDto>() {};
        return realmKeysGetRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;KeysMetadataRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<KeysMetadataRepresentationDto>> realmKeysGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<KeysMetadataRepresentationDto> localVarReturnType = new ParameterizedTypeReference<KeysMetadataRepresentationDto>() {};
        return realmKeysGetRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmKeysGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmKeysGetRequestCreation(realm);
    }
}

package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.ServerInfoRepresentationDto;

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
public class RootApi {
    private ApiClient apiClient;

    public RootApi() {
        this(new ApiClient());
    }

    @Autowired
    public RootApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get themes, social providers, auth providers, and event listeners available on this server
     * 
     * <p><b>2XX</b> - success
     * @return ServerInfoRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec rootGetRequestCreation() throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<ServerInfoRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ServerInfoRepresentationDto>() {};
        return apiClient.invokeAPI("/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get themes, social providers, auth providers, and event listeners available on this server
     * 
     * <p><b>2XX</b> - success
     * @return ServerInfoRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ServerInfoRepresentationDto> rootGet() throws WebClientResponseException {
        ParameterizedTypeReference<ServerInfoRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ServerInfoRepresentationDto>() {};
        return rootGetRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get themes, social providers, auth providers, and event listeners available on this server
     * 
     * <p><b>2XX</b> - success
     * @return ResponseEntity&lt;ServerInfoRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ServerInfoRepresentationDto>> rootGetWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ServerInfoRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ServerInfoRepresentationDto>() {};
        return rootGetRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get themes, social providers, auth providers, and event listeners available on this server
     * 
     * <p><b>2XX</b> - success
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec rootGetWithResponseSpec() throws WebClientResponseException {
        return rootGetRequestCreation();
    }
}

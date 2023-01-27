package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.ClientInitialAccessCreatePresentationDto;
import dev.mbo.keycloak.admin.api.dto.ClientInitialAccessPresentationDto;

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
public class ClientInitialAccessApi {
    private ApiClient apiClient;

    public ClientInitialAccessApi() {
        this(new ApiClient());
    }

    @Autowired
    public ClientInitialAccessApi(ApiClient apiClient) {
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
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsInitialAccessGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsInitialAccessGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients-initial-access", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmClientsInitialAccessGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsInitialAccessGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmClientsInitialAccessGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmClientsInitialAccessGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsInitialAccessGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmClientsInitialAccessGetRequestCreation(realm);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsInitialAccessIdDeleteRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsInitialAccessIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsInitialAccessIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/clients-initial-access/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmClientsInitialAccessIdDelete(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsInitialAccessIdDeleteRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmClientsInitialAccessIdDeleteWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmClientsInitialAccessIdDeleteRequestCreation(realm, id).toEntity(localVarReturnType);
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
    public ResponseSpec realmClientsInitialAccessIdDeleteWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmClientsInitialAccessIdDeleteRequestCreation(realm, id);
    }
    /**
     * Create a new initial access token.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientInitialAccessCreatePresentationDto The clientInitialAccessCreatePresentationDto parameter
     * @return ClientInitialAccessPresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsInitialAccessPostRequestCreation(String realm, ClientInitialAccessCreatePresentationDto clientInitialAccessCreatePresentationDto) throws WebClientResponseException {
        Object postBody = clientInitialAccessCreatePresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsInitialAccessPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientInitialAccessCreatePresentationDto' is set
        if (clientInitialAccessCreatePresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientInitialAccessCreatePresentationDto' when calling realmClientsInitialAccessPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ClientInitialAccessPresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientInitialAccessPresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/clients-initial-access", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new initial access token.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientInitialAccessCreatePresentationDto The clientInitialAccessCreatePresentationDto parameter
     * @return ClientInitialAccessPresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ClientInitialAccessPresentationDto> realmClientsInitialAccessPost(String realm, ClientInitialAccessCreatePresentationDto clientInitialAccessCreatePresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<ClientInitialAccessPresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientInitialAccessPresentationDto>() {};
        return realmClientsInitialAccessPostRequestCreation(realm, clientInitialAccessCreatePresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Create a new initial access token.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientInitialAccessCreatePresentationDto The clientInitialAccessCreatePresentationDto parameter
     * @return ResponseEntity&lt;ClientInitialAccessPresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ClientInitialAccessPresentationDto>> realmClientsInitialAccessPostWithHttpInfo(String realm, ClientInitialAccessCreatePresentationDto clientInitialAccessCreatePresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<ClientInitialAccessPresentationDto> localVarReturnType = new ParameterizedTypeReference<ClientInitialAccessPresentationDto>() {};
        return realmClientsInitialAccessPostRequestCreation(realm, clientInitialAccessCreatePresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Create a new initial access token.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param clientInitialAccessCreatePresentationDto The clientInitialAccessCreatePresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsInitialAccessPostWithResponseSpec(String realm, ClientInitialAccessCreatePresentationDto clientInitialAccessCreatePresentationDto) throws WebClientResponseException {
        return realmClientsInitialAccessPostRequestCreation(realm, clientInitialAccessCreatePresentationDto);
    }
}

package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.ComponentRepresentationDto;

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
public class ComponentApi {
    private ApiClient apiClient;

    public ComponentApi() {
        this(new ApiClient());
    }

    @Autowired
    public ComponentApi(ApiClient apiClient) {
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
     * @param name The name parameter
     * @param parent The parent parameter
     * @param type The type parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmComponentsGetRequestCreation(String realm, String name, String parent, String type) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmComponentsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parent", parent));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/components", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param name The name parameter
     * @param parent The parent parameter
     * @param type The type parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmComponentsGet(String realm, String name, String parent, String type) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmComponentsGetRequestCreation(realm, name, parent, type).bodyToFlux(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param name The name parameter
     * @param parent The parent parameter
     * @param type The type parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmComponentsGetWithHttpInfo(String realm, String name, String parent, String type) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmComponentsGetRequestCreation(realm, name, parent, type).toEntityList(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param name The name parameter
     * @param parent The parent parameter
     * @param type The type parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmComponentsGetWithResponseSpec(String realm, String name, String parent, String type) throws WebClientResponseException {
        return realmComponentsGetRequestCreation(realm, name, parent, type);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmComponentsIdDeleteRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmComponentsIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmComponentsIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/components/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmComponentsIdDelete(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmComponentsIdDeleteRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmComponentsIdDeleteWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmComponentsIdDeleteRequestCreation(realm, id).toEntity(localVarReturnType);
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
    public ResponseSpec realmComponentsIdDeleteWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmComponentsIdDeleteRequestCreation(realm, id);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ComponentRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmComponentsIdGetRequestCreation(String realm, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmComponentsIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmComponentsIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ComponentRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ComponentRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/components/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ComponentRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ComponentRepresentationDto> realmComponentsIdGet(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<ComponentRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ComponentRepresentationDto>() {};
        return realmComponentsIdGetRequestCreation(realm, id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @return ResponseEntity&lt;ComponentRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ComponentRepresentationDto>> realmComponentsIdGetWithHttpInfo(String realm, String id) throws WebClientResponseException {
        ParameterizedTypeReference<ComponentRepresentationDto> localVarReturnType = new ParameterizedTypeReference<ComponentRepresentationDto>() {};
        return realmComponentsIdGetRequestCreation(realm, id).toEntity(localVarReturnType);
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
    public ResponseSpec realmComponentsIdGetWithResponseSpec(String realm, String id) throws WebClientResponseException {
        return realmComponentsIdGetRequestCreation(realm, id);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param componentRepresentationDto The componentRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmComponentsIdPutRequestCreation(String realm, String id, ComponentRepresentationDto componentRepresentationDto) throws WebClientResponseException {
        Object postBody = componentRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmComponentsIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmComponentsIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentRepresentationDto' is set
        if (componentRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'componentRepresentationDto' when calling realmComponentsIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/components/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param componentRepresentationDto The componentRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmComponentsIdPut(String realm, String id, ComponentRepresentationDto componentRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmComponentsIdPutRequestCreation(realm, id, componentRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param componentRepresentationDto The componentRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmComponentsIdPutWithHttpInfo(String realm, String id, ComponentRepresentationDto componentRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmComponentsIdPutRequestCreation(realm, id, componentRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param componentRepresentationDto The componentRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmComponentsIdPutWithResponseSpec(String realm, String id, ComponentRepresentationDto componentRepresentationDto) throws WebClientResponseException {
        return realmComponentsIdPutRequestCreation(realm, id, componentRepresentationDto);
    }
    /**
     * List of subcomponent types that are available to configure for a particular parent component.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param type The type parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmComponentsIdSubComponentTypesGetRequestCreation(String realm, String id, String type) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmComponentsIdSubComponentTypesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmComponentsIdSubComponentTypesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/components/{id}/sub-component-types", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List of subcomponent types that are available to configure for a particular parent component.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param type The type parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmComponentsIdSubComponentTypesGet(String realm, String id, String type) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmComponentsIdSubComponentTypesGetRequestCreation(realm, id, type).bodyToFlux(localVarReturnType);
    }

    /**
     * List of subcomponent types that are available to configure for a particular parent component.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param type The type parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmComponentsIdSubComponentTypesGetWithHttpInfo(String realm, String id, String type) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmComponentsIdSubComponentTypesGetRequestCreation(realm, id, type).toEntityList(localVarReturnType);
    }

    /**
     * List of subcomponent types that are available to configure for a particular parent component.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id The id parameter
     * @param type The type parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmComponentsIdSubComponentTypesGetWithResponseSpec(String realm, String id, String type) throws WebClientResponseException {
        return realmComponentsIdSubComponentTypesGetRequestCreation(realm, id, type);
    }
    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param componentRepresentationDto The componentRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmComponentsPostRequestCreation(String realm, ComponentRepresentationDto componentRepresentationDto) throws WebClientResponseException {
        Object postBody = componentRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmComponentsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentRepresentationDto' is set
        if (componentRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'componentRepresentationDto' when calling realmComponentsPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/components", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param componentRepresentationDto The componentRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmComponentsPost(String realm, ComponentRepresentationDto componentRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmComponentsPostRequestCreation(realm, componentRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param componentRepresentationDto The componentRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmComponentsPostWithHttpInfo(String realm, ComponentRepresentationDto componentRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmComponentsPostRequestCreation(realm, componentRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param componentRepresentationDto The componentRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmComponentsPostWithResponseSpec(String realm, ComponentRepresentationDto componentRepresentationDto) throws WebClientResponseException {
        return realmComponentsPostRequestCreation(realm, componentRepresentationDto);
    }
}

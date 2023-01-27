package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.IdentityProviderMapperRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.IdentityProviderRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.ManagementPermissionReferenceDto;

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
public class IdentityProvidersApi {
    private ApiClient apiClient;

    public IdentityProvidersApi() {
        this(new ApiClient());
    }

    @Autowired
    public IdentityProvidersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Import identity provider from uploaded JSON file
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderImportConfigPostRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderImportConfigPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/identity-provider/import-config", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Import identity provider from uploaded JSON file
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, Object>> realmIdentityProviderImportConfigPost(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmIdentityProviderImportConfigPostRequestCreation(realm).bodyToMono(localVarReturnType);
    }

    /**
     * Import identity provider from uploaded JSON file
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Map<String, Object>>> realmIdentityProviderImportConfigPostWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return realmIdentityProviderImportConfigPostRequestCreation(realm).toEntity(localVarReturnType);
    }

    /**
     * Import identity provider from uploaded JSON file
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderImportConfigPostWithResponseSpec(String realm) throws WebClientResponseException {
        return realmIdentityProviderImportConfigPostRequestCreation(realm);
    }
    /**
     * Delete the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesAliasDeleteRequestCreation(String realm, String alias) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesAliasDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmIdentityProviderInstancesAliasDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/identity-provider/instances/{alias}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmIdentityProviderInstancesAliasDelete(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasDeleteRequestCreation(realm, alias).bodyToMono(localVarReturnType);
    }

    /**
     * Delete the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmIdentityProviderInstancesAliasDeleteWithHttpInfo(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasDeleteRequestCreation(realm, alias).toEntity(localVarReturnType);
    }

    /**
     * Delete the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesAliasDeleteWithResponseSpec(String realm, String alias) throws WebClientResponseException {
        return realmIdentityProviderInstancesAliasDeleteRequestCreation(realm, alias);
    }
    /**
     * Export public broker configuration for identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param format Format to use
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesAliasExportGetRequestCreation(String realm, String alias, String format) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesAliasExportGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmIdentityProviderInstancesAliasExportGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("alias", alias);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "format", format));

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{realm}/identity-provider/instances/{alias}/export", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Export public broker configuration for identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param format Format to use
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmIdentityProviderInstancesAliasExportGet(String realm, String alias, String format) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasExportGetRequestCreation(realm, alias, format).bodyToMono(localVarReturnType);
    }

    /**
     * Export public broker configuration for identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param format Format to use
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmIdentityProviderInstancesAliasExportGetWithHttpInfo(String realm, String alias, String format) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasExportGetRequestCreation(realm, alias, format).toEntity(localVarReturnType);
    }

    /**
     * Export public broker configuration for identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param format Format to use
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesAliasExportGetWithResponseSpec(String realm, String alias, String format) throws WebClientResponseException {
        return realmIdentityProviderInstancesAliasExportGetRequestCreation(realm, alias, format);
    }
    /**
     * Get the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return IdentityProviderRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesAliasGetRequestCreation(String realm, String alias) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesAliasGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmIdentityProviderInstancesAliasGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<IdentityProviderRepresentationDto> localVarReturnType = new ParameterizedTypeReference<IdentityProviderRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/identity-provider/instances/{alias}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return IdentityProviderRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<IdentityProviderRepresentationDto> realmIdentityProviderInstancesAliasGet(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<IdentityProviderRepresentationDto> localVarReturnType = new ParameterizedTypeReference<IdentityProviderRepresentationDto>() {};
        return realmIdentityProviderInstancesAliasGetRequestCreation(realm, alias).bodyToMono(localVarReturnType);
    }

    /**
     * Get the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return ResponseEntity&lt;IdentityProviderRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<IdentityProviderRepresentationDto>> realmIdentityProviderInstancesAliasGetWithHttpInfo(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<IdentityProviderRepresentationDto> localVarReturnType = new ParameterizedTypeReference<IdentityProviderRepresentationDto>() {};
        return realmIdentityProviderInstancesAliasGetRequestCreation(realm, alias).toEntity(localVarReturnType);
    }

    /**
     * Get the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesAliasGetWithResponseSpec(String realm, String alias) throws WebClientResponseException {
        return realmIdentityProviderInstancesAliasGetRequestCreation(realm, alias);
    }
    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesAliasManagementPermissionsGetRequestCreation(String realm, String alias) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesAliasManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmIdentityProviderInstancesAliasManagementPermissionsGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return apiClient.invokeAPI("/{realm}/identity-provider/instances/{alias}/management/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmIdentityProviderInstancesAliasManagementPermissionsGet(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmIdentityProviderInstancesAliasManagementPermissionsGetRequestCreation(realm, alias).bodyToMono(localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmIdentityProviderInstancesAliasManagementPermissionsGetWithHttpInfo(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmIdentityProviderInstancesAliasManagementPermissionsGetRequestCreation(realm, alias).toEntity(localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesAliasManagementPermissionsGetWithResponseSpec(String realm, String alias) throws WebClientResponseException {
        return realmIdentityProviderInstancesAliasManagementPermissionsGetRequestCreation(realm, alias);
    }
    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesAliasManagementPermissionsPutRequestCreation(String realm, String alias, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        Object postBody = managementPermissionReferenceDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesAliasManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmIdentityProviderInstancesAliasManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'managementPermissionReferenceDto' is set
        if (managementPermissionReferenceDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'managementPermissionReferenceDto' when calling realmIdentityProviderInstancesAliasManagementPermissionsPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return apiClient.invokeAPI("/{realm}/identity-provider/instances/{alias}/management/permissions", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ManagementPermissionReferenceDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagementPermissionReferenceDto> realmIdentityProviderInstancesAliasManagementPermissionsPut(String realm, String alias, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmIdentityProviderInstancesAliasManagementPermissionsPutRequestCreation(realm, alias, managementPermissionReferenceDto).bodyToMono(localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseEntity&lt;ManagementPermissionReferenceDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagementPermissionReferenceDto>> realmIdentityProviderInstancesAliasManagementPermissionsPutWithHttpInfo(String realm, String alias, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        ParameterizedTypeReference<ManagementPermissionReferenceDto> localVarReturnType = new ParameterizedTypeReference<ManagementPermissionReferenceDto>() {};
        return realmIdentityProviderInstancesAliasManagementPermissionsPutRequestCreation(realm, alias, managementPermissionReferenceDto).toEntity(localVarReturnType);
    }

    /**
     * Return object stating whether client Authorization permissions have been initialized or not and a reference
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param managementPermissionReferenceDto The managementPermissionReferenceDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesAliasManagementPermissionsPutWithResponseSpec(String realm, String alias, ManagementPermissionReferenceDto managementPermissionReferenceDto) throws WebClientResponseException {
        return realmIdentityProviderInstancesAliasManagementPermissionsPutRequestCreation(realm, alias, managementPermissionReferenceDto);
    }
    /**
     * Get mapper types for identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesAliasMapperTypesGetRequestCreation(String realm, String alias) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesAliasMapperTypesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmIdentityProviderInstancesAliasMapperTypesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/identity-provider/instances/{alias}/mapper-types", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get mapper types for identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmIdentityProviderInstancesAliasMapperTypesGet(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasMapperTypesGetRequestCreation(realm, alias).bodyToMono(localVarReturnType);
    }

    /**
     * Get mapper types for identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmIdentityProviderInstancesAliasMapperTypesGetWithHttpInfo(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasMapperTypesGetRequestCreation(realm, alias).toEntity(localVarReturnType);
    }

    /**
     * Get mapper types for identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesAliasMapperTypesGetWithResponseSpec(String realm, String alias) throws WebClientResponseException {
        return realmIdentityProviderInstancesAliasMapperTypesGetRequestCreation(realm, alias);
    }
    /**
     * Get mappers for identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesAliasMappersGetRequestCreation(String realm, String alias) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesAliasMappersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmIdentityProviderInstancesAliasMappersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/{realm}/identity-provider/instances/{alias}/mappers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get mappers for identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmIdentityProviderInstancesAliasMappersGet(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmIdentityProviderInstancesAliasMappersGetRequestCreation(realm, alias).bodyToFlux(localVarReturnType);
    }

    /**
     * Get mappers for identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmIdentityProviderInstancesAliasMappersGetWithHttpInfo(String realm, String alias) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmIdentityProviderInstancesAliasMappersGetRequestCreation(realm, alias).toEntityList(localVarReturnType);
    }

    /**
     * Get mappers for identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesAliasMappersGetWithResponseSpec(String realm, String alias) throws WebClientResponseException {
        return realmIdentityProviderInstancesAliasMappersGetRequestCreation(realm, alias);
    }
    /**
     * Delete a mapper for the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param id Mapper id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesAliasMappersIdDeleteRequestCreation(String realm, String alias, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesAliasMappersIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmIdentityProviderInstancesAliasMappersIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmIdentityProviderInstancesAliasMappersIdDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("alias", alias);
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
        return apiClient.invokeAPI("/{realm}/identity-provider/instances/{alias}/mappers/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a mapper for the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param id Mapper id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmIdentityProviderInstancesAliasMappersIdDelete(String realm, String alias, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasMappersIdDeleteRequestCreation(realm, alias, id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a mapper for the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param id Mapper id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmIdentityProviderInstancesAliasMappersIdDeleteWithHttpInfo(String realm, String alias, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasMappersIdDeleteRequestCreation(realm, alias, id).toEntity(localVarReturnType);
    }

    /**
     * Delete a mapper for the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param id Mapper id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesAliasMappersIdDeleteWithResponseSpec(String realm, String alias, String id) throws WebClientResponseException {
        return realmIdentityProviderInstancesAliasMappersIdDeleteRequestCreation(realm, alias, id);
    }
    /**
     * Get mapper by id for the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param id Mapper id
     * @return IdentityProviderMapperRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesAliasMappersIdGetRequestCreation(String realm, String alias, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesAliasMappersIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmIdentityProviderInstancesAliasMappersIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmIdentityProviderInstancesAliasMappersIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("alias", alias);
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

        ParameterizedTypeReference<IdentityProviderMapperRepresentationDto> localVarReturnType = new ParameterizedTypeReference<IdentityProviderMapperRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/identity-provider/instances/{alias}/mappers/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get mapper by id for the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param id Mapper id
     * @return IdentityProviderMapperRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<IdentityProviderMapperRepresentationDto> realmIdentityProviderInstancesAliasMappersIdGet(String realm, String alias, String id) throws WebClientResponseException {
        ParameterizedTypeReference<IdentityProviderMapperRepresentationDto> localVarReturnType = new ParameterizedTypeReference<IdentityProviderMapperRepresentationDto>() {};
        return realmIdentityProviderInstancesAliasMappersIdGetRequestCreation(realm, alias, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get mapper by id for the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param id Mapper id
     * @return ResponseEntity&lt;IdentityProviderMapperRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<IdentityProviderMapperRepresentationDto>> realmIdentityProviderInstancesAliasMappersIdGetWithHttpInfo(String realm, String alias, String id) throws WebClientResponseException {
        ParameterizedTypeReference<IdentityProviderMapperRepresentationDto> localVarReturnType = new ParameterizedTypeReference<IdentityProviderMapperRepresentationDto>() {};
        return realmIdentityProviderInstancesAliasMappersIdGetRequestCreation(realm, alias, id).toEntity(localVarReturnType);
    }

    /**
     * Get mapper by id for the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param id Mapper id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesAliasMappersIdGetWithResponseSpec(String realm, String alias, String id) throws WebClientResponseException {
        return realmIdentityProviderInstancesAliasMappersIdGetRequestCreation(realm, alias, id);
    }
    /**
     * Update a mapper for the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param id Mapper id
     * @param identityProviderMapperRepresentationDto The identityProviderMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesAliasMappersIdPutRequestCreation(String realm, String alias, String id, IdentityProviderMapperRepresentationDto identityProviderMapperRepresentationDto) throws WebClientResponseException {
        Object postBody = identityProviderMapperRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesAliasMappersIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmIdentityProviderInstancesAliasMappersIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmIdentityProviderInstancesAliasMappersIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'identityProviderMapperRepresentationDto' is set
        if (identityProviderMapperRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'identityProviderMapperRepresentationDto' when calling realmIdentityProviderInstancesAliasMappersIdPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("alias", alias);
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
        return apiClient.invokeAPI("/{realm}/identity-provider/instances/{alias}/mappers/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a mapper for the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param id Mapper id
     * @param identityProviderMapperRepresentationDto The identityProviderMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmIdentityProviderInstancesAliasMappersIdPut(String realm, String alias, String id, IdentityProviderMapperRepresentationDto identityProviderMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasMappersIdPutRequestCreation(realm, alias, id, identityProviderMapperRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update a mapper for the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param id Mapper id
     * @param identityProviderMapperRepresentationDto The identityProviderMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmIdentityProviderInstancesAliasMappersIdPutWithHttpInfo(String realm, String alias, String id, IdentityProviderMapperRepresentationDto identityProviderMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasMappersIdPutRequestCreation(realm, alias, id, identityProviderMapperRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update a mapper for the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param id Mapper id
     * @param identityProviderMapperRepresentationDto The identityProviderMapperRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesAliasMappersIdPutWithResponseSpec(String realm, String alias, String id, IdentityProviderMapperRepresentationDto identityProviderMapperRepresentationDto) throws WebClientResponseException {
        return realmIdentityProviderInstancesAliasMappersIdPutRequestCreation(realm, alias, id, identityProviderMapperRepresentationDto);
    }
    /**
     * Add a mapper to identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param identityProviderMapperRepresentationDto The identityProviderMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesAliasMappersPostRequestCreation(String realm, String alias, IdentityProviderMapperRepresentationDto identityProviderMapperRepresentationDto) throws WebClientResponseException {
        Object postBody = identityProviderMapperRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesAliasMappersPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmIdentityProviderInstancesAliasMappersPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'identityProviderMapperRepresentationDto' is set
        if (identityProviderMapperRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'identityProviderMapperRepresentationDto' when calling realmIdentityProviderInstancesAliasMappersPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/identity-provider/instances/{alias}/mappers", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add a mapper to identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param identityProviderMapperRepresentationDto The identityProviderMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmIdentityProviderInstancesAliasMappersPost(String realm, String alias, IdentityProviderMapperRepresentationDto identityProviderMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasMappersPostRequestCreation(realm, alias, identityProviderMapperRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Add a mapper to identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param identityProviderMapperRepresentationDto The identityProviderMapperRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmIdentityProviderInstancesAliasMappersPostWithHttpInfo(String realm, String alias, IdentityProviderMapperRepresentationDto identityProviderMapperRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasMappersPostRequestCreation(realm, alias, identityProviderMapperRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Add a mapper to identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param identityProviderMapperRepresentationDto The identityProviderMapperRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesAliasMappersPostWithResponseSpec(String realm, String alias, IdentityProviderMapperRepresentationDto identityProviderMapperRepresentationDto) throws WebClientResponseException {
        return realmIdentityProviderInstancesAliasMappersPostRequestCreation(realm, alias, identityProviderMapperRepresentationDto);
    }
    /**
     * Update the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param identityProviderRepresentationDto The identityProviderRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesAliasPutRequestCreation(String realm, String alias, IdentityProviderRepresentationDto identityProviderRepresentationDto) throws WebClientResponseException {
        Object postBody = identityProviderRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesAliasPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new WebClientResponseException("Missing the required parameter 'alias' when calling realmIdentityProviderInstancesAliasPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'identityProviderRepresentationDto' is set
        if (identityProviderRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'identityProviderRepresentationDto' when calling realmIdentityProviderInstancesAliasPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/identity-provider/instances/{alias}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param identityProviderRepresentationDto The identityProviderRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmIdentityProviderInstancesAliasPut(String realm, String alias, IdentityProviderRepresentationDto identityProviderRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasPutRequestCreation(realm, alias, identityProviderRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Update the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param identityProviderRepresentationDto The identityProviderRepresentationDto parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmIdentityProviderInstancesAliasPutWithHttpInfo(String realm, String alias, IdentityProviderRepresentationDto identityProviderRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesAliasPutRequestCreation(realm, alias, identityProviderRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Update the identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param alias The alias parameter
     * @param identityProviderRepresentationDto The identityProviderRepresentationDto parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesAliasPutWithResponseSpec(String realm, String alias, IdentityProviderRepresentationDto identityProviderRepresentationDto) throws WebClientResponseException {
        return realmIdentityProviderInstancesAliasPutRequestCreation(realm, alias, identityProviderRepresentationDto);
    }
    /**
     * Get identity providers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesGetRequestCreation(String realm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/identity-provider/instances", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get identity providers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> realmIdentityProviderInstancesGet(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmIdentityProviderInstancesGetRequestCreation(realm).bodyToFlux(localVarReturnType);
    }

    /**
     * Get identity providers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> realmIdentityProviderInstancesGetWithHttpInfo(String realm) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return realmIdentityProviderInstancesGetRequestCreation(realm).toEntityList(localVarReturnType);
    }

    /**
     * Get identity providers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesGetWithResponseSpec(String realm) throws WebClientResponseException {
        return realmIdentityProviderInstancesGetRequestCreation(realm);
    }
    /**
     * Create a new identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param identityProviderRepresentationDto JSON body
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderInstancesPostRequestCreation(String realm, IdentityProviderRepresentationDto identityProviderRepresentationDto) throws WebClientResponseException {
        Object postBody = identityProviderRepresentationDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderInstancesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'identityProviderRepresentationDto' is set
        if (identityProviderRepresentationDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'identityProviderRepresentationDto' when calling realmIdentityProviderInstancesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/{realm}/identity-provider/instances", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param identityProviderRepresentationDto JSON body
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmIdentityProviderInstancesPost(String realm, IdentityProviderRepresentationDto identityProviderRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesPostRequestCreation(realm, identityProviderRepresentationDto).bodyToMono(localVarReturnType);
    }

    /**
     * Create a new identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param identityProviderRepresentationDto JSON body
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmIdentityProviderInstancesPostWithHttpInfo(String realm, IdentityProviderRepresentationDto identityProviderRepresentationDto) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderInstancesPostRequestCreation(realm, identityProviderRepresentationDto).toEntity(localVarReturnType);
    }

    /**
     * Create a new identity provider
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param identityProviderRepresentationDto JSON body
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderInstancesPostWithResponseSpec(String realm, IdentityProviderRepresentationDto identityProviderRepresentationDto) throws WebClientResponseException {
        return realmIdentityProviderInstancesPostRequestCreation(realm, identityProviderRepresentationDto);
    }
    /**
     * Get identity providers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param providerId Provider id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmIdentityProviderProvidersProviderIdGetRequestCreation(String realm, String providerId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmIdentityProviderProvidersProviderIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new WebClientResponseException("Missing the required parameter 'providerId' when calling realmIdentityProviderProvidersProviderIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("provider_id", providerId);

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
        return apiClient.invokeAPI("/{realm}/identity-provider/providers/{provider_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get identity providers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param providerId Provider id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> realmIdentityProviderProvidersProviderIdGet(String realm, String providerId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderProvidersProviderIdGetRequestCreation(realm, providerId).bodyToMono(localVarReturnType);
    }

    /**
     * Get identity providers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param providerId Provider id
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> realmIdentityProviderProvidersProviderIdGetWithHttpInfo(String realm, String providerId) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return realmIdentityProviderProvidersProviderIdGetRequestCreation(realm, providerId).toEntity(localVarReturnType);
    }

    /**
     * Get identity providers
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param providerId Provider id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmIdentityProviderProvidersProviderIdGetWithResponseSpec(String realm, String providerId) throws WebClientResponseException {
        return realmIdentityProviderProvidersProviderIdGetRequestCreation(realm, providerId);
    }
}

package dev.mbo.keycloak.admin.api;

import dev.mbo.keycloak.admin.api.client.ApiClient;

import dev.mbo.keycloak.admin.api.dto.CertificateRepresentationDto;
import dev.mbo.keycloak.admin.api.dto.KeyStoreConfigDto;

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
public class ClientAttributeCertificateApi {
    private ApiClient apiClient;

    public ClientAttributeCertificateApi() {
        this(new ApiClient());
    }

    @Autowired
    public ClientAttributeCertificateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a keystore file for the client, containing private key and public certificate
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @param keyStoreConfigDto Keystore configuration as JSON
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdCertificatesAttrDownloadPostRequestCreation(String realm, String id, String attr, KeyStoreConfigDto keyStoreConfigDto) throws WebClientResponseException {
        Object postBody = keyStoreConfigDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdCertificatesAttrDownloadPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdCertificatesAttrDownloadPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attr' is set
        if (attr == null) {
            throw new WebClientResponseException("Missing the required parameter 'attr' when calling realmClientsIdCertificatesAttrDownloadPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'keyStoreConfigDto' is set
        if (keyStoreConfigDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'keyStoreConfigDto' when calling realmClientsIdCertificatesAttrDownloadPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("attr", attr);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/certificates/{attr}/download", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a keystore file for the client, containing private key and public certificate
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @param keyStoreConfigDto Keystore configuration as JSON
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> realmClientsIdCertificatesAttrDownloadPost(String realm, String id, String attr, KeyStoreConfigDto keyStoreConfigDto) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return realmClientsIdCertificatesAttrDownloadPostRequestCreation(realm, id, attr, keyStoreConfigDto).bodyToMono(localVarReturnType);
    }

    /**
     * Get a keystore file for the client, containing private key and public certificate
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @param keyStoreConfigDto Keystore configuration as JSON
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<byte[]>> realmClientsIdCertificatesAttrDownloadPostWithHttpInfo(String realm, String id, String attr, KeyStoreConfigDto keyStoreConfigDto) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return realmClientsIdCertificatesAttrDownloadPostRequestCreation(realm, id, attr, keyStoreConfigDto).toEntity(localVarReturnType);
    }

    /**
     * Get a keystore file for the client, containing private key and public certificate
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @param keyStoreConfigDto Keystore configuration as JSON
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdCertificatesAttrDownloadPostWithResponseSpec(String realm, String id, String attr, KeyStoreConfigDto keyStoreConfigDto) throws WebClientResponseException {
        return realmClientsIdCertificatesAttrDownloadPostRequestCreation(realm, id, attr, keyStoreConfigDto);
    }
    /**
     * Generate a new keypair and certificate, and get the private key file   Generates a keypair and certificate and serves the private key in a specified keystore format.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @param keyStoreConfigDto Keystore configuration as JSON
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdCertificatesAttrGenerateAndDownloadPostRequestCreation(String realm, String id, String attr, KeyStoreConfigDto keyStoreConfigDto) throws WebClientResponseException {
        Object postBody = keyStoreConfigDto;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdCertificatesAttrGenerateAndDownloadPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdCertificatesAttrGenerateAndDownloadPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attr' is set
        if (attr == null) {
            throw new WebClientResponseException("Missing the required parameter 'attr' when calling realmClientsIdCertificatesAttrGenerateAndDownloadPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'keyStoreConfigDto' is set
        if (keyStoreConfigDto == null) {
            throw new WebClientResponseException("Missing the required parameter 'keyStoreConfigDto' when calling realmClientsIdCertificatesAttrGenerateAndDownloadPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("attr", attr);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "access_token" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/certificates/{attr}/generate-and-download", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Generate a new keypair and certificate, and get the private key file   Generates a keypair and certificate and serves the private key in a specified keystore format.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @param keyStoreConfigDto Keystore configuration as JSON
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> realmClientsIdCertificatesAttrGenerateAndDownloadPost(String realm, String id, String attr, KeyStoreConfigDto keyStoreConfigDto) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return realmClientsIdCertificatesAttrGenerateAndDownloadPostRequestCreation(realm, id, attr, keyStoreConfigDto).bodyToMono(localVarReturnType);
    }

    /**
     * Generate a new keypair and certificate, and get the private key file   Generates a keypair and certificate and serves the private key in a specified keystore format.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @param keyStoreConfigDto Keystore configuration as JSON
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<byte[]>> realmClientsIdCertificatesAttrGenerateAndDownloadPostWithHttpInfo(String realm, String id, String attr, KeyStoreConfigDto keyStoreConfigDto) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return realmClientsIdCertificatesAttrGenerateAndDownloadPostRequestCreation(realm, id, attr, keyStoreConfigDto).toEntity(localVarReturnType);
    }

    /**
     * Generate a new keypair and certificate, and get the private key file   Generates a keypair and certificate and serves the private key in a specified keystore format.
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @param keyStoreConfigDto Keystore configuration as JSON
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdCertificatesAttrGenerateAndDownloadPostWithResponseSpec(String realm, String id, String attr, KeyStoreConfigDto keyStoreConfigDto) throws WebClientResponseException {
        return realmClientsIdCertificatesAttrGenerateAndDownloadPostRequestCreation(realm, id, attr, keyStoreConfigDto);
    }
    /**
     * Generate a new certificate with new key pair
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return CertificateRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdCertificatesAttrGeneratePostRequestCreation(String realm, String id, String attr) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdCertificatesAttrGeneratePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdCertificatesAttrGeneratePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attr' is set
        if (attr == null) {
            throw new WebClientResponseException("Missing the required parameter 'attr' when calling realmClientsIdCertificatesAttrGeneratePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("attr", attr);

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

        ParameterizedTypeReference<CertificateRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CertificateRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/certificates/{attr}/generate", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Generate a new certificate with new key pair
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return CertificateRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CertificateRepresentationDto> realmClientsIdCertificatesAttrGeneratePost(String realm, String id, String attr) throws WebClientResponseException {
        ParameterizedTypeReference<CertificateRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CertificateRepresentationDto>() {};
        return realmClientsIdCertificatesAttrGeneratePostRequestCreation(realm, id, attr).bodyToMono(localVarReturnType);
    }

    /**
     * Generate a new certificate with new key pair
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return ResponseEntity&lt;CertificateRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CertificateRepresentationDto>> realmClientsIdCertificatesAttrGeneratePostWithHttpInfo(String realm, String id, String attr) throws WebClientResponseException {
        ParameterizedTypeReference<CertificateRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CertificateRepresentationDto>() {};
        return realmClientsIdCertificatesAttrGeneratePostRequestCreation(realm, id, attr).toEntity(localVarReturnType);
    }

    /**
     * Generate a new certificate with new key pair
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdCertificatesAttrGeneratePostWithResponseSpec(String realm, String id, String attr) throws WebClientResponseException {
        return realmClientsIdCertificatesAttrGeneratePostRequestCreation(realm, id, attr);
    }
    /**
     * Get key info
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return CertificateRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdCertificatesAttrGetRequestCreation(String realm, String id, String attr) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdCertificatesAttrGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdCertificatesAttrGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attr' is set
        if (attr == null) {
            throw new WebClientResponseException("Missing the required parameter 'attr' when calling realmClientsIdCertificatesAttrGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("attr", attr);

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

        ParameterizedTypeReference<CertificateRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CertificateRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/certificates/{attr}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get key info
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return CertificateRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CertificateRepresentationDto> realmClientsIdCertificatesAttrGet(String realm, String id, String attr) throws WebClientResponseException {
        ParameterizedTypeReference<CertificateRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CertificateRepresentationDto>() {};
        return realmClientsIdCertificatesAttrGetRequestCreation(realm, id, attr).bodyToMono(localVarReturnType);
    }

    /**
     * Get key info
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return ResponseEntity&lt;CertificateRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CertificateRepresentationDto>> realmClientsIdCertificatesAttrGetWithHttpInfo(String realm, String id, String attr) throws WebClientResponseException {
        ParameterizedTypeReference<CertificateRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CertificateRepresentationDto>() {};
        return realmClientsIdCertificatesAttrGetRequestCreation(realm, id, attr).toEntity(localVarReturnType);
    }

    /**
     * Get key info
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdCertificatesAttrGetWithResponseSpec(String realm, String id, String attr) throws WebClientResponseException {
        return realmClientsIdCertificatesAttrGetRequestCreation(realm, id, attr);
    }
    /**
     * Upload only certificate, not private key
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return CertificateRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdCertificatesAttrUploadCertificatePostRequestCreation(String realm, String id, String attr) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdCertificatesAttrUploadCertificatePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdCertificatesAttrUploadCertificatePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attr' is set
        if (attr == null) {
            throw new WebClientResponseException("Missing the required parameter 'attr' when calling realmClientsIdCertificatesAttrUploadCertificatePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("attr", attr);

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

        ParameterizedTypeReference<CertificateRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CertificateRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/certificates/{attr}/upload-certificate", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Upload only certificate, not private key
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return CertificateRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CertificateRepresentationDto> realmClientsIdCertificatesAttrUploadCertificatePost(String realm, String id, String attr) throws WebClientResponseException {
        ParameterizedTypeReference<CertificateRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CertificateRepresentationDto>() {};
        return realmClientsIdCertificatesAttrUploadCertificatePostRequestCreation(realm, id, attr).bodyToMono(localVarReturnType);
    }

    /**
     * Upload only certificate, not private key
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return ResponseEntity&lt;CertificateRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CertificateRepresentationDto>> realmClientsIdCertificatesAttrUploadCertificatePostWithHttpInfo(String realm, String id, String attr) throws WebClientResponseException {
        ParameterizedTypeReference<CertificateRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CertificateRepresentationDto>() {};
        return realmClientsIdCertificatesAttrUploadCertificatePostRequestCreation(realm, id, attr).toEntity(localVarReturnType);
    }

    /**
     * Upload only certificate, not private key
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdCertificatesAttrUploadCertificatePostWithResponseSpec(String realm, String id, String attr) throws WebClientResponseException {
        return realmClientsIdCertificatesAttrUploadCertificatePostRequestCreation(realm, id, attr);
    }
    /**
     * Upload certificate and eventually private key
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return CertificateRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec realmClientsIdCertificatesAttrUploadPostRequestCreation(String realm, String id, String attr) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new WebClientResponseException("Missing the required parameter 'realm' when calling realmClientsIdCertificatesAttrUploadPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling realmClientsIdCertificatesAttrUploadPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attr' is set
        if (attr == null) {
            throw new WebClientResponseException("Missing the required parameter 'attr' when calling realmClientsIdCertificatesAttrUploadPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("realm", realm);
        pathParams.put("id", id);
        pathParams.put("attr", attr);

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

        ParameterizedTypeReference<CertificateRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CertificateRepresentationDto>() {};
        return apiClient.invokeAPI("/{realm}/clients/{id}/certificates/{attr}/upload", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Upload certificate and eventually private key
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return CertificateRepresentationDto
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CertificateRepresentationDto> realmClientsIdCertificatesAttrUploadPost(String realm, String id, String attr) throws WebClientResponseException {
        ParameterizedTypeReference<CertificateRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CertificateRepresentationDto>() {};
        return realmClientsIdCertificatesAttrUploadPostRequestCreation(realm, id, attr).bodyToMono(localVarReturnType);
    }

    /**
     * Upload certificate and eventually private key
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return ResponseEntity&lt;CertificateRepresentationDto&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CertificateRepresentationDto>> realmClientsIdCertificatesAttrUploadPostWithHttpInfo(String realm, String id, String attr) throws WebClientResponseException {
        ParameterizedTypeReference<CertificateRepresentationDto> localVarReturnType = new ParameterizedTypeReference<CertificateRepresentationDto>() {};
        return realmClientsIdCertificatesAttrUploadPostRequestCreation(realm, id, attr).toEntity(localVarReturnType);
    }

    /**
     * Upload certificate and eventually private key
     * 
     * <p><b>2XX</b> - success
     * @param realm realm name (not id!)
     * @param id id of client (not client-id)
     * @param attr The attr parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec realmClientsIdCertificatesAttrUploadPostWithResponseSpec(String realm, String id, String attr) throws WebClientResponseException {
        return realmClientsIdCertificatesAttrUploadPostRequestCreation(realm, id, attr);
    }
}

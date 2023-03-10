/*
 * ${product.name.full} Admin REST API
 * This is a REST API reference for the ${product.name.full} Admin REST API.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package dev.mbo.keycloak.admin.api.dto;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * FederatedIdentityRepresentationDto
 */
@JsonPropertyOrder({
  FederatedIdentityRepresentationDto.JSON_PROPERTY_IDENTITY_PROVIDER,
  FederatedIdentityRepresentationDto.JSON_PROPERTY_USER_ID,
  FederatedIdentityRepresentationDto.JSON_PROPERTY_USER_NAME
})
@JsonTypeName("FederatedIdentityRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FederatedIdentityRepresentationDto {
  public static final String JSON_PROPERTY_IDENTITY_PROVIDER = "identityProvider";
  private String identityProvider;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public FederatedIdentityRepresentationDto() {
  }

  public FederatedIdentityRepresentationDto identityProvider(String identityProvider) {
    
    this.identityProvider = identityProvider;
    return this;
  }

   /**
   * Get identityProvider
   * @return identityProvider
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_IDENTITY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentityProvider() {
    return identityProvider;
  }


  @JsonProperty(JSON_PROPERTY_IDENTITY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentityProvider(String identityProvider) {
    this.identityProvider = identityProvider;
  }


  public FederatedIdentityRepresentationDto userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public FederatedIdentityRepresentationDto userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FederatedIdentityRepresentationDto federatedIdentityRepresentation = (FederatedIdentityRepresentationDto) o;
    return Objects.equals(this.identityProvider, federatedIdentityRepresentation.identityProvider) &&
        Objects.equals(this.userId, federatedIdentityRepresentation.userId) &&
        Objects.equals(this.userName, federatedIdentityRepresentation.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityProvider, userId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FederatedIdentityRepresentationDto {\n");
    sb.append("    identityProvider: ").append(toIndentedString(identityProvider)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


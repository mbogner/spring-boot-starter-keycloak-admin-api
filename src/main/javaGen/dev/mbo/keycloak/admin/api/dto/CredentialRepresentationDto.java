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
 * CredentialRepresentationDto
 */
@JsonPropertyOrder({
  CredentialRepresentationDto.JSON_PROPERTY_CREATED_DATE,
  CredentialRepresentationDto.JSON_PROPERTY_CREDENTIAL_DATA,
  CredentialRepresentationDto.JSON_PROPERTY_ID,
  CredentialRepresentationDto.JSON_PROPERTY_PRIORITY,
  CredentialRepresentationDto.JSON_PROPERTY_SECRET_DATA,
  CredentialRepresentationDto.JSON_PROPERTY_TEMPORARY,
  CredentialRepresentationDto.JSON_PROPERTY_TYPE,
  CredentialRepresentationDto.JSON_PROPERTY_USER_LABEL,
  CredentialRepresentationDto.JSON_PROPERTY_VALUE
})
@JsonTypeName("CredentialRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CredentialRepresentationDto {
  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private Long createdDate;

  public static final String JSON_PROPERTY_CREDENTIAL_DATA = "credentialData";
  private String credentialData;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public static final String JSON_PROPERTY_SECRET_DATA = "secretData";
  private String secretData;

  public static final String JSON_PROPERTY_TEMPORARY = "temporary";
  private Boolean temporary;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_USER_LABEL = "userLabel";
  private String userLabel;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public CredentialRepresentationDto() {
  }

  public CredentialRepresentationDto createdDate(Long createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }


  public CredentialRepresentationDto credentialData(String credentialData) {
    
    this.credentialData = credentialData;
    return this;
  }

   /**
   * Get credentialData
   * @return credentialData
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CREDENTIAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCredentialData() {
    return credentialData;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredentialData(String credentialData) {
    this.credentialData = credentialData;
  }


  public CredentialRepresentationDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public CredentialRepresentationDto priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public CredentialRepresentationDto secretData(String secretData) {
    
    this.secretData = secretData;
    return this;
  }

   /**
   * Get secretData
   * @return secretData
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_SECRET_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecretData() {
    return secretData;
  }


  @JsonProperty(JSON_PROPERTY_SECRET_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecretData(String secretData) {
    this.secretData = secretData;
  }


  public CredentialRepresentationDto temporary(Boolean temporary) {
    
    this.temporary = temporary;
    return this;
  }

   /**
   * Get temporary
   * @return temporary
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_TEMPORARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTemporary() {
    return temporary;
  }


  @JsonProperty(JSON_PROPERTY_TEMPORARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemporary(Boolean temporary) {
    this.temporary = temporary;
  }


  public CredentialRepresentationDto type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public CredentialRepresentationDto userLabel(String userLabel) {
    
    this.userLabel = userLabel;
    return this;
  }

   /**
   * Get userLabel
   * @return userLabel
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_USER_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserLabel() {
    return userLabel;
  }


  @JsonProperty(JSON_PROPERTY_USER_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserLabel(String userLabel) {
    this.userLabel = userLabel;
  }


  public CredentialRepresentationDto value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialRepresentationDto credentialRepresentation = (CredentialRepresentationDto) o;
    return Objects.equals(this.createdDate, credentialRepresentation.createdDate) &&
        Objects.equals(this.credentialData, credentialRepresentation.credentialData) &&
        Objects.equals(this.id, credentialRepresentation.id) &&
        Objects.equals(this.priority, credentialRepresentation.priority) &&
        Objects.equals(this.secretData, credentialRepresentation.secretData) &&
        Objects.equals(this.temporary, credentialRepresentation.temporary) &&
        Objects.equals(this.type, credentialRepresentation.type) &&
        Objects.equals(this.userLabel, credentialRepresentation.userLabel) &&
        Objects.equals(this.value, credentialRepresentation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, credentialData, id, priority, secretData, temporary, type, userLabel, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialRepresentationDto {\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    credentialData: ").append(toIndentedString(credentialData)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    secretData: ").append(toIndentedString(secretData)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userLabel: ").append(toIndentedString(userLabel)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


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
 * PasswordPolicyTypeRepresentationDto
 */
@JsonPropertyOrder({
  PasswordPolicyTypeRepresentationDto.JSON_PROPERTY_CONFIG_TYPE,
  PasswordPolicyTypeRepresentationDto.JSON_PROPERTY_DEFAULT_VALUE,
  PasswordPolicyTypeRepresentationDto.JSON_PROPERTY_DISPLAY_NAME,
  PasswordPolicyTypeRepresentationDto.JSON_PROPERTY_ID,
  PasswordPolicyTypeRepresentationDto.JSON_PROPERTY_MULTIPLE_SUPPORTED
})
@JsonTypeName("PasswordPolicyTypeRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PasswordPolicyTypeRepresentationDto {
  public static final String JSON_PROPERTY_CONFIG_TYPE = "configType";
  private String configType;

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
  private String defaultValue;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MULTIPLE_SUPPORTED = "multipleSupported";
  private Boolean multipleSupported;

  public PasswordPolicyTypeRepresentationDto() {
  }

  public PasswordPolicyTypeRepresentationDto configType(String configType) {
    
    this.configType = configType;
    return this;
  }

   /**
   * Get configType
   * @return configType
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CONFIG_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConfigType() {
    return configType;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigType(String configType) {
    this.configType = configType;
  }


  public PasswordPolicyTypeRepresentationDto defaultValue(String defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultValue() {
    return defaultValue;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public PasswordPolicyTypeRepresentationDto displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PasswordPolicyTypeRepresentationDto id(String id) {
    
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


  public PasswordPolicyTypeRepresentationDto multipleSupported(Boolean multipleSupported) {
    
    this.multipleSupported = multipleSupported;
    return this;
  }

   /**
   * Get multipleSupported
   * @return multipleSupported
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_MULTIPLE_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultipleSupported() {
    return multipleSupported;
  }


  @JsonProperty(JSON_PROPERTY_MULTIPLE_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultipleSupported(Boolean multipleSupported) {
    this.multipleSupported = multipleSupported;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordPolicyTypeRepresentationDto passwordPolicyTypeRepresentation = (PasswordPolicyTypeRepresentationDto) o;
    return Objects.equals(this.configType, passwordPolicyTypeRepresentation.configType) &&
        Objects.equals(this.defaultValue, passwordPolicyTypeRepresentation.defaultValue) &&
        Objects.equals(this.displayName, passwordPolicyTypeRepresentation.displayName) &&
        Objects.equals(this.id, passwordPolicyTypeRepresentation.id) &&
        Objects.equals(this.multipleSupported, passwordPolicyTypeRepresentation.multipleSupported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configType, defaultValue, displayName, id, multipleSupported);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyTypeRepresentationDto {\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    multipleSupported: ").append(toIndentedString(multipleSupported)).append("\n");
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


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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * ConfigPropertyRepresentationDto
 */
@JsonPropertyOrder({
  ConfigPropertyRepresentationDto.JSON_PROPERTY_DEFAULT_VALUE,
  ConfigPropertyRepresentationDto.JSON_PROPERTY_HELP_TEXT,
  ConfigPropertyRepresentationDto.JSON_PROPERTY_LABEL,
  ConfigPropertyRepresentationDto.JSON_PROPERTY_NAME,
  ConfigPropertyRepresentationDto.JSON_PROPERTY_OPTIONS,
  ConfigPropertyRepresentationDto.JSON_PROPERTY_READ_ONLY,
  ConfigPropertyRepresentationDto.JSON_PROPERTY_SECRET,
  ConfigPropertyRepresentationDto.JSON_PROPERTY_TYPE
})
@JsonTypeName("ConfigPropertyRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigPropertyRepresentationDto {
  public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
  private Object defaultValue;

  public static final String JSON_PROPERTY_HELP_TEXT = "helpText";
  private String helpText;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<String> options = null;

  public static final String JSON_PROPERTY_READ_ONLY = "readOnly";
  private Boolean readOnly;

  public static final String JSON_PROPERTY_SECRET = "secret";
  private Boolean secret;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ConfigPropertyRepresentationDto() {
  }

  public ConfigPropertyRepresentationDto defaultValue(Object defaultValue) {
    
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

  public Object getDefaultValue() {
    return defaultValue;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
  }


  public ConfigPropertyRepresentationDto helpText(String helpText) {
    
    this.helpText = helpText;
    return this;
  }

   /**
   * Get helpText
   * @return helpText
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_HELP_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHelpText() {
    return helpText;
  }


  @JsonProperty(JSON_PROPERTY_HELP_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }


  public ConfigPropertyRepresentationDto label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public ConfigPropertyRepresentationDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ConfigPropertyRepresentationDto options(List<String> options) {
    
    this.options = options;
    return this;
  }

  public ConfigPropertyRepresentationDto addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(List<String> options) {
    this.options = options;
  }


  public ConfigPropertyRepresentationDto readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_READ_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReadOnly() {
    return readOnly;
  }


  @JsonProperty(JSON_PROPERTY_READ_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public ConfigPropertyRepresentationDto secret(Boolean secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSecret() {
    return secret;
  }


  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecret(Boolean secret) {
    this.secret = secret;
  }


  public ConfigPropertyRepresentationDto type(String type) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigPropertyRepresentationDto configPropertyRepresentation = (ConfigPropertyRepresentationDto) o;
    return Objects.equals(this.defaultValue, configPropertyRepresentation.defaultValue) &&
        Objects.equals(this.helpText, configPropertyRepresentation.helpText) &&
        Objects.equals(this.label, configPropertyRepresentation.label) &&
        Objects.equals(this.name, configPropertyRepresentation.name) &&
        Objects.equals(this.options, configPropertyRepresentation.options) &&
        Objects.equals(this.readOnly, configPropertyRepresentation.readOnly) &&
        Objects.equals(this.secret, configPropertyRepresentation.secret) &&
        Objects.equals(this.type, configPropertyRepresentation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, helpText, label, name, options, readOnly, secret, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigPropertyRepresentationDto {\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * IdentityProviderMapperRepresentationDto
 */
@JsonPropertyOrder({
  IdentityProviderMapperRepresentationDto.JSON_PROPERTY_CONFIG,
  IdentityProviderMapperRepresentationDto.JSON_PROPERTY_ID,
  IdentityProviderMapperRepresentationDto.JSON_PROPERTY_IDENTITY_PROVIDER_ALIAS,
  IdentityProviderMapperRepresentationDto.JSON_PROPERTY_IDENTITY_PROVIDER_MAPPER,
  IdentityProviderMapperRepresentationDto.JSON_PROPERTY_NAME
})
@JsonTypeName("IdentityProviderMapperRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentityProviderMapperRepresentationDto {
  public static final String JSON_PROPERTY_CONFIG = "config";
  private Map<String, Object> config = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IDENTITY_PROVIDER_ALIAS = "identityProviderAlias";
  private String identityProviderAlias;

  public static final String JSON_PROPERTY_IDENTITY_PROVIDER_MAPPER = "identityProviderMapper";
  private String identityProviderMapper;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public IdentityProviderMapperRepresentationDto() {
  }

  public IdentityProviderMapperRepresentationDto config(Map<String, Object> config) {
    
    this.config = config;
    return this;
  }

  public IdentityProviderMapperRepresentationDto putConfigItem(String key, Object configItem) {
    if (this.config == null) {
      this.config = new HashMap<>();
    }
    this.config.put(key, configItem);
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getConfig() {
    return config;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfig(Map<String, Object> config) {
    this.config = config;
  }


  public IdentityProviderMapperRepresentationDto id(String id) {
    
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


  public IdentityProviderMapperRepresentationDto identityProviderAlias(String identityProviderAlias) {
    
    this.identityProviderAlias = identityProviderAlias;
    return this;
  }

   /**
   * Get identityProviderAlias
   * @return identityProviderAlias
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_IDENTITY_PROVIDER_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentityProviderAlias() {
    return identityProviderAlias;
  }


  @JsonProperty(JSON_PROPERTY_IDENTITY_PROVIDER_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentityProviderAlias(String identityProviderAlias) {
    this.identityProviderAlias = identityProviderAlias;
  }


  public IdentityProviderMapperRepresentationDto identityProviderMapper(String identityProviderMapper) {
    
    this.identityProviderMapper = identityProviderMapper;
    return this;
  }

   /**
   * Get identityProviderMapper
   * @return identityProviderMapper
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_IDENTITY_PROVIDER_MAPPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentityProviderMapper() {
    return identityProviderMapper;
  }


  @JsonProperty(JSON_PROPERTY_IDENTITY_PROVIDER_MAPPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentityProviderMapper(String identityProviderMapper) {
    this.identityProviderMapper = identityProviderMapper;
  }


  public IdentityProviderMapperRepresentationDto name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityProviderMapperRepresentationDto identityProviderMapperRepresentation = (IdentityProviderMapperRepresentationDto) o;
    return Objects.equals(this.config, identityProviderMapperRepresentation.config) &&
        Objects.equals(this.id, identityProviderMapperRepresentation.id) &&
        Objects.equals(this.identityProviderAlias, identityProviderMapperRepresentation.identityProviderAlias) &&
        Objects.equals(this.identityProviderMapper, identityProviderMapperRepresentation.identityProviderMapper) &&
        Objects.equals(this.name, identityProviderMapperRepresentation.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, id, identityProviderAlias, identityProviderMapper, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityProviderMapperRepresentationDto {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identityProviderAlias: ").append(toIndentedString(identityProviderAlias)).append("\n");
    sb.append("    identityProviderMapper: ").append(toIndentedString(identityProviderMapper)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


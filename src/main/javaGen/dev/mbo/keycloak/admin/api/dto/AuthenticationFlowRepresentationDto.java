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
import dev.mbo.keycloak.admin.api.dto.AuthenticationExecutionExportRepresentationDto;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * AuthenticationFlowRepresentationDto
 */
@JsonPropertyOrder({
  AuthenticationFlowRepresentationDto.JSON_PROPERTY_ALIAS,
  AuthenticationFlowRepresentationDto.JSON_PROPERTY_AUTHENTICATION_EXECUTIONS,
  AuthenticationFlowRepresentationDto.JSON_PROPERTY_BUILT_IN,
  AuthenticationFlowRepresentationDto.JSON_PROPERTY_DESCRIPTION,
  AuthenticationFlowRepresentationDto.JSON_PROPERTY_ID,
  AuthenticationFlowRepresentationDto.JSON_PROPERTY_PROVIDER_ID,
  AuthenticationFlowRepresentationDto.JSON_PROPERTY_TOP_LEVEL
})
@JsonTypeName("AuthenticationFlowRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthenticationFlowRepresentationDto {
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_AUTHENTICATION_EXECUTIONS = "authenticationExecutions";
  private List<AuthenticationExecutionExportRepresentationDto> authenticationExecutions = null;

  public static final String JSON_PROPERTY_BUILT_IN = "builtIn";
  private Boolean builtIn;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PROVIDER_ID = "providerId";
  private String providerId;

  public static final String JSON_PROPERTY_TOP_LEVEL = "topLevel";
  private Boolean topLevel;

  public AuthenticationFlowRepresentationDto() {
  }

  public AuthenticationFlowRepresentationDto alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlias() {
    return alias;
  }


  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlias(String alias) {
    this.alias = alias;
  }


  public AuthenticationFlowRepresentationDto authenticationExecutions(List<AuthenticationExecutionExportRepresentationDto> authenticationExecutions) {
    
    this.authenticationExecutions = authenticationExecutions;
    return this;
  }

  public AuthenticationFlowRepresentationDto addAuthenticationExecutionsItem(AuthenticationExecutionExportRepresentationDto authenticationExecutionsItem) {
    if (this.authenticationExecutions == null) {
      this.authenticationExecutions = new ArrayList<>();
    }
    this.authenticationExecutions.add(authenticationExecutionsItem);
    return this;
  }

   /**
   * Get authenticationExecutions
   * @return authenticationExecutions
  **/
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_EXECUTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AuthenticationExecutionExportRepresentationDto> getAuthenticationExecutions() {
    return authenticationExecutions;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_EXECUTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationExecutions(List<AuthenticationExecutionExportRepresentationDto> authenticationExecutions) {
    this.authenticationExecutions = authenticationExecutions;
  }


  public AuthenticationFlowRepresentationDto builtIn(Boolean builtIn) {
    
    this.builtIn = builtIn;
    return this;
  }

   /**
   * Get builtIn
   * @return builtIn
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_BUILT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBuiltIn() {
    return builtIn;
  }


  @JsonProperty(JSON_PROPERTY_BUILT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuiltIn(Boolean builtIn) {
    this.builtIn = builtIn;
  }


  public AuthenticationFlowRepresentationDto description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AuthenticationFlowRepresentationDto id(String id) {
    
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


  public AuthenticationFlowRepresentationDto providerId(String providerId) {
    
    this.providerId = providerId;
    return this;
  }

   /**
   * Get providerId
   * @return providerId
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderId() {
    return providerId;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }


  public AuthenticationFlowRepresentationDto topLevel(Boolean topLevel) {
    
    this.topLevel = topLevel;
    return this;
  }

   /**
   * Get topLevel
   * @return topLevel
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_TOP_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTopLevel() {
    return topLevel;
  }


  @JsonProperty(JSON_PROPERTY_TOP_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopLevel(Boolean topLevel) {
    this.topLevel = topLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationFlowRepresentationDto authenticationFlowRepresentation = (AuthenticationFlowRepresentationDto) o;
    return Objects.equals(this.alias, authenticationFlowRepresentation.alias) &&
        Objects.equals(this.authenticationExecutions, authenticationFlowRepresentation.authenticationExecutions) &&
        Objects.equals(this.builtIn, authenticationFlowRepresentation.builtIn) &&
        Objects.equals(this.description, authenticationFlowRepresentation.description) &&
        Objects.equals(this.id, authenticationFlowRepresentation.id) &&
        Objects.equals(this.providerId, authenticationFlowRepresentation.providerId) &&
        Objects.equals(this.topLevel, authenticationFlowRepresentation.topLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, authenticationExecutions, builtIn, description, id, providerId, topLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationFlowRepresentationDto {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    authenticationExecutions: ").append(toIndentedString(authenticationExecutions)).append("\n");
    sb.append("    builtIn: ").append(toIndentedString(builtIn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    topLevel: ").append(toIndentedString(topLevel)).append("\n");
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


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
 * AuthenticationExecutionExportRepresentationDto
 */
@JsonPropertyOrder({
  AuthenticationExecutionExportRepresentationDto.JSON_PROPERTY_AUTHENTICATOR,
  AuthenticationExecutionExportRepresentationDto.JSON_PROPERTY_AUTHENTICATOR_CONFIG,
  AuthenticationExecutionExportRepresentationDto.JSON_PROPERTY_AUTHENTICATOR_FLOW,
  AuthenticationExecutionExportRepresentationDto.JSON_PROPERTY_FLOW_ALIAS,
  AuthenticationExecutionExportRepresentationDto.JSON_PROPERTY_PRIORITY,
  AuthenticationExecutionExportRepresentationDto.JSON_PROPERTY_REQUIREMENT,
  AuthenticationExecutionExportRepresentationDto.JSON_PROPERTY_USER_SETUP_ALLOWED
})
@JsonTypeName("AuthenticationExecutionExportRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthenticationExecutionExportRepresentationDto {
  public static final String JSON_PROPERTY_AUTHENTICATOR = "authenticator";
  private String authenticator;

  public static final String JSON_PROPERTY_AUTHENTICATOR_CONFIG = "authenticatorConfig";
  private String authenticatorConfig;

  public static final String JSON_PROPERTY_AUTHENTICATOR_FLOW = "authenticatorFlow";
  private Boolean authenticatorFlow;

  public static final String JSON_PROPERTY_FLOW_ALIAS = "flowAlias";
  private String flowAlias;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public static final String JSON_PROPERTY_REQUIREMENT = "requirement";
  private String requirement;

  public static final String JSON_PROPERTY_USER_SETUP_ALLOWED = "userSetupAllowed";
  private Boolean userSetupAllowed;

  public AuthenticationExecutionExportRepresentationDto() {
  }

  public AuthenticationExecutionExportRepresentationDto authenticator(String authenticator) {
    
    this.authenticator = authenticator;
    return this;
  }

   /**
   * Get authenticator
   * @return authenticator
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_AUTHENTICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthenticator() {
    return authenticator;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticator(String authenticator) {
    this.authenticator = authenticator;
  }


  public AuthenticationExecutionExportRepresentationDto authenticatorConfig(String authenticatorConfig) {
    
    this.authenticatorConfig = authenticatorConfig;
    return this;
  }

   /**
   * Get authenticatorConfig
   * @return authenticatorConfig
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_AUTHENTICATOR_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthenticatorConfig() {
    return authenticatorConfig;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATOR_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticatorConfig(String authenticatorConfig) {
    this.authenticatorConfig = authenticatorConfig;
  }


  public AuthenticationExecutionExportRepresentationDto authenticatorFlow(Boolean authenticatorFlow) {
    
    this.authenticatorFlow = authenticatorFlow;
    return this;
  }

   /**
   * Get authenticatorFlow
   * @return authenticatorFlow
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_AUTHENTICATOR_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAuthenticatorFlow() {
    return authenticatorFlow;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATOR_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticatorFlow(Boolean authenticatorFlow) {
    this.authenticatorFlow = authenticatorFlow;
  }


  public AuthenticationExecutionExportRepresentationDto flowAlias(String flowAlias) {
    
    this.flowAlias = flowAlias;
    return this;
  }

   /**
   * Get flowAlias
   * @return flowAlias
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_FLOW_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFlowAlias() {
    return flowAlias;
  }


  @JsonProperty(JSON_PROPERTY_FLOW_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlowAlias(String flowAlias) {
    this.flowAlias = flowAlias;
  }


  public AuthenticationExecutionExportRepresentationDto priority(Integer priority) {
    
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


  public AuthenticationExecutionExportRepresentationDto requirement(String requirement) {
    
    this.requirement = requirement;
    return this;
  }

   /**
   * Get requirement
   * @return requirement
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_REQUIREMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequirement() {
    return requirement;
  }


  @JsonProperty(JSON_PROPERTY_REQUIREMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequirement(String requirement) {
    this.requirement = requirement;
  }


  public AuthenticationExecutionExportRepresentationDto userSetupAllowed(Boolean userSetupAllowed) {
    
    this.userSetupAllowed = userSetupAllowed;
    return this;
  }

   /**
   * Get userSetupAllowed
   * @return userSetupAllowed
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_USER_SETUP_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUserSetupAllowed() {
    return userSetupAllowed;
  }


  @JsonProperty(JSON_PROPERTY_USER_SETUP_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserSetupAllowed(Boolean userSetupAllowed) {
    this.userSetupAllowed = userSetupAllowed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationExecutionExportRepresentationDto authenticationExecutionExportRepresentation = (AuthenticationExecutionExportRepresentationDto) o;
    return Objects.equals(this.authenticator, authenticationExecutionExportRepresentation.authenticator) &&
        Objects.equals(this.authenticatorConfig, authenticationExecutionExportRepresentation.authenticatorConfig) &&
        Objects.equals(this.authenticatorFlow, authenticationExecutionExportRepresentation.authenticatorFlow) &&
        Objects.equals(this.flowAlias, authenticationExecutionExportRepresentation.flowAlias) &&
        Objects.equals(this.priority, authenticationExecutionExportRepresentation.priority) &&
        Objects.equals(this.requirement, authenticationExecutionExportRepresentation.requirement) &&
        Objects.equals(this.userSetupAllowed, authenticationExecutionExportRepresentation.userSetupAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticator, authenticatorConfig, authenticatorFlow, flowAlias, priority, requirement, userSetupAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationExecutionExportRepresentationDto {\n");
    sb.append("    authenticator: ").append(toIndentedString(authenticator)).append("\n");
    sb.append("    authenticatorConfig: ").append(toIndentedString(authenticatorConfig)).append("\n");
    sb.append("    authenticatorFlow: ").append(toIndentedString(authenticatorFlow)).append("\n");
    sb.append("    flowAlias: ").append(toIndentedString(flowAlias)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requirement: ").append(toIndentedString(requirement)).append("\n");
    sb.append("    userSetupAllowed: ").append(toIndentedString(userSetupAllowed)).append("\n");
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


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
 * AuthenticationExecutionRepresentationDto
 */
@JsonPropertyOrder({
  AuthenticationExecutionRepresentationDto.JSON_PROPERTY_AUTHENTICATOR,
  AuthenticationExecutionRepresentationDto.JSON_PROPERTY_AUTHENTICATOR_CONFIG,
  AuthenticationExecutionRepresentationDto.JSON_PROPERTY_AUTHENTICATOR_FLOW,
  AuthenticationExecutionRepresentationDto.JSON_PROPERTY_FLOW_ID,
  AuthenticationExecutionRepresentationDto.JSON_PROPERTY_ID,
  AuthenticationExecutionRepresentationDto.JSON_PROPERTY_PARENT_FLOW,
  AuthenticationExecutionRepresentationDto.JSON_PROPERTY_PRIORITY,
  AuthenticationExecutionRepresentationDto.JSON_PROPERTY_REQUIREMENT
})
@JsonTypeName("AuthenticationExecutionRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthenticationExecutionRepresentationDto {
  public static final String JSON_PROPERTY_AUTHENTICATOR = "authenticator";
  private String authenticator;

  public static final String JSON_PROPERTY_AUTHENTICATOR_CONFIG = "authenticatorConfig";
  private String authenticatorConfig;

  public static final String JSON_PROPERTY_AUTHENTICATOR_FLOW = "authenticatorFlow";
  private Boolean authenticatorFlow;

  public static final String JSON_PROPERTY_FLOW_ID = "flowId";
  private String flowId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PARENT_FLOW = "parentFlow";
  private String parentFlow;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public static final String JSON_PROPERTY_REQUIREMENT = "requirement";
  private String requirement;

  public AuthenticationExecutionRepresentationDto() {
  }

  public AuthenticationExecutionRepresentationDto authenticator(String authenticator) {
    
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


  public AuthenticationExecutionRepresentationDto authenticatorConfig(String authenticatorConfig) {
    
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


  public AuthenticationExecutionRepresentationDto authenticatorFlow(Boolean authenticatorFlow) {
    
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


  public AuthenticationExecutionRepresentationDto flowId(String flowId) {
    
    this.flowId = flowId;
    return this;
  }

   /**
   * Get flowId
   * @return flowId
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_FLOW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFlowId() {
    return flowId;
  }


  @JsonProperty(JSON_PROPERTY_FLOW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }


  public AuthenticationExecutionRepresentationDto id(String id) {
    
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


  public AuthenticationExecutionRepresentationDto parentFlow(String parentFlow) {
    
    this.parentFlow = parentFlow;
    return this;
  }

   /**
   * Get parentFlow
   * @return parentFlow
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PARENT_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentFlow() {
    return parentFlow;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentFlow(String parentFlow) {
    this.parentFlow = parentFlow;
  }


  public AuthenticationExecutionRepresentationDto priority(Integer priority) {
    
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


  public AuthenticationExecutionRepresentationDto requirement(String requirement) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationExecutionRepresentationDto authenticationExecutionRepresentation = (AuthenticationExecutionRepresentationDto) o;
    return Objects.equals(this.authenticator, authenticationExecutionRepresentation.authenticator) &&
        Objects.equals(this.authenticatorConfig, authenticationExecutionRepresentation.authenticatorConfig) &&
        Objects.equals(this.authenticatorFlow, authenticationExecutionRepresentation.authenticatorFlow) &&
        Objects.equals(this.flowId, authenticationExecutionRepresentation.flowId) &&
        Objects.equals(this.id, authenticationExecutionRepresentation.id) &&
        Objects.equals(this.parentFlow, authenticationExecutionRepresentation.parentFlow) &&
        Objects.equals(this.priority, authenticationExecutionRepresentation.priority) &&
        Objects.equals(this.requirement, authenticationExecutionRepresentation.requirement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticator, authenticatorConfig, authenticatorFlow, flowId, id, parentFlow, priority, requirement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationExecutionRepresentationDto {\n");
    sb.append("    authenticator: ").append(toIndentedString(authenticator)).append("\n");
    sb.append("    authenticatorConfig: ").append(toIndentedString(authenticatorConfig)).append("\n");
    sb.append("    authenticatorFlow: ").append(toIndentedString(authenticatorFlow)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentFlow: ").append(toIndentedString(parentFlow)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requirement: ").append(toIndentedString(requirement)).append("\n");
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


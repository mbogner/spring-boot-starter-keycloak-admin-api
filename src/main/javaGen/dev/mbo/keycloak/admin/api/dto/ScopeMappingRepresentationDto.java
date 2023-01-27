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
 * ScopeMappingRepresentationDto
 */
@JsonPropertyOrder({
  ScopeMappingRepresentationDto.JSON_PROPERTY_CLIENT,
  ScopeMappingRepresentationDto.JSON_PROPERTY_CLIENT_SCOPE,
  ScopeMappingRepresentationDto.JSON_PROPERTY_ROLES,
  ScopeMappingRepresentationDto.JSON_PROPERTY_SELF
})
@JsonTypeName("ScopeMappingRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScopeMappingRepresentationDto {
  public static final String JSON_PROPERTY_CLIENT = "client";
  private String client;

  public static final String JSON_PROPERTY_CLIENT_SCOPE = "clientScope";
  private String clientScope;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<String> roles = null;

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public ScopeMappingRepresentationDto() {
  }

  public ScopeMappingRepresentationDto client(String client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CLIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClient() {
    return client;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClient(String client) {
    this.client = client;
  }


  public ScopeMappingRepresentationDto clientScope(String clientScope) {
    
    this.clientScope = clientScope;
    return this;
  }

   /**
   * Get clientScope
   * @return clientScope
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CLIENT_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientScope() {
    return clientScope;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientScope(String clientScope) {
    this.clientScope = clientScope;
  }


  public ScopeMappingRepresentationDto roles(List<String> roles) {
    
    this.roles = roles;
    return this;
  }

  public ScopeMappingRepresentationDto addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  public ScopeMappingRepresentationDto self(String self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSelf() {
    return self;
  }


  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelf(String self) {
    this.self = self;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScopeMappingRepresentationDto scopeMappingRepresentation = (ScopeMappingRepresentationDto) o;
    return Objects.equals(this.client, scopeMappingRepresentation.client) &&
        Objects.equals(this.clientScope, scopeMappingRepresentation.clientScope) &&
        Objects.equals(this.roles, scopeMappingRepresentation.roles) &&
        Objects.equals(this.self, scopeMappingRepresentation.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, clientScope, roles, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScopeMappingRepresentationDto {\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    clientScope: ").append(toIndentedString(clientScope)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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


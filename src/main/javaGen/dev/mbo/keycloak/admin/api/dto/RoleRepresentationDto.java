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
import dev.mbo.keycloak.admin.api.dto.RoleRepresentationCompositesDto;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * RoleRepresentationDto
 */
@JsonPropertyOrder({
  RoleRepresentationDto.JSON_PROPERTY_ATTRIBUTES,
  RoleRepresentationDto.JSON_PROPERTY_CLIENT_ROLE,
  RoleRepresentationDto.JSON_PROPERTY_COMPOSITE,
  RoleRepresentationDto.JSON_PROPERTY_COMPOSITES,
  RoleRepresentationDto.JSON_PROPERTY_CONTAINER_ID,
  RoleRepresentationDto.JSON_PROPERTY_DESCRIPTION,
  RoleRepresentationDto.JSON_PROPERTY_ID,
  RoleRepresentationDto.JSON_PROPERTY_NAME
})
@JsonTypeName("RoleRepresentation")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoleRepresentationDto {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = null;

  public static final String JSON_PROPERTY_CLIENT_ROLE = "clientRole";
  private Boolean clientRole;

  public static final String JSON_PROPERTY_COMPOSITE = "composite";
  private Boolean composite;

  public static final String JSON_PROPERTY_COMPOSITES = "composites";
  private RoleRepresentationCompositesDto composites;

  public static final String JSON_PROPERTY_CONTAINER_ID = "containerId";
  private String containerId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public RoleRepresentationDto() {
  }

  public RoleRepresentationDto attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public RoleRepresentationDto putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public RoleRepresentationDto clientRole(Boolean clientRole) {
    
    this.clientRole = clientRole;
    return this;
  }

   /**
   * Get clientRole
   * @return clientRole
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CLIENT_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getClientRole() {
    return clientRole;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientRole(Boolean clientRole) {
    this.clientRole = clientRole;
  }


  public RoleRepresentationDto composite(Boolean composite) {
    
    this.composite = composite;
    return this;
  }

   /**
   * Get composite
   * @return composite
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_COMPOSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getComposite() {
    return composite;
  }


  @JsonProperty(JSON_PROPERTY_COMPOSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComposite(Boolean composite) {
    this.composite = composite;
  }


  public RoleRepresentationDto composites(RoleRepresentationCompositesDto composites) {
    
    this.composites = composites;
    return this;
  }

   /**
   * Get composites
   * @return composites
  **/
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_COMPOSITES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleRepresentationCompositesDto getComposites() {
    return composites;
  }


  @JsonProperty(JSON_PROPERTY_COMPOSITES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComposites(RoleRepresentationCompositesDto composites) {
    this.composites = composites;
  }


  public RoleRepresentationDto containerId(String containerId) {
    
    this.containerId = containerId;
    return this;
  }

   /**
   * Get containerId
   * @return containerId
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CONTAINER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContainerId() {
    return containerId;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }


  public RoleRepresentationDto description(String description) {
    
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


  public RoleRepresentationDto id(String id) {
    
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


  public RoleRepresentationDto name(String name) {
    
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
    RoleRepresentationDto roleRepresentation = (RoleRepresentationDto) o;
    return Objects.equals(this.attributes, roleRepresentation.attributes) &&
        Objects.equals(this.clientRole, roleRepresentation.clientRole) &&
        Objects.equals(this.composite, roleRepresentation.composite) &&
        Objects.equals(this.composites, roleRepresentation.composites) &&
        Objects.equals(this.containerId, roleRepresentation.containerId) &&
        Objects.equals(this.description, roleRepresentation.description) &&
        Objects.equals(this.id, roleRepresentation.id) &&
        Objects.equals(this.name, roleRepresentation.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, clientRole, composite, composites, containerId, description, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleRepresentationDto {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    clientRole: ").append(toIndentedString(clientRole)).append("\n");
    sb.append("    composite: ").append(toIndentedString(composite)).append("\n");
    sb.append("    composites: ").append(toIndentedString(composites)).append("\n");
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


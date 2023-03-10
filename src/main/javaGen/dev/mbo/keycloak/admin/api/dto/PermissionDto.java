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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * PermissionDto
 */
@JsonPropertyOrder({
  PermissionDto.JSON_PROPERTY_CLAIMS,
  PermissionDto.JSON_PROPERTY_RSID,
  PermissionDto.JSON_PROPERTY_RSNAME,
  PermissionDto.JSON_PROPERTY_SCOPES
})
@JsonTypeName("Permission")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PermissionDto {
  public static final String JSON_PROPERTY_CLAIMS = "claims";
  private Map<String, Object> claims = null;

  public static final String JSON_PROPERTY_RSID = "rsid";
  private String rsid;

  public static final String JSON_PROPERTY_RSNAME = "rsname";
  private String rsname;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private List<String> scopes = null;

  public PermissionDto() {
  }

  public PermissionDto claims(Map<String, Object> claims) {
    
    this.claims = claims;
    return this;
  }

  public PermissionDto putClaimsItem(String key, Object claimsItem) {
    if (this.claims == null) {
      this.claims = new HashMap<>();
    }
    this.claims.put(key, claimsItem);
    return this;
  }

   /**
   * Get claims
   * @return claims
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CLAIMS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getClaims() {
    return claims;
  }


  @JsonProperty(JSON_PROPERTY_CLAIMS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setClaims(Map<String, Object> claims) {
    this.claims = claims;
  }


  public PermissionDto rsid(String rsid) {
    
    this.rsid = rsid;
    return this;
  }

   /**
   * Get rsid
   * @return rsid
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_RSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRsid() {
    return rsid;
  }


  @JsonProperty(JSON_PROPERTY_RSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRsid(String rsid) {
    this.rsid = rsid;
  }


  public PermissionDto rsname(String rsname) {
    
    this.rsname = rsname;
    return this;
  }

   /**
   * Get rsname
   * @return rsname
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_RSNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRsname() {
    return rsname;
  }


  @JsonProperty(JSON_PROPERTY_RSNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRsname(String rsname) {
    this.rsname = rsname;
  }


  public PermissionDto scopes(List<String> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public PermissionDto addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getScopes() {
    return scopes;
  }


  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionDto permission = (PermissionDto) o;
    return Objects.equals(this.claims, permission.claims) &&
        Objects.equals(this.rsid, permission.rsid) &&
        Objects.equals(this.rsname, permission.rsname) &&
        Objects.equals(this.scopes, permission.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claims, rsid, rsname, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionDto {\n");
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
    sb.append("    rsid: ").append(toIndentedString(rsid)).append("\n");
    sb.append("    rsname: ").append(toIndentedString(rsname)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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


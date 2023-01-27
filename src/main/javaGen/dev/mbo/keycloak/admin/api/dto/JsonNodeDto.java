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
 * JsonNodeDto
 */
@JsonPropertyOrder({
  JsonNodeDto.JSON_PROPERTY_ARRAY,
  JsonNodeDto.JSON_PROPERTY_BIG_DECIMAL,
  JsonNodeDto.JSON_PROPERTY_BIG_INTEGER,
  JsonNodeDto.JSON_PROPERTY_BINARY,
  JsonNodeDto.JSON_PROPERTY_BOOLEAN,
  JsonNodeDto.JSON_PROPERTY_CONTAINER_NODE,
  JsonNodeDto.JSON_PROPERTY_DOUBLE,
  JsonNodeDto.JSON_PROPERTY_EMPTY,
  JsonNodeDto.JSON_PROPERTY_FLOAT,
  JsonNodeDto.JSON_PROPERTY_FLOATING_POINT_NUMBER,
  JsonNodeDto.JSON_PROPERTY_INT,
  JsonNodeDto.JSON_PROPERTY_INTEGRAL_NUMBER,
  JsonNodeDto.JSON_PROPERTY_LONG,
  JsonNodeDto.JSON_PROPERTY_MISSING_NODE,
  JsonNodeDto.JSON_PROPERTY_NODE_TYPE,
  JsonNodeDto.JSON_PROPERTY_NULL,
  JsonNodeDto.JSON_PROPERTY_NUMBER,
  JsonNodeDto.JSON_PROPERTY_OBJECT,
  JsonNodeDto.JSON_PROPERTY_POJO,
  JsonNodeDto.JSON_PROPERTY_SHORT,
  JsonNodeDto.JSON_PROPERTY_TEXTUAL,
  JsonNodeDto.JSON_PROPERTY_VALUE_NODE
})
@JsonTypeName("JsonNode")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JsonNodeDto {
  public static final String JSON_PROPERTY_ARRAY = "array";
  private Boolean array;

  public static final String JSON_PROPERTY_BIG_DECIMAL = "bigDecimal";
  private Boolean bigDecimal;

  public static final String JSON_PROPERTY_BIG_INTEGER = "bigInteger";
  private Boolean bigInteger;

  public static final String JSON_PROPERTY_BINARY = "binary";
  private Boolean binary;

  public static final String JSON_PROPERTY_BOOLEAN = "boolean";
  private Boolean _boolean;

  public static final String JSON_PROPERTY_CONTAINER_NODE = "containerNode";
  private Boolean containerNode;

  public static final String JSON_PROPERTY_DOUBLE = "double";
  private Boolean _double;

  public static final String JSON_PROPERTY_EMPTY = "empty";
  private Boolean empty;

  public static final String JSON_PROPERTY_FLOAT = "float";
  private Boolean _float;

  public static final String JSON_PROPERTY_FLOATING_POINT_NUMBER = "floatingPointNumber";
  private Boolean floatingPointNumber;

  public static final String JSON_PROPERTY_INT = "int";
  private Boolean _int;

  public static final String JSON_PROPERTY_INTEGRAL_NUMBER = "integralNumber";
  private Boolean integralNumber;

  public static final String JSON_PROPERTY_LONG = "long";
  private Boolean _long;

  public static final String JSON_PROPERTY_MISSING_NODE = "missingNode";
  private Boolean missingNode;

  /**
   * Gets or Sets nodeType
   */
  public enum NodeTypeEnum {
    ARRAY("ARRAY"),
    
    BINARY("BINARY"),
    
    BOOLEAN("BOOLEAN"),
    
    MISSING("MISSING"),
    
    NULL("NULL"),
    
    NUMBER("NUMBER"),
    
    OBJECT("OBJECT"),
    
    POJO("POJO"),
    
    STRING("STRING");

    private String value;

    NodeTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NodeTypeEnum fromValue(String value) {
      for (NodeTypeEnum b : NodeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NODE_TYPE = "nodeType";
  private NodeTypeEnum nodeType;

  public static final String JSON_PROPERTY_NULL = "null";
  private Boolean _null;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private Boolean number;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private Boolean _object;

  public static final String JSON_PROPERTY_POJO = "pojo";
  private Boolean pojo;

  public static final String JSON_PROPERTY_SHORT = "short";
  private Boolean _short;

  public static final String JSON_PROPERTY_TEXTUAL = "textual";
  private Boolean textual;

  public static final String JSON_PROPERTY_VALUE_NODE = "valueNode";
  private Boolean valueNode;

  public JsonNodeDto() {
  }

  public JsonNodeDto array(Boolean array) {
    
    this.array = array;
    return this;
  }

   /**
   * Get array
   * @return array
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getArray() {
    return array;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArray(Boolean array) {
    this.array = array;
  }


  public JsonNodeDto bigDecimal(Boolean bigDecimal) {
    
    this.bigDecimal = bigDecimal;
    return this;
  }

   /**
   * Get bigDecimal
   * @return bigDecimal
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_BIG_DECIMAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBigDecimal() {
    return bigDecimal;
  }


  @JsonProperty(JSON_PROPERTY_BIG_DECIMAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBigDecimal(Boolean bigDecimal) {
    this.bigDecimal = bigDecimal;
  }


  public JsonNodeDto bigInteger(Boolean bigInteger) {
    
    this.bigInteger = bigInteger;
    return this;
  }

   /**
   * Get bigInteger
   * @return bigInteger
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_BIG_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBigInteger() {
    return bigInteger;
  }


  @JsonProperty(JSON_PROPERTY_BIG_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBigInteger(Boolean bigInteger) {
    this.bigInteger = bigInteger;
  }


  public JsonNodeDto binary(Boolean binary) {
    
    this.binary = binary;
    return this;
  }

   /**
   * Get binary
   * @return binary
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_BINARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBinary() {
    return binary;
  }


  @JsonProperty(JSON_PROPERTY_BINARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinary(Boolean binary) {
    this.binary = binary;
  }


  public JsonNodeDto _boolean(Boolean _boolean) {
    
    this._boolean = _boolean;
    return this;
  }

   /**
   * Get _boolean
   * @return _boolean
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBoolean() {
    return _boolean;
  }


  @JsonProperty(JSON_PROPERTY_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBoolean(Boolean _boolean) {
    this._boolean = _boolean;
  }


  public JsonNodeDto containerNode(Boolean containerNode) {
    
    this.containerNode = containerNode;
    return this;
  }

   /**
   * Get containerNode
   * @return containerNode
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CONTAINER_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainerNode() {
    return containerNode;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINER_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainerNode(Boolean containerNode) {
    this.containerNode = containerNode;
  }


  public JsonNodeDto _double(Boolean _double) {
    
    this._double = _double;
    return this;
  }

   /**
   * Get _double
   * @return _double
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_DOUBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDouble() {
    return _double;
  }


  @JsonProperty(JSON_PROPERTY_DOUBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDouble(Boolean _double) {
    this._double = _double;
  }


  public JsonNodeDto empty(Boolean empty) {
    
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_EMPTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmpty() {
    return empty;
  }


  @JsonProperty(JSON_PROPERTY_EMPTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }


  public JsonNodeDto _float(Boolean _float) {
    
    this._float = _float;
    return this;
  }

   /**
   * Get _float
   * @return _float
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_FLOAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFloat() {
    return _float;
  }


  @JsonProperty(JSON_PROPERTY_FLOAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFloat(Boolean _float) {
    this._float = _float;
  }


  public JsonNodeDto floatingPointNumber(Boolean floatingPointNumber) {
    
    this.floatingPointNumber = floatingPointNumber;
    return this;
  }

   /**
   * Get floatingPointNumber
   * @return floatingPointNumber
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_FLOATING_POINT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFloatingPointNumber() {
    return floatingPointNumber;
  }


  @JsonProperty(JSON_PROPERTY_FLOATING_POINT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFloatingPointNumber(Boolean floatingPointNumber) {
    this.floatingPointNumber = floatingPointNumber;
  }


  public JsonNodeDto _int(Boolean _int) {
    
    this._int = _int;
    return this;
  }

   /**
   * Get _int
   * @return _int
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_INT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInt() {
    return _int;
  }


  @JsonProperty(JSON_PROPERTY_INT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInt(Boolean _int) {
    this._int = _int;
  }


  public JsonNodeDto integralNumber(Boolean integralNumber) {
    
    this.integralNumber = integralNumber;
    return this;
  }

   /**
   * Get integralNumber
   * @return integralNumber
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_INTEGRAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIntegralNumber() {
    return integralNumber;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegralNumber(Boolean integralNumber) {
    this.integralNumber = integralNumber;
  }


  public JsonNodeDto _long(Boolean _long) {
    
    this._long = _long;
    return this;
  }

   /**
   * Get _long
   * @return _long
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_LONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLong() {
    return _long;
  }


  @JsonProperty(JSON_PROPERTY_LONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLong(Boolean _long) {
    this._long = _long;
  }


  public JsonNodeDto missingNode(Boolean missingNode) {
    
    this.missingNode = missingNode;
    return this;
  }

   /**
   * Get missingNode
   * @return missingNode
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_MISSING_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMissingNode() {
    return missingNode;
  }


  @JsonProperty(JSON_PROPERTY_MISSING_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMissingNode(Boolean missingNode) {
    this.missingNode = missingNode;
  }


  public JsonNodeDto nodeType(NodeTypeEnum nodeType) {
    
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NodeTypeEnum getNodeType() {
    return nodeType;
  }


  @JsonProperty(JSON_PROPERTY_NODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }


  public JsonNodeDto _null(Boolean _null) {
    
    this._null = _null;
    return this;
  }

   /**
   * Get _null
   * @return _null
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNull() {
    return _null;
  }


  @JsonProperty(JSON_PROPERTY_NULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNull(Boolean _null) {
    this._null = _null;
  }


  public JsonNodeDto number(Boolean number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(Boolean number) {
    this.number = number;
  }


  public JsonNodeDto _object(Boolean _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObject(Boolean _object) {
    this._object = _object;
  }


  public JsonNodeDto pojo(Boolean pojo) {
    
    this.pojo = pojo;
    return this;
  }

   /**
   * Get pojo
   * @return pojo
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_POJO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPojo() {
    return pojo;
  }


  @JsonProperty(JSON_PROPERTY_POJO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPojo(Boolean pojo) {
    this.pojo = pojo;
  }


  public JsonNodeDto _short(Boolean _short) {
    
    this._short = _short;
    return this;
  }

   /**
   * Get _short
   * @return _short
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_SHORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShort() {
    return _short;
  }


  @JsonProperty(JSON_PROPERTY_SHORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShort(Boolean _short) {
    this._short = _short;
  }


  public JsonNodeDto textual(Boolean textual) {
    
    this.textual = textual;
    return this;
  }

   /**
   * Get textual
   * @return textual
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_TEXTUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTextual() {
    return textual;
  }


  @JsonProperty(JSON_PROPERTY_TEXTUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextual(Boolean textual) {
    this.textual = textual;
  }


  public JsonNodeDto valueNode(Boolean valueNode) {
    
    this.valueNode = valueNode;
    return this;
  }

   /**
   * Get valueNode
   * @return valueNode
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_VALUE_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValueNode() {
    return valueNode;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueNode(Boolean valueNode) {
    this.valueNode = valueNode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonNodeDto jsonNode = (JsonNodeDto) o;
    return Objects.equals(this.array, jsonNode.array) &&
        Objects.equals(this.bigDecimal, jsonNode.bigDecimal) &&
        Objects.equals(this.bigInteger, jsonNode.bigInteger) &&
        Objects.equals(this.binary, jsonNode.binary) &&
        Objects.equals(this._boolean, jsonNode._boolean) &&
        Objects.equals(this.containerNode, jsonNode.containerNode) &&
        Objects.equals(this._double, jsonNode._double) &&
        Objects.equals(this.empty, jsonNode.empty) &&
        Objects.equals(this._float, jsonNode._float) &&
        Objects.equals(this.floatingPointNumber, jsonNode.floatingPointNumber) &&
        Objects.equals(this._int, jsonNode._int) &&
        Objects.equals(this.integralNumber, jsonNode.integralNumber) &&
        Objects.equals(this._long, jsonNode._long) &&
        Objects.equals(this.missingNode, jsonNode.missingNode) &&
        Objects.equals(this.nodeType, jsonNode.nodeType) &&
        Objects.equals(this._null, jsonNode._null) &&
        Objects.equals(this.number, jsonNode.number) &&
        Objects.equals(this._object, jsonNode._object) &&
        Objects.equals(this.pojo, jsonNode.pojo) &&
        Objects.equals(this._short, jsonNode._short) &&
        Objects.equals(this.textual, jsonNode.textual) &&
        Objects.equals(this.valueNode, jsonNode.valueNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(array, bigDecimal, bigInteger, binary, _boolean, containerNode, _double, empty, _float, floatingPointNumber, _int, integralNumber, _long, missingNode, nodeType, _null, number, _object, pojo, _short, textual, valueNode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonNodeDto {\n");
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    bigDecimal: ").append(toIndentedString(bigDecimal)).append("\n");
    sb.append("    bigInteger: ").append(toIndentedString(bigInteger)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
    sb.append("    containerNode: ").append(toIndentedString(containerNode)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    floatingPointNumber: ").append(toIndentedString(floatingPointNumber)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    integralNumber: ").append(toIndentedString(integralNumber)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    missingNode: ").append(toIndentedString(missingNode)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    _null: ").append(toIndentedString(_null)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    pojo: ").append(toIndentedString(pojo)).append("\n");
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
    sb.append("    textual: ").append(toIndentedString(textual)).append("\n");
    sb.append("    valueNode: ").append(toIndentedString(valueNode)).append("\n");
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


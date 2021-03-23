/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Details of the parser to use for the global variable. */
@ApiModel(description = "Details of the parser to use for the global variable.")
@JsonPropertyOrder({
  SyntheticsVariableParser.JSON_PROPERTY_TYPE,
  SyntheticsVariableParser.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsVariableParser {
  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsGlobalVariableParserType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public SyntheticsVariableParser type(SyntheticsGlobalVariableParserType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsGlobalVariableParserType getType() {
    return type;
  }

  public void setType(SyntheticsGlobalVariableParserType type) {
    this.type = type;
  }

  public SyntheticsVariableParser value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Regex or JSON path used for the parser. Not used with type &#x60;raw&#x60;.
   *
   * @return value
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Regex or JSON path used for the parser. Not used with type `raw`.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this SyntheticsVariableParser object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsVariableParser syntheticsVariableParser = (SyntheticsVariableParser) o;
    return Objects.equals(this.type, syntheticsVariableParser.type)
        && Objects.equals(this.value, syntheticsVariableParser.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsVariableParser {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
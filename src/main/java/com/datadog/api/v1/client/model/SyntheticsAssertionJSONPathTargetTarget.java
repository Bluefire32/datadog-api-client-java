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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Composed target for &#x60;validatesJSONPath&#x60; operator.
 */
@ApiModel(description = "Composed target for `validatesJSONPath` operator.")
@JsonPropertyOrder({
  SyntheticsAssertionJSONPathTargetTarget.JSON_PROPERTY_JSON_PATH,
  SyntheticsAssertionJSONPathTargetTarget.JSON_PROPERTY_OPERATOR,
  SyntheticsAssertionJSONPathTargetTarget.JSON_PROPERTY_TARGET_VALUE
})

public class SyntheticsAssertionJSONPathTargetTarget {
  public static final String JSON_PROPERTY_JSON_PATH = "jsonPath";
  private String jsonPath;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private String operator;

  public static final String JSON_PROPERTY_TARGET_VALUE = "targetValue";
  private Object targetValue;


  public SyntheticsAssertionJSONPathTargetTarget jsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
    return this;
  }

   /**
   * The JSON path to assert.
   * @return jsonPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The JSON path to assert.")
  @JsonProperty(JSON_PROPERTY_JSON_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJsonPath() {
    return jsonPath;
  }


  public void setJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
  }


  public SyntheticsAssertionJSONPathTargetTarget operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * The specific operator to use on the path.
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The specific operator to use on the path.")
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public SyntheticsAssertionJSONPathTargetTarget targetValue(Object targetValue) {
    this.targetValue = targetValue;
    return this;
  }

   /**
   * The path target value to compare to.
   * @return targetValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The path target value to compare to.")
  @JsonProperty(JSON_PROPERTY_TARGET_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTargetValue() {
    return targetValue;
  }


  public void setTargetValue(Object targetValue) {
    this.targetValue = targetValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAssertionJSONPathTargetTarget syntheticsAssertionJSONPathTargetTarget = (SyntheticsAssertionJSONPathTargetTarget) o;
    return Objects.equals(this.jsonPath, syntheticsAssertionJSONPathTargetTarget.jsonPath) &&
        Objects.equals(this.operator, syntheticsAssertionJSONPathTargetTarget.operator) &&
        Objects.equals(this.targetValue, syntheticsAssertionJSONPathTargetTarget.targetValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonPath, operator, targetValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAssertionJSONPathTargetTarget {\n");
    sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

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
import com.datadog.api.v1.client.model.UsageSpecifiedCustomReportsData;
import com.datadog.api.v1.client.model.UsageSpecifiedCustomReportsMeta;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Returns available specified custom reports.
 */
@ApiModel(description = "Returns available specified custom reports.")
@JsonPropertyOrder({
  UsageSpecifiedCustomReportsResponse.JSON_PROPERTY_DATA,
  UsageSpecifiedCustomReportsResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageSpecifiedCustomReportsResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private UsageSpecifiedCustomReportsData data;

  public static final String JSON_PROPERTY_META = "meta";
  private UsageSpecifiedCustomReportsMeta meta;


  public UsageSpecifiedCustomReportsResponse data(UsageSpecifiedCustomReportsData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageSpecifiedCustomReportsData getData() {
    return data;
  }


  public void setData(UsageSpecifiedCustomReportsData data) {
    this.data = data;
  }


  public UsageSpecifiedCustomReportsResponse meta(UsageSpecifiedCustomReportsMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageSpecifiedCustomReportsMeta getMeta() {
    return meta;
  }


  public void setMeta(UsageSpecifiedCustomReportsMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this UsageSpecifiedCustomReportsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSpecifiedCustomReportsResponse usageSpecifiedCustomReportsResponse = (UsageSpecifiedCustomReportsResponse) o;
    return Objects.equals(this.data, usageSpecifiedCustomReportsResponse.data) &&
        Objects.equals(this.meta, usageSpecifiedCustomReportsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSpecifiedCustomReportsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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


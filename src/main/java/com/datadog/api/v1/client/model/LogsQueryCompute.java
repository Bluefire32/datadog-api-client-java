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
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Define computation for a log query.
 */
@ApiModel(description = "Define computation for a log query.")
@JsonPropertyOrder({
  LogsQueryCompute.JSON_PROPERTY_AGGREGATION,
  LogsQueryCompute.JSON_PROPERTY_FACET,
  LogsQueryCompute.JSON_PROPERTY_INTERVAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsQueryCompute {
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private String aggregation;

  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;


  public LogsQueryCompute aggregation(String aggregation) {
    this.aggregation = aggregation;
    return this;
  }

   /**
   * The aggregation method.
   * @return aggregation
  **/
  @ApiModelProperty(example = "avg", required = true, value = "The aggregation method.")
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAggregation() {
    return aggregation;
  }


  public void setAggregation(String aggregation) {
    this.aggregation = aggregation;
  }


  public LogsQueryCompute facet(String facet) {
    this.facet = facet;
    return this;
  }

   /**
   * Facet name.
   * @return facet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "@duration", value = "Facet name.")
  @JsonProperty(JSON_PROPERTY_FACET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFacet() {
    return facet;
  }


  public void setFacet(String facet) {
    this.facet = facet;
  }


  public LogsQueryCompute interval(Long interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Define a time interval in seconds.
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000", value = "Define a time interval in seconds.")
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInterval() {
    return interval;
  }


  public void setInterval(Long interval) {
    this.interval = interval;
  }


  /**
   * Return true if this LogsQueryCompute object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsQueryCompute logsQueryCompute = (LogsQueryCompute) o;
    return Objects.equals(this.aggregation, logsQueryCompute.aggregation) &&
        Objects.equals(this.facet, logsQueryCompute.facet) &&
        Objects.equals(this.interval, logsQueryCompute.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, facet, interval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsQueryCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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


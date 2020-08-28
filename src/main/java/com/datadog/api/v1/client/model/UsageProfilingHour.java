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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * The number of profiled hosts for each hour for a given organization.
 */
@ApiModel(description = "The number of profiled hosts for each hour for a given organization.")
@JsonPropertyOrder({
  UsageProfilingHour.JSON_PROPERTY_AVG_CONTAINER_AGENT_COUNT,
  UsageProfilingHour.JSON_PROPERTY_HOST_COUNT,
  UsageProfilingHour.JSON_PROPERTY_HOUR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageProfilingHour {
  public static final String JSON_PROPERTY_AVG_CONTAINER_AGENT_COUNT = "avg_container_agent_count";
  private Long avgContainerAgentCount;

  public static final String JSON_PROPERTY_HOST_COUNT = "host_count";
  private Long hostCount;

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;


  public UsageProfilingHour avgContainerAgentCount(Long avgContainerAgentCount) {
    this.avgContainerAgentCount = avgContainerAgentCount;
    return this;
  }

   /**
   * Get average number of container agents for that hour.
   * @return avgContainerAgentCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Get average number of container agents for that hour.")
  @JsonProperty(JSON_PROPERTY_AVG_CONTAINER_AGENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAvgContainerAgentCount() {
    return avgContainerAgentCount;
  }


  public void setAvgContainerAgentCount(Long avgContainerAgentCount) {
    this.avgContainerAgentCount = avgContainerAgentCount;
  }


  public UsageProfilingHour hostCount(Long hostCount) {
    this.hostCount = hostCount;
    return this;
  }

   /**
   * Contains the total number of profiled hosts reporting during a given hour.
   * @return hostCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the total number of profiled hosts reporting during a given hour.")
  @JsonProperty(JSON_PROPERTY_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHostCount() {
    return hostCount;
  }


  public void setHostCount(Long hostCount) {
    this.hostCount = hostCount;
  }


  public UsageProfilingHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

   /**
   * The hour for the usage.
   * @return hour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hour for the usage.")
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getHour() {
    return hour;
  }


  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }


  /**
   * Return true if this UsageProfilingHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageProfilingHour usageProfilingHour = (UsageProfilingHour) o;
    return Objects.equals(this.avgContainerAgentCount, usageProfilingHour.avgContainerAgentCount) &&
        Objects.equals(this.hostCount, usageProfilingHour.hostCount) &&
        Objects.equals(this.hour, usageProfilingHour.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgContainerAgentCount, hostCount, hour);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageProfilingHour {\n");
    sb.append("    avgContainerAgentCount: ").append(toIndentedString(avgContainerAgentCount)).append("\n");
    sb.append("    hostCount: ").append(toIndentedString(hostCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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


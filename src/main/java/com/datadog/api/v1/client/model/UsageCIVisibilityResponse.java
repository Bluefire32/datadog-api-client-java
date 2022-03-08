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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** CI visibility usage response */
@ApiModel(description = "CI visibility usage response")
@JsonPropertyOrder({UsageCIVisibilityResponse.JSON_PROPERTY_USAGE})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageCIVisibilityResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_USAGE = "usage";
  private List<UsageCIVisibilityHour> usage = null;

  public UsageCIVisibilityResponse usage(List<UsageCIVisibilityHour> usage) {
    this.usage = usage;
    for (UsageCIVisibilityHour item : usage) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UsageCIVisibilityResponse addUsageItem(UsageCIVisibilityHour usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    this.unparsed |= usageItem.unparsed;
    return this;
  }

  /**
   * Response containing CI visibility usage.
   *
   * @return usage
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Response containing CI visibility usage.")
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UsageCIVisibilityHour> getUsage() {
    return usage;
  }

  public void setUsage(List<UsageCIVisibilityHour> usage) {
    this.usage = usage;
  }

  /** Return true if this UsageCIVisibilityResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageCIVisibilityResponse usageCIVisibilityResponse = (UsageCIVisibilityResponse) o;
    return Objects.equals(this.usage, usageCIVisibilityResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageCIVisibilityResponse {\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
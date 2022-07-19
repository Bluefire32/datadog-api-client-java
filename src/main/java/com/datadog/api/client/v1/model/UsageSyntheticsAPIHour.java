/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;

/** Number of Synthetics API tests run for each hour for a given organization. */
@JsonPropertyOrder({
  UsageSyntheticsAPIHour.JSON_PROPERTY_CHECK_CALLS_COUNT,
  UsageSyntheticsAPIHour.JSON_PROPERTY_HOUR,
  UsageSyntheticsAPIHour.JSON_PROPERTY_ORG_NAME,
  UsageSyntheticsAPIHour.JSON_PROPERTY_PUBLIC_ID
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageSyntheticsAPIHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHECK_CALLS_COUNT = "check_calls_count";
  private Long checkCallsCount;

  public static final String JSON_PROPERTY_HOUR = "hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageSyntheticsAPIHour checkCallsCount(Long checkCallsCount) {
    this.checkCallsCount = checkCallsCount;
    return this;
  }

  /**
   * Contains the number of Synthetics API tests run.
   *
   * @return checkCallsCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_CALLS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCheckCallsCount() {
    return checkCallsCount;
  }

  public void setCheckCallsCount(Long checkCallsCount) {
    this.checkCallsCount = checkCallsCount;
  }

  public UsageSyntheticsAPIHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * The hour for the usage.
   *
   * @return hour
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getHour() {
    return hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }

  public UsageSyntheticsAPIHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The organization name.
   *
   * @return orgName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UsageSyntheticsAPIHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  /** Return true if this UsageSyntheticsAPIHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSyntheticsAPIHour usageSyntheticsApiHour = (UsageSyntheticsAPIHour) o;
    return Objects.equals(this.checkCallsCount, usageSyntheticsApiHour.checkCallsCount)
        && Objects.equals(this.hour, usageSyntheticsApiHour.hour)
        && Objects.equals(this.orgName, usageSyntheticsApiHour.orgName)
        && Objects.equals(this.publicId, usageSyntheticsApiHour.publicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkCallsCount, hour, orgName, publicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSyntheticsAPIHour {\n");
    sb.append("    checkCallsCount: ").append(toIndentedString(checkCallsCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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
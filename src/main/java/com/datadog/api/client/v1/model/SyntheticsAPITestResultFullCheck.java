/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object describing the API test configuration. */
@JsonPropertyOrder({SyntheticsAPITestResultFullCheck.JSON_PROPERTY_CONFIG})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAPITestResultFullCheck {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG = "config";
  private SyntheticsTestConfig config;

  public SyntheticsAPITestResultFullCheck() {}

  @JsonCreator
  public SyntheticsAPITestResultFullCheck(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG) SyntheticsTestConfig config) {
    this.config = config;
    this.unparsed |= config.unparsed;
  }

  public SyntheticsAPITestResultFullCheck config(SyntheticsTestConfig config) {
    this.config = config;
    this.unparsed |= config.unparsed;
    return this;
  }

  /**
   * Configuration object for a Synthetic test.
   *
   * @return config
   */
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsTestConfig getConfig() {
    return config;
  }

  public void setConfig(SyntheticsTestConfig config) {
    this.config = config;
  }

  /** Return true if this SyntheticsAPITestResultFullCheck object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPITestResultFullCheck syntheticsApiTestResultFullCheck =
        (SyntheticsAPITestResultFullCheck) o;
    return Objects.equals(this.config, syntheticsApiTestResultFullCheck.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAPITestResultFullCheck {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object containing the definition of a metric's distinct volume. */
@JsonPropertyOrder({MetricDistinctVolumeAttributes.JSON_PROPERTY_DISTINCT_VOLUME})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricDistinctVolumeAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISTINCT_VOLUME = "distinct_volume";
  private Long distinctVolume;

  public MetricDistinctVolumeAttributes distinctVolume(Long distinctVolume) {
    this.distinctVolume = distinctVolume;
    return this;
  }

  /**
   * Distinct volume for the given metric.
   *
   * @return distinctVolume
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISTINCT_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDistinctVolume() {
    return distinctVolume;
  }

  public void setDistinctVolume(Long distinctVolume) {
    this.distinctVolume = distinctVolume;
  }

  /** Return true if this MetricDistinctVolumeAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricDistinctVolumeAttributes metricDistinctVolumeAttributes =
        (MetricDistinctVolumeAttributes) o;
    return Objects.equals(this.distinctVolume, metricDistinctVolumeAttributes.distinctVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distinctVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricDistinctVolumeAttributes {\n");
    sb.append("    distinctVolume: ").append(toIndentedString(distinctVolume)).append("\n");
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

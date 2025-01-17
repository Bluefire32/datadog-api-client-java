/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;

/** A timeseries point. */
@JsonPropertyOrder({
  CIAppAggregateBucketValueTimeseriesPoint.JSON_PROPERTY_TIME,
  CIAppAggregateBucketValueTimeseriesPoint.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppAggregateBucketValueTimeseriesPoint {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TIME = "time";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime time;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public CIAppAggregateBucketValueTimeseriesPoint time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * The time value for this point.
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public CIAppAggregateBucketValueTimeseriesPoint value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * The value for this point.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  /** Return true if this CIAppAggregateBucketValueTimeseriesPoint object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppAggregateBucketValueTimeseriesPoint ciAppAggregateBucketValueTimeseriesPoint =
        (CIAppAggregateBucketValueTimeseriesPoint) o;
    return Objects.equals(this.time, ciAppAggregateBucketValueTimeseriesPoint.time)
        && Objects.equals(this.value, ciAppAggregateBucketValueTimeseriesPoint.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppAggregateBucketValueTimeseriesPoint {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

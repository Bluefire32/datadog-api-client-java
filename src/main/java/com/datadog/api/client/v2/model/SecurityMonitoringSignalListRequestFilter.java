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

/** Search filters for listing security signals. */
@JsonPropertyOrder({
  SecurityMonitoringSignalListRequestFilter.JSON_PROPERTY_FROM,
  SecurityMonitoringSignalListRequestFilter.JSON_PROPERTY_QUERY,
  SecurityMonitoringSignalListRequestFilter.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalListRequestFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime from;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TO = "to";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime to;

  public SecurityMonitoringSignalListRequestFilter from(OffsetDateTime from) {
    this.from = from;
    return this;
  }

  /**
   * The minimum timestamp for requested security signals.
   *
   * @return from
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getFrom() {
    return from;
  }

  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }

  public SecurityMonitoringSignalListRequestFilter query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Search query for listing security signals.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public SecurityMonitoringSignalListRequestFilter to(OffsetDateTime to) {
    this.to = to;
    return this;
  }

  /**
   * The maximum timestamp for requested security signals.
   *
   * @return to
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTo() {
    return to;
  }

  public void setTo(OffsetDateTime to) {
    this.to = to;
  }

  /** Return true if this SecurityMonitoringSignalListRequestFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalListRequestFilter securityMonitoringSignalListRequestFilter =
        (SecurityMonitoringSignalListRequestFilter) o;
    return Objects.equals(this.from, securityMonitoringSignalListRequestFilter.from)
        && Objects.equals(this.query, securityMonitoringSignalListRequestFilter.query)
        && Objects.equals(this.to, securityMonitoringSignalListRequestFilter.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, query, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalListRequestFilter {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

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

/** Pagination settings. */
@JsonPropertyOrder({EventsRequestPage.JSON_PROPERTY_CURSOR, EventsRequestPage.JSON_PROPERTY_LIMIT})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsRequestPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURSOR = "cursor";
  private String cursor;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit = 10;

  public EventsRequestPage cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * The returned paging point to use to get the next results.
   *
   * @return cursor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public EventsRequestPage limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The maximum number of logs in the response. maximum: 1000
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /** Return true if this EventsRequestPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsRequestPage eventsRequestPage = (EventsRequestPage) o;
    return Objects.equals(this.cursor, eventsRequestPage.cursor)
        && Objects.equals(this.limit, eventsRequestPage.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsRequestPage {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
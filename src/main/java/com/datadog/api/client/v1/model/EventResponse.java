/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object containing an event response. */
@JsonPropertyOrder({EventResponse.JSON_PROPERTY_EVENT, EventResponse.JSON_PROPERTY_STATUS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT = "event";
  private Event event;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public EventResponse event(Event event) {
    this.event = event;
    this.unparsed |= event.unparsed;
    return this;
  }

  /**
   * Object representing an event.
   *
   * @return event
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  public EventResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * A status.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /** Return true if this EventResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventResponse eventResponse = (EventResponse) o;
    return Objects.equals(this.event, eventResponse.event)
        && Objects.equals(this.status, eventResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResponse {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

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

/** The Slack channel configuration. */
@JsonPropertyOrder({
  SlackIntegrationChannel.JSON_PROPERTY_DISPLAY,
  SlackIntegrationChannel.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SlackIntegrationChannel {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY = "display";
  private SlackIntegrationChannelDisplay display;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public SlackIntegrationChannel display(SlackIntegrationChannelDisplay display) {
    this.display = display;
    this.unparsed |= display.unparsed;
    return this;
  }

  /**
   * Configuration options for what is shown in an alert event message.
   *
   * @return display
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SlackIntegrationChannelDisplay getDisplay() {
    return display;
  }

  public void setDisplay(SlackIntegrationChannelDisplay display) {
    this.display = display;
  }

  public SlackIntegrationChannel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Your channel name.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /** Return true if this SlackIntegrationChannel object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackIntegrationChannel slackIntegrationChannel = (SlackIntegrationChannel) o;
    return Objects.equals(this.display, slackIntegrationChannel.display)
        && Objects.equals(this.name, slackIntegrationChannel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackIntegrationChannel {\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

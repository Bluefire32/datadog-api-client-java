/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The definition of an archive order. */
@JsonPropertyOrder({
  LogsArchiveOrderDefinition.JSON_PROPERTY_ATTRIBUTES,
  LogsArchiveOrderDefinition.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArchiveOrderDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private LogsArchiveOrderAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsArchiveOrderDefinitionType type = LogsArchiveOrderDefinitionType.ARCHIVE_ORDER;

  public LogsArchiveOrderDefinition() {}

  @JsonCreator
  public LogsArchiveOrderDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          LogsArchiveOrderAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          LogsArchiveOrderDefinitionType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsArchiveOrderDefinition attributes(LogsArchiveOrderAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The attributes associated with the archive order.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsArchiveOrderAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(LogsArchiveOrderAttributes attributes) {
    this.attributes = attributes;
  }

  public LogsArchiveOrderDefinition type(LogsArchiveOrderDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the archive order definition.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsArchiveOrderDefinitionType getType() {
    return type;
  }

  public void setType(LogsArchiveOrderDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this LogsArchiveOrderDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveOrderDefinition logsArchiveOrderDefinition = (LogsArchiveOrderDefinition) o;
    return Objects.equals(this.attributes, logsArchiveOrderDefinition.attributes)
        && Objects.equals(this.type, logsArchiveOrderDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveOrderDefinition {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
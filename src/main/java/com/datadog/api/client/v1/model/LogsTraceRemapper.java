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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * There are two ways to improve correlation between application traces and logs.
 *
 * <ol>
 *   <li>
 *       <p>Follow the documentation on <a
 *       href="https://docs.datadoghq.com/tracing/connect_logs_and_traces">how to inject a trace ID
 *       in the application logs</a> and by default log integrations take care of all the rest of
 *       the setup.
 *   <li>
 *       <p>Use the Trace remapper processor to define a log attribute as its associated trace ID.
 * </ol>
 */
@JsonPropertyOrder({
  LogsTraceRemapper.JSON_PROPERTY_IS_ENABLED,
  LogsTraceRemapper.JSON_PROPERTY_NAME,
  LogsTraceRemapper.JSON_PROPERTY_SOURCES,
  LogsTraceRemapper.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsTraceRemapper {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsTraceRemapperType type = LogsTraceRemapperType.TRACE_ID_REMAPPER;

  public LogsTraceRemapper() {}

  @JsonCreator
  public LogsTraceRemapper(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsTraceRemapperType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsTraceRemapper isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the processor is enabled.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public LogsTraceRemapper name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the processor.
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

  public LogsTraceRemapper sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public LogsTraceRemapper addSourcesItem(String sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * Array of source attributes.
   *
   * @return sources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getSources() {
    return sources;
  }

  public void setSources(List<String> sources) {
    this.sources = sources;
  }

  public LogsTraceRemapper type(LogsTraceRemapperType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs trace remapper.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsTraceRemapperType getType() {
    return type;
  }

  public void setType(LogsTraceRemapperType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this LogsTraceRemapper object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsTraceRemapper logsTraceRemapper = (LogsTraceRemapper) o;
    return Objects.equals(this.isEnabled, logsTraceRemapper.isEnabled)
        && Objects.equals(this.name, logsTraceRemapper.name)
        && Objects.equals(this.sources, logsTraceRemapper.sources)
        && Objects.equals(this.type, logsTraceRemapper.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, name, sources, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsTraceRemapper {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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

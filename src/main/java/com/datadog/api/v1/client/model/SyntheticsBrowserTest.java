/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object containing details about a Synthetic browser test. */
@ApiModel(description = "Object containing details about a Synthetic browser test.")
@JsonPropertyOrder({
  SyntheticsBrowserTest.JSON_PROPERTY_CONFIG,
  SyntheticsBrowserTest.JSON_PROPERTY_LOCATIONS,
  SyntheticsBrowserTest.JSON_PROPERTY_MESSAGE,
  SyntheticsBrowserTest.JSON_PROPERTY_MONITOR_ID,
  SyntheticsBrowserTest.JSON_PROPERTY_NAME,
  SyntheticsBrowserTest.JSON_PROPERTY_OPTIONS,
  SyntheticsBrowserTest.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsBrowserTest.JSON_PROPERTY_STATUS,
  SyntheticsBrowserTest.JSON_PROPERTY_STEPS,
  SyntheticsBrowserTest.JSON_PROPERTY_TAGS,
  SyntheticsBrowserTest.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsBrowserTest {
  public static final String JSON_PROPERTY_CONFIG = "config";
  private SyntheticsBrowserTestConfig config;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<String> locations = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private Long monitorId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private SyntheticsTestOptions options;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsTestPauseStatus status;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<SyntheticsStep> steps = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsBrowserTestType type = SyntheticsBrowserTestType.BROWSER;

  public SyntheticsBrowserTest config(SyntheticsBrowserTestConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   *
   * @return config
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsBrowserTestConfig getConfig() {
    return config;
  }

  public void setConfig(SyntheticsBrowserTestConfig config) {
    this.config = config;
  }

  public SyntheticsBrowserTest locations(List<String> locations) {
    this.locations = locations;
    return this;
  }

  public SyntheticsBrowserTest addLocationsItem(String locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Array of locations used to run the test.
   *
   * @return locations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of locations used to run the test.")
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getLocations() {
    return locations;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }

  public SyntheticsBrowserTest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Notification message associated with the test. Message can either be text or an empty string.
   *
   * @return message
   */
  @ApiModelProperty(
      example = "",
      required = true,
      value =
          "Notification message associated with the test. Message can either be text or an empty"
              + " string.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SyntheticsBrowserTest monitorId(Long monitorId) {
    this.monitorId = monitorId;
    return this;
  }

  /**
   * The associated monitor ID.
   *
   * @return monitorId
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The associated monitor ID.")
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMonitorId() {
    return monitorId;
  }

  public void setMonitorId(Long monitorId) {
    this.monitorId = monitorId;
  }

  public SyntheticsBrowserTest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the test.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the test.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsBrowserTest options(SyntheticsTestOptions options) {
    this.options = options;
    return this;
  }

  /**
   * Get options
   *
   * @return options
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestOptions getOptions() {
    return options;
  }

  public void setOptions(SyntheticsTestOptions options) {
    this.options = options;
  }

  public SyntheticsBrowserTest publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The public ID of the test.
   *
   * @return publicId
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public ID of the test.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public SyntheticsBrowserTest status(SyntheticsTestPauseStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestPauseStatus getStatus() {
    return status;
  }

  public void setStatus(SyntheticsTestPauseStatus status) {
    this.status = status;
  }

  public SyntheticsBrowserTest steps(List<SyntheticsStep> steps) {
    this.steps = steps;
    return this;
  }

  public SyntheticsBrowserTest addStepsItem(SyntheticsStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * The steps of the test.
   *
   * @return steps
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The steps of the test.")
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsStep> getSteps() {
    return steps;
  }

  public void setSteps(List<SyntheticsStep> steps) {
    this.steps = steps;
  }

  public SyntheticsBrowserTest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SyntheticsBrowserTest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Array of tags attached to the test.
   *
   * @return tags
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of tags attached to the test.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public SyntheticsBrowserTest type(SyntheticsBrowserTestType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsBrowserTestType getType() {
    return type;
  }

  public void setType(SyntheticsBrowserTestType type) {
    this.type = type;
  }

  /** Return true if this SyntheticsBrowserTest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBrowserTest syntheticsBrowserTest = (SyntheticsBrowserTest) o;
    return Objects.equals(this.config, syntheticsBrowserTest.config)
        && Objects.equals(this.locations, syntheticsBrowserTest.locations)
        && Objects.equals(this.message, syntheticsBrowserTest.message)
        && Objects.equals(this.monitorId, syntheticsBrowserTest.monitorId)
        && Objects.equals(this.name, syntheticsBrowserTest.name)
        && Objects.equals(this.options, syntheticsBrowserTest.options)
        && Objects.equals(this.publicId, syntheticsBrowserTest.publicId)
        && Objects.equals(this.status, syntheticsBrowserTest.status)
        && Objects.equals(this.steps, syntheticsBrowserTest.steps)
        && Objects.equals(this.tags, syntheticsBrowserTest.tags)
        && Objects.equals(this.type, syntheticsBrowserTest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        config, locations, message, monitorId, name, options, publicId, status, steps, tags, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserTest {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
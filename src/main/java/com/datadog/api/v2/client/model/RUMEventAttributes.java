/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** JSON object containing all event attributes and their associated values. */
@ApiModel(description = "JSON object containing all event attributes and their associated values.")
@JsonPropertyOrder({
  RUMEventAttributes.JSON_PROPERTY_ATTRIBUTES,
  RUMEventAttributes.JSON_PROPERTY_SERVICE,
  RUMEventAttributes.JSON_PROPERTY_TAGS,
  RUMEventAttributes.JSON_PROPERTY_TIMESTAMP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RUMEventAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = null;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public RUMEventAttributes attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public RUMEventAttributes putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * JSON object of attributes from RUM events.
   *
   * @return attributes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "{\"customAttribute\":123,\"duration\":2345}",
      value = "JSON object of attributes from RUM events.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public RUMEventAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The name of the application or service generating RUM events. It is used to switch from RUM to
   * APM, so make sure you define the same value when you use both products.
   *
   * @return service
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "web-app",
      value =
          "The name of the application or service generating RUM events. It is used to switch from"
              + " RUM to APM, so make sure you define the same value when you use both products.")
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public RUMEventAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RUMEventAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Array of tags associated with your event.
   *
   * @return tags
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"team:A\"]", value = "Array of tags associated with your event.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public RUMEventAttributes timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Timestamp of your event.
   *
   * @return timestamp
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-02T09:42:36.320Z", value = "Timestamp of your event.")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /** Return true if this RUMEventAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMEventAttributes ruMEventAttributes = (RUMEventAttributes) o;
    return Objects.equals(this.attributes, ruMEventAttributes.attributes)
        && Objects.equals(this.service, ruMEventAttributes.service)
        && Objects.equals(this.tags, ruMEventAttributes.tags)
        && Objects.equals(this.timestamp, ruMEventAttributes.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, service, tags, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMEventAttributes {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
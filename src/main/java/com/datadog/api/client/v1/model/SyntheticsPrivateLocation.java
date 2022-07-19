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

/** Object containing information about the private location to create. */
@JsonPropertyOrder({
  SyntheticsPrivateLocation.JSON_PROPERTY_DESCRIPTION,
  SyntheticsPrivateLocation.JSON_PROPERTY_ID,
  SyntheticsPrivateLocation.JSON_PROPERTY_METADATA,
  SyntheticsPrivateLocation.JSON_PROPERTY_NAME,
  SyntheticsPrivateLocation.JSON_PROPERTY_SECRETS,
  SyntheticsPrivateLocation.JSON_PROPERTY_TAGS
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsPrivateLocation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private SyntheticsPrivateLocationMetadata metadata;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SECRETS = "secrets";
  private SyntheticsPrivateLocationSecrets secrets;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public SyntheticsPrivateLocation() {}

  @JsonCreator
  public SyntheticsPrivateLocation(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.description = description;
    this.name = name;
    this.tags = tags;
  }

  public SyntheticsPrivateLocation description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the private location.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Unique identifier of the private location.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public SyntheticsPrivateLocation metadata(SyntheticsPrivateLocationMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * Object containing metadata about the private location.
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsPrivateLocationMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(SyntheticsPrivateLocationMetadata metadata) {
    this.metadata = metadata;
  }

  public SyntheticsPrivateLocation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the private location.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Secrets for the private location. Only present in the response when creating the private
   * location.
   *
   * @return secrets
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECRETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsPrivateLocationSecrets getSecrets() {
    return secrets;
  }

  public SyntheticsPrivateLocation tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SyntheticsPrivateLocation addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Array of tags attached to the private location.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /** Return true if this SyntheticsPrivateLocation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsPrivateLocation syntheticsPrivateLocation = (SyntheticsPrivateLocation) o;
    return Objects.equals(this.description, syntheticsPrivateLocation.description)
        && Objects.equals(this.id, syntheticsPrivateLocation.id)
        && Objects.equals(this.metadata, syntheticsPrivateLocation.metadata)
        && Objects.equals(this.name, syntheticsPrivateLocation.name)
        && Objects.equals(this.secrets, syntheticsPrivateLocation.secrets)
        && Objects.equals(this.tags, syntheticsPrivateLocation.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, metadata, name, secrets, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsPrivateLocation {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
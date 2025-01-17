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

/** The new security filter properties. */
@JsonPropertyOrder({
  SecurityFilterUpdateData.JSON_PROPERTY_ATTRIBUTES,
  SecurityFilterUpdateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityFilterUpdateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SecurityFilterUpdateAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SecurityFilterType type = SecurityFilterType.SECURITY_FILTERS;

  public SecurityFilterUpdateData() {}

  @JsonCreator
  public SecurityFilterUpdateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          SecurityFilterUpdateAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SecurityFilterType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SecurityFilterUpdateData attributes(SecurityFilterUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The security filters properties to be updated.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityFilterUpdateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SecurityFilterUpdateAttributes attributes) {
    this.attributes = attributes;
  }

  public SecurityFilterUpdateData type(SecurityFilterType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the resource. The value should always be <code>security_filters</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityFilterType getType() {
    return type;
  }

  public void setType(SecurityFilterType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SecurityFilterUpdateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityFilterUpdateData securityFilterUpdateData = (SecurityFilterUpdateData) o;
    return Objects.equals(this.attributes, securityFilterUpdateData.attributes)
        && Objects.equals(this.type, securityFilterUpdateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityFilterUpdateData {\n");
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

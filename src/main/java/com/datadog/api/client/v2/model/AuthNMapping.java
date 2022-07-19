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

/** The AuthN Mapping object returned by API. */
@JsonPropertyOrder({
  AuthNMapping.JSON_PROPERTY_ATTRIBUTES,
  AuthNMapping.JSON_PROPERTY_ID,
  AuthNMapping.JSON_PROPERTY_RELATIONSHIPS,
  AuthNMapping.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuthNMapping {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private AuthNMappingAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private AuthNMappingRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AuthNMappingsType type = AuthNMappingsType.AUTHN_MAPPINGS;

  public AuthNMapping() {}

  @JsonCreator
  public AuthNMapping(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) AuthNMappingsType type) {
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AuthNMapping attributes(AuthNMappingAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of AuthN Mapping.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AuthNMappingAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(AuthNMappingAttributes attributes) {
    this.attributes = attributes;
  }

  public AuthNMapping id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the AuthN Mapping.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuthNMapping relationships(AuthNMappingRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * All relationships associated with AuthN Mapping.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AuthNMappingRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(AuthNMappingRelationships relationships) {
    this.relationships = relationships;
  }

  public AuthNMapping type(AuthNMappingsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * AuthN Mappings resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AuthNMappingsType getType() {
    return type;
  }

  public void setType(AuthNMappingsType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this AuthNMapping object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthNMapping authNMapping = (AuthNMapping) o;
    return Objects.equals(this.attributes, authNMapping.attributes)
        && Objects.equals(this.id, authNMapping.id)
        && Objects.equals(this.relationships, authNMapping.relationships)
        && Objects.equals(this.type, authNMapping.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthNMapping {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

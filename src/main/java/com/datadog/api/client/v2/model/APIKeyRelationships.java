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

/** Resources related to the API key. */
@JsonPropertyOrder({
  APIKeyRelationships.JSON_PROPERTY_CREATED_BY,
  APIKeyRelationships.JSON_PROPERTY_MODIFIED_BY
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class APIKeyRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private RelationshipToUser createdBy;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private RelationshipToUser modifiedBy;

  public APIKeyRelationships createdBy(RelationshipToUser createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return createdBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(RelationshipToUser createdBy) {
    this.createdBy = createdBy;
  }

  public APIKeyRelationships modifiedBy(RelationshipToUser modifiedBy) {
    this.modifiedBy = modifiedBy;
    this.unparsed |= modifiedBy.unparsed;
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return modifiedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(RelationshipToUser modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  /** Return true if this APIKeyRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIKeyRelationships apiKeyRelationships = (APIKeyRelationships) o;
    return Objects.equals(this.createdBy, apiKeyRelationships.createdBy)
        && Objects.equals(this.modifiedBy, apiKeyRelationships.modifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, modifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIKeyRelationships {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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
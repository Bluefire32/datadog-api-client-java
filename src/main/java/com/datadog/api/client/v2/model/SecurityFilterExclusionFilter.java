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

/** Exclusion filter for the security filter. */
@JsonPropertyOrder({
  SecurityFilterExclusionFilter.JSON_PROPERTY_NAME,
  SecurityFilterExclusionFilter.JSON_PROPERTY_QUERY
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityFilterExclusionFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public SecurityFilterExclusionFilter() {}

  @JsonCreator
  public SecurityFilterExclusionFilter(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.name = name;
    this.query = query;
  }

  public SecurityFilterExclusionFilter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Exclusion filter name.
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

  public SecurityFilterExclusionFilter query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Exclusion filter query. Logs that match this query are excluded from the security filter.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  /** Return true if this SecurityFilterExclusionFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityFilterExclusionFilter securityFilterExclusionFilter = (SecurityFilterExclusionFilter) o;
    return Objects.equals(this.name, securityFilterExclusionFilter.name)
        && Objects.equals(this.query, securityFilterExclusionFilter.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityFilterExclusionFilter {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
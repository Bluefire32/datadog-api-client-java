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
import java.util.Objects;

/** Defined items in the group. */
@JsonPropertyOrder({
  LogQueryDefinitionGroupBy.JSON_PROPERTY_FACET,
  LogQueryDefinitionGroupBy.JSON_PROPERTY_LIMIT,
  LogQueryDefinitionGroupBy.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogQueryDefinitionGroupBy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_SORT = "sort";
  private LogQueryDefinitionGroupBySort sort;

  public LogQueryDefinitionGroupBy() {}

  @JsonCreator
  public LogQueryDefinitionGroupBy(
      @JsonProperty(required = true, value = JSON_PROPERTY_FACET) String facet) {
    this.facet = facet;
  }

  public LogQueryDefinitionGroupBy facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * Facet name.
   *
   * @return facet
   */
  @JsonProperty(JSON_PROPERTY_FACET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
  }

  public LogQueryDefinitionGroupBy limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of items in the group.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public LogQueryDefinitionGroupBy sort(LogQueryDefinitionGroupBySort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Define a sorting method.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogQueryDefinitionGroupBySort getSort() {
    return sort;
  }

  public void setSort(LogQueryDefinitionGroupBySort sort) {
    this.sort = sort;
  }

  /** Return true if this LogQueryDefinitionGroupBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogQueryDefinitionGroupBy logQueryDefinitionGroupBy = (LogQueryDefinitionGroupBy) o;
    return Objects.equals(this.facet, logQueryDefinitionGroupBy.facet)
        && Objects.equals(this.limit, logQueryDefinitionGroupBy.limit)
        && Objects.equals(this.sort, logQueryDefinitionGroupBy.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facet, limit, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogQueryDefinitionGroupBy {\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

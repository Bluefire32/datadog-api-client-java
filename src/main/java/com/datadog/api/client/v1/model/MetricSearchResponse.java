/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object containing the list of metrics matching the search query. */
@JsonPropertyOrder({MetricSearchResponse.JSON_PROPERTY_RESULTS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricSearchResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RESULTS = "results";
  private MetricSearchResponseResults results;

  public MetricSearchResponse results(MetricSearchResponseResults results) {
    this.results = results;
    this.unparsed |= results.unparsed;
    return this;
  }

  /**
   * Search result.
   *
   * @return results
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetricSearchResponseResults getResults() {
    return results;
  }

  public void setResults(MetricSearchResponseResults results) {
    this.results = results;
  }

  /** Return true if this MetricSearchResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricSearchResponse metricSearchResponse = (MetricSearchResponse) o;
    return Objects.equals(this.results, metricSearchResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricSearchResponse {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object with the latest Synthetic browser test run. */
@JsonPropertyOrder({
  SyntheticsGetBrowserTestLatestResultsResponse.JSON_PROPERTY_LAST_TIMESTAMP_FETCHED,
  SyntheticsGetBrowserTestLatestResultsResponse.JSON_PROPERTY_RESULTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsGetBrowserTestLatestResultsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAST_TIMESTAMP_FETCHED = "last_timestamp_fetched";
  private Long lastTimestampFetched;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<SyntheticsBrowserTestResultShort> results = null;

  public SyntheticsGetBrowserTestLatestResultsResponse lastTimestampFetched(
      Long lastTimestampFetched) {
    this.lastTimestampFetched = lastTimestampFetched;
    return this;
  }

  /**
   * Timestamp of the latest browser test run.
   *
   * @return lastTimestampFetched
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_TIMESTAMP_FETCHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastTimestampFetched() {
    return lastTimestampFetched;
  }

  public void setLastTimestampFetched(Long lastTimestampFetched) {
    this.lastTimestampFetched = lastTimestampFetched;
  }

  public SyntheticsGetBrowserTestLatestResultsResponse results(
      List<SyntheticsBrowserTestResultShort> results) {
    this.results = results;
    for (SyntheticsBrowserTestResultShort item : results) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsGetBrowserTestLatestResultsResponse addResultsItem(
      SyntheticsBrowserTestResultShort resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    this.unparsed |= resultsItem.unparsed;
    return this;
  }

  /**
   * Result of the latest browser test run.
   *
   * @return results
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsBrowserTestResultShort> getResults() {
    return results;
  }

  public void setResults(List<SyntheticsBrowserTestResultShort> results) {
    this.results = results;
  }

  /** Return true if this SyntheticsGetBrowserTestLatestResultsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsGetBrowserTestLatestResultsResponse syntheticsGetBrowserTestLatestResultsResponse =
        (SyntheticsGetBrowserTestLatestResultsResponse) o;
    return Objects.equals(
            this.lastTimestampFetched,
            syntheticsGetBrowserTestLatestResultsResponse.lastTimestampFetched)
        && Objects.equals(this.results, syntheticsGetBrowserTestLatestResultsResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTimestampFetched, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsGetBrowserTestLatestResultsResponse {\n");
    sb.append("    lastTimestampFetched: ")
        .append(toIndentedString(lastTimestampFetched))
        .append("\n");
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

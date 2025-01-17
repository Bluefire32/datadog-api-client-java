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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The query results. */
@JsonPropertyOrder({CIAppPipelinesAggregationBucketsResponse.JSON_PROPERTY_BUCKETS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppPipelinesAggregationBucketsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUCKETS = "buckets";
  private List<CIAppPipelinesBucketResponse> buckets = null;

  public CIAppPipelinesAggregationBucketsResponse buckets(
      List<CIAppPipelinesBucketResponse> buckets) {
    this.buckets = buckets;
    for (CIAppPipelinesBucketResponse item : buckets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CIAppPipelinesAggregationBucketsResponse addBucketsItem(
      CIAppPipelinesBucketResponse bucketsItem) {
    if (this.buckets == null) {
      this.buckets = new ArrayList<>();
    }
    this.buckets.add(bucketsItem);
    this.unparsed |= bucketsItem.unparsed;
    return this;
  }

  /**
   * The list of matching buckets, one item per bucket.
   *
   * @return buckets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUCKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CIAppPipelinesBucketResponse> getBuckets() {
    return buckets;
  }

  public void setBuckets(List<CIAppPipelinesBucketResponse> buckets) {
    this.buckets = buckets;
  }

  /** Return true if this CIAppPipelinesAggregationBucketsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppPipelinesAggregationBucketsResponse ciAppPipelinesAggregationBucketsResponse =
        (CIAppPipelinesAggregationBucketsResponse) o;
    return Objects.equals(this.buckets, ciAppPipelinesAggregationBucketsResponse.buckets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buckets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppPipelinesAggregationBucketsResponse {\n");
    sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
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

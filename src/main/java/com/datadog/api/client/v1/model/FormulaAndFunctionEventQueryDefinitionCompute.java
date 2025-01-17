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

/** Compute options. */
@JsonPropertyOrder({
  FormulaAndFunctionEventQueryDefinitionCompute.JSON_PROPERTY_AGGREGATION,
  FormulaAndFunctionEventQueryDefinitionCompute.JSON_PROPERTY_INTERVAL,
  FormulaAndFunctionEventQueryDefinitionCompute.JSON_PROPERTY_METRIC
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaAndFunctionEventQueryDefinitionCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private FormulaAndFunctionEventAggregation aggregation;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public FormulaAndFunctionEventQueryDefinitionCompute() {}

  @JsonCreator
  public FormulaAndFunctionEventQueryDefinitionCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          FormulaAndFunctionEventAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
  }

  public FormulaAndFunctionEventQueryDefinitionCompute aggregation(
      FormulaAndFunctionEventAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * Aggregation methods for event platform queries.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaAndFunctionEventAggregation getAggregation() {
    return aggregation;
  }

  public void setAggregation(FormulaAndFunctionEventAggregation aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public FormulaAndFunctionEventQueryDefinitionCompute interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * A time interval in milliseconds.
   *
   * @return interval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInterval() {
    return interval;
  }

  public void setInterval(Long interval) {
    this.interval = interval;
  }

  public FormulaAndFunctionEventQueryDefinitionCompute metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Measurable attribute to compute.
   *
   * @return metric
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  /** Return true if this FormulaAndFunctionEventQueryDefinitionCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionEventQueryDefinitionCompute formulaAndFunctionEventQueryDefinitionCompute =
        (FormulaAndFunctionEventQueryDefinitionCompute) o;
    return Objects.equals(
            this.aggregation, formulaAndFunctionEventQueryDefinitionCompute.aggregation)
        && Objects.equals(this.interval, formulaAndFunctionEventQueryDefinitionCompute.interval)
        && Objects.equals(this.metric, formulaAndFunctionEventQueryDefinitionCompute.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, interval, metric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionEventQueryDefinitionCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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

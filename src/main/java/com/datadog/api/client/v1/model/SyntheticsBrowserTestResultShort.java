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

/** Object with the results of a single Synthetic browser test. */
@JsonPropertyOrder({
  SyntheticsBrowserTestResultShort.JSON_PROPERTY_CHECK_TIME,
  SyntheticsBrowserTestResultShort.JSON_PROPERTY_PROBE_DC,
  SyntheticsBrowserTestResultShort.JSON_PROPERTY_RESULT,
  SyntheticsBrowserTestResultShort.JSON_PROPERTY_RESULT_ID,
  SyntheticsBrowserTestResultShort.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBrowserTestResultShort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHECK_TIME = "check_time";
  private Double checkTime;

  public static final String JSON_PROPERTY_PROBE_DC = "probe_dc";
  private String probeDc;

  public static final String JSON_PROPERTY_RESULT = "result";
  private SyntheticsBrowserTestResultShortResult result;

  public static final String JSON_PROPERTY_RESULT_ID = "result_id";
  private String resultId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsTestMonitorStatus status;

  public SyntheticsBrowserTestResultShort checkTime(Double checkTime) {
    this.checkTime = checkTime;
    return this;
  }

  /**
   * Last time the browser test was performed.
   *
   * @return checkTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCheckTime() {
    return checkTime;
  }

  public void setCheckTime(Double checkTime) {
    this.checkTime = checkTime;
  }

  public SyntheticsBrowserTestResultShort probeDc(String probeDc) {
    this.probeDc = probeDc;
    return this;
  }

  /**
   * Location from which the Browser test was performed.
   *
   * @return probeDc
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROBE_DC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProbeDc() {
    return probeDc;
  }

  public void setProbeDc(String probeDc) {
    this.probeDc = probeDc;
  }

  public SyntheticsBrowserTestResultShort result(SyntheticsBrowserTestResultShortResult result) {
    this.result = result;
    this.unparsed |= result.unparsed;
    return this;
  }

  /**
   * Object with the result of the last browser test run.
   *
   * @return result
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsBrowserTestResultShortResult getResult() {
    return result;
  }

  public void setResult(SyntheticsBrowserTestResultShortResult result) {
    this.result = result;
  }

  public SyntheticsBrowserTestResultShort resultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

  /**
   * ID of the browser test result.
   *
   * @return resultId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResultId() {
    return resultId;
  }

  public void setResultId(String resultId) {
    this.resultId = resultId;
  }

  public SyntheticsBrowserTestResultShort status(SyntheticsTestMonitorStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of your Synthetic monitor. * <code>O</code> for not triggered * <code>1</code> for
   * triggered * <code>2</code> for no data
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestMonitorStatus getStatus() {
    return status;
  }

  public void setStatus(SyntheticsTestMonitorStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  /** Return true if this SyntheticsBrowserTestResultShort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBrowserTestResultShort syntheticsBrowserTestResultShort =
        (SyntheticsBrowserTestResultShort) o;
    return Objects.equals(this.checkTime, syntheticsBrowserTestResultShort.checkTime)
        && Objects.equals(this.probeDc, syntheticsBrowserTestResultShort.probeDc)
        && Objects.equals(this.result, syntheticsBrowserTestResultShort.result)
        && Objects.equals(this.resultId, syntheticsBrowserTestResultShort.resultId)
        && Objects.equals(this.status, syntheticsBrowserTestResultShort.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkTime, probeDc, result, resultId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserTestResultShort {\n");
    sb.append("    checkTime: ").append(toIndentedString(checkTime)).append("\n");
    sb.append("    probeDc: ").append(toIndentedString(probeDc)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

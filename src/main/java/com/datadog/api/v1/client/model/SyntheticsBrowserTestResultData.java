/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.SyntheticsDevice;
import com.datadog.api.v1.client.model.SyntheticsStepDetail;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Object containing results for your Synthetic browser test.
 */
@ApiModel(description = "Object containing results for your Synthetic browser test.")
@JsonPropertyOrder({
  SyntheticsBrowserTestResultData.JSON_PROPERTY_BROWSER_TYPE,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_BROWSER_VERSION,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_DEVICE,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_DURATION,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_ERROR,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_PASSED,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_RECEIVED_EMAIL_COUNT,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_START_URL,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_STEP_DETAILS,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_THUMBNAILS_BUCKET_KEY,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_TIME_TO_INTERACTIVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsBrowserTestResultData {
  public static final String JSON_PROPERTY_BROWSER_TYPE = "browserType";
  private String browserType;

  public static final String JSON_PROPERTY_BROWSER_VERSION = "browserVersion";
  private String browserVersion;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private SyntheticsDevice device;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Double duration;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_PASSED = "passed";
  private Boolean passed;

  public static final String JSON_PROPERTY_RECEIVED_EMAIL_COUNT = "receivedEmailCount";
  private Long receivedEmailCount;

  public static final String JSON_PROPERTY_START_URL = "startUrl";
  private String startUrl;

  public static final String JSON_PROPERTY_STEP_DETAILS = "stepDetails";
  private List<SyntheticsStepDetail> stepDetails = null;

  public static final String JSON_PROPERTY_THUMBNAILS_BUCKET_KEY = "thumbnailsBucketKey";
  private Boolean thumbnailsBucketKey;

  public static final String JSON_PROPERTY_TIME_TO_INTERACTIVE = "timeToInteractive";
  private Double timeToInteractive;


  public SyntheticsBrowserTestResultData browserType(String browserType) {
    this.browserType = browserType;
    return this;
  }

   /**
   * Type of browser device used for the browser test.
   * @return browserType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of browser device used for the browser test.")
  @JsonProperty(JSON_PROPERTY_BROWSER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrowserType() {
    return browserType;
  }


  public void setBrowserType(String browserType) {
    this.browserType = browserType;
  }


  public SyntheticsBrowserTestResultData browserVersion(String browserVersion) {
    this.browserVersion = browserVersion;
    return this;
  }

   /**
   * Browser version used for the browser test.
   * @return browserVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Browser version used for the browser test.")
  @JsonProperty(JSON_PROPERTY_BROWSER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrowserVersion() {
    return browserVersion;
  }


  public void setBrowserVersion(String browserVersion) {
    this.browserVersion = browserVersion;
  }


  public SyntheticsBrowserTestResultData device(SyntheticsDevice device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsDevice getDevice() {
    return device;
  }


  public void setDevice(SyntheticsDevice device) {
    this.device = device;
  }


  public SyntheticsBrowserTestResultData duration(Double duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Global duration in second of the browser test.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Global duration in second of the browser test.")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public SyntheticsBrowserTestResultData error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Error returned for the browser test.
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error returned for the browser test.")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public SyntheticsBrowserTestResultData passed(Boolean passed) {
    this.passed = passed;
    return this;
  }

   /**
   * Whether or not the browser test was conducted.
   * @return passed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the browser test was conducted.")
  @JsonProperty(JSON_PROPERTY_PASSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPassed() {
    return passed;
  }


  public void setPassed(Boolean passed) {
    this.passed = passed;
  }


  public SyntheticsBrowserTestResultData receivedEmailCount(Long receivedEmailCount) {
    this.receivedEmailCount = receivedEmailCount;
    return this;
  }

   /**
   * The amount of email received during the browser test.
   * @return receivedEmailCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of email received during the browser test.")
  @JsonProperty(JSON_PROPERTY_RECEIVED_EMAIL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReceivedEmailCount() {
    return receivedEmailCount;
  }


  public void setReceivedEmailCount(Long receivedEmailCount) {
    this.receivedEmailCount = receivedEmailCount;
  }


  public SyntheticsBrowserTestResultData startUrl(String startUrl) {
    this.startUrl = startUrl;
    return this;
  }

   /**
   * Starting URL for the browser test.
   * @return startUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Starting URL for the browser test.")
  @JsonProperty(JSON_PROPERTY_START_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartUrl() {
    return startUrl;
  }


  public void setStartUrl(String startUrl) {
    this.startUrl = startUrl;
  }


  public SyntheticsBrowserTestResultData stepDetails(List<SyntheticsStepDetail> stepDetails) {
    this.stepDetails = stepDetails;
    return this;
  }

  public SyntheticsBrowserTestResultData addStepDetailsItem(SyntheticsStepDetail stepDetailsItem) {
    if (this.stepDetails == null) {
      this.stepDetails = new ArrayList<>();
    }
    this.stepDetails.add(stepDetailsItem);
    return this;
  }

   /**
   * Array containing the different browser test steps.
   * @return stepDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array containing the different browser test steps.")
  @JsonProperty(JSON_PROPERTY_STEP_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SyntheticsStepDetail> getStepDetails() {
    return stepDetails;
  }


  public void setStepDetails(List<SyntheticsStepDetail> stepDetails) {
    this.stepDetails = stepDetails;
  }


  public SyntheticsBrowserTestResultData thumbnailsBucketKey(Boolean thumbnailsBucketKey) {
    this.thumbnailsBucketKey = thumbnailsBucketKey;
    return this;
  }

   /**
   * Whether or not a thumbnail is associated with the browser test.
   * @return thumbnailsBucketKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not a thumbnail is associated with the browser test.")
  @JsonProperty(JSON_PROPERTY_THUMBNAILS_BUCKET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getThumbnailsBucketKey() {
    return thumbnailsBucketKey;
  }


  public void setThumbnailsBucketKey(Boolean thumbnailsBucketKey) {
    this.thumbnailsBucketKey = thumbnailsBucketKey;
  }


  public SyntheticsBrowserTestResultData timeToInteractive(Double timeToInteractive) {
    this.timeToInteractive = timeToInteractive;
    return this;
  }

   /**
   * Time in second to wait before the browser test starts after reaching the start URL.
   * @return timeToInteractive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time in second to wait before the browser test starts after reaching the start URL.")
  @JsonProperty(JSON_PROPERTY_TIME_TO_INTERACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTimeToInteractive() {
    return timeToInteractive;
  }


  public void setTimeToInteractive(Double timeToInteractive) {
    this.timeToInteractive = timeToInteractive;
  }


  /**
   * Return true if this SyntheticsBrowserTestResultData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBrowserTestResultData syntheticsBrowserTestResultData = (SyntheticsBrowserTestResultData) o;
    return Objects.equals(this.browserType, syntheticsBrowserTestResultData.browserType) &&
        Objects.equals(this.browserVersion, syntheticsBrowserTestResultData.browserVersion) &&
        Objects.equals(this.device, syntheticsBrowserTestResultData.device) &&
        Objects.equals(this.duration, syntheticsBrowserTestResultData.duration) &&
        Objects.equals(this.error, syntheticsBrowserTestResultData.error) &&
        Objects.equals(this.passed, syntheticsBrowserTestResultData.passed) &&
        Objects.equals(this.receivedEmailCount, syntheticsBrowserTestResultData.receivedEmailCount) &&
        Objects.equals(this.startUrl, syntheticsBrowserTestResultData.startUrl) &&
        Objects.equals(this.stepDetails, syntheticsBrowserTestResultData.stepDetails) &&
        Objects.equals(this.thumbnailsBucketKey, syntheticsBrowserTestResultData.thumbnailsBucketKey) &&
        Objects.equals(this.timeToInteractive, syntheticsBrowserTestResultData.timeToInteractive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browserType, browserVersion, device, duration, error, passed, receivedEmailCount, startUrl, stepDetails, thumbnailsBucketKey, timeToInteractive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserTestResultData {\n");
    sb.append("    browserType: ").append(toIndentedString(browserType)).append("\n");
    sb.append("    browserVersion: ").append(toIndentedString(browserVersion)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    receivedEmailCount: ").append(toIndentedString(receivedEmailCount)).append("\n");
    sb.append("    startUrl: ").append(toIndentedString(startUrl)).append("\n");
    sb.append("    stepDetails: ").append(toIndentedString(stepDetails)).append("\n");
    sb.append("    thumbnailsBucketKey: ").append(toIndentedString(thumbnailsBucketKey)).append("\n");
    sb.append("    timeToInteractive: ").append(toIndentedString(timeToInteractive)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


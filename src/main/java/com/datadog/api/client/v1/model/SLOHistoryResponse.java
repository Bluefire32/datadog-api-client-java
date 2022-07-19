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

/** A service level objective history response. */
@JsonPropertyOrder({SLOHistoryResponse.JSON_PROPERTY_DATA, SLOHistoryResponse.JSON_PROPERTY_ERRORS})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOHistoryResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private SLOHistoryResponseData data;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<SLOHistoryResponseError> errors = null;

  public SLOHistoryResponse data(SLOHistoryResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * An array of service level objective objects.
   *
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOHistoryResponseData getData() {
    return data;
  }

  public void setData(SLOHistoryResponseData data) {
    this.data = data;
  }

  public SLOHistoryResponse errors(List<SLOHistoryResponseError> errors) {
    this.errors = errors;
    for (SLOHistoryResponseError item : errors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SLOHistoryResponse addErrorsItem(SLOHistoryResponseError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    this.unparsed |= errorsItem.unparsed;
    return this;
  }

  /**
   * A list of errors while querying the history data for the service level objective.
   *
   * @return errors
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SLOHistoryResponseError> getErrors() {
    return errors;
  }

  public void setErrors(List<SLOHistoryResponseError> errors) {
    this.errors = errors;
  }

  /** Return true if this SLOHistoryResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOHistoryResponse sloHistoryResponse = (SLOHistoryResponse) o;
    return Objects.equals(this.data, sloHistoryResponse.data)
        && Objects.equals(this.errors, sloHistoryResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOHistoryResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
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

/** The metadata associated with a request. */
@JsonPropertyOrder({
  RUMResponseMetadata.JSON_PROPERTY_ELAPSED,
  RUMResponseMetadata.JSON_PROPERTY_PAGE,
  RUMResponseMetadata.JSON_PROPERTY_REQUEST_ID,
  RUMResponseMetadata.JSON_PROPERTY_STATUS,
  RUMResponseMetadata.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMResponseMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ELAPSED = "elapsed";
  private Long elapsed;

  public static final String JSON_PROPERTY_PAGE = "page";
  private RUMResponsePage page;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RUMResponseStatus status;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<RUMWarning> warnings = null;

  public RUMResponseMetadata elapsed(Long elapsed) {
    this.elapsed = elapsed;
    return this;
  }

  /**
   * The time elapsed in milliseconds.
   *
   * @return elapsed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELAPSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getElapsed() {
    return elapsed;
  }

  public void setElapsed(Long elapsed) {
    this.elapsed = elapsed;
  }

  public RUMResponseMetadata page(RUMResponsePage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * Paging attributes.
   *
   * @return page
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMResponsePage getPage() {
    return page;
  }

  public void setPage(RUMResponsePage page) {
    this.page = page;
  }

  public RUMResponseMetadata requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * The identifier of the request.
   *
   * @return requestId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public RUMResponseMetadata status(RUMResponseStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the response.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMResponseStatus getStatus() {
    return status;
  }

  public void setStatus(RUMResponseStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public RUMResponseMetadata warnings(List<RUMWarning> warnings) {
    this.warnings = warnings;
    for (RUMWarning item : warnings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RUMResponseMetadata addWarningsItem(RUMWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    this.unparsed |= warningsItem.unparsed;
    return this;
  }

  /**
   * A list of warnings (non-fatal errors) encountered. Partial results may return if warnings are
   * present in the response.
   *
   * @return warnings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RUMWarning> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<RUMWarning> warnings) {
    this.warnings = warnings;
  }

  /** Return true if this RUMResponseMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMResponseMetadata rumResponseMetadata = (RUMResponseMetadata) o;
    return Objects.equals(this.elapsed, rumResponseMetadata.elapsed)
        && Objects.equals(this.page, rumResponseMetadata.page)
        && Objects.equals(this.requestId, rumResponseMetadata.requestId)
        && Objects.equals(this.status, rumResponseMetadata.status)
        && Objects.equals(this.warnings, rumResponseMetadata.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elapsed, page, requestId, status, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMResponseMetadata {\n");
    sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

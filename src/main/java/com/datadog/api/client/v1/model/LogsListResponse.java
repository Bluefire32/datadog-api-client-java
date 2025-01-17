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

/** Response object with all logs matching the request and pagination information. */
@JsonPropertyOrder({
  LogsListResponse.JSON_PROPERTY_LOGS,
  LogsListResponse.JSON_PROPERTY_NEXT_LOG_ID,
  LogsListResponse.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LOGS = "logs";
  private List<Log> logs = null;

  public static final String JSON_PROPERTY_NEXT_LOG_ID = "nextLogId";
  private String nextLogId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public LogsListResponse logs(List<Log> logs) {
    this.logs = logs;
    for (Log item : logs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsListResponse addLogsItem(Log logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }
    this.logs.add(logsItem);
    this.unparsed |= logsItem.unparsed;
    return this;
  }

  /**
   * Array of logs matching the request and the <code>nextLogId</code> if sent.
   *
   * @return logs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Log> getLogs() {
    return logs;
  }

  public void setLogs(List<Log> logs) {
    this.logs = logs;
  }

  public LogsListResponse nextLogId(String nextLogId) {
    this.nextLogId = nextLogId;
    return this;
  }

  /**
   * Hash identifier of the next log to return in the list. This parameter is used for the
   * pagination feature.
   *
   * @return nextLogId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_LOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNextLogId() {
    return nextLogId;
  }

  public void setNextLogId(String nextLogId) {
    this.nextLogId = nextLogId;
  }

  public LogsListResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the response.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /** Return true if this LogsListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsListResponse logsListResponse = (LogsListResponse) o;
    return Objects.equals(this.logs, logsListResponse.logs)
        && Objects.equals(this.nextLogId, logsListResponse.nextLogId)
        && Objects.equals(this.status, logsListResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs, nextLogId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsListResponse {\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    nextLogId: ").append(toIndentedString(nextLogId)).append("\n");
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

/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Dashboards within a list. */
@JsonPropertyOrder({
  DashboardListItems.JSON_PROPERTY_DASHBOARDS,
  DashboardListItems.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardListItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DASHBOARDS = "dashboards";
  private List<DashboardListItem> dashboards = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public DashboardListItems() {}

  @JsonCreator
  public DashboardListItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_DASHBOARDS)
          List<DashboardListItem> dashboards) {
    this.dashboards = dashboards;
  }

  public DashboardListItems dashboards(List<DashboardListItem> dashboards) {
    this.dashboards = dashboards;
    for (DashboardListItem item : dashboards) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardListItems addDashboardsItem(DashboardListItem dashboardsItem) {
    this.dashboards.add(dashboardsItem);
    this.unparsed |= dashboardsItem.unparsed;
    return this;
  }

  /**
   * List of dashboards in the dashboard list.
   *
   * @return dashboards
   */
  @JsonProperty(JSON_PROPERTY_DASHBOARDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DashboardListItem> getDashboards() {
    return dashboards;
  }

  public void setDashboards(List<DashboardListItem> dashboards) {
    this.dashboards = dashboards;
  }

  /**
   * Number of dashboards in the dashboard list.
   *
   * @return total
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotal() {
    return total;
  }

  /** Return true if this DashboardListItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardListItems dashboardListItems = (DashboardListItems) o;
    return Objects.equals(this.dashboards, dashboardListItems.dashboards)
        && Objects.equals(this.total, dashboardListItems.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboards, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardListItems {\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

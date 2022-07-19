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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The table visualization is available on timeboards and screenboards. It displays columns of
 * metrics grouped by tag key.
 */
@JsonPropertyOrder({
  TableWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  TableWidgetDefinition.JSON_PROPERTY_HAS_SEARCH_BAR,
  TableWidgetDefinition.JSON_PROPERTY_REQUESTS,
  TableWidgetDefinition.JSON_PROPERTY_TIME,
  TableWidgetDefinition.JSON_PROPERTY_TITLE,
  TableWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  TableWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  TableWidgetDefinition.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_HAS_SEARCH_BAR = "has_search_bar";
  private TableWidgetHasSearchBar hasSearchBar;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<TableWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TableWidgetDefinitionType type = TableWidgetDefinitionType.QUERY_TABLE;

  public TableWidgetDefinition() {}

  @JsonCreator
  public TableWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<TableWidgetRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) TableWidgetDefinitionType type) {
    this.requests = requests;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TableWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TableWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * List of custom links.
   *
   * @return customLinks
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetCustomLink> getCustomLinks() {
    return customLinks;
  }

  public void setCustomLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
  }

  public TableWidgetDefinition hasSearchBar(TableWidgetHasSearchBar hasSearchBar) {
    this.hasSearchBar = hasSearchBar;
    this.unparsed |= !hasSearchBar.isValid();
    return this;
  }

  /**
   * Controls the display of the search bar.
   *
   * @return hasSearchBar
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_SEARCH_BAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TableWidgetHasSearchBar getHasSearchBar() {
    return hasSearchBar;
  }

  public void setHasSearchBar(TableWidgetHasSearchBar hasSearchBar) {
    if (!hasSearchBar.isValid()) {
      this.unparsed = true;
    }
    this.hasSearchBar = hasSearchBar;
  }

  public TableWidgetDefinition requests(List<TableWidgetRequest> requests) {
    this.requests = requests;
    for (TableWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TableWidgetDefinition addRequestsItem(TableWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * Widget definition.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TableWidgetRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<TableWidgetRequest> requests) {
    this.requests = requests;
  }

  public TableWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Time setting for the widget.
   *
   * @return time
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTime getTime() {
    return time;
  }

  public void setTime(WidgetTime time) {
    this.time = time;
  }

  public TableWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of your widget.
   *
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public TableWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * How to align the text on the widget.
   *
   * @return titleAlign
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }

  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
      this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }

  public TableWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Size of the title.
   *
   * @return titleSize
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public TableWidgetDefinition type(TableWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the table widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TableWidgetDefinitionType getType() {
    return type;
  }

  public void setType(TableWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this TableWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableWidgetDefinition tableWidgetDefinition = (TableWidgetDefinition) o;
    return Objects.equals(this.customLinks, tableWidgetDefinition.customLinks)
        && Objects.equals(this.hasSearchBar, tableWidgetDefinition.hasSearchBar)
        && Objects.equals(this.requests, tableWidgetDefinition.requests)
        && Objects.equals(this.time, tableWidgetDefinition.time)
        && Objects.equals(this.title, tableWidgetDefinition.title)
        && Objects.equals(this.titleAlign, tableWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, tableWidgetDefinition.titleSize)
        && Objects.equals(this.type, tableWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customLinks, hasSearchBar, requests, time, title, titleAlign, titleSize, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableWidgetDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    hasSearchBar: ").append(toIndentedString(hasSearchBar)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
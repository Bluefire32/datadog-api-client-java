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

/** The view of the world that the map should render. */
@JsonPropertyOrder({GeomapWidgetDefinitionView.JSON_PROPERTY_FOCUS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapWidgetDefinitionView {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FOCUS = "focus";
  private String focus;

  public GeomapWidgetDefinitionView() {}

  @JsonCreator
  public GeomapWidgetDefinitionView(
      @JsonProperty(required = true, value = JSON_PROPERTY_FOCUS) String focus) {
    this.focus = focus;
  }

  public GeomapWidgetDefinitionView focus(String focus) {
    this.focus = focus;
    return this;
  }

  /**
   * The 2-letter ISO code of a country to focus the map on. Or <code>WORLD</code>.
   *
   * @return focus
   */
  @JsonProperty(JSON_PROPERTY_FOCUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFocus() {
    return focus;
  }

  public void setFocus(String focus) {
    this.focus = focus;
  }

  /** Return true if this GeomapWidgetDefinitionView object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapWidgetDefinitionView geomapWidgetDefinitionView = (GeomapWidgetDefinitionView) o;
    return Objects.equals(this.focus, geomapWidgetDefinitionView.focus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(focus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapWidgetDefinitionView {\n");
    sb.append("    focus: ").append(toIndentedString(focus)).append("\n");
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

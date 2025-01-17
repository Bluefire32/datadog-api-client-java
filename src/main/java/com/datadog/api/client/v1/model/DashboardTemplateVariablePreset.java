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

/** Template variables saved views. */
@JsonPropertyOrder({
  DashboardTemplateVariablePreset.JSON_PROPERTY_NAME,
  DashboardTemplateVariablePreset.JSON_PROPERTY_TEMPLATE_VARIABLES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardTemplateVariablePreset {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private List<DashboardTemplateVariablePresetValue> templateVariables = null;

  public DashboardTemplateVariablePreset name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the variable.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DashboardTemplateVariablePreset templateVariables(
      List<DashboardTemplateVariablePresetValue> templateVariables) {
    this.templateVariables = templateVariables;
    for (DashboardTemplateVariablePresetValue item : templateVariables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardTemplateVariablePreset addTemplateVariablesItem(
      DashboardTemplateVariablePresetValue templateVariablesItem) {
    if (this.templateVariables == null) {
      this.templateVariables = new ArrayList<>();
    }
    this.templateVariables.add(templateVariablesItem);
    this.unparsed |= templateVariablesItem.unparsed;
    return this;
  }

  /**
   * List of variables.
   *
   * @return templateVariables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardTemplateVariablePresetValue> getTemplateVariables() {
    return templateVariables;
  }

  public void setTemplateVariables(List<DashboardTemplateVariablePresetValue> templateVariables) {
    this.templateVariables = templateVariables;
  }

  /** Return true if this DashboardTemplateVariablePreset object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardTemplateVariablePreset dashboardTemplateVariablePreset =
        (DashboardTemplateVariablePreset) o;
    return Objects.equals(this.name, dashboardTemplateVariablePreset.name)
        && Objects.equals(
            this.templateVariables, dashboardTemplateVariablePreset.templateVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, templateVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardTemplateVariablePreset {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
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

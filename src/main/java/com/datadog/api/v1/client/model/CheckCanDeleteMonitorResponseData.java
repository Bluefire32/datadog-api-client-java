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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Wrapper object with the list of monitor IDs.
 */
@ApiModel(description = "Wrapper object with the list of monitor IDs.")
@JsonPropertyOrder({
  CheckCanDeleteMonitorResponseData.JSON_PROPERTY_OK
})

public class CheckCanDeleteMonitorResponseData {
  public static final String JSON_PROPERTY_OK = "ok";
  private List<Long> ok = null;


  public CheckCanDeleteMonitorResponseData ok(List<Long> ok) {
    
    this.ok = ok;
    return this;
  }

  public CheckCanDeleteMonitorResponseData addOkItem(Long okItem) {
    if (this.ok == null) {
      this.ok = new ArrayList<>();
    }
    this.ok.add(okItem);
    return this;
  }

   /**
   * An array of of Monitor IDs that can be safely deleted.
   * @return ok
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of of Monitor IDs that can be safely deleted.")
  @JsonProperty(JSON_PROPERTY_OK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getOk() {
    return ok;
  }


  public void setOk(List<Long> ok) {
    this.ok = ok;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckCanDeleteMonitorResponseData checkCanDeleteMonitorResponseData = (CheckCanDeleteMonitorResponseData) o;
    return Objects.equals(this.ok, checkCanDeleteMonitorResponseData.ok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckCanDeleteMonitorResponseData {\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

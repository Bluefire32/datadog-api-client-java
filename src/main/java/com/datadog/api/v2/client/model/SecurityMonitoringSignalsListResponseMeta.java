/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalsListResponseMetaPage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * Meta attributes.
 */
@ApiModel(description = "Meta attributes.")
@JsonPropertyOrder({
  SecurityMonitoringSignalsListResponseMeta.JSON_PROPERTY_PAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityMonitoringSignalsListResponseMeta {
  public static final String JSON_PROPERTY_PAGE = "page";
  private SecurityMonitoringSignalsListResponseMetaPage page;


  public SecurityMonitoringSignalsListResponseMeta page(SecurityMonitoringSignalsListResponseMetaPage page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecurityMonitoringSignalsListResponseMetaPage getPage() {
    return page;
  }


  public void setPage(SecurityMonitoringSignalsListResponseMetaPage page) {
    this.page = page;
  }


  /**
   * Return true if this SecurityMonitoringSignalsListResponse_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalsListResponseMeta securityMonitoringSignalsListResponseMeta = (SecurityMonitoringSignalsListResponseMeta) o;
    return Objects.equals(this.page, securityMonitoringSignalsListResponseMeta.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalsListResponseMeta {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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


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

/** Array of AuthN Mappings response. */
@JsonPropertyOrder({
  AuthNMappingsResponse.JSON_PROPERTY_DATA,
  AuthNMappingsResponse.JSON_PROPERTY_INCLUDED,
  AuthNMappingsResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuthNMappingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<AuthNMapping> data = null;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<AuthNMappingIncluded> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private ResponseMetaAttributes meta;

  public AuthNMappingsResponse data(List<AuthNMapping> data) {
    this.data = data;
    for (AuthNMapping item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AuthNMappingsResponse addDataItem(AuthNMapping dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Array of returned AuthN Mappings.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AuthNMapping> getData() {
    return data;
  }

  public void setData(List<AuthNMapping> data) {
    this.data = data;
  }

  public AuthNMappingsResponse included(List<AuthNMappingIncluded> included) {
    this.included = included;
    for (AuthNMappingIncluded item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AuthNMappingsResponse addIncludedItem(AuthNMappingIncluded includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Included data in the AuthN Mapping response.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AuthNMappingIncluded> getIncluded() {
    return included;
  }

  public void setIncluded(List<AuthNMappingIncluded> included) {
    this.included = included;
  }

  public AuthNMappingsResponse meta(ResponseMetaAttributes meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Object describing meta attributes of response.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResponseMetaAttributes getMeta() {
    return meta;
  }

  public void setMeta(ResponseMetaAttributes meta) {
    this.meta = meta;
  }

  /** Return true if this AuthNMappingsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthNMappingsResponse authNMappingsResponse = (AuthNMappingsResponse) o;
    return Objects.equals(this.data, authNMappingsResponse.data)
        && Objects.equals(this.included, authNMappingsResponse.included)
        && Objects.equals(this.meta, authNMappingsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthNMappingsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

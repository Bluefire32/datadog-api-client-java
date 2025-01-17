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

/** Available prefix information for the APM endpoints. */
@JsonPropertyOrder({
  IPPrefixesAPM.JSON_PROPERTY_PREFIXES_IPV4,
  IPPrefixesAPM.JSON_PROPERTY_PREFIXES_IPV6
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IPPrefixesAPM {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PREFIXES_IPV4 = "prefixes_ipv4";
  private List<String> prefixesIpv4 = null;

  public static final String JSON_PROPERTY_PREFIXES_IPV6 = "prefixes_ipv6";
  private List<String> prefixesIpv6 = null;

  public IPPrefixesAPM prefixesIpv4(List<String> prefixesIpv4) {
    this.prefixesIpv4 = prefixesIpv4;
    return this;
  }

  public IPPrefixesAPM addPrefixesIpv4Item(String prefixesIpv4Item) {
    if (this.prefixesIpv4 == null) {
      this.prefixesIpv4 = new ArrayList<>();
    }
    this.prefixesIpv4.add(prefixesIpv4Item);
    return this;
  }

  /**
   * List of IPv4 prefixes.
   *
   * @return prefixesIpv4
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIXES_IPV4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPrefixesIpv4() {
    return prefixesIpv4;
  }

  public void setPrefixesIpv4(List<String> prefixesIpv4) {
    this.prefixesIpv4 = prefixesIpv4;
  }

  public IPPrefixesAPM prefixesIpv6(List<String> prefixesIpv6) {
    this.prefixesIpv6 = prefixesIpv6;
    return this;
  }

  public IPPrefixesAPM addPrefixesIpv6Item(String prefixesIpv6Item) {
    if (this.prefixesIpv6 == null) {
      this.prefixesIpv6 = new ArrayList<>();
    }
    this.prefixesIpv6.add(prefixesIpv6Item);
    return this;
  }

  /**
   * List of IPv6 prefixes.
   *
   * @return prefixesIpv6
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIXES_IPV6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPrefixesIpv6() {
    return prefixesIpv6;
  }

  public void setPrefixesIpv6(List<String> prefixesIpv6) {
    this.prefixesIpv6 = prefixesIpv6;
  }

  /** Return true if this IPPrefixesAPM object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPPrefixesAPM ipPrefixesApm = (IPPrefixesAPM) o;
    return Objects.equals(this.prefixesIpv4, ipPrefixesApm.prefixesIpv4)
        && Objects.equals(this.prefixesIpv6, ipPrefixesApm.prefixesIpv6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefixesIpv4, prefixesIpv6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPPrefixesAPM {\n");
    sb.append("    prefixesIpv4: ").append(toIndentedString(prefixesIpv4)).append("\n");
    sb.append("    prefixesIpv6: ").append(toIndentedString(prefixesIpv6)).append("\n");
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

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

/** Object to handle <code>NTLM</code> authentication when performing the test. */
@JsonPropertyOrder({
  SyntheticsBasicAuthNTLM.JSON_PROPERTY_DOMAIN,
  SyntheticsBasicAuthNTLM.JSON_PROPERTY_PASSWORD,
  SyntheticsBasicAuthNTLM.JSON_PROPERTY_TYPE,
  SyntheticsBasicAuthNTLM.JSON_PROPERTY_USERNAME,
  SyntheticsBasicAuthNTLM.JSON_PROPERTY_WORKSTATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBasicAuthNTLM {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsBasicAuthNTLMType type = SyntheticsBasicAuthNTLMType.NTLM;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_WORKSTATION = "workstation";
  private String workstation;

  public SyntheticsBasicAuthNTLM() {}

  @JsonCreator
  public SyntheticsBasicAuthNTLM(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SyntheticsBasicAuthNTLMType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SyntheticsBasicAuthNTLM domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Domain for the authentication to use when performing the test.
   *
   * @return domain
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public SyntheticsBasicAuthNTLM password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password for the authentication to use when performing the test.
   *
   * @return password
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SyntheticsBasicAuthNTLM type(SyntheticsBasicAuthNTLMType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of authentication to use when performing the test.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsBasicAuthNTLMType getType() {
    return type;
  }

  public void setType(SyntheticsBasicAuthNTLMType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public SyntheticsBasicAuthNTLM username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username for the authentication to use when performing the test.
   *
   * @return username
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SyntheticsBasicAuthNTLM workstation(String workstation) {
    this.workstation = workstation;
    return this;
  }

  /**
   * Workstation for the authentication to use when performing the test.
   *
   * @return workstation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWorkstation() {
    return workstation;
  }

  public void setWorkstation(String workstation) {
    this.workstation = workstation;
  }

  /** Return true if this SyntheticsBasicAuthNTLM object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBasicAuthNTLM syntheticsBasicAuthNtlm = (SyntheticsBasicAuthNTLM) o;
    return Objects.equals(this.domain, syntheticsBasicAuthNtlm.domain)
        && Objects.equals(this.password, syntheticsBasicAuthNtlm.password)
        && Objects.equals(this.type, syntheticsBasicAuthNtlm.type)
        && Objects.equals(this.username, syntheticsBasicAuthNtlm.username)
        && Objects.equals(this.workstation, syntheticsBasicAuthNtlm.workstation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, password, type, username, workstation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBasicAuthNTLM {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    workstation: ").append(toIndentedString(workstation)).append("\n");
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

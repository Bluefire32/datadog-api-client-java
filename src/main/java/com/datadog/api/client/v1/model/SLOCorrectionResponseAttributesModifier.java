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
import java.util.Objects;

/** Modifier of the object. */
@JsonPropertyOrder({
  SLOCorrectionResponseAttributesModifier.JSON_PROPERTY_EMAIL,
  SLOCorrectionResponseAttributesModifier.JSON_PROPERTY_HANDLE,
  SLOCorrectionResponseAttributesModifier.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOCorrectionResponseAttributesModifier {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public SLOCorrectionResponseAttributesModifier email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email of the Modifier.
   *
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SLOCorrectionResponseAttributesModifier handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * Handle of the Modifier.
   *
   * @return handle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public SLOCorrectionResponseAttributesModifier name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Modifier.
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

  /** Return true if this SLOCorrectionResponseAttributesModifier object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOCorrectionResponseAttributesModifier sloCorrectionResponseAttributesModifier =
        (SLOCorrectionResponseAttributesModifier) o;
    return Objects.equals(this.email, sloCorrectionResponseAttributesModifier.email)
        && Objects.equals(this.handle, sloCorrectionResponseAttributesModifier.handle)
        && Objects.equals(this.name, sloCorrectionResponseAttributesModifier.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, handle, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOCorrectionResponseAttributesModifier {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

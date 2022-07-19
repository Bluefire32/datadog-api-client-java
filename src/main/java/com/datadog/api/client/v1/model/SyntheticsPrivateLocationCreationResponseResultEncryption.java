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

/** Public key for the result encryption. */
@JsonPropertyOrder({
  SyntheticsPrivateLocationCreationResponseResultEncryption.JSON_PROPERTY_ID,
  SyntheticsPrivateLocationCreationResponseResultEncryption.JSON_PROPERTY_KEY
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsPrivateLocationCreationResponseResultEncryption {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public SyntheticsPrivateLocationCreationResponseResultEncryption id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Fingerprint for the encryption key.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SyntheticsPrivateLocationCreationResponseResultEncryption key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Public key for result encryption.
   *
   * @return key
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Return true if this SyntheticsPrivateLocationCreationResponseResultEncryption object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsPrivateLocationCreationResponseResultEncryption
        syntheticsPrivateLocationCreationResponseResultEncryption =
            (SyntheticsPrivateLocationCreationResponseResultEncryption) o;
    return Objects.equals(this.id, syntheticsPrivateLocationCreationResponseResultEncryption.id)
        && Objects.equals(this.key, syntheticsPrivateLocationCreationResponseResultEncryption.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsPrivateLocationCreationResponseResultEncryption {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
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

/** Object describing the device used to perform the Synthetic test. */
@JsonPropertyOrder({
  SyntheticsDevice.JSON_PROPERTY_HEIGHT,
  SyntheticsDevice.JSON_PROPERTY_ID,
  SyntheticsDevice.JSON_PROPERTY_IS_MOBILE,
  SyntheticsDevice.JSON_PROPERTY_NAME,
  SyntheticsDevice.JSON_PROPERTY_WIDTH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsDevice {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_ID = "id";
  private SyntheticsDeviceID id;

  public static final String JSON_PROPERTY_IS_MOBILE = "isMobile";
  private Boolean isMobile;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Long width;

  public SyntheticsDevice() {}

  @JsonCreator
  public SyntheticsDevice(
      @JsonProperty(required = true, value = JSON_PROPERTY_HEIGHT) Long height,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) SyntheticsDeviceID id,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_WIDTH) Long width) {
    this.height = height;
    this.id = id;
    this.unparsed |= !id.isValid();
    this.name = name;
    this.width = width;
  }

  public SyntheticsDevice height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Screen height of the device.
   *
   * @return height
   */
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public SyntheticsDevice id(SyntheticsDeviceID id) {
    this.id = id;
    this.unparsed |= !id.isValid();
    return this;
  }

  /**
   * The device ID.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsDeviceID getId() {
    return id;
  }

  public void setId(SyntheticsDeviceID id) {
    if (!id.isValid()) {
      this.unparsed = true;
    }
    this.id = id;
  }

  public SyntheticsDevice isMobile(Boolean isMobile) {
    this.isMobile = isMobile;
    return this;
  }

  /**
   * Whether or not the device is a mobile.
   *
   * @return isMobile
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_MOBILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsMobile() {
    return isMobile;
  }

  public void setIsMobile(Boolean isMobile) {
    this.isMobile = isMobile;
  }

  public SyntheticsDevice name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The device name.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsDevice width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * Screen width of the device.
   *
   * @return width
   */
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }

  /** Return true if this SyntheticsDevice object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsDevice syntheticsDevice = (SyntheticsDevice) o;
    return Objects.equals(this.height, syntheticsDevice.height)
        && Objects.equals(this.id, syntheticsDevice.id)
        && Objects.equals(this.isMobile, syntheticsDevice.isMobile)
        && Objects.equals(this.name, syntheticsDevice.name)
        && Objects.equals(this.width, syntheticsDevice.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, id, isMobile, name, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsDevice {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMobile: ").append(toIndentedString(isMobile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

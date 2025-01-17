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
import java.util.Objects;

/** Charges breakdown. */
@JsonPropertyOrder({
  ChargebackBreakdown.JSON_PROPERTY_CHARGE_TYPE,
  ChargebackBreakdown.JSON_PROPERTY_COST,
  ChargebackBreakdown.JSON_PROPERTY_PRODUCT_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChargebackBreakdown {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHARGE_TYPE = "charge_type";
  private String chargeType;

  public static final String JSON_PROPERTY_COST = "cost";
  private Double cost;

  public static final String JSON_PROPERTY_PRODUCT_NAME = "product_name";
  private String productName;

  public ChargebackBreakdown chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

  /**
   * The type of charge for a particular product.
   *
   * @return chargeType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public ChargebackBreakdown cost(Double cost) {
    this.cost = cost;
    return this;
  }

  /**
   * The cost for a particular product and charge type during a given month.
   *
   * @return cost
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public ChargebackBreakdown productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * The product for which cost is being reported.
   *
   * @return productName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  /** Return true if this ChargebackBreakdown object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackBreakdown chargebackBreakdown = (ChargebackBreakdown) o;
    return Objects.equals(this.chargeType, chargebackBreakdown.chargeType)
        && Objects.equals(this.cost, chargebackBreakdown.cost)
        && Objects.equals(this.productName, chargebackBreakdown.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeType, cost, productName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargebackBreakdown {\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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

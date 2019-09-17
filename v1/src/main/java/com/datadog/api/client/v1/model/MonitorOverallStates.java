/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.client.v1.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets MonitorOverallStates
 */
public enum MonitorOverallStates {
  
  ALERT("Alert"),
  
  IGNORED("Ignored"),
  
  NO_DATA("No Data"),
  
  OK("OK"),
  
  SKIPPED("Skipped"),
  
  UNKNOWN("Unknown"),
  
  WARN("Warn");

  private String value;

  MonitorOverallStates(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MonitorOverallStates fromValue(String value) {
    for (MonitorOverallStates b : MonitorOverallStates.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


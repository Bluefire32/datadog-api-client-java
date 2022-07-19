/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Type of the assertion. */
@JsonSerialize(using = SyntheticsAssertionType.SyntheticsAssertionTypeSerializer.class)
public class SyntheticsAssertionType {

  public static final SyntheticsAssertionType BODY = new SyntheticsAssertionType("body");
  public static final SyntheticsAssertionType HEADER = new SyntheticsAssertionType("header");
  public static final SyntheticsAssertionType STATUS_CODE =
      new SyntheticsAssertionType("statusCode");
  public static final SyntheticsAssertionType CERTIFICATE =
      new SyntheticsAssertionType("certificate");
  public static final SyntheticsAssertionType RESPONSE_TIME =
      new SyntheticsAssertionType("responseTime");
  public static final SyntheticsAssertionType PROPERTY = new SyntheticsAssertionType("property");
  public static final SyntheticsAssertionType RECORD_EVERY =
      new SyntheticsAssertionType("recordEvery");
  public static final SyntheticsAssertionType RECORD_SOME =
      new SyntheticsAssertionType("recordSome");
  public static final SyntheticsAssertionType TLS_VERSION =
      new SyntheticsAssertionType("tlsVersion");
  public static final SyntheticsAssertionType MIN_TLS_VERSION =
      new SyntheticsAssertionType("minTlsVersion");
  public static final SyntheticsAssertionType LATENCY = new SyntheticsAssertionType("latency");
  public static final SyntheticsAssertionType PACKET_LOSS_PERCENTAGE =
      new SyntheticsAssertionType("packetLossPercentage");
  public static final SyntheticsAssertionType PACKETS_RECEIVED =
      new SyntheticsAssertionType("packetsReceived");
  public static final SyntheticsAssertionType NETWORK_HOP =
      new SyntheticsAssertionType("networkHop");
  public static final SyntheticsAssertionType RECEIVED_MESSAGE =
      new SyntheticsAssertionType("receivedMessage");
  public static final SyntheticsAssertionType GRPC_HEALTHCHECK_STATUS =
      new SyntheticsAssertionType("grpcHealthcheckStatus");
  public static final SyntheticsAssertionType CONNECTION =
      new SyntheticsAssertionType("connection");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "body",
              "header",
              "statusCode",
              "certificate",
              "responseTime",
              "property",
              "recordEvery",
              "recordSome",
              "tlsVersion",
              "minTlsVersion",
              "latency",
              "packetLossPercentage",
              "packetsReceived",
              "networkHop",
              "receivedMessage",
              "grpcHealthcheckStatus",
              "connection"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SyntheticsAssertionType(String value) {
    this.value = value;
  }

  public static class SyntheticsAssertionTypeSerializer
      extends StdSerializer<SyntheticsAssertionType> {
    public SyntheticsAssertionTypeSerializer(Class<SyntheticsAssertionType> t) {
      super(t);
    }

    public SyntheticsAssertionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsAssertionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this SyntheticsAssertionType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SyntheticsAssertionType) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SyntheticsAssertionType fromValue(String value) {
    return new SyntheticsAssertionType(value);
  }
}
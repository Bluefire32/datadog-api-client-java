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

/** AWS account ID and Lambda ARN. */
@JsonPropertyOrder({
  AWSAccountAndLambdaRequest.JSON_PROPERTY_ACCOUNT_ID,
  AWSAccountAndLambdaRequest.JSON_PROPERTY_LAMBDA_ARN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSAccountAndLambdaRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_LAMBDA_ARN = "lambda_arn";
  private String lambdaArn;

  public AWSAccountAndLambdaRequest() {}

  @JsonCreator
  public AWSAccountAndLambdaRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAMBDA_ARN) String lambdaArn) {
    this.accountId = accountId;
    this.lambdaArn = lambdaArn;
  }

  public AWSAccountAndLambdaRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Your AWS Account ID without dashes.
   *
   * @return accountId
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AWSAccountAndLambdaRequest lambdaArn(String lambdaArn) {
    this.lambdaArn = lambdaArn;
    return this;
  }

  /**
   * ARN of the Datadog Lambda created during the Datadog-Amazon Web services Log collection setup.
   *
   * @return lambdaArn
   */
  @JsonProperty(JSON_PROPERTY_LAMBDA_ARN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLambdaArn() {
    return lambdaArn;
  }

  public void setLambdaArn(String lambdaArn) {
    this.lambdaArn = lambdaArn;
  }

  /** Return true if this AWSAccountAndLambdaRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccountAndLambdaRequest awsAccountAndLambdaRequest = (AWSAccountAndLambdaRequest) o;
    return Objects.equals(this.accountId, awsAccountAndLambdaRequest.accountId)
        && Objects.equals(this.lambdaArn, awsAccountAndLambdaRequest.lambdaArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, lambdaArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccountAndLambdaRequest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    lambdaArn: ").append(toIndentedString(lambdaArn)).append("\n");
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

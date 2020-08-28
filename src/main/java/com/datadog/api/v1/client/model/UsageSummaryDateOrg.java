/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Global hourly report of all data billed by Datadog for a given organization.
 */
@ApiModel(description = "Global hourly report of all data billed by Datadog for a given organization.")
@JsonPropertyOrder({
  UsageSummaryDateOrg.JSON_PROPERTY_AGENT_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_APM_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_AWS_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT,
  UsageSummaryDateOrg.JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_CONTAINER_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CONTAINER_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_CUSTOM_TS_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_GCP_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_ID,
  UsageSummaryDateOrg.JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_INFRA_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_NAME,
  UsageSummaryDateOrg.JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_NPM_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_PROFILING_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_PUBLIC_ID,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageSummaryDateOrg {
  public static final String JSON_PROPERTY_AGENT_HOST_TOP99P = "agent_host_top99p";
  private Long agentHostTop99p;

  public static final String JSON_PROPERTY_APM_HOST_TOP99P = "apm_host_top99p";
  private Long apmHostTop99p;

  public static final String JSON_PROPERTY_AWS_HOST_TOP99P = "aws_host_top99p";
  private Long awsHostTop99p;

  public static final String JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT = "aws_lambda_func_count";
  private Long awsLambdaFuncCount;

  public static final String JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM = "aws_lambda_invocations_sum";
  private Long awsLambdaInvocationsSum;

  public static final String JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM = "billable_ingested_bytes_sum";
  private Long billableIngestedBytesSum;

  public static final String JSON_PROPERTY_CONTAINER_AVG = "container_avg";
  private Long containerAvg;

  public static final String JSON_PROPERTY_CONTAINER_HWM = "container_hwm";
  private Long containerHwm;

  public static final String JSON_PROPERTY_CUSTOM_TS_AVG = "custom_ts_avg";
  private Long customTsAvg;

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG = "fargate_tasks_count_avg";
  private Long fargateTasksCountAvg;

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM = "fargate_tasks_count_hwm";
  private Long fargateTasksCountHwm;

  public static final String JSON_PROPERTY_GCP_HOST_TOP99P = "gcp_host_top99p";
  private Long gcpHostTop99p;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM = "indexed_events_count_sum";
  private Long indexedEventsCountSum;

  public static final String JSON_PROPERTY_INFRA_HOST_TOP99P = "infra_host_top99p";
  private Long infraHostTop99p;

  public static final String JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM = "ingested_events_bytes_sum";
  private Long ingestedEventsBytesSum;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM = "netflow_indexed_events_count_sum";
  private Long netflowIndexedEventsCountSum;

  public static final String JSON_PROPERTY_NPM_HOST_TOP99P = "npm_host_top99p";
  private Long npmHostTop99p;

  public static final String JSON_PROPERTY_PROFILING_HOST_TOP99P = "profiling_host_top99p";
  private Long profilingHostTop99p;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_RUM_SESSION_COUNT_SUM = "rum_session_count_sum";
  private Long rumSessionCountSum;

  public static final String JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM = "synthetics_browser_check_calls_count_sum";
  private Long syntheticsBrowserCheckCallsCountSum;

  public static final String JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM = "synthetics_check_calls_count_sum";
  private Long syntheticsCheckCallsCountSum;

  public static final String JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM = "trace_search_indexed_events_count_sum";
  private Long traceSearchIndexedEventsCountSum;


  public UsageSummaryDateOrg agentHostTop99p(Long agentHostTop99p) {
    this.agentHostTop99p = agentHostTop99p;
    return this;
  }

   /**
   * Shows the 99th percentile of all agent hosts over all hours in the current date for the given org.
   * @return agentHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the 99th percentile of all agent hosts over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_AGENT_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAgentHostTop99p() {
    return agentHostTop99p;
  }


  public void setAgentHostTop99p(Long agentHostTop99p) {
    this.agentHostTop99p = agentHostTop99p;
  }


  public UsageSummaryDateOrg apmHostTop99p(Long apmHostTop99p) {
    this.apmHostTop99p = apmHostTop99p;
    return this;
  }

   /**
   * Shows the 99th percentile of all distinct APM hosts over all hours in the current date for the given org.
   * @return apmHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the 99th percentile of all distinct APM hosts over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_APM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getApmHostTop99p() {
    return apmHostTop99p;
  }


  public void setApmHostTop99p(Long apmHostTop99p) {
    this.apmHostTop99p = apmHostTop99p;
  }


  public UsageSummaryDateOrg awsHostTop99p(Long awsHostTop99p) {
    this.awsHostTop99p = awsHostTop99p;
    return this;
  }

   /**
   * Shows the 99th percentile of all AWS hosts over all hours in the current date for the given org.
   * @return awsHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the 99th percentile of all AWS hosts over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_AWS_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAwsHostTop99p() {
    return awsHostTop99p;
  }


  public void setAwsHostTop99p(Long awsHostTop99p) {
    this.awsHostTop99p = awsHostTop99p;
  }


  public UsageSummaryDateOrg awsLambdaFuncCount(Long awsLambdaFuncCount) {
    this.awsLambdaFuncCount = awsLambdaFuncCount;
    return this;
  }

   /**
   * Shows the sum of all AWS Lambda invocations over all hours in the current date for the given org.
   * @return awsLambdaFuncCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all AWS Lambda invocations over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAwsLambdaFuncCount() {
    return awsLambdaFuncCount;
  }


  public void setAwsLambdaFuncCount(Long awsLambdaFuncCount) {
    this.awsLambdaFuncCount = awsLambdaFuncCount;
  }


  public UsageSummaryDateOrg awsLambdaInvocationsSum(Long awsLambdaInvocationsSum) {
    this.awsLambdaInvocationsSum = awsLambdaInvocationsSum;
    return this;
  }

   /**
   * Shows the sum of all AWS Lambda invocations over all hours in the current date for the given org.
   * @return awsLambdaInvocationsSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all AWS Lambda invocations over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAwsLambdaInvocationsSum() {
    return awsLambdaInvocationsSum;
  }


  public void setAwsLambdaInvocationsSum(Long awsLambdaInvocationsSum) {
    this.awsLambdaInvocationsSum = awsLambdaInvocationsSum;
  }


  public UsageSummaryDateOrg billableIngestedBytesSum(Long billableIngestedBytesSum) {
    this.billableIngestedBytesSum = billableIngestedBytesSum;
    return this;
  }

   /**
   * Shows the sum of all log bytes ingested over all hours in the current date for the given org.
   * @return billableIngestedBytesSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all log bytes ingested over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBillableIngestedBytesSum() {
    return billableIngestedBytesSum;
  }


  public void setBillableIngestedBytesSum(Long billableIngestedBytesSum) {
    this.billableIngestedBytesSum = billableIngestedBytesSum;
  }


  public UsageSummaryDateOrg containerAvg(Long containerAvg) {
    this.containerAvg = containerAvg;
    return this;
  }

   /**
   * Shows the average of all distinct containers over all hours in the current date for the given org.
   * @return containerAvg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the average of all distinct containers over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_CONTAINER_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getContainerAvg() {
    return containerAvg;
  }


  public void setContainerAvg(Long containerAvg) {
    this.containerAvg = containerAvg;
  }


  public UsageSummaryDateOrg containerHwm(Long containerHwm) {
    this.containerHwm = containerHwm;
    return this;
  }

   /**
   * Shows the high watermark of all distinct containers over all hours in the current date for the given org.
   * @return containerHwm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the high watermark of all distinct containers over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_CONTAINER_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getContainerHwm() {
    return containerHwm;
  }


  public void setContainerHwm(Long containerHwm) {
    this.containerHwm = containerHwm;
  }


  public UsageSummaryDateOrg customTsAvg(Long customTsAvg) {
    this.customTsAvg = customTsAvg;
    return this;
  }

   /**
   * Shows the average number of distinct custom metrics over all hours in the current date for the given org.
   * @return customTsAvg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the average number of distinct custom metrics over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_TS_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCustomTsAvg() {
    return customTsAvg;
  }


  public void setCustomTsAvg(Long customTsAvg) {
    this.customTsAvg = customTsAvg;
  }


  public UsageSummaryDateOrg fargateTasksCountAvg(Long fargateTasksCountAvg) {
    this.fargateTasksCountAvg = fargateTasksCountAvg;
    return this;
  }

   /**
   * The average task count for Fargate.
   * @return fargateTasksCountAvg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average task count for Fargate.")
  @JsonProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFargateTasksCountAvg() {
    return fargateTasksCountAvg;
  }


  public void setFargateTasksCountAvg(Long fargateTasksCountAvg) {
    this.fargateTasksCountAvg = fargateTasksCountAvg;
  }


  public UsageSummaryDateOrg fargateTasksCountHwm(Long fargateTasksCountHwm) {
    this.fargateTasksCountHwm = fargateTasksCountHwm;
    return this;
  }

   /**
   * Shows the high watermark of all Fargate tasks over all hours in the current date for the given org.
   * @return fargateTasksCountHwm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the high watermark of all Fargate tasks over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFargateTasksCountHwm() {
    return fargateTasksCountHwm;
  }


  public void setFargateTasksCountHwm(Long fargateTasksCountHwm) {
    this.fargateTasksCountHwm = fargateTasksCountHwm;
  }


  public UsageSummaryDateOrg gcpHostTop99p(Long gcpHostTop99p) {
    this.gcpHostTop99p = gcpHostTop99p;
    return this;
  }

   /**
   * Shows the 99th percentile of all GCP hosts over all hours in the current date for the given org.
   * @return gcpHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the 99th percentile of all GCP hosts over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_GCP_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getGcpHostTop99p() {
    return gcpHostTop99p;
  }


  public void setGcpHostTop99p(Long gcpHostTop99p) {
    this.gcpHostTop99p = gcpHostTop99p;
  }


  public UsageSummaryDateOrg id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The organization id.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization id.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UsageSummaryDateOrg indexedEventsCountSum(Long indexedEventsCountSum) {
    this.indexedEventsCountSum = indexedEventsCountSum;
    return this;
  }

   /**
   * Shows the sum of all log events indexed over all hours in the current date for the given org.
   * @return indexedEventsCountSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all log events indexed over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIndexedEventsCountSum() {
    return indexedEventsCountSum;
  }


  public void setIndexedEventsCountSum(Long indexedEventsCountSum) {
    this.indexedEventsCountSum = indexedEventsCountSum;
  }


  public UsageSummaryDateOrg infraHostTop99p(Long infraHostTop99p) {
    this.infraHostTop99p = infraHostTop99p;
    return this;
  }

   /**
   * Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current date for the given org.
   * @return infraHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_INFRA_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInfraHostTop99p() {
    return infraHostTop99p;
  }


  public void setInfraHostTop99p(Long infraHostTop99p) {
    this.infraHostTop99p = infraHostTop99p;
  }


  public UsageSummaryDateOrg ingestedEventsBytesSum(Long ingestedEventsBytesSum) {
    this.ingestedEventsBytesSum = ingestedEventsBytesSum;
    return this;
  }

   /**
   * Shows the sum of all log bytes ingested over all hours in the current date for the given org.
   * @return ingestedEventsBytesSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all log bytes ingested over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIngestedEventsBytesSum() {
    return ingestedEventsBytesSum;
  }


  public void setIngestedEventsBytesSum(Long ingestedEventsBytesSum) {
    this.ingestedEventsBytesSum = ingestedEventsBytesSum;
  }


  public UsageSummaryDateOrg name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The organization name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization name.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UsageSummaryDateOrg netflowIndexedEventsCountSum(Long netflowIndexedEventsCountSum) {
    this.netflowIndexedEventsCountSum = netflowIndexedEventsCountSum;
    return this;
  }

   /**
   * Shows the sum of all Network flows indexed over all hours in the current date for the given org.
   * @return netflowIndexedEventsCountSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all Network flows indexed over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNetflowIndexedEventsCountSum() {
    return netflowIndexedEventsCountSum;
  }


  public void setNetflowIndexedEventsCountSum(Long netflowIndexedEventsCountSum) {
    this.netflowIndexedEventsCountSum = netflowIndexedEventsCountSum;
  }


  public UsageSummaryDateOrg npmHostTop99p(Long npmHostTop99p) {
    this.npmHostTop99p = npmHostTop99p;
    return this;
  }

   /**
   * Shows the 99th percentile of all distinct Networks hosts over all hours in the current date for the given org.
   * @return npmHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the 99th percentile of all distinct Networks hosts over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_NPM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNpmHostTop99p() {
    return npmHostTop99p;
  }


  public void setNpmHostTop99p(Long npmHostTop99p) {
    this.npmHostTop99p = npmHostTop99p;
  }


  public UsageSummaryDateOrg profilingHostTop99p(Long profilingHostTop99p) {
    this.profilingHostTop99p = profilingHostTop99p;
    return this;
  }

   /**
   * Shows the 99th percentile of all profiled hosts over all hours in the current date for all organizations.
   * @return profilingHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the 99th percentile of all profiled hosts over all hours in the current date for all organizations.")
  @JsonProperty(JSON_PROPERTY_PROFILING_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProfilingHostTop99p() {
    return profilingHostTop99p;
  }


  public void setProfilingHostTop99p(Long profilingHostTop99p) {
    this.profilingHostTop99p = profilingHostTop99p;
  }


  public UsageSummaryDateOrg publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

   /**
   * The organization public id.
   * @return publicId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization public id.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicId() {
    return publicId;
  }


  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }


  public UsageSummaryDateOrg rumSessionCountSum(Long rumSessionCountSum) {
    this.rumSessionCountSum = rumSessionCountSum;
    return this;
  }

   /**
   * Shows the sum of all RUM Sessions over all hours in the current date for the given org.
   * @return rumSessionCountSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all RUM Sessions over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_RUM_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRumSessionCountSum() {
    return rumSessionCountSum;
  }


  public void setRumSessionCountSum(Long rumSessionCountSum) {
    this.rumSessionCountSum = rumSessionCountSum;
  }


  public UsageSummaryDateOrg syntheticsBrowserCheckCallsCountSum(Long syntheticsBrowserCheckCallsCountSum) {
    this.syntheticsBrowserCheckCallsCountSum = syntheticsBrowserCheckCallsCountSum;
    return this;
  }

   /**
   * Shows the sum of all Synthetic browser tests over all hours in the current date for the given org.
   * @return syntheticsBrowserCheckCallsCountSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all Synthetic browser tests over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSyntheticsBrowserCheckCallsCountSum() {
    return syntheticsBrowserCheckCallsCountSum;
  }


  public void setSyntheticsBrowserCheckCallsCountSum(Long syntheticsBrowserCheckCallsCountSum) {
    this.syntheticsBrowserCheckCallsCountSum = syntheticsBrowserCheckCallsCountSum;
  }


  public UsageSummaryDateOrg syntheticsCheckCallsCountSum(Long syntheticsCheckCallsCountSum) {
    this.syntheticsCheckCallsCountSum = syntheticsCheckCallsCountSum;
    return this;
  }

   /**
   * Shows the sum of all Synthetic API tests over all hours in the current date for the given org.
   * @return syntheticsCheckCallsCountSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all Synthetic API tests over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSyntheticsCheckCallsCountSum() {
    return syntheticsCheckCallsCountSum;
  }


  public void setSyntheticsCheckCallsCountSum(Long syntheticsCheckCallsCountSum) {
    this.syntheticsCheckCallsCountSum = syntheticsCheckCallsCountSum;
  }


  public UsageSummaryDateOrg traceSearchIndexedEventsCountSum(Long traceSearchIndexedEventsCountSum) {
    this.traceSearchIndexedEventsCountSum = traceSearchIndexedEventsCountSum;
    return this;
  }

   /**
   * Shows the sum of all analyzed spans indexed over all hours in the current date for the given org.
   * @return traceSearchIndexedEventsCountSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all analyzed spans indexed over all hours in the current date for the given org.")
  @JsonProperty(JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTraceSearchIndexedEventsCountSum() {
    return traceSearchIndexedEventsCountSum;
  }


  public void setTraceSearchIndexedEventsCountSum(Long traceSearchIndexedEventsCountSum) {
    this.traceSearchIndexedEventsCountSum = traceSearchIndexedEventsCountSum;
  }


  /**
   * Return true if this UsageSummaryDateOrg object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSummaryDateOrg usageSummaryDateOrg = (UsageSummaryDateOrg) o;
    return Objects.equals(this.agentHostTop99p, usageSummaryDateOrg.agentHostTop99p) &&
        Objects.equals(this.apmHostTop99p, usageSummaryDateOrg.apmHostTop99p) &&
        Objects.equals(this.awsHostTop99p, usageSummaryDateOrg.awsHostTop99p) &&
        Objects.equals(this.awsLambdaFuncCount, usageSummaryDateOrg.awsLambdaFuncCount) &&
        Objects.equals(this.awsLambdaInvocationsSum, usageSummaryDateOrg.awsLambdaInvocationsSum) &&
        Objects.equals(this.billableIngestedBytesSum, usageSummaryDateOrg.billableIngestedBytesSum) &&
        Objects.equals(this.containerAvg, usageSummaryDateOrg.containerAvg) &&
        Objects.equals(this.containerHwm, usageSummaryDateOrg.containerHwm) &&
        Objects.equals(this.customTsAvg, usageSummaryDateOrg.customTsAvg) &&
        Objects.equals(this.fargateTasksCountAvg, usageSummaryDateOrg.fargateTasksCountAvg) &&
        Objects.equals(this.fargateTasksCountHwm, usageSummaryDateOrg.fargateTasksCountHwm) &&
        Objects.equals(this.gcpHostTop99p, usageSummaryDateOrg.gcpHostTop99p) &&
        Objects.equals(this.id, usageSummaryDateOrg.id) &&
        Objects.equals(this.indexedEventsCountSum, usageSummaryDateOrg.indexedEventsCountSum) &&
        Objects.equals(this.infraHostTop99p, usageSummaryDateOrg.infraHostTop99p) &&
        Objects.equals(this.ingestedEventsBytesSum, usageSummaryDateOrg.ingestedEventsBytesSum) &&
        Objects.equals(this.name, usageSummaryDateOrg.name) &&
        Objects.equals(this.netflowIndexedEventsCountSum, usageSummaryDateOrg.netflowIndexedEventsCountSum) &&
        Objects.equals(this.npmHostTop99p, usageSummaryDateOrg.npmHostTop99p) &&
        Objects.equals(this.profilingHostTop99p, usageSummaryDateOrg.profilingHostTop99p) &&
        Objects.equals(this.publicId, usageSummaryDateOrg.publicId) &&
        Objects.equals(this.rumSessionCountSum, usageSummaryDateOrg.rumSessionCountSum) &&
        Objects.equals(this.syntheticsBrowserCheckCallsCountSum, usageSummaryDateOrg.syntheticsBrowserCheckCallsCountSum) &&
        Objects.equals(this.syntheticsCheckCallsCountSum, usageSummaryDateOrg.syntheticsCheckCallsCountSum) &&
        Objects.equals(this.traceSearchIndexedEventsCountSum, usageSummaryDateOrg.traceSearchIndexedEventsCountSum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentHostTop99p, apmHostTop99p, awsHostTop99p, awsLambdaFuncCount, awsLambdaInvocationsSum, billableIngestedBytesSum, containerAvg, containerHwm, customTsAvg, fargateTasksCountAvg, fargateTasksCountHwm, gcpHostTop99p, id, indexedEventsCountSum, infraHostTop99p, ingestedEventsBytesSum, name, netflowIndexedEventsCountSum, npmHostTop99p, profilingHostTop99p, publicId, rumSessionCountSum, syntheticsBrowserCheckCallsCountSum, syntheticsCheckCallsCountSum, traceSearchIndexedEventsCountSum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSummaryDateOrg {\n");
    sb.append("    agentHostTop99p: ").append(toIndentedString(agentHostTop99p)).append("\n");
    sb.append("    apmHostTop99p: ").append(toIndentedString(apmHostTop99p)).append("\n");
    sb.append("    awsHostTop99p: ").append(toIndentedString(awsHostTop99p)).append("\n");
    sb.append("    awsLambdaFuncCount: ").append(toIndentedString(awsLambdaFuncCount)).append("\n");
    sb.append("    awsLambdaInvocationsSum: ").append(toIndentedString(awsLambdaInvocationsSum)).append("\n");
    sb.append("    billableIngestedBytesSum: ").append(toIndentedString(billableIngestedBytesSum)).append("\n");
    sb.append("    containerAvg: ").append(toIndentedString(containerAvg)).append("\n");
    sb.append("    containerHwm: ").append(toIndentedString(containerHwm)).append("\n");
    sb.append("    customTsAvg: ").append(toIndentedString(customTsAvg)).append("\n");
    sb.append("    fargateTasksCountAvg: ").append(toIndentedString(fargateTasksCountAvg)).append("\n");
    sb.append("    fargateTasksCountHwm: ").append(toIndentedString(fargateTasksCountHwm)).append("\n");
    sb.append("    gcpHostTop99p: ").append(toIndentedString(gcpHostTop99p)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indexedEventsCountSum: ").append(toIndentedString(indexedEventsCountSum)).append("\n");
    sb.append("    infraHostTop99p: ").append(toIndentedString(infraHostTop99p)).append("\n");
    sb.append("    ingestedEventsBytesSum: ").append(toIndentedString(ingestedEventsBytesSum)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    netflowIndexedEventsCountSum: ").append(toIndentedString(netflowIndexedEventsCountSum)).append("\n");
    sb.append("    npmHostTop99p: ").append(toIndentedString(npmHostTop99p)).append("\n");
    sb.append("    profilingHostTop99p: ").append(toIndentedString(profilingHostTop99p)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    rumSessionCountSum: ").append(toIndentedString(rumSessionCountSum)).append("\n");
    sb.append("    syntheticsBrowserCheckCallsCountSum: ").append(toIndentedString(syntheticsBrowserCheckCallsCountSum)).append("\n");
    sb.append("    syntheticsCheckCallsCountSum: ").append(toIndentedString(syntheticsCheckCallsCountSum)).append("\n");
    sb.append("    traceSearchIndexedEventsCountSum: ").append(toIndentedString(traceSearchIndexedEventsCountSum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


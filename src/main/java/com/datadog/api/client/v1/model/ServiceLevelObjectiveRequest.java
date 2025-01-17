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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A service level objective object includes a service level indicator, thresholds for one or more
 * timeframes, and metadata (<code>name</code>, <code>description</code>, <code>tags</code>, etc.).
 */
@JsonPropertyOrder({
  ServiceLevelObjectiveRequest.JSON_PROPERTY_DESCRIPTION,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_GROUPS,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_MONITOR_IDS,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_NAME,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_QUERY,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_TAGS,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_THRESHOLDS,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceLevelObjectiveRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = null;

  public static final String JSON_PROPERTY_MONITOR_IDS = "monitor_ids";
  private List<Long> monitorIds = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ServiceLevelObjectiveQuery query;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_THRESHOLDS = "thresholds";
  private List<SLOThreshold> thresholds = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private SLOType type;

  public ServiceLevelObjectiveRequest() {}

  @JsonCreator
  public ServiceLevelObjectiveRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_THRESHOLDS)
          List<SLOThreshold> thresholds,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SLOType type) {
    this.name = name;
    this.thresholds = thresholds;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ServiceLevelObjectiveRequest description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * A user-defined description of the service level objective.
   *
   * <p>Always included in service level objective responses (but may be <code>null</code>).
   * Optional in create/update requests.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public ServiceLevelObjectiveRequest groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ServiceLevelObjectiveRequest addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * A list of (up to 100) monitor groups that narrow the scope of a monitor service level
   * objective.
   *
   * <p>Included in service level objective responses if it is not empty. Optional in create/update
   * requests for monitor service level objectives, but may only be used when then length of the
   * <code>monitor_ids</code> field is one.
   *
   * @return groups
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public ServiceLevelObjectiveRequest monitorIds(List<Long> monitorIds) {
    this.monitorIds = monitorIds;
    return this;
  }

  public ServiceLevelObjectiveRequest addMonitorIdsItem(Long monitorIdsItem) {
    if (this.monitorIds == null) {
      this.monitorIds = new ArrayList<>();
    }
    this.monitorIds.add(monitorIdsItem);
    return this;
  }

  /**
   * A list of monitor IDs that defines the scope of a monitor service level objective.
   * <strong>Required if type is <code>monitor</code></strong>.
   *
   * @return monitorIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getMonitorIds() {
    return monitorIds;
  }

  public void setMonitorIds(List<Long> monitorIds) {
    this.monitorIds = monitorIds;
  }

  public ServiceLevelObjectiveRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the service level objective object.
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

  public ServiceLevelObjectiveRequest query(ServiceLevelObjectiveQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * A metric-based SLO. <strong>Required if type is <code>metric</code></strong>. Note that Datadog
   * only allows the sum by aggregator to be used because this will sum up all request counts
   * instead of averaging them, or taking the max or min of all of those requests.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceLevelObjectiveQuery getQuery() {
    return query;
  }

  public void setQuery(ServiceLevelObjectiveQuery query) {
    this.query = query;
  }

  public ServiceLevelObjectiveRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ServiceLevelObjectiveRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags associated with this service level objective. Always included in service level
   * objective responses (but may be empty). Optional in create/update requests.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ServiceLevelObjectiveRequest thresholds(List<SLOThreshold> thresholds) {
    this.thresholds = thresholds;
    for (SLOThreshold item : thresholds) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ServiceLevelObjectiveRequest addThresholdsItem(SLOThreshold thresholdsItem) {
    this.thresholds.add(thresholdsItem);
    this.unparsed |= thresholdsItem.unparsed;
    return this;
  }

  /**
   * The thresholds (timeframes and associated targets) for this service level objective object.
   *
   * @return thresholds
   */
  @JsonProperty(JSON_PROPERTY_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SLOThreshold> getThresholds() {
    return thresholds;
  }

  public void setThresholds(List<SLOThreshold> thresholds) {
    this.thresholds = thresholds;
  }

  public ServiceLevelObjectiveRequest type(SLOType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the service level objective.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SLOType getType() {
    return type;
  }

  public void setType(SLOType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ServiceLevelObjectiveRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLevelObjectiveRequest serviceLevelObjectiveRequest = (ServiceLevelObjectiveRequest) o;
    return Objects.equals(this.description, serviceLevelObjectiveRequest.description)
        && Objects.equals(this.groups, serviceLevelObjectiveRequest.groups)
        && Objects.equals(this.monitorIds, serviceLevelObjectiveRequest.monitorIds)
        && Objects.equals(this.name, serviceLevelObjectiveRequest.name)
        && Objects.equals(this.query, serviceLevelObjectiveRequest.query)
        && Objects.equals(this.tags, serviceLevelObjectiveRequest.tags)
        && Objects.equals(this.thresholds, serviceLevelObjectiveRequest.thresholds)
        && Objects.equals(this.type, serviceLevelObjectiveRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, groups, monitorIds, name, query, tags, thresholds, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLevelObjectiveRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    monitorIds: ").append(toIndentedString(monitorIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

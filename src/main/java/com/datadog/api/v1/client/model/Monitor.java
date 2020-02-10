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
import com.datadog.api.v1.client.model.Creator;
import com.datadog.api.v1.client.model.MonitorOptions;
import com.datadog.api.v1.client.model.MonitorOverallStates;
import com.datadog.api.v1.client.model.MonitorState;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Monitor
 */
@JsonPropertyOrder({
  Monitor.JSON_PROPERTY_CREATED,
  Monitor.JSON_PROPERTY_CREATOR,
  Monitor.JSON_PROPERTY_DELETED,
  Monitor.JSON_PROPERTY_ID,
  Monitor.JSON_PROPERTY_MESSAGE,
  Monitor.JSON_PROPERTY_MODIFIED,
  Monitor.JSON_PROPERTY_MULTI,
  Monitor.JSON_PROPERTY_NAME,
  Monitor.JSON_PROPERTY_OPTIONS,
  Monitor.JSON_PROPERTY_OVERALL_STATE,
  Monitor.JSON_PROPERTY_QUERY,
  Monitor.JSON_PROPERTY_STATE,
  Monitor.JSON_PROPERTY_TAGS,
  Monitor.JSON_PROPERTY_TYPE
})

public class Monitor {
  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private Creator creator;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private OffsetDateTime deleted;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_MULTI = "multi";
  private Boolean multi;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private MonitorOptions options;

  public static final String JSON_PROPERTY_OVERALL_STATE = "overall_state";
  private MonitorOverallStates overallState;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_STATE = "state";
  private MonitorState state;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  /**
   * The type of the monitor
   */
  public enum TypeEnum {
    COMPOSITE("composite"),
    
    EVENT_ALERT("event alert"),
    
    LOG_ALERT("log alert"),
    
    METRIC_ALERT("metric alert"),
    
    PROCESS_ALERT("process alert"),
    
    QUERY_ALERT("query alert"),
    
    SERVICE_CHECK("service check"),
    
    SYNTHETICS_ALERT("synthetics alert"),
    
    TRACE_ANALYTICS_ALERT("trace-analytics alert");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;


  public Monitor created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Monitor creator(Creator creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Creator getCreator() {
    return creator;
  }


  public void setCreator(Creator creator) {
    this.creator = creator;
  }


  public Monitor deleted(OffsetDateTime deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDeleted() {
    return deleted;
  }


  public void setDeleted(OffsetDateTime deleted) {
    this.deleted = deleted;
  }


  public Monitor id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of this monitor
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of this monitor")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Monitor message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A message to include with notifications for this monitor.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A message to include with notifications for this monitor.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Monitor modified(OffsetDateTime modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModified() {
    return modified;
  }


  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  public Monitor multi(Boolean multi) {
    
    this.multi = multi;
    return this;
  }

   /**
   * Get multi
   * @return multi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MULTI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMulti() {
    return multi;
  }


  public void setMulti(Boolean multi) {
    this.multi = multi;
  }


  public Monitor name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Monitor options(MonitorOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitorOptions getOptions() {
    return options;
  }


  public void setOptions(MonitorOptions options) {
    this.options = options;
  }


  public Monitor overallState(MonitorOverallStates overallState) {
    
    this.overallState = overallState;
    return this;
  }

   /**
   * Get overallState
   * @return overallState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERALL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitorOverallStates getOverallState() {
    return overallState;
  }


  public void setOverallState(MonitorOverallStates overallState) {
    this.overallState = overallState;
  }


  public Monitor query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public Monitor state(MonitorState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitorState getState() {
    return state;
  }


  public void setState(MonitorState state) {
    this.state = state;
  }


  public Monitor tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Monitor addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Monitor type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the monitor
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the monitor")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Monitor monitor = (Monitor) o;
    return Objects.equals(this.created, monitor.created) &&
        Objects.equals(this.creator, monitor.creator) &&
        Objects.equals(this.deleted, monitor.deleted) &&
        Objects.equals(this.id, monitor.id) &&
        Objects.equals(this.message, monitor.message) &&
        Objects.equals(this.modified, monitor.modified) &&
        Objects.equals(this.multi, monitor.multi) &&
        Objects.equals(this.name, monitor.name) &&
        Objects.equals(this.options, monitor.options) &&
        Objects.equals(this.overallState, monitor.overallState) &&
        Objects.equals(this.query, monitor.query) &&
        Objects.equals(this.state, monitor.state) &&
        Objects.equals(this.tags, monitor.tags) &&
        Objects.equals(this.type, monitor.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, creator, deleted, id, message, modified, multi, name, options, overallState, query, state, tags, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Monitor {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    multi: ").append(toIndentedString(multi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    overallState: ").append(toIndentedString(overallState)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

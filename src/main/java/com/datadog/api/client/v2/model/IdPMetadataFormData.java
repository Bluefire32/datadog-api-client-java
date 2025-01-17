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
import java.io.File;
import java.util.Objects;

/** The form data submitted to upload IdP metadata */
@JsonPropertyOrder({IdPMetadataFormData.JSON_PROPERTY_IDP_FILE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IdPMetadataFormData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IDP_FILE = "idp_file";
  private File idpFile;

  public IdPMetadataFormData idpFile(File idpFile) {
    this.idpFile = idpFile;
    return this;
  }

  /**
   * The IdP metadata XML file
   *
   * @return idpFile
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDP_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public File getIdpFile() {
    return idpFile;
  }

  public void setIdpFile(File idpFile) {
    this.idpFile = idpFile;
  }

  /** Return true if this IdPMetadataFormData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdPMetadataFormData idPMetadataFormData = (IdPMetadataFormData) o;
    return Objects.equals(this.idpFile, idPMetadataFormData.idpFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idpFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdPMetadataFormData {\n");
    sb.append("    idpFile: ").append(toIndentedString(idpFile)).append("\n");
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

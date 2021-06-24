/*
 * FACT-Finder REST-API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.factfinder.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.factfinder.client.model.ErrorDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeleteResult {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ErrorDescription error;

  public static final String SERIALIZED_NAME_RECORD_ID = "recordId";
  @SerializedName(SERIALIZED_NAME_RECORD_ID)
  private String recordId;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<ErrorDescription> warnings = null;


  public DeleteResult error(ErrorDescription error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ErrorDescription getError() {
    return error;
  }


  public void setError(ErrorDescription error) {
    this.error = error;
  }


  public DeleteResult recordId(String recordId) {
    
    this.recordId = recordId;
    return this;
  }

   /**
   * The id of the record which should be deleted.
   * @return recordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the record which should be deleted.")

  public String getRecordId() {
    return recordId;
  }


  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }


  public DeleteResult success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * If true, the operation succeeded. Otherwise an error occurred which will be described in the error field.
   * @return success
  **/
  @ApiModelProperty(example = "true", required = true, value = "If true, the operation succeeded. Otherwise an error occurred which will be described in the error field.")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public DeleteResult warnings(List<ErrorDescription> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public DeleteResult addWarningsItem(ErrorDescription warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<ErrorDescription>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * A list of all warnings.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of all warnings.")

  public List<ErrorDescription> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<ErrorDescription> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteResult deleteResult = (DeleteResult) o;
    return Objects.equals(this.error, deleteResult.error) &&
        Objects.equals(this.recordId, deleteResult.recordId) &&
        Objects.equals(this.success, deleteResult.success) &&
        Objects.equals(this.warnings, deleteResult.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, recordId, success, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteResult {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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


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
import de.factfinder.client.model.FullRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Contains a list of full records with master and variant values.
 */
@ApiModel(description = "Contains a list of full records with master and variant values.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FullRecordsResult {
  public static final String SERIALIZED_NAME_FIELD_ROLES = "fieldRoles";
  @SerializedName(SERIALIZED_NAME_FIELD_ROLES)
  private Map<String, String> fieldRoles = new HashMap<String, String>();

  public static final String SERIALIZED_NAME_RECORDS = "records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  private List<FullRecord> records = new ArrayList<FullRecord>();


  public FullRecordsResult fieldRoles(Map<String, String> fieldRoles) {
    
    this.fieldRoles = fieldRoles;
    return this;
  }

  public FullRecordsResult putFieldRolesItem(String key, String fieldRolesItem) {
    this.fieldRoles.put(key, fieldRolesItem);
    return this;
  }

   /**
   * A field to role mapping. For example, a field role may be &#39;brand&#39;, meaning that the field contains the manufacturer&#39;s name. (key &#x3D; field role, value &#x3D; field name)
   * @return fieldRoles
  **/
  @ApiModelProperty(required = true, value = "A field to role mapping. For example, a field role may be 'brand', meaning that the field contains the manufacturer's name. (key = field role, value = field name)")

  public Map<String, String> getFieldRoles() {
    return fieldRoles;
  }


  public void setFieldRoles(Map<String, String> fieldRoles) {
    this.fieldRoles = fieldRoles;
  }


  public FullRecordsResult records(List<FullRecord> records) {
    
    this.records = records;
    return this;
  }

  public FullRecordsResult addRecordsItem(FullRecord recordsItem) {
    this.records.add(recordsItem);
    return this;
  }

   /**
   * A list of found records. Records for IDs which are not present in database will be missing.
   * @return records
  **/
  @ApiModelProperty(required = true, value = "A list of found records. Records for IDs which are not present in database will be missing.")

  public List<FullRecord> getRecords() {
    return records;
  }


  public void setRecords(List<FullRecord> records) {
    this.records = records;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullRecordsResult fullRecordsResult = (FullRecordsResult) o;
    return Objects.equals(this.fieldRoles, fullRecordsResult.fieldRoles) &&
        Objects.equals(this.records, fullRecordsResult.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRoles, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullRecordsResult {\n");
    sb.append("    fieldRoles: ").append(toIndentedString(fieldRoles)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

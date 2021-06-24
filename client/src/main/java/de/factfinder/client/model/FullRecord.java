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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a record with master and variant values.
 */
@ApiModel(description = "Represents a record with master and variant values.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FullRecord {
  public static final String SERIALIZED_NAME_MASTER_VALUES = "masterValues";
  @SerializedName(SERIALIZED_NAME_MASTER_VALUES)
  private Map<String, Object> masterValues = new HashMap<String, Object>();

  public static final String SERIALIZED_NAME_VARIANT_VALUES = "variantValues";
  @SerializedName(SERIALIZED_NAME_VARIANT_VALUES)
  private List<Map<String, Object>> variantValues = new ArrayList<Map<String, Object>>();


  public FullRecord masterValues(Map<String, Object> masterValues) {
    
    this.masterValues = masterValues;
    return this;
  }

  public FullRecord putMasterValuesItem(String key, Object masterValuesItem) {
    this.masterValues.put(key, masterValuesItem);
    return this;
  }

   /**
   * Contains all fields in the record, with a string representation of the respective values.
   * @return masterValues
  **/
  @ApiModelProperty(required = true, value = "Contains all fields in the record, with a string representation of the respective values.")

  public Map<String, Object> getMasterValues() {
    return masterValues;
  }


  public void setMasterValues(Map<String, Object> masterValues) {
    this.masterValues = masterValues;
  }


  public FullRecord variantValues(List<Map<String, Object>> variantValues) {
    
    this.variantValues = variantValues;
    return this;
  }

  public FullRecord addVariantValuesItem(Map<String, Object> variantValuesItem) {
    this.variantValues.add(variantValuesItem);
    return this;
  }

   /**
   * Contains variants. The values are mapped from field names to the field value.
   * @return variantValues
  **/
  @ApiModelProperty(required = true, value = "Contains variants. The values are mapped from field names to the field value.")

  public List<Map<String, Object>> getVariantValues() {
    return variantValues;
  }


  public void setVariantValues(List<Map<String, Object>> variantValues) {
    this.variantValues = variantValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullRecord fullRecord = (FullRecord) o;
    return Objects.equals(this.masterValues, fullRecord.masterValues) &&
        Objects.equals(this.variantValues, fullRecord.variantValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterValues, variantValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullRecord {\n");
    sb.append("    masterValues: ").append(toIndentedString(masterValues)).append("\n");
    sb.append("    variantValues: ").append(toIndentedString(variantValues)).append("\n");
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

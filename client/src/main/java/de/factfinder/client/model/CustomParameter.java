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
import java.util.List;

/**
 * CustomParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomParameter {
  public static final String SERIALIZED_NAME_CACHE_IRRELEVANT = "cacheIrrelevant";
  @SerializedName(SERIALIZED_NAME_CACHE_IRRELEVANT)
  private Boolean cacheIrrelevant;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = new ArrayList<String>();


  public CustomParameter cacheIrrelevant(Boolean cacheIrrelevant) {
    
    this.cacheIrrelevant = cacheIrrelevant;
    return this;
  }

   /**
   * When set to true, the custom parameter will not influence caching.
   * @return cacheIrrelevant
  **/
  @ApiModelProperty(required = true, value = "When set to true, the custom parameter will not influence caching.")

  public Boolean getCacheIrrelevant() {
    return cacheIrrelevant;
  }


  public void setCacheIrrelevant(Boolean cacheIrrelevant) {
    this.cacheIrrelevant = cacheIrrelevant;
  }


  public CustomParameter name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The parameter name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The parameter name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CustomParameter values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public CustomParameter addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The parameter values.
   * @return values
  **/
  @ApiModelProperty(required = true, value = "The parameter values.")

  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomParameter customParameter = (CustomParameter) o;
    return Objects.equals(this.cacheIrrelevant, customParameter.cacheIrrelevant) &&
        Objects.equals(this.name, customParameter.name) &&
        Objects.equals(this.values, customParameter.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheIrrelevant, name, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomParameter {\n");
    sb.append("    cacheIrrelevant: ").append(toIndentedString(cacheIrrelevant)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


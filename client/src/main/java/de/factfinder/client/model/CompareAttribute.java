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

/**
 * CompareAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompareAttribute {
  public static final String SERIALIZED_NAME_DIFFERENT = "different";
  @SerializedName(SERIALIZED_NAME_DIFFERENT)
  private Boolean different;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOURCE_FIELD = "sourceField";
  @SerializedName(SERIALIZED_NAME_SOURCE_FIELD)
  private String sourceField;


  public CompareAttribute different(Boolean different) {
    
    this.different = different;
    return this;
  }

   /**
   * Set to true if the compared products have different values for the attribute.
   * @return different
  **/
  @ApiModelProperty(required = true, value = "Set to true if the compared products have different values for the attribute.")

  public Boolean getDifferent() {
    return different;
  }


  public void setDifferent(Boolean different) {
    this.different = different;
  }


  public CompareAttribute name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the attribute.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the attribute.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CompareAttribute sourceField(String sourceField) {
    
    this.sourceField = sourceField;
    return this;
  }

   /**
   * The name of the database field that contains the attribute.
   * @return sourceField
  **/
  @ApiModelProperty(required = true, value = "The name of the database field that contains the attribute.")

  public String getSourceField() {
    return sourceField;
  }


  public void setSourceField(String sourceField) {
    this.sourceField = sourceField;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompareAttribute compareAttribute = (CompareAttribute) o;
    return Objects.equals(this.different, compareAttribute.different) &&
        Objects.equals(this.name, compareAttribute.name) &&
        Objects.equals(this.sourceField, compareAttribute.sourceField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(different, name, sourceField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompareAttribute {\n");
    sb.append("    different: ").append(toIndentedString(different)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceField: ").append(toIndentedString(sourceField)).append("\n");
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


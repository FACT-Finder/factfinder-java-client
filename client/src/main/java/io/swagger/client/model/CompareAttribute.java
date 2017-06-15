/*
 * FACT-Finder REST-API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CompareAttribute
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-14T06:49:07.742+02:00")
public class CompareAttribute {
  @SerializedName("attributeName")
  private String attributeName = null;

  @SerializedName("different")
  private Boolean different = null;

  @SerializedName("sourceField")
  private String sourceField = null;

  public CompareAttribute attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

   /**
   * Get attributeName
   * @return attributeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  public CompareAttribute different(Boolean different) {
    this.different = different;
    return this;
  }

   /**
   * Get different
   * @return different
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDifferent() {
    return different;
  }

  public void setDifferent(Boolean different) {
    this.different = different;
  }

  public CompareAttribute sourceField(String sourceField) {
    this.sourceField = sourceField;
    return this;
  }

   /**
   * Get sourceField
   * @return sourceField
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSourceField() {
    return sourceField;
  }

  public void setSourceField(String sourceField) {
    this.sourceField = sourceField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompareAttribute compareAttribute = (CompareAttribute) o;
    return Objects.equals(this.attributeName, compareAttribute.attributeName) &&
        Objects.equals(this.different, compareAttribute.different) &&
        Objects.equals(this.sourceField, compareAttribute.sourceField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, different, sourceField);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompareAttribute {\n");
    
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    different: ").append(toIndentedString(different)).append("\n");
    sb.append("    sourceField: ").append(toIndentedString(sourceField)).append("\n");
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


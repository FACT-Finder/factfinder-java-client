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
import io.swagger.client.model.Params;

/**
 * BreadCrumbTrailItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-14T06:49:07.742+02:00")
public class BreadCrumbTrailItem {
  @SerializedName("associatedFieldName")
  private String associatedFieldName = null;

  @SerializedName("searchParams")
  private Params searchParams = null;

  @SerializedName("text")
  private String text = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("search")
    SEARCH("search"),
    
    @SerializedName("filter")
    FILTER("filter"),
    
    @SerializedName("advisor")
    ADVISOR("advisor"),
    
    @SerializedName("unspecified")
    UNSPECIFIED("unspecified");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("value")
  private String value = null;

  public BreadCrumbTrailItem associatedFieldName(String associatedFieldName) {
    this.associatedFieldName = associatedFieldName;
    return this;
  }

   /**
   * Get associatedFieldName
   * @return associatedFieldName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssociatedFieldName() {
    return associatedFieldName;
  }

  public void setAssociatedFieldName(String associatedFieldName) {
    this.associatedFieldName = associatedFieldName;
  }

  public BreadCrumbTrailItem searchParams(Params searchParams) {
    this.searchParams = searchParams;
    return this;
  }

   /**
   * Get searchParams
   * @return searchParams
  **/
  @ApiModelProperty(example = "null", value = "")
  public Params getSearchParams() {
    return searchParams;
  }

  public void setSearchParams(Params searchParams) {
    this.searchParams = searchParams;
  }

  public BreadCrumbTrailItem text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public BreadCrumbTrailItem type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BreadCrumbTrailItem value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreadCrumbTrailItem breadCrumbTrailItem = (BreadCrumbTrailItem) o;
    return Objects.equals(this.associatedFieldName, breadCrumbTrailItem.associatedFieldName) &&
        Objects.equals(this.searchParams, breadCrumbTrailItem.searchParams) &&
        Objects.equals(this.text, breadCrumbTrailItem.text) &&
        Objects.equals(this.type, breadCrumbTrailItem.type) &&
        Objects.equals(this.value, breadCrumbTrailItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedFieldName, searchParams, text, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreadCrumbTrailItem {\n");
    
    sb.append("    associatedFieldName: ").append(toIndentedString(associatedFieldName)).append("\n");
    sb.append("    searchParams: ").append(toIndentedString(searchParams)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

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


package de.factfinder.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import de.factfinder.client.model.Params;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GroupElement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-18T10:39:52.864+02:00")
public class GroupElement {
  @SerializedName("absoluteMaxValue")
  private Double absoluteMaxValue = null;

  @SerializedName("absoluteMinValue")
  private Double absoluteMinValue = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("associatedFieldName")
  private String associatedFieldName = null;

  @SerializedName("clusterLevel")
  private Integer clusterLevel = null;

  @SerializedName("previewImageURL")
  private String previewImageURL = null;

  @SerializedName("recordCount")
  private Integer recordCount = null;

  @SerializedName("searchParams")
  private Params searchParams = null;

  @SerializedName("selected")
  private Boolean selected = null;

  @SerializedName("selectedMaxValue")
  private Double selectedMaxValue = null;

  @SerializedName("selectedMinValue")
  private Double selectedMinValue = null;

  @SerializedName("text")
  private String text = null;

  public GroupElement absoluteMaxValue(Double absoluteMaxValue) {
    this.absoluteMaxValue = absoluteMaxValue;
    return this;
  }

   /**
   * Get absoluteMaxValue
   * @return absoluteMaxValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getAbsoluteMaxValue() {
    return absoluteMaxValue;
  }

  public void setAbsoluteMaxValue(Double absoluteMaxValue) {
    this.absoluteMaxValue = absoluteMaxValue;
  }

  public GroupElement absoluteMinValue(Double absoluteMinValue) {
    this.absoluteMinValue = absoluteMinValue;
    return this;
  }

   /**
   * Get absoluteMinValue
   * @return absoluteMinValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getAbsoluteMinValue() {
    return absoluteMinValue;
  }

  public void setAbsoluteMinValue(Double absoluteMinValue) {
    this.absoluteMinValue = absoluteMinValue;
  }

  public GroupElement active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public GroupElement associatedFieldName(String associatedFieldName) {
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

  public GroupElement clusterLevel(Integer clusterLevel) {
    this.clusterLevel = clusterLevel;
    return this;
  }

   /**
   * Get clusterLevel
   * @return clusterLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getClusterLevel() {
    return clusterLevel;
  }

  public void setClusterLevel(Integer clusterLevel) {
    this.clusterLevel = clusterLevel;
  }

  public GroupElement previewImageURL(String previewImageURL) {
    this.previewImageURL = previewImageURL;
    return this;
  }

   /**
   * Get previewImageURL
   * @return previewImageURL
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPreviewImageURL() {
    return previewImageURL;
  }

  public void setPreviewImageURL(String previewImageURL) {
    this.previewImageURL = previewImageURL;
  }

  public GroupElement recordCount(Integer recordCount) {
    this.recordCount = recordCount;
    return this;
  }

   /**
   * Get recordCount
   * @return recordCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Integer recordCount) {
    this.recordCount = recordCount;
  }

  public GroupElement searchParams(Params searchParams) {
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

  public GroupElement selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

   /**
   * Get selected
   * @return selected
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }

  public GroupElement selectedMaxValue(Double selectedMaxValue) {
    this.selectedMaxValue = selectedMaxValue;
    return this;
  }

   /**
   * Get selectedMaxValue
   * @return selectedMaxValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getSelectedMaxValue() {
    return selectedMaxValue;
  }

  public void setSelectedMaxValue(Double selectedMaxValue) {
    this.selectedMaxValue = selectedMaxValue;
  }

  public GroupElement selectedMinValue(Double selectedMinValue) {
    this.selectedMinValue = selectedMinValue;
    return this;
  }

   /**
   * Get selectedMinValue
   * @return selectedMinValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getSelectedMinValue() {
    return selectedMinValue;
  }

  public void setSelectedMinValue(Double selectedMinValue) {
    this.selectedMinValue = selectedMinValue;
  }

  public GroupElement text(String text) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupElement groupElement = (GroupElement) o;
    return Objects.equals(this.absoluteMaxValue, groupElement.absoluteMaxValue) &&
        Objects.equals(this.absoluteMinValue, groupElement.absoluteMinValue) &&
        Objects.equals(this.active, groupElement.active) &&
        Objects.equals(this.associatedFieldName, groupElement.associatedFieldName) &&
        Objects.equals(this.clusterLevel, groupElement.clusterLevel) &&
        Objects.equals(this.previewImageURL, groupElement.previewImageURL) &&
        Objects.equals(this.recordCount, groupElement.recordCount) &&
        Objects.equals(this.searchParams, groupElement.searchParams) &&
        Objects.equals(this.selected, groupElement.selected) &&
        Objects.equals(this.selectedMaxValue, groupElement.selectedMaxValue) &&
        Objects.equals(this.selectedMinValue, groupElement.selectedMinValue) &&
        Objects.equals(this.text, groupElement.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absoluteMaxValue, absoluteMinValue, active, associatedFieldName, clusterLevel, previewImageURL, recordCount, searchParams, selected, selectedMaxValue, selectedMinValue, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupElement {\n");
    
    sb.append("    absoluteMaxValue: ").append(toIndentedString(absoluteMaxValue)).append("\n");
    sb.append("    absoluteMinValue: ").append(toIndentedString(absoluteMinValue)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    associatedFieldName: ").append(toIndentedString(associatedFieldName)).append("\n");
    sb.append("    clusterLevel: ").append(toIndentedString(clusterLevel)).append("\n");
    sb.append("    previewImageURL: ").append(toIndentedString(previewImageURL)).append("\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    searchParams: ").append(toIndentedString(searchParams)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    selectedMaxValue: ").append(toIndentedString(selectedMaxValue)).append("\n");
    sb.append("    selectedMinValue: ").append(toIndentedString(selectedMinValue)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

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
import de.factfinder.client.model.SearchParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FacetElement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FacetElement {
  public static final String SERIALIZED_NAME_ABSOLUTE_MAX_VALUE = "absoluteMaxValue";
  @SerializedName(SERIALIZED_NAME_ABSOLUTE_MAX_VALUE)
  private Double absoluteMaxValue;

  public static final String SERIALIZED_NAME_ABSOLUTE_MIN_VALUE = "absoluteMinValue";
  @SerializedName(SERIALIZED_NAME_ABSOLUTE_MIN_VALUE)
  private Double absoluteMinValue;

  public static final String SERIALIZED_NAME_CLUSTER_LEVEL = "clusterLevel";
  @SerializedName(SERIALIZED_NAME_CLUSTER_LEVEL)
  private Integer clusterLevel;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private Double distance;

  public static final String SERIALIZED_NAME_PREVIEW_IMAGE_U_R_L = "previewImageURL";
  @SerializedName(SERIALIZED_NAME_PREVIEW_IMAGE_U_R_L)
  private String previewImageURL;

  public static final String SERIALIZED_NAME_SEARCH_PARAMS = "searchParams";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARAMS)
  private SearchParams searchParams;

  /**
   * TRUE, if the element is currently selected, IMPLICIT, if the selection is implicit, IRRELEVANT means, that the element has been selected by the user, but does not match any record of the search result, otherwise FALSE.
   */
  @JsonAdapter(SelectedEnum.Adapter.class)
  public enum SelectedEnum {
    TRUE("TRUE"),
    
    FALSE("FALSE"),
    
    IMPLICIT("IMPLICIT"),
    
    IRRELEVANT("IRRELEVANT");

    private String value;

    SelectedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SelectedEnum fromValue(String value) {
      for (SelectedEnum b : SelectedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SelectedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SelectedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SelectedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SelectedEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  private SelectedEnum selected;

  public static final String SERIALIZED_NAME_SELECTED_MAX_VALUE = "selectedMaxValue";
  @SerializedName(SERIALIZED_NAME_SELECTED_MAX_VALUE)
  private Double selectedMaxValue;

  public static final String SERIALIZED_NAME_SELECTED_MIN_VALUE = "selectedMinValue";
  @SerializedName(SERIALIZED_NAME_SELECTED_MIN_VALUE)
  private Double selectedMinValue;

  public static final String SERIALIZED_NAME_SHOW_DISTANCE = "showDistance";
  @SerializedName(SERIALIZED_NAME_SHOW_DISTANCE)
  private Boolean showDistance;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TOTAL_HITS = "totalHits";
  @SerializedName(SERIALIZED_NAME_TOTAL_HITS)
  private Integer totalHits;


  public FacetElement absoluteMaxValue(Double absoluteMaxValue) {
    
    this.absoluteMaxValue = absoluteMaxValue;
    return this;
  }

   /**
   * The absolute maximum value for the overall slider range.
   * @return absoluteMaxValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The absolute maximum value for the overall slider range.")

  public Double getAbsoluteMaxValue() {
    return absoluteMaxValue;
  }


  public void setAbsoluteMaxValue(Double absoluteMaxValue) {
    this.absoluteMaxValue = absoluteMaxValue;
  }


  public FacetElement absoluteMinValue(Double absoluteMinValue) {
    
    this.absoluteMinValue = absoluteMinValue;
    return this;
  }

   /**
   * The absolute minimum value for the overall slider range.
   * @return absoluteMinValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The absolute minimum value for the overall slider range.")

  public Double getAbsoluteMinValue() {
    return absoluteMinValue;
  }


  public void setAbsoluteMinValue(Double absoluteMinValue) {
    this.absoluteMinValue = absoluteMinValue;
  }


  public FacetElement clusterLevel(Integer clusterLevel) {
    
    this.clusterLevel = clusterLevel;
    return this;
  }

   /**
   * Level in the cluster hierarchy. Corresponding subcategories have a higher (deeper) level.
   * @return clusterLevel
  **/
  @ApiModelProperty(required = true, value = "Level in the cluster hierarchy. Corresponding subcategories have a higher (deeper) level.")

  public Integer getClusterLevel() {
    return clusterLevel;
  }


  public void setClusterLevel(Integer clusterLevel) {
    this.clusterLevel = clusterLevel;
  }


  public FacetElement distance(Double distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * The distance between the location of the search and the market location associated with this element.
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The distance between the location of the search and the market location associated with this element.")

  public Double getDistance() {
    return distance;
  }


  public void setDistance(Double distance) {
    this.distance = distance;
  }


  public FacetElement previewImageURL(String previewImageURL) {
    
    this.previewImageURL = previewImageURL;
    return this;
  }

   /**
   * URL to the preview image to be displayed with the element.
   * @return previewImageURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to the preview image to be displayed with the element.")

  public String getPreviewImageURL() {
    return previewImageURL;
  }


  public void setPreviewImageURL(String previewImageURL) {
    this.previewImageURL = previewImageURL;
  }


  public FacetElement searchParams(SearchParams searchParams) {
    
    this.searchParams = searchParams;
    return this;
  }

   /**
   * Get searchParams
   * @return searchParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchParams getSearchParams() {
    return searchParams;
  }


  public void setSearchParams(SearchParams searchParams) {
    this.searchParams = searchParams;
  }


  public FacetElement selected(SelectedEnum selected) {
    
    this.selected = selected;
    return this;
  }

   /**
   * TRUE, if the element is currently selected, IMPLICIT, if the selection is implicit, IRRELEVANT means, that the element has been selected by the user, but does not match any record of the search result, otherwise FALSE.
   * @return selected
  **/
  @ApiModelProperty(required = true, value = "TRUE, if the element is currently selected, IMPLICIT, if the selection is implicit, IRRELEVANT means, that the element has been selected by the user, but does not match any record of the search result, otherwise FALSE.")

  public SelectedEnum getSelected() {
    return selected;
  }


  public void setSelected(SelectedEnum selected) {
    this.selected = selected;
  }


  public FacetElement selectedMaxValue(Double selectedMaxValue) {
    
    this.selectedMaxValue = selectedMaxValue;
    return this;
  }

   /**
   * The maximum value of the currently selected slider range.
   * @return selectedMaxValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum value of the currently selected slider range.")

  public Double getSelectedMaxValue() {
    return selectedMaxValue;
  }


  public void setSelectedMaxValue(Double selectedMaxValue) {
    this.selectedMaxValue = selectedMaxValue;
  }


  public FacetElement selectedMinValue(Double selectedMinValue) {
    
    this.selectedMinValue = selectedMinValue;
    return this;
  }

   /**
   * The minimum value of the currently selected slider range.
   * @return selectedMinValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum value of the currently selected slider range.")

  public Double getSelectedMinValue() {
    return selectedMinValue;
  }


  public void setSelectedMinValue(Double selectedMinValue) {
    this.selectedMinValue = selectedMinValue;
  }


  public FacetElement showDistance(Boolean showDistance) {
    
    this.showDistance = showDistance;
    return this;
  }

   /**
   * If &#39;true&#39;, the distance should be added to the element name label by frontend.
   * @return showDistance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If 'true', the distance should be added to the element name label by frontend.")

  public Boolean getShowDistance() {
    return showDistance;
  }


  public void setShowDistance(Boolean showDistance) {
    this.showDistance = showDistance;
  }


  public FacetElement text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The text to be displayed to the user.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The text to be displayed to the user.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public FacetElement totalHits(Integer totalHits) {
    
    this.totalHits = totalHits;
    return this;
  }

   /**
   * The number of products that the search result should contain when this facet element is selected.
   * @return totalHits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of products that the search result should contain when this facet element is selected.")

  public Integer getTotalHits() {
    return totalHits;
  }


  public void setTotalHits(Integer totalHits) {
    this.totalHits = totalHits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetElement facetElement = (FacetElement) o;
    return Objects.equals(this.absoluteMaxValue, facetElement.absoluteMaxValue) &&
        Objects.equals(this.absoluteMinValue, facetElement.absoluteMinValue) &&
        Objects.equals(this.clusterLevel, facetElement.clusterLevel) &&
        Objects.equals(this.distance, facetElement.distance) &&
        Objects.equals(this.previewImageURL, facetElement.previewImageURL) &&
        Objects.equals(this.searchParams, facetElement.searchParams) &&
        Objects.equals(this.selected, facetElement.selected) &&
        Objects.equals(this.selectedMaxValue, facetElement.selectedMaxValue) &&
        Objects.equals(this.selectedMinValue, facetElement.selectedMinValue) &&
        Objects.equals(this.showDistance, facetElement.showDistance) &&
        Objects.equals(this.text, facetElement.text) &&
        Objects.equals(this.totalHits, facetElement.totalHits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absoluteMaxValue, absoluteMinValue, clusterLevel, distance, previewImageURL, searchParams, selected, selectedMaxValue, selectedMinValue, showDistance, text, totalHits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetElement {\n");
    sb.append("    absoluteMaxValue: ").append(toIndentedString(absoluteMaxValue)).append("\n");
    sb.append("    absoluteMinValue: ").append(toIndentedString(absoluteMinValue)).append("\n");
    sb.append("    clusterLevel: ").append(toIndentedString(clusterLevel)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    previewImageURL: ").append(toIndentedString(previewImageURL)).append("\n");
    sb.append("    searchParams: ").append(toIndentedString(searchParams)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    selectedMaxValue: ").append(toIndentedString(selectedMaxValue)).append("\n");
    sb.append("    selectedMinValue: ").append(toIndentedString(selectedMinValue)).append("\n");
    sb.append("    showDistance: ").append(toIndentedString(showDistance)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    totalHits: ").append(toIndentedString(totalHits)).append("\n");
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


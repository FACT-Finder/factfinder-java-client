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
import de.factfinder.client.model.FacetElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Facet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Facet {
  public static final String SERIALIZED_NAME_ASSOCIATED_FIELD_NAME = "associatedFieldName";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_FIELD_NAME)
  private String associatedFieldName;

  public static final String SERIALIZED_NAME_DETAILED_LINKS = "detailedLinks";
  @SerializedName(SERIALIZED_NAME_DETAILED_LINKS)
  private Integer detailedLinks;

  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private List<FacetElement> elements = new ArrayList<FacetElement>();

  /**
   * The style in which the filter should be displayed.
   */
  @JsonAdapter(FilterStyleEnum.Adapter.class)
  public enum FilterStyleEnum {
    DEFAULT("DEFAULT"),
    
    SLIDER("SLIDER"),
    
    MULTISELECT("MULTISELECT"),
    
    TREE("TREE");

    private String value;

    FilterStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FilterStyleEnum fromValue(String value) {
      for (FilterStyleEnum b : FilterStyleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FilterStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FilterStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FilterStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FilterStyleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FILTER_STYLE = "filterStyle";
  @SerializedName(SERIALIZED_NAME_FILTER_STYLE)
  private FilterStyleEnum filterStyle;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SELECTED_ELEMENTS = "selectedElements";
  @SerializedName(SERIALIZED_NAME_SELECTED_ELEMENTS)
  private List<FacetElement> selectedElements = new ArrayList<FacetElement>();

  /**
   * Defines the way this filter behaves when elements are selected.
   */
  @JsonAdapter(SelectionTypeEnum.Adapter.class)
  public enum SelectionTypeEnum {
    SINGLEHIDEUNSELECTED("singleHideUnselected"),
    
    SINGLESHOWUNSELECTED("singleShowUnselected"),
    
    MULTISELECTOR("multiSelectOr"),
    
    MULTISELECTAND("multiSelectAnd");

    private String value;

    SelectionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SelectionTypeEnum fromValue(String value) {
      for (SelectionTypeEnum b : SelectionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SelectionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SelectionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SelectionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SelectionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SELECTION_TYPE = "selectionType";
  @SerializedName(SERIALIZED_NAME_SELECTION_TYPE)
  private SelectionTypeEnum selectionType;

  public static final String SERIALIZED_NAME_SHOW_PREVIEW_IMAGES = "showPreviewImages";
  @SerializedName(SERIALIZED_NAME_SHOW_PREVIEW_IMAGES)
  private Boolean showPreviewImages;

  /**
   * The type of the filter elements.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FLOAT("FLOAT"),
    
    INTEGER("INTEGER"),
    
    MULTI("MULTI"),
    
    TEXT("TEXT"),
    
    CATEGORY_PATH("CATEGORY_PATH"),
    
    BOOLEAN("BOOLEAN"),
    
    DATE("DATE"),
    
    GTIN("GTIN"),
    
    ALPHANUMERIC("ALPHANUMERIC"),
    
    PROPERTY("PROPERTY"),
    
    GEO("GEO");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;


  public Facet associatedFieldName(String associatedFieldName) {
    
    this.associatedFieldName = associatedFieldName;
    return this;
  }

   /**
   * The name of the field that contains the values represented by this facet.
   * @return associatedFieldName
  **/
  @ApiModelProperty(required = true, value = "The name of the field that contains the values represented by this facet.")

  public String getAssociatedFieldName() {
    return associatedFieldName;
  }


  public void setAssociatedFieldName(String associatedFieldName) {
    this.associatedFieldName = associatedFieldName;
  }


  public Facet detailedLinks(Integer detailedLinks) {
    
    this.detailedLinks = detailedLinks;
    return this;
  }

   /**
   * Number of links to be displayed (for the selection menu).
   * @return detailedLinks
  **/
  @ApiModelProperty(required = true, value = "Number of links to be displayed (for the selection menu).")

  public Integer getDetailedLinks() {
    return detailedLinks;
  }


  public void setDetailedLinks(Integer detailedLinks) {
    this.detailedLinks = detailedLinks;
  }


  public Facet elements(List<FacetElement> elements) {
    
    this.elements = elements;
    return this;
  }

  public Facet addElementsItem(FacetElement elementsItem) {
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * The elements shown in the filter.
   * @return elements
  **/
  @ApiModelProperty(required = true, value = "The elements shown in the filter.")

  public List<FacetElement> getElements() {
    return elements;
  }


  public void setElements(List<FacetElement> elements) {
    this.elements = elements;
  }


  public Facet filterStyle(FilterStyleEnum filterStyle) {
    
    this.filterStyle = filterStyle;
    return this;
  }

   /**
   * The style in which the filter should be displayed.
   * @return filterStyle
  **/
  @ApiModelProperty(required = true, value = "The style in which the filter should be displayed.")

  public FilterStyleEnum getFilterStyle() {
    return filterStyle;
  }


  public void setFilterStyle(FilterStyleEnum filterStyle) {
    this.filterStyle = filterStyle;
  }


  public Facet name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Filter name that should be displayed to the user.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter name that should be displayed to the user.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Facet selectedElements(List<FacetElement> selectedElements) {
    
    this.selectedElements = selectedElements;
    return this;
  }

  public Facet addSelectedElementsItem(FacetElement selectedElementsItem) {
    this.selectedElements.add(selectedElementsItem);
    return this;
  }

   /**
   * The elements of the filter that are currently selected.
   * @return selectedElements
  **/
  @ApiModelProperty(required = true, value = "The elements of the filter that are currently selected.")

  public List<FacetElement> getSelectedElements() {
    return selectedElements;
  }


  public void setSelectedElements(List<FacetElement> selectedElements) {
    this.selectedElements = selectedElements;
  }


  public Facet selectionType(SelectionTypeEnum selectionType) {
    
    this.selectionType = selectionType;
    return this;
  }

   /**
   * Defines the way this filter behaves when elements are selected.
   * @return selectionType
  **/
  @ApiModelProperty(required = true, value = "Defines the way this filter behaves when elements are selected.")

  public SelectionTypeEnum getSelectionType() {
    return selectionType;
  }


  public void setSelectionType(SelectionTypeEnum selectionType) {
    this.selectionType = selectionType;
  }


  public Facet showPreviewImages(Boolean showPreviewImages) {
    
    this.showPreviewImages = showPreviewImages;
    return this;
  }

   /**
   * If true, preview images should be displayed to the user.
   * @return showPreviewImages
  **/
  @ApiModelProperty(required = true, value = "If true, preview images should be displayed to the user.")

  public Boolean getShowPreviewImages() {
    return showPreviewImages;
  }


  public void setShowPreviewImages(Boolean showPreviewImages) {
    this.showPreviewImages = showPreviewImages;
  }


  public Facet type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the filter elements.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the filter elements.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Facet unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * The units to be shown, if filter elements represent (for instance) length, or weight.
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cm", value = "The units to be shown, if filter elements represent (for instance) length, or weight.")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Facet facet = (Facet) o;
    return Objects.equals(this.associatedFieldName, facet.associatedFieldName) &&
        Objects.equals(this.detailedLinks, facet.detailedLinks) &&
        Objects.equals(this.elements, facet.elements) &&
        Objects.equals(this.filterStyle, facet.filterStyle) &&
        Objects.equals(this.name, facet.name) &&
        Objects.equals(this.selectedElements, facet.selectedElements) &&
        Objects.equals(this.selectionType, facet.selectionType) &&
        Objects.equals(this.showPreviewImages, facet.showPreviewImages) &&
        Objects.equals(this.type, facet.type) &&
        Objects.equals(this.unit, facet.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedFieldName, detailedLinks, elements, filterStyle, name, selectedElements, selectionType, showPreviewImages, type, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Facet {\n");
    sb.append("    associatedFieldName: ").append(toIndentedString(associatedFieldName)).append("\n");
    sb.append("    detailedLinks: ").append(toIndentedString(detailedLinks)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    filterStyle: ").append(toIndentedString(filterStyle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selectedElements: ").append(toIndentedString(selectedElements)).append("\n");
    sb.append("    selectionType: ").append(toIndentedString(selectionType)).append("\n");
    sb.append("    showPreviewImages: ").append(toIndentedString(showPreviewImages)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

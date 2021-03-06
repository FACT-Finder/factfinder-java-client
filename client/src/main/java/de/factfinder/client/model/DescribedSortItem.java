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
 * DescribedSortItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DescribedSortItem {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The sort order direction.
   */
  @JsonAdapter(OrderEnum.Adapter.class)
  public enum OrderEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderEnum fromValue(String value) {
      for (OrderEnum b : OrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OrderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderEnum order;

  public static final String SERIALIZED_NAME_SEARCH_PARAMS = "searchParams";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARAMS)
  private SearchParams searchParams;

  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  private Boolean selected;


  public DescribedSortItem description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The sorting option description, which should be displayed frontend.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The sorting option description, which should be displayed frontend.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DescribedSortItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the field to be sorted by, or &#39;Relevancy&#39;, for score based sorting.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the field to be sorted by, or 'Relevancy', for score based sorting.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DescribedSortItem order(OrderEnum order) {
    
    this.order = order;
    return this;
  }

   /**
   * The sort order direction.
   * @return order
  **/
  @ApiModelProperty(required = true, value = "The sort order direction.")

  public OrderEnum getOrder() {
    return order;
  }


  public void setOrder(OrderEnum order) {
    this.order = order;
  }


  public DescribedSortItem searchParams(SearchParams searchParams) {
    
    this.searchParams = searchParams;
    return this;
  }

   /**
   * Get searchParams
   * @return searchParams
  **/
  @ApiModelProperty(required = true, value = "")

  public SearchParams getSearchParams() {
    return searchParams;
  }


  public void setSearchParams(SearchParams searchParams) {
    this.searchParams = searchParams;
  }


  public DescribedSortItem selected(Boolean selected) {
    
    this.selected = selected;
    return this;
  }

   /**
   * If true, the sorting is applied to the current search result.
   * @return selected
  **/
  @ApiModelProperty(required = true, value = "If true, the sorting is applied to the current search result.")

  public Boolean getSelected() {
    return selected;
  }


  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribedSortItem describedSortItem = (DescribedSortItem) o;
    return Objects.equals(this.description, describedSortItem.description) &&
        Objects.equals(this.name, describedSortItem.name) &&
        Objects.equals(this.order, describedSortItem.order) &&
        Objects.equals(this.searchParams, describedSortItem.searchParams) &&
        Objects.equals(this.selected, describedSortItem.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, order, searchParams, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribedSortItem {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    searchParams: ").append(toIndentedString(searchParams)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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


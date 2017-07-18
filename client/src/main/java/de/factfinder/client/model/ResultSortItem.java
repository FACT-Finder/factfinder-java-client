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
 * ResultSortItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-18T10:39:52.864+02:00")
public class ResultSortItem {
  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets order
   */
  public enum OrderEnum {
    @SerializedName("asc")
    ASC("asc"),
    
    @SerializedName("desc")
    DESC("desc");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("order")
  private OrderEnum order = null;

  @SerializedName("relevanceSortItem")
  private Boolean relevanceSortItem = null;

  @SerializedName("searchParams")
  private Params searchParams = null;

  @SerializedName("selected")
  private Boolean selected = null;

  public ResultSortItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ResultSortItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResultSortItem order(OrderEnum order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "null", value = "")
  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }

  public ResultSortItem relevanceSortItem(Boolean relevanceSortItem) {
    this.relevanceSortItem = relevanceSortItem;
    return this;
  }

   /**
   * Get relevanceSortItem
   * @return relevanceSortItem
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRelevanceSortItem() {
    return relevanceSortItem;
  }

  public void setRelevanceSortItem(Boolean relevanceSortItem) {
    this.relevanceSortItem = relevanceSortItem;
  }

  public ResultSortItem searchParams(Params searchParams) {
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

  public ResultSortItem selected(Boolean selected) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultSortItem resultSortItem = (ResultSortItem) o;
    return Objects.equals(this.description, resultSortItem.description) &&
        Objects.equals(this.name, resultSortItem.name) &&
        Objects.equals(this.order, resultSortItem.order) &&
        Objects.equals(this.relevanceSortItem, resultSortItem.relevanceSortItem) &&
        Objects.equals(this.searchParams, resultSortItem.searchParams) &&
        Objects.equals(this.selected, resultSortItem.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, order, relevanceSortItem, searchParams, selected);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultSortItem {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    relevanceSortItem: ").append(toIndentedString(relevanceSortItem)).append("\n");
    sb.append("    searchParams: ").append(toIndentedString(searchParams)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

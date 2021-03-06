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
 * PageLink
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageLink {
  public static final String SERIALIZED_NAME_CURRENT_PAGE = "currentPage";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Boolean currentPage;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_SEARCH_PARAMS = "searchParams";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARAMS)
  private SearchParams searchParams;


  public PageLink currentPage(Boolean currentPage) {
    
    this.currentPage = currentPage;
    return this;
  }

   /**
   * True, when this page is the current page.
   * @return currentPage
  **/
  @ApiModelProperty(required = true, value = "True, when this page is the current page.")

  public Boolean getCurrentPage() {
    return currentPage;
  }


  public void setCurrentPage(Boolean currentPage) {
    this.currentPage = currentPage;
  }


  public PageLink number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * Number of the page in the search result.
   * @return number
  **/
  @ApiModelProperty(required = true, value = "Number of the page in the search result.")

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    this.number = number;
  }


  public PageLink searchParams(SearchParams searchParams) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageLink pageLink = (PageLink) o;
    return Objects.equals(this.currentPage, pageLink.currentPage) &&
        Objects.equals(this.number, pageLink.number) &&
        Objects.equals(this.searchParams, pageLink.searchParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, number, searchParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageLink {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    searchParams: ").append(toIndentedString(searchParams)).append("\n");
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


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
 * PageLink
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-14T06:49:07.742+02:00")
public class PageLink {
  @SerializedName("caption")
  private String caption = null;

  @SerializedName("currentPage")
  private Boolean currentPage = null;

  @SerializedName("number")
  private Integer number = null;

  @SerializedName("searchParams")
  private Params searchParams = null;

  public PageLink caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public PageLink currentPage(Boolean currentPage) {
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Get currentPage
   * @return currentPage
  **/
  @ApiModelProperty(example = "null", value = "")
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
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PageLink searchParams(Params searchParams) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageLink pageLink = (PageLink) o;
    return Objects.equals(this.caption, pageLink.caption) &&
        Objects.equals(this.currentPage, pageLink.currentPage) &&
        Objects.equals(this.number, pageLink.number) &&
        Objects.equals(this.searchParams, pageLink.searchParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caption, currentPage, number, searchParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageLink {\n");
    
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}


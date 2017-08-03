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
import de.factfinder.client.model.PageLink;
import de.factfinder.client.model.PagingConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Paging
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-03T08:09:51.291+02:00")
public class Paging {
  @SerializedName("currentPage")
  private Integer currentPage = null;

  @SerializedName("firstLink")
  private PageLink firstLink = null;

  @SerializedName("lastLink")
  private PageLink lastLink = null;

  @SerializedName("nextLink")
  private PageLink nextLink = null;

  @SerializedName("pageCount")
  private Integer pageCount = null;

  @SerializedName("pageLinks")
  private List<PageLink> pageLinks = new ArrayList<PageLink>();

  @SerializedName("pagingConfig")
  private PagingConfiguration pagingConfig = null;

  @SerializedName("previousLink")
  private PageLink previousLink = null;

  @SerializedName("resultsPerPage")
  private Integer resultsPerPage = null;

  public Paging currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Get currentPage
   * @return currentPage
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public Paging firstLink(PageLink firstLink) {
    this.firstLink = firstLink;
    return this;
  }

   /**
   * Get firstLink
   * @return firstLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public PageLink getFirstLink() {
    return firstLink;
  }

  public void setFirstLink(PageLink firstLink) {
    this.firstLink = firstLink;
  }

  public Paging lastLink(PageLink lastLink) {
    this.lastLink = lastLink;
    return this;
  }

   /**
   * Get lastLink
   * @return lastLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public PageLink getLastLink() {
    return lastLink;
  }

  public void setLastLink(PageLink lastLink) {
    this.lastLink = lastLink;
  }

  public Paging nextLink(PageLink nextLink) {
    this.nextLink = nextLink;
    return this;
  }

   /**
   * Get nextLink
   * @return nextLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public PageLink getNextLink() {
    return nextLink;
  }

  public void setNextLink(PageLink nextLink) {
    this.nextLink = nextLink;
  }

  public Paging pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Get pageCount
   * @return pageCount
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public Paging pageLinks(List<PageLink> pageLinks) {
    this.pageLinks = pageLinks;
    return this;
  }

  public Paging addPageLinksItem(PageLink pageLinksItem) {
    this.pageLinks.add(pageLinksItem);
    return this;
  }

   /**
   * Get pageLinks
   * @return pageLinks
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<PageLink> getPageLinks() {
    return pageLinks;
  }

  public void setPageLinks(List<PageLink> pageLinks) {
    this.pageLinks = pageLinks;
  }

  public Paging pagingConfig(PagingConfiguration pagingConfig) {
    this.pagingConfig = pagingConfig;
    return this;
  }

   /**
   * Get pagingConfig
   * @return pagingConfig
  **/
  @ApiModelProperty(example = "null", value = "")
  public PagingConfiguration getPagingConfig() {
    return pagingConfig;
  }

  public void setPagingConfig(PagingConfiguration pagingConfig) {
    this.pagingConfig = pagingConfig;
  }

  public Paging previousLink(PageLink previousLink) {
    this.previousLink = previousLink;
    return this;
  }

   /**
   * Get previousLink
   * @return previousLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public PageLink getPreviousLink() {
    return previousLink;
  }

  public void setPreviousLink(PageLink previousLink) {
    this.previousLink = previousLink;
  }

  public Paging resultsPerPage(Integer resultsPerPage) {
    this.resultsPerPage = resultsPerPage;
    return this;
  }

   /**
   * Get resultsPerPage
   * @return resultsPerPage
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getResultsPerPage() {
    return resultsPerPage;
  }

  public void setResultsPerPage(Integer resultsPerPage) {
    this.resultsPerPage = resultsPerPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paging paging = (Paging) o;
    return Objects.equals(this.currentPage, paging.currentPage) &&
        Objects.equals(this.firstLink, paging.firstLink) &&
        Objects.equals(this.lastLink, paging.lastLink) &&
        Objects.equals(this.nextLink, paging.nextLink) &&
        Objects.equals(this.pageCount, paging.pageCount) &&
        Objects.equals(this.pageLinks, paging.pageLinks) &&
        Objects.equals(this.pagingConfig, paging.pagingConfig) &&
        Objects.equals(this.previousLink, paging.previousLink) &&
        Objects.equals(this.resultsPerPage, paging.resultsPerPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, firstLink, lastLink, nextLink, pageCount, pageLinks, pagingConfig, previousLink, resultsPerPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paging {\n");
    
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    firstLink: ").append(toIndentedString(firstLink)).append("\n");
    sb.append("    lastLink: ").append(toIndentedString(lastLink)).append("\n");
    sb.append("    nextLink: ").append(toIndentedString(nextLink)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pageLinks: ").append(toIndentedString(pageLinks)).append("\n");
    sb.append("    pagingConfig: ").append(toIndentedString(pagingConfig)).append("\n");
    sb.append("    previousLink: ").append(toIndentedString(previousLink)).append("\n");
    sb.append("    resultsPerPage: ").append(toIndentedString(resultsPerPage)).append("\n");
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


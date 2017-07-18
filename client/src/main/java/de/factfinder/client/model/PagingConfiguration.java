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
import de.factfinder.client.model.ResultsPerPageOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PagingConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-18T10:39:52.864+02:00")
public class PagingConfiguration {
  @SerializedName("defaultResultsPerPage")
  private Integer defaultResultsPerPage = null;

  @SerializedName("linkCount")
  private Integer linkCount = null;

  @SerializedName("nextCaption")
  private String nextCaption = null;

  @SerializedName("previousCaption")
  private String previousCaption = null;

  @SerializedName("resultsPerPage")
  private List<ResultsPerPageOption> resultsPerPage = new ArrayList<ResultsPerPageOption>();

  public PagingConfiguration defaultResultsPerPage(Integer defaultResultsPerPage) {
    this.defaultResultsPerPage = defaultResultsPerPage;
    return this;
  }

   /**
   * Get defaultResultsPerPage
   * @return defaultResultsPerPage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDefaultResultsPerPage() {
    return defaultResultsPerPage;
  }

  public void setDefaultResultsPerPage(Integer defaultResultsPerPage) {
    this.defaultResultsPerPage = defaultResultsPerPage;
  }

  public PagingConfiguration linkCount(Integer linkCount) {
    this.linkCount = linkCount;
    return this;
  }

   /**
   * Get linkCount
   * @return linkCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLinkCount() {
    return linkCount;
  }

  public void setLinkCount(Integer linkCount) {
    this.linkCount = linkCount;
  }

  public PagingConfiguration nextCaption(String nextCaption) {
    this.nextCaption = nextCaption;
    return this;
  }

   /**
   * Get nextCaption
   * @return nextCaption
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNextCaption() {
    return nextCaption;
  }

  public void setNextCaption(String nextCaption) {
    this.nextCaption = nextCaption;
  }

  public PagingConfiguration previousCaption(String previousCaption) {
    this.previousCaption = previousCaption;
    return this;
  }

   /**
   * Get previousCaption
   * @return previousCaption
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPreviousCaption() {
    return previousCaption;
  }

  public void setPreviousCaption(String previousCaption) {
    this.previousCaption = previousCaption;
  }

  public PagingConfiguration resultsPerPage(List<ResultsPerPageOption> resultsPerPage) {
    this.resultsPerPage = resultsPerPage;
    return this;
  }

  public PagingConfiguration addResultsPerPageItem(ResultsPerPageOption resultsPerPageItem) {
    this.resultsPerPage.add(resultsPerPageItem);
    return this;
  }

   /**
   * Get resultsPerPage
   * @return resultsPerPage
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ResultsPerPageOption> getResultsPerPage() {
    return resultsPerPage;
  }

  public void setResultsPerPage(List<ResultsPerPageOption> resultsPerPage) {
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
    PagingConfiguration pagingConfiguration = (PagingConfiguration) o;
    return Objects.equals(this.defaultResultsPerPage, pagingConfiguration.defaultResultsPerPage) &&
        Objects.equals(this.linkCount, pagingConfiguration.linkCount) &&
        Objects.equals(this.nextCaption, pagingConfiguration.nextCaption) &&
        Objects.equals(this.previousCaption, pagingConfiguration.previousCaption) &&
        Objects.equals(this.resultsPerPage, pagingConfiguration.resultsPerPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultResultsPerPage, linkCount, nextCaption, previousCaption, resultsPerPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagingConfiguration {\n");
    
    sb.append("    defaultResultsPerPage: ").append(toIndentedString(defaultResultsPerPage)).append("\n");
    sb.append("    linkCount: ").append(toIndentedString(linkCount)).append("\n");
    sb.append("    nextCaption: ").append(toIndentedString(nextCaption)).append("\n");
    sb.append("    previousCaption: ").append(toIndentedString(previousCaption)).append("\n");
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

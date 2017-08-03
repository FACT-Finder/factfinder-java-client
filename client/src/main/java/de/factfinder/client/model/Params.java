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
import de.factfinder.client.model.AdvisorCampaignStatusHolder;
import de.factfinder.client.model.CustomParameter;
import de.factfinder.client.model.Filter;
import de.factfinder.client.model.SortItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Params
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-03T08:09:51.291+02:00")
public class Params {
  @SerializedName("advisorStatus")
  private AdvisorCampaignStatusHolder advisorStatus = null;

  @SerializedName("articleNumber")
  private Boolean articleNumber = null;

  @SerializedName("channel")
  private String channel = null;

  @SerializedName("customParameters")
  private List<CustomParameter> customParameters = new ArrayList<CustomParameter>();

  @SerializedName("filters")
  private List<Filter> filters = new ArrayList<Filter>();

  @SerializedName("followSearch")
  private Integer followSearch = null;

  @SerializedName("noArticleNumberSearch")
  private Boolean noArticleNumberSearch = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("resultsPerPage")
  private Integer resultsPerPage = null;

  @SerializedName("searchField")
  private String searchField = null;

  @SerializedName("seoPath")
  private String seoPath = null;

  @SerializedName("sortsList")
  private List<SortItem> sortsList = new ArrayList<SortItem>();

  public Params advisorStatus(AdvisorCampaignStatusHolder advisorStatus) {
    this.advisorStatus = advisorStatus;
    return this;
  }

   /**
   * Get advisorStatus
   * @return advisorStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public AdvisorCampaignStatusHolder getAdvisorStatus() {
    return advisorStatus;
  }

  public void setAdvisorStatus(AdvisorCampaignStatusHolder advisorStatus) {
    this.advisorStatus = advisorStatus;
  }

  public Params articleNumber(Boolean articleNumber) {
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * Get articleNumber
   * @return articleNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getArticleNumber() {
    return articleNumber;
  }

  public void setArticleNumber(Boolean articleNumber) {
    this.articleNumber = articleNumber;
  }

  public Params channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public Params customParameters(List<CustomParameter> customParameters) {
    this.customParameters = customParameters;
    return this;
  }

  public Params addCustomParametersItem(CustomParameter customParametersItem) {
    this.customParameters.add(customParametersItem);
    return this;
  }

   /**
   * Get customParameters
   * @return customParameters
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<CustomParameter> getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(List<CustomParameter> customParameters) {
    this.customParameters = customParameters;
  }

  public Params filters(List<Filter> filters) {
    this.filters = filters;
    return this;
  }

  public Params addFiltersItem(Filter filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<Filter> filters) {
    this.filters = filters;
  }

  public Params followSearch(Integer followSearch) {
    this.followSearch = followSearch;
    return this;
  }

   /**
   * Get followSearch
   * @return followSearch
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getFollowSearch() {
    return followSearch;
  }

  public void setFollowSearch(Integer followSearch) {
    this.followSearch = followSearch;
  }

  public Params noArticleNumberSearch(Boolean noArticleNumberSearch) {
    this.noArticleNumberSearch = noArticleNumberSearch;
    return this;
  }

   /**
   * Get noArticleNumberSearch
   * @return noArticleNumberSearch
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getNoArticleNumberSearch() {
    return noArticleNumberSearch;
  }

  public void setNoArticleNumberSearch(Boolean noArticleNumberSearch) {
    this.noArticleNumberSearch = noArticleNumberSearch;
  }

  public Params page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Params query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public Params resultsPerPage(Integer resultsPerPage) {
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

  public Params searchField(String searchField) {
    this.searchField = searchField;
    return this;
  }

   /**
   * Get searchField
   * @return searchField
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSearchField() {
    return searchField;
  }

  public void setSearchField(String searchField) {
    this.searchField = searchField;
  }

  public Params seoPath(String seoPath) {
    this.seoPath = seoPath;
    return this;
  }

   /**
   * Get seoPath
   * @return seoPath
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSeoPath() {
    return seoPath;
  }

  public void setSeoPath(String seoPath) {
    this.seoPath = seoPath;
  }

  public Params sortsList(List<SortItem> sortsList) {
    this.sortsList = sortsList;
    return this;
  }

  public Params addSortsListItem(SortItem sortsListItem) {
    this.sortsList.add(sortsListItem);
    return this;
  }

   /**
   * Get sortsList
   * @return sortsList
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<SortItem> getSortsList() {
    return sortsList;
  }

  public void setSortsList(List<SortItem> sortsList) {
    this.sortsList = sortsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Params params = (Params) o;
    return Objects.equals(this.advisorStatus, params.advisorStatus) &&
        Objects.equals(this.articleNumber, params.articleNumber) &&
        Objects.equals(this.channel, params.channel) &&
        Objects.equals(this.customParameters, params.customParameters) &&
        Objects.equals(this.filters, params.filters) &&
        Objects.equals(this.followSearch, params.followSearch) &&
        Objects.equals(this.noArticleNumberSearch, params.noArticleNumberSearch) &&
        Objects.equals(this.page, params.page) &&
        Objects.equals(this.query, params.query) &&
        Objects.equals(this.resultsPerPage, params.resultsPerPage) &&
        Objects.equals(this.searchField, params.searchField) &&
        Objects.equals(this.seoPath, params.seoPath) &&
        Objects.equals(this.sortsList, params.sortsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advisorStatus, articleNumber, channel, customParameters, filters, followSearch, noArticleNumberSearch, page, query, resultsPerPage, searchField, seoPath, sortsList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Params {\n");
    
    sb.append("    advisorStatus: ").append(toIndentedString(advisorStatus)).append("\n");
    sb.append("    articleNumber: ").append(toIndentedString(articleNumber)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    followSearch: ").append(toIndentedString(followSearch)).append("\n");
    sb.append("    noArticleNumberSearch: ").append(toIndentedString(noArticleNumberSearch)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    resultsPerPage: ").append(toIndentedString(resultsPerPage)).append("\n");
    sb.append("    searchField: ").append(toIndentedString(searchField)).append("\n");
    sb.append("    seoPath: ").append(toIndentedString(seoPath)).append("\n");
    sb.append("    sortsList: ").append(toIndentedString(sortsList)).append("\n");
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


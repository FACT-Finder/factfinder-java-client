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
import de.factfinder.client.model.AdvisorCampaignStatusHolder;
import de.factfinder.client.model.CustomParameter;
import de.factfinder.client.model.Filter;
import de.factfinder.client.model.Location;
import de.factfinder.client.model.SortItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SearchParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchParams {
  public static final String SERIALIZED_NAME_ACTIVE_AB_TESTS = "activeAbTests";
  @SerializedName(SERIALIZED_NAME_ACTIVE_AB_TESTS)
  private Map<String, String> activeAbTests = null;

  public static final String SERIALIZED_NAME_ADVISOR_STATUS = "advisorStatus";
  @SerializedName(SERIALIZED_NAME_ADVISOR_STATUS)
  private AdvisorCampaignStatusHolder advisorStatus;

  /**
   * Specifies if the search term should be interpreted as article number.
   */
  @JsonAdapter(ArticleNumberSearchEnum.Adapter.class)
  public enum ArticleNumberSearchEnum {
    DETECT("DETECT"),
    
    ALWAYS("ALWAYS"),
    
    NEVER("NEVER");

    private String value;

    ArticleNumberSearchEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ArticleNumberSearchEnum fromValue(String value) {
      for (ArticleNumberSearchEnum b : ArticleNumberSearchEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ArticleNumberSearchEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ArticleNumberSearchEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ArticleNumberSearchEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ArticleNumberSearchEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ARTICLE_NUMBER_SEARCH = "articleNumberSearch";
  @SerializedName(SERIALIZED_NAME_ARTICLE_NUMBER_SEARCH)
  private ArticleNumberSearchEnum articleNumberSearch;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_CUSTOM_PARAMETERS = "customParameters";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PARAMETERS)
  private List<CustomParameter> customParameters = null;

  public static final String SERIALIZED_NAME_EXCLUDE_PRODUCTS_NOT_IN_RANGE = "excludeProductsNotInRange";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_PRODUCTS_NOT_IN_RANGE)
  private Boolean excludeProductsNotInRange;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Filter> filters = null;

  public static final String SERIALIZED_NAME_FOLLOW_SEARCH = "followSearch";
  @SerializedName(SERIALIZED_NAME_FOLLOW_SEARCH)
  private String followSearch;

  public static final String SERIALIZED_NAME_HITS_PER_PAGE = "hitsPerPage";
  @SerializedName(SERIALIZED_NAME_HITS_PER_PAGE)
  private Integer hitsPerPage;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location;

  public static final String SERIALIZED_NAME_MARKET_IDS = "marketIds";
  @SerializedName(SERIALIZED_NAME_MARKET_IDS)
  private List<String> marketIds = null;

  public static final String SERIALIZED_NAME_MAX_COUNT_VARIANTS = "maxCountVariants";
  @SerializedName(SERIALIZED_NAME_MAX_COUNT_VARIANTS)
  private Integer maxCountVariants;

  public static final String SERIALIZED_NAME_MAX_DISTANCE = "maxDistance";
  @SerializedName(SERIALIZED_NAME_MAX_DISTANCE)
  private Double maxDistance;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PURCHASER_ID = "purchaserId";
  @SerializedName(SERIALIZED_NAME_PURCHASER_ID)
  private String purchaserId;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_SEARCH_FIELD = "searchField";
  @SerializedName(SERIALIZED_NAME_SEARCH_FIELD)
  private String searchField;

  public static final String SERIALIZED_NAME_SORT_ITEMS = "sortItems";
  @SerializedName(SERIALIZED_NAME_SORT_ITEMS)
  private List<SortItem> sortItems = null;


  public SearchParams activeAbTests(Map<String, String> activeAbTests) {
    
    this.activeAbTests = activeAbTests;
    return this;
  }

  public SearchParams putActiveAbTestsItem(String key, String activeAbTestsItem) {
    if (this.activeAbTests == null) {
      this.activeAbTests = new HashMap<String, String>();
    }
    this.activeAbTests.put(key, activeAbTestsItem);
    return this;
  }

   /**
   * The active ab tests variants.
   * @return activeAbTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The active ab tests variants.")

  public Map<String, String> getActiveAbTests() {
    return activeAbTests;
  }


  public void setActiveAbTests(Map<String, String> activeAbTests) {
    this.activeAbTests = activeAbTests;
  }


  public SearchParams advisorStatus(AdvisorCampaignStatusHolder advisorStatus) {
    
    this.advisorStatus = advisorStatus;
    return this;
  }

   /**
   * Get advisorStatus
   * @return advisorStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdvisorCampaignStatusHolder getAdvisorStatus() {
    return advisorStatus;
  }


  public void setAdvisorStatus(AdvisorCampaignStatusHolder advisorStatus) {
    this.advisorStatus = advisorStatus;
  }


  public SearchParams articleNumberSearch(ArticleNumberSearchEnum articleNumberSearch) {
    
    this.articleNumberSearch = articleNumberSearch;
    return this;
  }

   /**
   * Specifies if the search term should be interpreted as article number.
   * @return articleNumberSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the search term should be interpreted as article number.")

  public ArticleNumberSearchEnum getArticleNumberSearch() {
    return articleNumberSearch;
  }


  public void setArticleNumberSearch(ArticleNumberSearchEnum articleNumberSearch) {
    this.articleNumberSearch = articleNumberSearch;
  }


  public SearchParams channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * The channel in which the search should be performed.
   * @return channel
  **/
  @ApiModelProperty(required = true, value = "The channel in which the search should be performed.")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public SearchParams customParameters(List<CustomParameter> customParameters) {
    
    this.customParameters = customParameters;
    return this;
  }

  public SearchParams addCustomParametersItem(CustomParameter customParametersItem) {
    if (this.customParameters == null) {
      this.customParameters = new ArrayList<CustomParameter>();
    }
    this.customParameters.add(customParametersItem);
    return this;
  }

   /**
   * May be used to provide custom parameters, such as for custom classes.
   * @return customParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "May be used to provide custom parameters, such as for custom classes.")

  public List<CustomParameter> getCustomParameters() {
    return customParameters;
  }


  public void setCustomParameters(List<CustomParameter> customParameters) {
    this.customParameters = customParameters;
  }


  public SearchParams excludeProductsNotInRange(Boolean excludeProductsNotInRange) {
    
    this.excludeProductsNotInRange = excludeProductsNotInRange;
    return this;
  }

   /**
   * Overrides the excludeProductsNotInRange setting for the geo search.
   * @return excludeProductsNotInRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Overrides the excludeProductsNotInRange setting for the geo search.")

  public Boolean getExcludeProductsNotInRange() {
    return excludeProductsNotInRange;
  }


  public void setExcludeProductsNotInRange(Boolean excludeProductsNotInRange) {
    this.excludeProductsNotInRange = excludeProductsNotInRange;
  }


  public SearchParams filters(List<Filter> filters) {
    
    this.filters = filters;
    return this;
  }

  public SearchParams addFiltersItem(Filter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<Filter>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * The filters to limit the search result.
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The filters to limit the search result.")

  public List<Filter> getFilters() {
    return filters;
  }


  public void setFilters(List<Filter> filters) {
    this.filters = filters;
  }


  public SearchParams followSearch(String followSearch) {
    
    this.followSearch = followSearch;
    return this;
  }

   /**
   * Optional request linking param from a previous search result or search param object. Can improve request performance.
   * @return followSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional request linking param from a previous search result or search param object. Can improve request performance.")

  public String getFollowSearch() {
    return followSearch;
  }


  public void setFollowSearch(String followSearch) {
    this.followSearch = followSearch;
  }


  public SearchParams hitsPerPage(Integer hitsPerPage) {
    
    this.hitsPerPage = hitsPerPage;
    return this;
  }

   /**
   * Number of products on a single page.
   * minimum: 0
   * @return hitsPerPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of products on a single page.")

  public Integer getHitsPerPage() {
    return hitsPerPage;
  }


  public void setHitsPerPage(Integer hitsPerPage) {
    this.hitsPerPage = hitsPerPage;
  }


  public SearchParams location(Location location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Location getLocation() {
    return location;
  }


  public void setLocation(Location location) {
    this.location = location;
  }


  public SearchParams marketIds(List<String> marketIds) {
    
    this.marketIds = marketIds;
    return this;
  }

  public SearchParams addMarketIdsItem(String marketIdsItem) {
    if (this.marketIds == null) {
      this.marketIds = new ArrayList<String>();
    }
    this.marketIds.add(marketIdsItem);
    return this;
  }

   /**
   * Only show products that have values for these market IDs.
   * @return marketIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only show products that have values for these market IDs.")

  public List<String> getMarketIds() {
    return marketIds;
  }


  public void setMarketIds(List<String> marketIds) {
    this.marketIds = marketIds;
  }


  public SearchParams maxCountVariants(Integer maxCountVariants) {
    
    this.maxCountVariants = maxCountVariants;
    return this;
  }

   /**
   * Defines the maximum number of variants to be returned in the result.
   * @return maxCountVariants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the maximum number of variants to be returned in the result.")

  public Integer getMaxCountVariants() {
    return maxCountVariants;
  }


  public void setMaxCountVariants(Integer maxCountVariants) {
    this.maxCountVariants = maxCountVariants;
  }


  public SearchParams maxDistance(Double maxDistance) {
    
    this.maxDistance = maxDistance;
    return this;
  }

   /**
   * Overrides the maximum distance setting for the geo search.
   * minimum: 1
   * @return maxDistance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Overrides the maximum distance setting for the geo search.")

  public Double getMaxDistance() {
    return maxDistance;
  }


  public void setMaxDistance(Double maxDistance) {
    this.maxDistance = maxDistance;
  }


  public SearchParams page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * The page to be requested within the search result.
   * minimum: 1
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The page to be requested within the search result.")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public SearchParams purchaserId(String purchaserId) {
    
    this.purchaserId = purchaserId;
    return this;
  }

   /**
   * The ID of the purchaser. This ID is only needed if the &#39;customer specific pricing&#39; module is activated. Otherwise it will be ignored.
   * @return purchaserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the purchaser. This ID is only needed if the 'customer specific pricing' module is activated. Otherwise it will be ignored.")

  public String getPurchaserId() {
    return purchaserId;
  }


  public void setPurchaserId(String purchaserId) {
    this.purchaserId = purchaserId;
  }


  public SearchParams query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * The search term.
   * @return query
  **/
  @ApiModelProperty(required = true, value = "The search term.")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public SearchParams searchField(String searchField) {
    
    this.searchField = searchField;
    return this;
  }

   /**
   * If set, the search term will be looked for only in the given field. Otherwise all searchable fields will be considered (for article number searches, all fields marked as containing article numbers).
   * @return searchField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, the search term will be looked for only in the given field. Otherwise all searchable fields will be considered (for article number searches, all fields marked as containing article numbers).")

  public String getSearchField() {
    return searchField;
  }


  public void setSearchField(String searchField) {
    this.searchField = searchField;
  }


  public SearchParams sortItems(List<SortItem> sortItems) {
    
    this.sortItems = sortItems;
    return this;
  }

  public SearchParams addSortItemsItem(SortItem sortItemsItem) {
    if (this.sortItems == null) {
      this.sortItems = new ArrayList<SortItem>();
    }
    this.sortItems.add(sortItemsItem);
    return this;
  }

   /**
   * Specifies the sort order for the search result.
   * @return sortItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the sort order for the search result.")

  public List<SortItem> getSortItems() {
    return sortItems;
  }


  public void setSortItems(List<SortItem> sortItems) {
    this.sortItems = sortItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchParams searchParams = (SearchParams) o;
    return Objects.equals(this.activeAbTests, searchParams.activeAbTests) &&
        Objects.equals(this.advisorStatus, searchParams.advisorStatus) &&
        Objects.equals(this.articleNumberSearch, searchParams.articleNumberSearch) &&
        Objects.equals(this.channel, searchParams.channel) &&
        Objects.equals(this.customParameters, searchParams.customParameters) &&
        Objects.equals(this.excludeProductsNotInRange, searchParams.excludeProductsNotInRange) &&
        Objects.equals(this.filters, searchParams.filters) &&
        Objects.equals(this.followSearch, searchParams.followSearch) &&
        Objects.equals(this.hitsPerPage, searchParams.hitsPerPage) &&
        Objects.equals(this.location, searchParams.location) &&
        Objects.equals(this.marketIds, searchParams.marketIds) &&
        Objects.equals(this.maxCountVariants, searchParams.maxCountVariants) &&
        Objects.equals(this.maxDistance, searchParams.maxDistance) &&
        Objects.equals(this.page, searchParams.page) &&
        Objects.equals(this.purchaserId, searchParams.purchaserId) &&
        Objects.equals(this.query, searchParams.query) &&
        Objects.equals(this.searchField, searchParams.searchField) &&
        Objects.equals(this.sortItems, searchParams.sortItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeAbTests, advisorStatus, articleNumberSearch, channel, customParameters, excludeProductsNotInRange, filters, followSearch, hitsPerPage, location, marketIds, maxCountVariants, maxDistance, page, purchaserId, query, searchField, sortItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchParams {\n");
    sb.append("    activeAbTests: ").append(toIndentedString(activeAbTests)).append("\n");
    sb.append("    advisorStatus: ").append(toIndentedString(advisorStatus)).append("\n");
    sb.append("    articleNumberSearch: ").append(toIndentedString(articleNumberSearch)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    excludeProductsNotInRange: ").append(toIndentedString(excludeProductsNotInRange)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    followSearch: ").append(toIndentedString(followSearch)).append("\n");
    sb.append("    hitsPerPage: ").append(toIndentedString(hitsPerPage)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    marketIds: ").append(toIndentedString(marketIds)).append("\n");
    sb.append("    maxCountVariants: ").append(toIndentedString(maxCountVariants)).append("\n");
    sb.append("    maxDistance: ").append(toIndentedString(maxDistance)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    purchaserId: ").append(toIndentedString(purchaserId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    searchField: ").append(toIndentedString(searchField)).append("\n");
    sb.append("    sortItems: ").append(toIndentedString(sortItems)).append("\n");
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


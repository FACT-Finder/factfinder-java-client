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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ClickEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ClickEvent {
  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private String campaign;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MASTER_ID = "masterId";
  @SerializedName(SERIALIZED_NAME_MASTER_ID)
  private String masterId;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_POS = "pos";
  @SerializedName(SERIALIZED_NAME_POS)
  private Integer pos;

  public static final String SERIALIZED_NAME_PURCHASER_ID = "purchaserId";
  @SerializedName(SERIALIZED_NAME_PURCHASER_ID)
  private String purchaserId;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;


  public ClickEvent campaign(String campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * If the product was added to search results by a campaign, this field should contain the campaign ID.
   * @return campaign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the product was added to search results by a campaign, this field should contain the campaign ID.")

  public String getCampaign() {
    return campaign;
  }


  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }


  public ClickEvent id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the product.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the product.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ClickEvent masterId(String masterId) {
    
    this.masterId = masterId;
    return this;
  }

   /**
   * Contains the master ID, if the article is a variant and &#39;ID&#39; refers to the variant.
   * @return masterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the master ID, if the article is a variant and 'ID' refers to the variant.")

  public String getMasterId() {
    return masterId;
  }


  public void setMasterId(String masterId) {
    this.masterId = masterId;
  }


  public ClickEvent page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * The page number of the search result that contains the product.
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The page number of the search result that contains the product.")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public ClickEvent pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The current page size (possibly adjusted by the user) when the product was clicked.
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current page size (possibly adjusted by the user) when the product was clicked.")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public ClickEvent pos(Integer pos) {
    
    this.pos = pos;
    return this;
  }

   /**
   * The overall position of the product inside the search result.
   * minimum: 1
   * @return pos
  **/
  @ApiModelProperty(required = true, value = "The overall position of the product inside the search result.")

  public Integer getPos() {
    return pos;
  }


  public void setPos(Integer pos) {
    this.pos = pos;
  }


  public ClickEvent purchaserId(String purchaserId) {
    
    this.purchaserId = purchaserId;
    return this;
  }

   /**
   * The ID for customer specific pricing.
   * @return purchaserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID for customer specific pricing.")

  public String getPurchaserId() {
    return purchaserId;
  }


  public void setPurchaserId(String purchaserId) {
    this.purchaserId = purchaserId;
  }


  public ClickEvent query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * The search term that the user searched for.
   * @return query
  **/
  @ApiModelProperty(required = true, value = "The search term that the user searched for.")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public ClickEvent score(Double score) {
    
    this.score = score;
    return this;
  }

   /**
   * The score of the product.
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The score of the product.")

  public Double getScore() {
    return score;
  }


  public void setScore(Double score) {
    this.score = score;
  }


  public ClickEvent sid(String sid) {
    
    this.sid = sid;
    return this;
  }

   /**
   * The session ID.
   * @return sid
  **/
  @ApiModelProperty(required = true, value = "The session ID.")

  public String getSid() {
    return sid;
  }


  public void setSid(String sid) {
    this.sid = sid;
  }


  public ClickEvent title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the product.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the product.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ClickEvent userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user who issued the request.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the user who issued the request.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClickEvent clickEvent = (ClickEvent) o;
    return Objects.equals(this.campaign, clickEvent.campaign) &&
        Objects.equals(this.id, clickEvent.id) &&
        Objects.equals(this.masterId, clickEvent.masterId) &&
        Objects.equals(this.page, clickEvent.page) &&
        Objects.equals(this.pageSize, clickEvent.pageSize) &&
        Objects.equals(this.pos, clickEvent.pos) &&
        Objects.equals(this.purchaserId, clickEvent.purchaserId) &&
        Objects.equals(this.query, clickEvent.query) &&
        Objects.equals(this.score, clickEvent.score) &&
        Objects.equals(this.sid, clickEvent.sid) &&
        Objects.equals(this.title, clickEvent.title) &&
        Objects.equals(this.userId, clickEvent.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, id, masterId, page, pageSize, pos, purchaserId, query, score, sid, title, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickEvent {\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    masterId: ").append(toIndentedString(masterId)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    purchaserId: ").append(toIndentedString(purchaserId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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


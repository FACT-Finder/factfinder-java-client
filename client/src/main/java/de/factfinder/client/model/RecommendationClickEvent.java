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
 * RecommendationClickEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationClickEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MAIN_ID = "mainId";
  @SerializedName(SERIALIZED_NAME_MAIN_ID)
  private String mainId;

  public static final String SERIALIZED_NAME_MASTER_ID = "masterId";
  @SerializedName(SERIALIZED_NAME_MASTER_ID)
  private String masterId;

  public static final String SERIALIZED_NAME_PURCHASER_ID = "purchaserId";
  @SerializedName(SERIALIZED_NAME_PURCHASER_ID)
  private String purchaserId;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;


  public RecommendationClickEvent id(String id) {
    
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


  public RecommendationClickEvent mainId(String mainId) {
    
    this.mainId = mainId;
    return this;
  }

   /**
   * The product ID for which the clicked product was recommended.
   * @return mainId
  **/
  @ApiModelProperty(required = true, value = "The product ID for which the clicked product was recommended.")

  public String getMainId() {
    return mainId;
  }


  public void setMainId(String mainId) {
    this.mainId = mainId;
  }


  public RecommendationClickEvent masterId(String masterId) {
    
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


  public RecommendationClickEvent purchaserId(String purchaserId) {
    
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


  public RecommendationClickEvent sid(String sid) {
    
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


  public RecommendationClickEvent title(String title) {
    
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


  public RecommendationClickEvent userId(String userId) {
    
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
    RecommendationClickEvent recommendationClickEvent = (RecommendationClickEvent) o;
    return Objects.equals(this.id, recommendationClickEvent.id) &&
        Objects.equals(this.mainId, recommendationClickEvent.mainId) &&
        Objects.equals(this.masterId, recommendationClickEvent.masterId) &&
        Objects.equals(this.purchaserId, recommendationClickEvent.purchaserId) &&
        Objects.equals(this.sid, recommendationClickEvent.sid) &&
        Objects.equals(this.title, recommendationClickEvent.title) &&
        Objects.equals(this.userId, recommendationClickEvent.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mainId, masterId, purchaserId, sid, title, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationClickEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mainId: ").append(toIndentedString(mainId)).append("\n");
    sb.append("    masterId: ").append(toIndentedString(masterId)).append("\n");
    sb.append("    purchaserId: ").append(toIndentedString(purchaserId)).append("\n");
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


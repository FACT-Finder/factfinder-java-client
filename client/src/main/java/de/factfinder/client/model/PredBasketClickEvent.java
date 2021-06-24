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
 * PredBasketClickEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PredBasketClickEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

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


  public PredBasketClickEvent id(String id) {
    
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


  public PredBasketClickEvent masterId(String masterId) {
    
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


  public PredBasketClickEvent purchaserId(String purchaserId) {
    
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


  public PredBasketClickEvent sid(String sid) {
    
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


  public PredBasketClickEvent title(String title) {
    
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


  public PredBasketClickEvent userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The user ID of the user clicking the suggested product.
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The user ID of the user clicking the suggested product.")

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
    PredBasketClickEvent predBasketClickEvent = (PredBasketClickEvent) o;
    return Objects.equals(this.id, predBasketClickEvent.id) &&
        Objects.equals(this.masterId, predBasketClickEvent.masterId) &&
        Objects.equals(this.purchaserId, predBasketClickEvent.purchaserId) &&
        Objects.equals(this.sid, predBasketClickEvent.sid) &&
        Objects.equals(this.title, predBasketClickEvent.title) &&
        Objects.equals(this.userId, predBasketClickEvent.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, masterId, purchaserId, sid, title, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredBasketClickEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


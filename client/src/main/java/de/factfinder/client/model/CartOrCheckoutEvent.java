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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CartOrCheckoutEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-03T08:09:51.291+02:00")
public class CartOrCheckoutEvent {
  @SerializedName("campaign")
  private String campaign = null;

  @SerializedName("cookieId")
  private String cookieId = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("masterId")
  private String masterId = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("sid")
  private String sid = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("userId")
  private String userId = null;

  public CartOrCheckoutEvent campaign(String campaign) {
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getCampaign() {
    return campaign;
  }

  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }

  public CartOrCheckoutEvent cookieId(String cookieId) {
    this.cookieId = cookieId;
    return this;
  }

   /**
   * Get cookieId
   * @return cookieId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCookieId() {
    return cookieId;
  }

  public void setCookieId(String cookieId) {
    this.cookieId = cookieId;
  }

  public CartOrCheckoutEvent count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CartOrCheckoutEvent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CartOrCheckoutEvent masterId(String masterId) {
    this.masterId = masterId;
    return this;
  }

   /**
   * Get masterId
   * @return masterId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMasterId() {
    return masterId;
  }

  public void setMasterId(String masterId) {
    this.masterId = masterId;
  }

  public CartOrCheckoutEvent price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public CartOrCheckoutEvent sid(String sid) {
    this.sid = sid;
    return this;
  }

   /**
   * Get sid
   * @return sid
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public CartOrCheckoutEvent title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CartOrCheckoutEvent userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartOrCheckoutEvent cartOrCheckoutEvent = (CartOrCheckoutEvent) o;
    return Objects.equals(this.campaign, cartOrCheckoutEvent.campaign) &&
        Objects.equals(this.cookieId, cartOrCheckoutEvent.cookieId) &&
        Objects.equals(this.count, cartOrCheckoutEvent.count) &&
        Objects.equals(this.id, cartOrCheckoutEvent.id) &&
        Objects.equals(this.masterId, cartOrCheckoutEvent.masterId) &&
        Objects.equals(this.price, cartOrCheckoutEvent.price) &&
        Objects.equals(this.sid, cartOrCheckoutEvent.sid) &&
        Objects.equals(this.title, cartOrCheckoutEvent.title) &&
        Objects.equals(this.userId, cartOrCheckoutEvent.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, cookieId, count, id, masterId, price, sid, title, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartOrCheckoutEvent {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    cookieId: ").append(toIndentedString(cookieId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    masterId: ").append(toIndentedString(masterId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}


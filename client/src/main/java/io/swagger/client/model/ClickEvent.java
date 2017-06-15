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

/**
 * ClickEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-14T06:49:07.742+02:00")
public class ClickEvent {
  @SerializedName("campaign")
  private String campaign = null;

  @SerializedName("cookieId")
  private String cookieId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("masterId")
  private String masterId = null;

  @SerializedName("origPageSize")
  private Integer origPageSize = null;

  @SerializedName("origPos")
  private Integer origPos = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("pos")
  private Integer pos = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("sid")
  private String sid = null;

  @SerializedName("simi")
  private Double simi = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("userId")
  private String userId = null;

  public ClickEvent campaign(String campaign) {
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCampaign() {
    return campaign;
  }

  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }

  public ClickEvent cookieId(String cookieId) {
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

  public ClickEvent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
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

  public ClickEvent origPageSize(Integer origPageSize) {
    this.origPageSize = origPageSize;
    return this;
  }

   /**
   * Get origPageSize
   * @return origPageSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOrigPageSize() {
    return origPageSize;
  }

  public void setOrigPageSize(Integer origPageSize) {
    this.origPageSize = origPageSize;
  }

  public ClickEvent origPos(Integer origPos) {
    this.origPos = origPos;
    return this;
  }

   /**
   * Get origPos
   * @return origPos
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOrigPos() {
    return origPos;
  }

  public void setOrigPos(Integer origPos) {
    this.origPos = origPos;
  }

  public ClickEvent page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "null", value = "")
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
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(example = "null", value = "")
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
   * Get pos
   * @return pos
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPos() {
    return pos;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public ClickEvent query(String query) {
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

  public ClickEvent sid(String sid) {
    this.sid = sid;
    return this;
  }

   /**
   * Get sid
   * @return sid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public ClickEvent simi(Double simi) {
    this.simi = simi;
    return this;
  }

   /**
   * Get simi
   * @return simi
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getSimi() {
    return simi;
  }

  public void setSimi(Double simi) {
    this.simi = simi;
  }

  public ClickEvent title(String title) {
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

  public ClickEvent userId(String userId) {
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
    ClickEvent clickEvent = (ClickEvent) o;
    return Objects.equals(this.campaign, clickEvent.campaign) &&
        Objects.equals(this.cookieId, clickEvent.cookieId) &&
        Objects.equals(this.id, clickEvent.id) &&
        Objects.equals(this.masterId, clickEvent.masterId) &&
        Objects.equals(this.origPageSize, clickEvent.origPageSize) &&
        Objects.equals(this.origPos, clickEvent.origPos) &&
        Objects.equals(this.page, clickEvent.page) &&
        Objects.equals(this.pageSize, clickEvent.pageSize) &&
        Objects.equals(this.pos, clickEvent.pos) &&
        Objects.equals(this.query, clickEvent.query) &&
        Objects.equals(this.sid, clickEvent.sid) &&
        Objects.equals(this.simi, clickEvent.simi) &&
        Objects.equals(this.title, clickEvent.title) &&
        Objects.equals(this.userId, clickEvent.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, cookieId, id, masterId, origPageSize, origPos, page, pageSize, pos, query, sid, simi, title, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickEvent {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    cookieId: ").append(toIndentedString(cookieId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    masterId: ").append(toIndentedString(masterId)).append("\n");
    sb.append("    origPageSize: ").append(toIndentedString(origPageSize)).append("\n");
    sb.append("    origPos: ").append(toIndentedString(origPos)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    simi: ").append(toIndentedString(simi)).append("\n");
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


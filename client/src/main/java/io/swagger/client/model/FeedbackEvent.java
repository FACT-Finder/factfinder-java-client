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
 * FeedbackEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-14T06:49:07.742+02:00")
public class FeedbackEvent {
  @SerializedName("message")
  private String message = null;

  @SerializedName("positive")
  private Boolean positive = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("sid")
  private String sid = null;

  public FeedbackEvent message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public FeedbackEvent positive(Boolean positive) {
    this.positive = positive;
    return this;
  }

   /**
   * Get positive
   * @return positive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPositive() {
    return positive;
  }

  public void setPositive(Boolean positive) {
    this.positive = positive;
  }

  public FeedbackEvent query(String query) {
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

  public FeedbackEvent sid(String sid) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackEvent feedbackEvent = (FeedbackEvent) o;
    return Objects.equals(this.message, feedbackEvent.message) &&
        Objects.equals(this.positive, feedbackEvent.positive) &&
        Objects.equals(this.query, feedbackEvent.query) &&
        Objects.equals(this.sid, feedbackEvent.sid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, positive, query, sid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackEvent {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    positive: ").append(toIndentedString(positive)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
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


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
import java.util.ArrayList;
import java.util.List;

/**
 * ImportChannelResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-14T06:49:07.742+02:00")
public class ImportChannelResult {
  @SerializedName("errorMessages")
  private List<String> errorMessages = new ArrayList<String>();

  @SerializedName("statusMessages")
  private List<String> statusMessages = new ArrayList<String>();

  public ImportChannelResult errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public ImportChannelResult addErrorMessagesItem(String errorMessagesItem) {
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

   /**
   * Get errorMessages
   * @return errorMessages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }

  public ImportChannelResult statusMessages(List<String> statusMessages) {
    this.statusMessages = statusMessages;
    return this;
  }

  public ImportChannelResult addStatusMessagesItem(String statusMessagesItem) {
    this.statusMessages.add(statusMessagesItem);
    return this;
  }

   /**
   * Get statusMessages
   * @return statusMessages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getStatusMessages() {
    return statusMessages;
  }

  public void setStatusMessages(List<String> statusMessages) {
    this.statusMessages = statusMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportChannelResult importChannelResult = (ImportChannelResult) o;
    return Objects.equals(this.errorMessages, importChannelResult.errorMessages) &&
        Objects.equals(this.statusMessages, importChannelResult.statusMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessages, statusMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportChannelResult {\n");
    
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    statusMessages: ").append(toIndentedString(statusMessages)).append("\n");
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


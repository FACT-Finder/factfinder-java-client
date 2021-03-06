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
import de.factfinder.client.model.NavigationParams;
import de.factfinder.client.model.SearchControlParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NavigationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NavigationRequest {
  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private NavigationParams params;

  public static final String SERIALIZED_NAME_SEARCH_CONTROL_PARAMS = "searchControlParams";
  @SerializedName(SERIALIZED_NAME_SEARCH_CONTROL_PARAMS)
  private SearchControlParams searchControlParams;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;


  public NavigationRequest params(NavigationParams params) {
    
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(required = true, value = "")

  public NavigationParams getParams() {
    return params;
  }


  public void setParams(NavigationParams params) {
    this.params = params;
  }


  public NavigationRequest searchControlParams(SearchControlParams searchControlParams) {
    
    this.searchControlParams = searchControlParams;
    return this;
  }

   /**
   * Get searchControlParams
   * @return searchControlParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchControlParams getSearchControlParams() {
    return searchControlParams;
  }


  public void setSearchControlParams(SearchControlParams searchControlParams) {
    this.searchControlParams = searchControlParams;
  }


  public NavigationRequest sid(String sid) {
    
    this.sid = sid;
    return this;
  }

   /**
   * The session ID of the user sending this search request.
   * @return sid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The session ID of the user sending this search request.")

  public String getSid() {
    return sid;
  }


  public void setSid(String sid) {
    this.sid = sid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NavigationRequest navigationRequest = (NavigationRequest) o;
    return Objects.equals(this.params, navigationRequest.params) &&
        Objects.equals(this.searchControlParams, navigationRequest.searchControlParams) &&
        Objects.equals(this.sid, navigationRequest.sid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(params, searchControlParams, sid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NavigationRequest {\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    searchControlParams: ").append(toIndentedString(searchControlParams)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
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


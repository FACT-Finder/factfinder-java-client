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
import de.factfinder.client.model.Facet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CategoryNavigation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CategoryNavigation {
  public static final String SERIALIZED_NAME_FACETS = "facets";
  @SerializedName(SERIALIZED_NAME_FACETS)
  private List<Facet> facets = null;

  public static final String SERIALIZED_NAME_TIMED_OUT = "timedOut";
  @SerializedName(SERIALIZED_NAME_TIMED_OUT)
  private Boolean timedOut;


  public CategoryNavigation facets(List<Facet> facets) {
    
    this.facets = facets;
    return this;
  }

  public CategoryNavigation addFacetsItem(Facet facetsItem) {
    if (this.facets == null) {
      this.facets = new ArrayList<Facet>();
    }
    this.facets.add(facetsItem);
    return this;
  }

   /**
   * Get facets
   * @return facets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Facet> getFacets() {
    return facets;
  }


  public void setFacets(List<Facet> facets) {
    this.facets = facets;
  }


  public CategoryNavigation timedOut(Boolean timedOut) {
    
    this.timedOut = timedOut;
    return this;
  }

   /**
   * If true, this search took longer than the timeout currently defined. Therefore, the results may not contain all relevant products.
   * @return timedOut
  **/
  @ApiModelProperty(required = true, value = "If true, this search took longer than the timeout currently defined. Therefore, the results may not contain all relevant products.")

  public Boolean getTimedOut() {
    return timedOut;
  }


  public void setTimedOut(Boolean timedOut) {
    this.timedOut = timedOut;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryNavigation categoryNavigation = (CategoryNavigation) o;
    return Objects.equals(this.facets, categoryNavigation.facets) &&
        Objects.equals(this.timedOut, categoryNavigation.timedOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facets, timedOut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryNavigation {\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    timedOut: ").append(toIndentedString(timedOut)).append("\n");
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


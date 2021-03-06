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
import de.factfinder.client.model.Campaign;
import de.factfinder.client.model.RecommendationResult;
import de.factfinder.client.model.RecordWithId;
import de.factfinder.client.model.SimilarProducts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DetailPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DetailPage {
  public static final String SERIALIZED_NAME_CAMPAIGNS = "campaigns";
  @SerializedName(SERIALIZED_NAME_CAMPAIGNS)
  private List<Campaign> campaigns = null;

  public static final String SERIALIZED_NAME_FIELD_ROLES = "fieldRoles";
  @SerializedName(SERIALIZED_NAME_FIELD_ROLES)
  private Map<String, String> fieldRoles = new HashMap<String, String>();

  public static final String SERIALIZED_NAME_RECOMMENDATIONS = "recommendations";
  @SerializedName(SERIALIZED_NAME_RECOMMENDATIONS)
  private RecommendationResult recommendations;

  public static final String SERIALIZED_NAME_RECORD = "record";
  @SerializedName(SERIALIZED_NAME_RECORD)
  private RecordWithId record;

  public static final String SERIALIZED_NAME_SIMILAR_PRODUCTS = "similarProducts";
  @SerializedName(SERIALIZED_NAME_SIMILAR_PRODUCTS)
  private SimilarProducts similarProducts;


  public DetailPage campaigns(List<Campaign> campaigns) {
    
    this.campaigns = campaigns;
    return this;
  }

  public DetailPage addCampaignsItem(Campaign campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<Campaign>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * Active campaigns for the product with the requested ID.
   * @return campaigns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Active campaigns for the product with the requested ID.")

  public List<Campaign> getCampaigns() {
    return campaigns;
  }


  public void setCampaigns(List<Campaign> campaigns) {
    this.campaigns = campaigns;
  }


  public DetailPage fieldRoles(Map<String, String> fieldRoles) {
    
    this.fieldRoles = fieldRoles;
    return this;
  }

  public DetailPage putFieldRolesItem(String key, String fieldRolesItem) {
    this.fieldRoles.put(key, fieldRolesItem);
    return this;
  }

   /**
   * A field to role mapping. For example, a field role may be &#39;brand&#39;, meaning that the field contains the manufacturer&#39;s name. (key &#x3D; field role, value &#x3D; field name)
   * @return fieldRoles
  **/
  @ApiModelProperty(required = true, value = "A field to role mapping. For example, a field role may be 'brand', meaning that the field contains the manufacturer's name. (key = field role, value = field name)")

  public Map<String, String> getFieldRoles() {
    return fieldRoles;
  }


  public void setFieldRoles(Map<String, String> fieldRoles) {
    this.fieldRoles = fieldRoles;
  }


  public DetailPage recommendations(RecommendationResult recommendations) {
    
    this.recommendations = recommendations;
    return this;
  }

   /**
   * Get recommendations
   * @return recommendations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecommendationResult getRecommendations() {
    return recommendations;
  }


  public void setRecommendations(RecommendationResult recommendations) {
    this.recommendations = recommendations;
  }


  public DetailPage record(RecordWithId record) {
    
    this.record = record;
    return this;
  }

   /**
   * Get record
   * @return record
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecordWithId getRecord() {
    return record;
  }


  public void setRecord(RecordWithId record) {
    this.record = record;
  }


  public DetailPage similarProducts(SimilarProducts similarProducts) {
    
    this.similarProducts = similarProducts;
    return this;
  }

   /**
   * Get similarProducts
   * @return similarProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SimilarProducts getSimilarProducts() {
    return similarProducts;
  }


  public void setSimilarProducts(SimilarProducts similarProducts) {
    this.similarProducts = similarProducts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailPage detailPage = (DetailPage) o;
    return Objects.equals(this.campaigns, detailPage.campaigns) &&
        Objects.equals(this.fieldRoles, detailPage.fieldRoles) &&
        Objects.equals(this.recommendations, detailPage.recommendations) &&
        Objects.equals(this.record, detailPage.record) &&
        Objects.equals(this.similarProducts, detailPage.similarProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, fieldRoles, recommendations, record, similarProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailPage {\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    fieldRoles: ").append(toIndentedString(fieldRoles)).append("\n");
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    similarProducts: ").append(toIndentedString(similarProducts)).append("\n");
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


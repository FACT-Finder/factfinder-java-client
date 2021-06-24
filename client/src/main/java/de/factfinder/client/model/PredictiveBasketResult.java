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
import de.factfinder.client.model.TypedFlatRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PredictiveBasketResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PredictiveBasketResult {
  public static final String SERIALIZED_NAME_HITS = "hits";
  @SerializedName(SERIALIZED_NAME_HITS)
  private List<TypedFlatRecord> hits = new ArrayList<TypedFlatRecord>();


  public PredictiveBasketResult hits(List<TypedFlatRecord> hits) {
    
    this.hits = hits;
    return this;
  }

  public PredictiveBasketResult addHitsItem(TypedFlatRecord hitsItem) {
    this.hits.add(hitsItem);
    return this;
  }

   /**
   * Records of the predicted products.
   * @return hits
  **/
  @ApiModelProperty(required = true, value = "Records of the predicted products.")

  public List<TypedFlatRecord> getHits() {
    return hits;
  }


  public void setHits(List<TypedFlatRecord> hits) {
    this.hits = hits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictiveBasketResult predictiveBasketResult = (PredictiveBasketResult) o;
    return Objects.equals(this.hits, predictiveBasketResult.hits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictiveBasketResult {\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
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

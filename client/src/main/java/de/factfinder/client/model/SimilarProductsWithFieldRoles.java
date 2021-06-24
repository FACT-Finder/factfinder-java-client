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
import de.factfinder.client.model.SimilarAttributeInfo;
import de.factfinder.client.model.TypedFlatRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SimilarProductsWithFieldRoles
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SimilarProductsWithFieldRoles {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<SimilarAttributeInfo> attributes = new ArrayList<SimilarAttributeInfo>();

  public static final String SERIALIZED_NAME_FIELD_ROLES = "fieldRoles";
  @SerializedName(SERIALIZED_NAME_FIELD_ROLES)
  private Map<String, String> fieldRoles = new HashMap<String, String>();

  public static final String SERIALIZED_NAME_HITS = "hits";
  @SerializedName(SERIALIZED_NAME_HITS)
  private List<TypedFlatRecord> hits = new ArrayList<TypedFlatRecord>();


  public SimilarProductsWithFieldRoles attributes(List<SimilarAttributeInfo> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public SimilarProductsWithFieldRoles addAttributesItem(SimilarAttributeInfo attributesItem) {
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * The criteria used to find the similar products..
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "The criteria used to find the similar products..")

  public List<SimilarAttributeInfo> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<SimilarAttributeInfo> attributes) {
    this.attributes = attributes;
  }


  public SimilarProductsWithFieldRoles fieldRoles(Map<String, String> fieldRoles) {
    
    this.fieldRoles = fieldRoles;
    return this;
  }

  public SimilarProductsWithFieldRoles putFieldRolesItem(String key, String fieldRolesItem) {
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


  public SimilarProductsWithFieldRoles hits(List<TypedFlatRecord> hits) {
    
    this.hits = hits;
    return this;
  }

  public SimilarProductsWithFieldRoles addHitsItem(TypedFlatRecord hitsItem) {
    this.hits.add(hitsItem);
    return this;
  }

   /**
   * The similar products.
   * @return hits
  **/
  @ApiModelProperty(required = true, value = "The similar products.")

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
    SimilarProductsWithFieldRoles similarProductsWithFieldRoles = (SimilarProductsWithFieldRoles) o;
    return Objects.equals(this.attributes, similarProductsWithFieldRoles.attributes) &&
        Objects.equals(this.fieldRoles, similarProductsWithFieldRoles.fieldRoles) &&
        Objects.equals(this.hits, similarProductsWithFieldRoles.hits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, fieldRoles, hits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarProductsWithFieldRoles {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    fieldRoles: ").append(toIndentedString(fieldRoles)).append("\n");
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

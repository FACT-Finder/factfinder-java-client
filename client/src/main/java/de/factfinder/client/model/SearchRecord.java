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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SearchRecord
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-03T08:09:51.291+02:00")
public class SearchRecord {
  @SerializedName("foundWords")
  private List<String> foundWords = new ArrayList<String>();

  @SerializedName("id")
  private String id = null;

  @SerializedName("keywords")
  private List<String> keywords = new ArrayList<String>();

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("record")
  private Map<String, String> record = new HashMap<String, String>();

  @SerializedName("searchSimilarity")
  private Float searchSimilarity = null;

  public SearchRecord foundWords(List<String> foundWords) {
    this.foundWords = foundWords;
    return this;
  }

  public SearchRecord addFoundWordsItem(String foundWordsItem) {
    this.foundWords.add(foundWordsItem);
    return this;
  }

   /**
   * Get foundWords
   * @return foundWords
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<String> getFoundWords() {
    return foundWords;
  }

  public void setFoundWords(List<String> foundWords) {
    this.foundWords = foundWords;
  }

  public SearchRecord id(String id) {
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

  public SearchRecord keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public SearchRecord addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public SearchRecord position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public SearchRecord record(Map<String, String> record) {
    this.record = record;
    return this;
  }

  public SearchRecord putRecordItem(String key, String recordItem) {
    this.record.put(key, recordItem);
    return this;
  }

   /**
   * Get record
   * @return record
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Map<String, String> getRecord() {
    return record;
  }

  public void setRecord(Map<String, String> record) {
    this.record = record;
  }

  public SearchRecord searchSimilarity(Float searchSimilarity) {
    this.searchSimilarity = searchSimilarity;
    return this;
  }

   /**
   * Get searchSimilarity
   * @return searchSimilarity
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Float getSearchSimilarity() {
    return searchSimilarity;
  }

  public void setSearchSimilarity(Float searchSimilarity) {
    this.searchSimilarity = searchSimilarity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRecord searchRecord = (SearchRecord) o;
    return Objects.equals(this.foundWords, searchRecord.foundWords) &&
        Objects.equals(this.id, searchRecord.id) &&
        Objects.equals(this.keywords, searchRecord.keywords) &&
        Objects.equals(this.position, searchRecord.position) &&
        Objects.equals(this.record, searchRecord.record) &&
        Objects.equals(this.searchSimilarity, searchRecord.searchSimilarity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foundWords, id, keywords, position, record, searchSimilarity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRecord {\n");
    
    sb.append("    foundWords: ").append(toIndentedString(foundWords)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    searchSimilarity: ").append(toIndentedString(searchSimilarity)).append("\n");
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


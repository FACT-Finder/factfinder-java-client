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
 * SearchControlParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-03T08:09:51.291+02:00")
public class SearchControlParams {
  @SerializedName("disableCache")
  private Boolean disableCache = null;

  @SerializedName("generateAdvisorTree")
  private Boolean generateAdvisorTree = null;

  @SerializedName("idsOnly")
  private Boolean idsOnly = null;

  @SerializedName("useAsn")
  private Boolean useAsn = null;

  @SerializedName("useAso")
  private Boolean useAso = null;

  @SerializedName("useCampaigns")
  private Boolean useCampaigns = null;

  @SerializedName("useFoundWords")
  private Boolean useFoundWords = null;

  @SerializedName("useKeywords")
  private Boolean useKeywords = null;

  @SerializedName("usePersonalization")
  private Boolean usePersonalization = null;

  @SerializedName("useSemanticEnhancer")
  private Boolean useSemanticEnhancer = null;

  public SearchControlParams disableCache(Boolean disableCache) {
    this.disableCache = disableCache;
    return this;
  }

   /**
   * Get disableCache
   * @return disableCache
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getDisableCache() {
    return disableCache;
  }

  public void setDisableCache(Boolean disableCache) {
    this.disableCache = disableCache;
  }

  public SearchControlParams generateAdvisorTree(Boolean generateAdvisorTree) {
    this.generateAdvisorTree = generateAdvisorTree;
    return this;
  }

   /**
   * Get generateAdvisorTree
   * @return generateAdvisorTree
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getGenerateAdvisorTree() {
    return generateAdvisorTree;
  }

  public void setGenerateAdvisorTree(Boolean generateAdvisorTree) {
    this.generateAdvisorTree = generateAdvisorTree;
  }

  public SearchControlParams idsOnly(Boolean idsOnly) {
    this.idsOnly = idsOnly;
    return this;
  }

   /**
   * Get idsOnly
   * @return idsOnly
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getIdsOnly() {
    return idsOnly;
  }

  public void setIdsOnly(Boolean idsOnly) {
    this.idsOnly = idsOnly;
  }

  public SearchControlParams useAsn(Boolean useAsn) {
    this.useAsn = useAsn;
    return this;
  }

   /**
   * Get useAsn
   * @return useAsn
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getUseAsn() {
    return useAsn;
  }

  public void setUseAsn(Boolean useAsn) {
    this.useAsn = useAsn;
  }

  public SearchControlParams useAso(Boolean useAso) {
    this.useAso = useAso;
    return this;
  }

   /**
   * Get useAso
   * @return useAso
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getUseAso() {
    return useAso;
  }

  public void setUseAso(Boolean useAso) {
    this.useAso = useAso;
  }

  public SearchControlParams useCampaigns(Boolean useCampaigns) {
    this.useCampaigns = useCampaigns;
    return this;
  }

   /**
   * Get useCampaigns
   * @return useCampaigns
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getUseCampaigns() {
    return useCampaigns;
  }

  public void setUseCampaigns(Boolean useCampaigns) {
    this.useCampaigns = useCampaigns;
  }

  public SearchControlParams useFoundWords(Boolean useFoundWords) {
    this.useFoundWords = useFoundWords;
    return this;
  }

   /**
   * Get useFoundWords
   * @return useFoundWords
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getUseFoundWords() {
    return useFoundWords;
  }

  public void setUseFoundWords(Boolean useFoundWords) {
    this.useFoundWords = useFoundWords;
  }

  public SearchControlParams useKeywords(Boolean useKeywords) {
    this.useKeywords = useKeywords;
    return this;
  }

   /**
   * Get useKeywords
   * @return useKeywords
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getUseKeywords() {
    return useKeywords;
  }

  public void setUseKeywords(Boolean useKeywords) {
    this.useKeywords = useKeywords;
  }

  public SearchControlParams usePersonalization(Boolean usePersonalization) {
    this.usePersonalization = usePersonalization;
    return this;
  }

   /**
   * Get usePersonalization
   * @return usePersonalization
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getUsePersonalization() {
    return usePersonalization;
  }

  public void setUsePersonalization(Boolean usePersonalization) {
    this.usePersonalization = usePersonalization;
  }

  public SearchControlParams useSemanticEnhancer(Boolean useSemanticEnhancer) {
    this.useSemanticEnhancer = useSemanticEnhancer;
    return this;
  }

   /**
   * Get useSemanticEnhancer
   * @return useSemanticEnhancer
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getUseSemanticEnhancer() {
    return useSemanticEnhancer;
  }

  public void setUseSemanticEnhancer(Boolean useSemanticEnhancer) {
    this.useSemanticEnhancer = useSemanticEnhancer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchControlParams searchControlParams = (SearchControlParams) o;
    return Objects.equals(this.disableCache, searchControlParams.disableCache) &&
        Objects.equals(this.generateAdvisorTree, searchControlParams.generateAdvisorTree) &&
        Objects.equals(this.idsOnly, searchControlParams.idsOnly) &&
        Objects.equals(this.useAsn, searchControlParams.useAsn) &&
        Objects.equals(this.useAso, searchControlParams.useAso) &&
        Objects.equals(this.useCampaigns, searchControlParams.useCampaigns) &&
        Objects.equals(this.useFoundWords, searchControlParams.useFoundWords) &&
        Objects.equals(this.useKeywords, searchControlParams.useKeywords) &&
        Objects.equals(this.usePersonalization, searchControlParams.usePersonalization) &&
        Objects.equals(this.useSemanticEnhancer, searchControlParams.useSemanticEnhancer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableCache, generateAdvisorTree, idsOnly, useAsn, useAso, useCampaigns, useFoundWords, useKeywords, usePersonalization, useSemanticEnhancer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchControlParams {\n");
    
    sb.append("    disableCache: ").append(toIndentedString(disableCache)).append("\n");
    sb.append("    generateAdvisorTree: ").append(toIndentedString(generateAdvisorTree)).append("\n");
    sb.append("    idsOnly: ").append(toIndentedString(idsOnly)).append("\n");
    sb.append("    useAsn: ").append(toIndentedString(useAsn)).append("\n");
    sb.append("    useAso: ").append(toIndentedString(useAso)).append("\n");
    sb.append("    useCampaigns: ").append(toIndentedString(useCampaigns)).append("\n");
    sb.append("    useFoundWords: ").append(toIndentedString(useFoundWords)).append("\n");
    sb.append("    useKeywords: ").append(toIndentedString(useKeywords)).append("\n");
    sb.append("    usePersonalization: ").append(toIndentedString(usePersonalization)).append("\n");
    sb.append("    useSemanticEnhancer: ").append(toIndentedString(useSemanticEnhancer)).append("\n");
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


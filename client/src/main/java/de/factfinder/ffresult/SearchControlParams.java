
package de.factfinder.ffresult;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "useKeywords",
    "disableCache",
    "useAsn",
    "generateAdvisorTree",
    "idsOnly",
    "useFoundWords",
    "useCampaigns"
})
public class SearchControlParams {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("useKeywords")
    private Boolean useKeywords;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("disableCache")
    private Boolean disableCache;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("useAsn")
    private Boolean useAsn;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("generateAdvisorTree")
    private Boolean generateAdvisorTree;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idsOnly")
    private Boolean idsOnly;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("useFoundWords")
    private Boolean useFoundWords;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("useCampaigns")
    private Boolean useCampaigns;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The useKeywords
     */
    @JsonProperty("useKeywords")
    public Boolean getUseKeywords() {
        return useKeywords;
    }

    /**
     * 
     * (Required)
     * 
     * @param useKeywords
     *     The useKeywords
     */
    @JsonProperty("useKeywords")
    public void setUseKeywords(Boolean useKeywords) {
        this.useKeywords = useKeywords;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The disableCache
     */
    @JsonProperty("disableCache")
    public Boolean getDisableCache() {
        return disableCache;
    }

    /**
     * 
     * (Required)
     * 
     * @param disableCache
     *     The disableCache
     */
    @JsonProperty("disableCache")
    public void setDisableCache(Boolean disableCache) {
        this.disableCache = disableCache;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The useAsn
     */
    @JsonProperty("useAsn")
    public Boolean getUseAsn() {
        return useAsn;
    }

    /**
     * 
     * (Required)
     * 
     * @param useAsn
     *     The useAsn
     */
    @JsonProperty("useAsn")
    public void setUseAsn(Boolean useAsn) {
        this.useAsn = useAsn;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The generateAdvisorTree
     */
    @JsonProperty("generateAdvisorTree")
    public Boolean getGenerateAdvisorTree() {
        return generateAdvisorTree;
    }

    /**
     * 
     * (Required)
     * 
     * @param generateAdvisorTree
     *     The generateAdvisorTree
     */
    @JsonProperty("generateAdvisorTree")
    public void setGenerateAdvisorTree(Boolean generateAdvisorTree) {
        this.generateAdvisorTree = generateAdvisorTree;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The idsOnly
     */
    @JsonProperty("idsOnly")
    public Boolean getIdsOnly() {
        return idsOnly;
    }

    /**
     * 
     * (Required)
     * 
     * @param idsOnly
     *     The idsOnly
     */
    @JsonProperty("idsOnly")
    public void setIdsOnly(Boolean idsOnly) {
        this.idsOnly = idsOnly;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The useFoundWords
     */
    @JsonProperty("useFoundWords")
    public Boolean getUseFoundWords() {
        return useFoundWords;
    }

    /**
     * 
     * (Required)
     * 
     * @param useFoundWords
     *     The useFoundWords
     */
    @JsonProperty("useFoundWords")
    public void setUseFoundWords(Boolean useFoundWords) {
        this.useFoundWords = useFoundWords;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The useCampaigns
     */
    @JsonProperty("useCampaigns")
    public Boolean getUseCampaigns() {
        return useCampaigns;
    }

    /**
     * 
     * (Required)
     * 
     * @param useCampaigns
     *     The useCampaigns
     */
    @JsonProperty("useCampaigns")
    public void setUseCampaigns(Boolean useCampaigns) {
        this.useCampaigns = useCampaigns;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(useKeywords).append(disableCache).append(useAsn).append(generateAdvisorTree).append(idsOnly).append(useFoundWords).append(useCampaigns).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SearchControlParams) == false) {
            return false;
        }
        SearchControlParams rhs = ((SearchControlParams) other);
        return new EqualsBuilder().append(useKeywords, rhs.useKeywords).append(disableCache, rhs.disableCache).append(useAsn, rhs.useAsn).append(generateAdvisorTree, rhs.generateAdvisorTree).append(idsOnly, rhs.idsOnly).append(useFoundWords, rhs.useFoundWords).append(useCampaigns, rhs.useCampaigns).isEquals();
    }

}

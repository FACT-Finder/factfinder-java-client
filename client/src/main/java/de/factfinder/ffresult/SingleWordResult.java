
package de.factfinder.ffresult;

import java.util.ArrayList;
import java.util.List;
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
    "recordCount",
    "searchParams",
    "previewRecords",
    "word"
})
public class SingleWordResult {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("recordCount")
    private Integer recordCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("searchParams")
    private String searchParams;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("previewRecords")
    private List<PreviewRecord> previewRecords = new ArrayList<PreviewRecord>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("word")
    private String word;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The recordCount
     */
    @JsonProperty("recordCount")
    public Integer getRecordCount() {
        return recordCount;
    }

    /**
     * 
     * (Required)
     * 
     * @param recordCount
     *     The recordCount
     */
    @JsonProperty("recordCount")
    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The searchParams
     */
    @JsonProperty("searchParams")
    public String getSearchParams() {
        return searchParams;
    }

    /**
     * 
     * (Required)
     * 
     * @param searchParams
     *     The searchParams
     */
    @JsonProperty("searchParams")
    public void setSearchParams(String searchParams) {
        this.searchParams = searchParams;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The previewRecords
     */
    @JsonProperty("previewRecords")
    public List<PreviewRecord> getPreviewRecords() {
        return previewRecords;
    }

    /**
     * 
     * (Required)
     * 
     * @param previewRecords
     *     The previewRecords
     */
    @JsonProperty("previewRecords")
    public void setPreviewRecords(List<PreviewRecord> previewRecords) {
        this.previewRecords = previewRecords;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The word
     */
    @JsonProperty("word")
    public String getWord() {
        return word;
    }

    /**
     * 
     * (Required)
     * 
     * @param word
     *     The word
     */
    @JsonProperty("word")
    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recordCount).append(searchParams).append(previewRecords).append(word).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SingleWordResult) == false) {
            return false;
        }
        SingleWordResult rhs = ((SingleWordResult) other);
        return new EqualsBuilder().append(recordCount, rhs.recordCount).append(searchParams, rhs.searchParams).append(previewRecords, rhs.previewRecords).append(word, rhs.word).isEquals();
    }

}


package de.factfinder.ffresult;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.factfinder.api.Record;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "searchSimilarity",
    "position",
    "id",
    "record",
    "keywords",
    "foundWords",
    "simiMalusAdd"
})
public class PreviewRecord {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("searchSimilarity")
    private Double  searchSimilarity;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("position")
    private Integer position;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String  id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("record")
    private Record  record;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keywords")
    private List<String> keywords = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("foundWords")
    private List<String> foundWords = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("simiMalusAdd")
    private Integer simiMalusAdd;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The searchSimilarity
     */
    @JsonProperty("searchSimilarity")
    public Double getSearchSimilarity() {
        return searchSimilarity;
    }

    /**
     * 
     * (Required)
     * 
     * @param searchSimilarity
     *     The searchSimilarity
     */
    @JsonProperty("searchSimilarity")
    public void setSearchSimilarity(Double searchSimilarity) {
        this.searchSimilarity = searchSimilarity;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The position
     */
    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    /**
     * 
     * (Required)
     * 
     * @param position
     *     The position
     */
    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The record
     */
    @JsonProperty("record")
    public Record getRecord() {
        return record;
    }

    /**
     * 
     * (Required)
     * 
     * @param record
     *     The record
     */
    @JsonProperty("record")
    public void setRecord(Record record) {
        this.record = record;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The keywords
     */
    @JsonProperty("keywords")
    public List<String> getKeywords() {
        return keywords;
    }

    /**
     * 
     * (Required)
     * 
     * @param keywords
     *     The keywords
     */
    @JsonProperty("keywords")
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The foundWords
     */
    @JsonProperty("foundWords")
    public List<String> getFoundWords() {
        return foundWords;
    }

    /**
     * 
     * (Required)
     * 
     * @param foundWords
     *     The foundWords
     */
    @JsonProperty("foundWords")
    public void setFoundWords(List<String> foundWords) {
        this.foundWords = foundWords;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The simiMalusAdd
     */
    @JsonProperty("simiMalusAdd")
    public Integer getSimiMalusAdd() {
        return simiMalusAdd;
    }

    /**
     * 
     * (Required)
     * 
     * @param simiMalusAdd
     *     The simiMalusAdd
     */
    @JsonProperty("simiMalusAdd")
    public void setSimiMalusAdd(Integer simiMalusAdd) {
        this.simiMalusAdd = simiMalusAdd;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(searchSimilarity).append(position).append(id).append(record).append(keywords).append(foundWords).append(simiMalusAdd).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PreviewRecord) == false) {
            return false;
        }
        PreviewRecord rhs = ((PreviewRecord) other);
        return new EqualsBuilder().append(searchSimilarity, rhs.searchSimilarity).append(position, rhs.position).append(id, rhs.id).append(record, rhs.record).append(keywords, rhs.keywords).append(foundWords, rhs.foundWords).append(simiMalusAdd, rhs.simiMalusAdd).isEquals();
    }

}

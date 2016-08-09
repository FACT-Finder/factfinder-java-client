
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
    "recordCount",
    "previewImageURL",
    "clusterLevel",
    "selected",
    "searchParams",
    "name",
    "associatedFieldName",
    "absoluteMinValue",
    "absoluteMaxValue",
    "selectedMinValue",
    "selectedMaxValue"
})
public class Element {

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
    @JsonProperty("previewImageURL")
    private String previewImageURL;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("clusterLevel")
    private Integer clusterLevel;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("selected")
    private Boolean selected;
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
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("associatedFieldName")
    private String associatedFieldName;
    @JsonProperty("absoluteMinValue")
    private Integer absoluteMinValue;
    @JsonProperty("absoluteMaxValue")
    private Integer absoluteMaxValue;
    @JsonProperty("selectedMinValue")
    private Integer selectedMinValue;
    @JsonProperty("selectedMaxValue")
    private Integer selectedMaxValue;

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
     *     The previewImageURL
     */
    @JsonProperty("previewImageURL")
    public String getPreviewImageURL() {
        return previewImageURL;
    }

    /**
     * 
     * (Required)
     * 
     * @param previewImageURL
     *     The previewImageURL
     */
    @JsonProperty("previewImageURL")
    public void setPreviewImageURL(String previewImageURL) {
        this.previewImageURL = previewImageURL;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The clusterLevel
     */
    @JsonProperty("clusterLevel")
    public Integer getClusterLevel() {
        return clusterLevel;
    }

    /**
     * 
     * (Required)
     * 
     * @param clusterLevel
     *     The clusterLevel
     */
    @JsonProperty("clusterLevel")
    public void setClusterLevel(Integer clusterLevel) {
        this.clusterLevel = clusterLevel;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The selected
     */
    @JsonProperty("selected")
    public Boolean getSelected() {
        return selected;
    }

    /**
     * 
     * (Required)
     * 
     * @param selected
     *     The selected
     */
    @JsonProperty("selected")
    public void setSelected(Boolean selected) {
        this.selected = selected;
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
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The associatedFieldName
     */
    @JsonProperty("associatedFieldName")
    public String getAssociatedFieldName() {
        return associatedFieldName;
    }

    /**
     * 
     * (Required)
     * 
     * @param associatedFieldName
     *     The associatedFieldName
     */
    @JsonProperty("associatedFieldName")
    public void setAssociatedFieldName(String associatedFieldName) {
        this.associatedFieldName = associatedFieldName;
    }

    /**
     * 
     * @return
     *     The absoluteMinValue
     */
    @JsonProperty("absoluteMinValue")
    public Integer getAbsoluteMinValue() {
        return absoluteMinValue;
    }

    /**
     * 
     * @param absoluteMinValue
     *     The absoluteMinValue
     */
    @JsonProperty("absoluteMinValue")
    public void setAbsoluteMinValue(Integer absoluteMinValue) {
        this.absoluteMinValue = absoluteMinValue;
    }

    /**
     * 
     * @return
     *     The absoluteMaxValue
     */
    @JsonProperty("absoluteMaxValue")
    public Integer getAbsoluteMaxValue() {
        return absoluteMaxValue;
    }

    /**
     * 
     * @param absoluteMaxValue
     *     The absoluteMaxValue
     */
    @JsonProperty("absoluteMaxValue")
    public void setAbsoluteMaxValue(Integer absoluteMaxValue) {
        this.absoluteMaxValue = absoluteMaxValue;
    }

    /**
     * 
     * @return
     *     The selectedMinValue
     */
    @JsonProperty("selectedMinValue")
    public Integer getSelectedMinValue() {
        return selectedMinValue;
    }

    /**
     * 
     * @param selectedMinValue
     *     The selectedMinValue
     */
    @JsonProperty("selectedMinValue")
    public void setSelectedMinValue(Integer selectedMinValue) {
        this.selectedMinValue = selectedMinValue;
    }

    /**
     * 
     * @return
     *     The selectedMaxValue
     */
    @JsonProperty("selectedMaxValue")
    public Integer getSelectedMaxValue() {
        return selectedMaxValue;
    }

    /**
     * 
     * @param selectedMaxValue
     *     The selectedMaxValue
     */
    @JsonProperty("selectedMaxValue")
    public void setSelectedMaxValue(Integer selectedMaxValue) {
        this.selectedMaxValue = selectedMaxValue;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recordCount).append(previewImageURL).append(clusterLevel).append(selected).append(searchParams).append(name).append(associatedFieldName).append(absoluteMinValue).append(absoluteMaxValue).append(selectedMinValue).append(selectedMaxValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Element) == false) {
            return false;
        }
        Element rhs = ((Element) other);
        return new EqualsBuilder().append(recordCount, rhs.recordCount).append(previewImageURL, rhs.previewImageURL).append(clusterLevel, rhs.clusterLevel).append(selected, rhs.selected).append(searchParams, rhs.searchParams).append(name, rhs.name).append(associatedFieldName, rhs.associatedFieldName).append(absoluteMinValue, rhs.absoluteMinValue).append(absoluteMaxValue, rhs.absoluteMaxValue).append(selectedMinValue, rhs.selectedMinValue).append(selectedMaxValue, rhs.selectedMaxValue).isEquals();
    }

}

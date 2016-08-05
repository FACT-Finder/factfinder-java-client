
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
    "searchParams",
    "number",
    "caption",
    "currentPage"
})
public class LastLink {

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
    @JsonProperty("number")
    private Integer number;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("caption")
    private String caption;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currentPage")
    private Boolean currentPage;

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
     *     The number
     */
    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    /**
     * 
     * (Required)
     * 
     * @param number
     *     The number
     */
    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The caption
     */
    @JsonProperty("caption")
    public String getCaption() {
        return caption;
    }

    /**
     * 
     * (Required)
     * 
     * @param caption
     *     The caption
     */
    @JsonProperty("caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The currentPage
     */
    @JsonProperty("currentPage")
    public Boolean getCurrentPage() {
        return currentPage;
    }

    /**
     * 
     * (Required)
     * 
     * @param currentPage
     *     The currentPage
     */
    @JsonProperty("currentPage")
    public void setCurrentPage(Boolean currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(searchParams).append(number).append(caption).append(currentPage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LastLink) == false) {
            return false;
        }
        LastLink rhs = ((LastLink) other);
        return new EqualsBuilder().append(searchParams, rhs.searchParams).append(number, rhs.number).append(caption, rhs.caption).append(currentPage, rhs.currentPage).isEquals();
    }

}


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
    "searchResult"
})
public class FFResult {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("searchResult")
    private SearchResult searchResult;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The searchResult
     */
    @JsonProperty("searchResult")
    public SearchResult getSearchResult() {
        return searchResult;
    }

    /**
     * 
     * (Required)
     * 
     * @param searchResult
     *     The searchResult
     */
    @JsonProperty("searchResult")
    public void setSearchResult(SearchResult searchResult) {
        this.searchResult = searchResult;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(searchResult).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FFResult) == false) {
            return false;
        }
        FFResult rhs = ((FFResult) other);
        return new EqualsBuilder().append(searchResult, rhs.searchResult).isEquals();
    }

}

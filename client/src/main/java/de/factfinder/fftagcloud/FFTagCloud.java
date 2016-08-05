
package de.factfinder.fftagcloud;

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
    "weight",
    "query",
    "searchCount",
    "params"
})
public class FFTagCloud {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("weight")
    private Double weight;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("query")
    private String query;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("searchCount")
    private Integer searchCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("params")
    private String params;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The weight
     */
    @JsonProperty("weight")
    public Double getWeight() {
        return weight;
    }

    /**
     * 
     * (Required)
     * 
     * @param weight
     *     The weight
     */
    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The query
     */
    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    /**
     * 
     * (Required)
     * 
     * @param query
     *     The query
     */
    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The searchCount
     */
    @JsonProperty("searchCount")
    public Integer getSearchCount() {
        return searchCount;
    }

    /**
     * 
     * (Required)
     * 
     * @param searchCount
     *     The searchCount
     */
    @JsonProperty("searchCount")
    public void setSearchCount(Integer searchCount) {
        this.searchCount = searchCount;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The params
     */
    @JsonProperty("params")
    public String getParams() {
        return params;
    }

    /**
     * 
     * (Required)
     * 
     * @param params
     *     The params
     */
    @JsonProperty("params")
    public void setParams(String params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(weight).append(query).append(searchCount).append(params).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FFTagCloud) == false) {
            return false;
        }
        FFTagCloud rhs = ((FFTagCloud) other);
        return new EqualsBuilder().append(weight, rhs.weight).append(query, rhs.query).append(searchCount, rhs.searchCount).append(params, rhs.params).isEquals();
    }

}


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
    "selected",
    "default",
    "searchParams",
    "value"
})
public class ResultsPerPageList {

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
    @JsonProperty("default")
    private Boolean _default;
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
    @JsonProperty("value")
    private Integer value;

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
     *     The _default
     */
    @JsonProperty("default")
    public Boolean getDefault() {
        return _default;
    }

    /**
     * 
     * (Required)
     * 
     * @param _default
     *     The default
     */
    @JsonProperty("default")
    public void setDefault(Boolean _default) {
        this._default = _default;
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
     *     The value
     */
    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(selected).append(_default).append(searchParams).append(value).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResultsPerPageList) == false) {
            return false;
        }
        ResultsPerPageList rhs = ((ResultsPerPageList) other);
        return new EqualsBuilder().append(selected, rhs.selected).append(_default, rhs._default).append(searchParams, rhs.searchParams).append(value, rhs.value).isEquals();
    }

}

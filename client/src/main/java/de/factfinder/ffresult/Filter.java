
package de.factfinder.ffresult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "substring",
    "name",
    "valueList"
})
public class Filter {

    @JsonProperty("substring")
    private Boolean substring;
    @JsonProperty("name")
    private String name;
    @JsonProperty("valueList")
    private List<ValueList> valueList = new ArrayList<ValueList>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The substring
     */
    @JsonProperty("substring")
    public Boolean getSubstring() {
        return substring;
    }

    /**
     * 
     * @param substring
     *     The substring
     */
    @JsonProperty("substring")
    public void setSubstring(Boolean substring) {
        this.substring = substring;
    }

    /**
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
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The valueList
     */
    @JsonProperty("valueList")
    public List<ValueList> getValueList() {
        return valueList;
    }

    /**
     * 
     * @param valueList
     *     The valueList
     */
    @JsonProperty("valueList")
    public void setValueList(List<ValueList> valueList) {
        this.valueList = valueList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(substring).append(name).append(valueList).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Filter) == false) {
            return false;
        }
        Filter rhs = ((Filter) other);
        return new EqualsBuilder().append(substring, rhs.substring).append(name, rhs.name).append(valueList, rhs.valueList).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

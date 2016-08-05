
package de.factfinder.ffcompare;

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
    "different",
    "attributeName",
    "sourceField"
})
public class Attribute {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("different")
    private Boolean different;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("attributeName")
    private String attributeName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sourceField")
    private String sourceField;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The different
     */
    @JsonProperty("different")
    public Boolean getDifferent() {
        return different;
    }

    /**
     * 
     * (Required)
     * 
     * @param different
     *     The different
     */
    @JsonProperty("different")
    public void setDifferent(Boolean different) {
        this.different = different;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The attributeName
     */
    @JsonProperty("attributeName")
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * 
     * (Required)
     * 
     * @param attributeName
     *     The attributeName
     */
    @JsonProperty("attributeName")
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The sourceField
     */
    @JsonProperty("sourceField")
    public String getSourceField() {
        return sourceField;
    }

    /**
     * 
     * (Required)
     * 
     * @param sourceField
     *     The sourceField
     */
    @JsonProperty("sourceField")
    public void setSourceField(String sourceField) {
        this.sourceField = sourceField;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(different).append(attributeName).append(sourceField).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attribute) == false) {
            return false;
        }
        Attribute rhs = ((Attribute) other);
        return new EqualsBuilder().append(different, rhs.different).append(attributeName, rhs.attributeName).append(sourceField, rhs.sourceField).isEquals();
    }

}

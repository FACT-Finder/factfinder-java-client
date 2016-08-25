
package de.factfinder.ffcompare;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.factfinder.api.RecordWithId;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "attributes",
    "records"
})
public class FFCompare {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("attributes")
    private List<Attribute>    attributes = new ArrayList<Attribute>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("records")
    private List<RecordWithId> records    = new ArrayList<RecordWithId>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The attributes
     */
    @JsonProperty("attributes")
    public List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * 
     * (Required)
     * 
     * @param attributes
     *     The attributes
     */
    @JsonProperty("attributes")
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The records
     */
    @JsonProperty("records")
    public List<RecordWithId> getRecords() {
        return records;
    }

    /**
     * 
     * (Required)
     * 
     * @param records
     *     The records
     */
    @JsonProperty("records")
    public void setRecords(List<RecordWithId> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attributes).append(records).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FFCompare) == false) {
            return false;
        }
        FFCompare rhs = ((FFCompare) other);
        return new EqualsBuilder().append(attributes, rhs.attributes).append(records, rhs.records).isEquals();
    }

}


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
    "id",
    "record",
    "simiMalusAdd"
})
public class PushedProductsRecord {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("record")
    private Record record;
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
        return new HashCodeBuilder().append(id).append(record).append(simiMalusAdd).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PushedProductsRecord) == false) {
            return false;
        }
        PushedProductsRecord rhs = ((PushedProductsRecord) other);
        return new EqualsBuilder().append(id, rhs.id).append(record, rhs.record).append(simiMalusAdd, rhs.simiMalusAdd).isEquals();
    }

}

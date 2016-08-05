
package de.factfinder.ffcompare;

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
    "id",
    "record",
    "respectContentDelimiters",
    "simiMalusMul",
    "fieldNames"
})
public class CompareRecord {

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
    @JsonProperty("respectContentDelimiters")
    private Boolean respectContentDelimiters;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("simiMalusMul")
    private Double  simiMalusMul;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fieldNames")
    private List<String> fieldNames = new ArrayList<String>();

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
     *     The respectContentDelimiters
     */
    @JsonProperty("respectContentDelimiters")
    public Boolean getRespectContentDelimiters() {
        return respectContentDelimiters;
    }

    /**
     * 
     * (Required)
     * 
     * @param respectContentDelimiters
     *     The respectContentDelimiters
     */
    @JsonProperty("respectContentDelimiters")
    public void setRespectContentDelimiters(Boolean respectContentDelimiters) {
        this.respectContentDelimiters = respectContentDelimiters;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The simiMalusMul
     */
    @JsonProperty("simiMalusMul")
    public Double getSimiMalusMul() {
        return simiMalusMul;
    }

    /**
     * 
     * (Required)
     * 
     * @param simiMalusMul
     *     The simiMalusMul
     */
    @JsonProperty("simiMalusMul")
    public void setSimiMalusMul(Double simiMalusMul) {
        this.simiMalusMul = simiMalusMul;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The fieldNames
     */
    @JsonProperty("fieldNames")
    public List<String> getFieldNames() {
        return fieldNames;
    }

    /**
     * 
     * (Required)
     * 
     * @param fieldNames
     *     The fieldNames
     */
    @JsonProperty("fieldNames")
    public void setFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(record).append(respectContentDelimiters).append(simiMalusMul).append(fieldNames).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CompareRecord) == false) {
            return false;
        }
        CompareRecord rhs = ((CompareRecord) other);
        return new EqualsBuilder().append(id, rhs.id).append(record, rhs.record).append(respectContentDelimiters, rhs.respectContentDelimiters).append(simiMalusMul, rhs.simiMalusMul).append(fieldNames, rhs.fieldNames).isEquals();
    }

}

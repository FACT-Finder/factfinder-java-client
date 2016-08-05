
package de.factfinder.ffimport;

import java.util.ArrayList;
import java.util.List;
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
    "errors",
    "status"
})
public class FFImport {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("errors")
    private List<String> errors = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private List<String> status = new ArrayList<String>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The errors
     */
    @JsonProperty("errors")
    public List<String> getErrors() {
        return errors;
    }

    /**
     * 
     * (Required)
     * 
     * @param errors
     *     The errors
     */
    @JsonProperty("errors")
    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public List<String> getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(List<String> status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(errors).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FFImport) == false) {
            return false;
        }
        FFImport rhs = ((FFImport) other);
        return new EqualsBuilder().append(errors, rhs.errors).append(status, rhs.status).isEquals();
    }

}

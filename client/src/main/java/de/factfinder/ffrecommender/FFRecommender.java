
package de.factfinder.ffrecommender;

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
    "resultRecords",
    "timedOut"
})
public class FFRecommender {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("resultRecords")
    private List<ResultRecord> resultRecords = new ArrayList<ResultRecord>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timedOut")
    private Boolean timedOut;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The resultRecords
     */
    @JsonProperty("resultRecords")
    public List<ResultRecord> getResultRecords() {
        return resultRecords;
    }

    /**
     * 
     * (Required)
     * 
     * @param resultRecords
     *     The resultRecords
     */
    @JsonProperty("resultRecords")
    public void setResultRecords(List<ResultRecord> resultRecords) {
        this.resultRecords = resultRecords;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The timedOut
     */
    @JsonProperty("timedOut")
    public Boolean getTimedOut() {
        return timedOut;
    }

    /**
     * 
     * (Required)
     * 
     * @param timedOut
     *     The timedOut
     */
    @JsonProperty("timedOut")
    public void setTimedOut(Boolean timedOut) {
        this.timedOut = timedOut;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resultRecords).append(timedOut).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FFRecommender) == false) {
            return false;
        }
        FFRecommender rhs = ((FFRecommender) other);
        return new EqualsBuilder().append(resultRecords, rhs.resultRecords).append(timedOut, rhs.timedOut).isEquals();
    }

}

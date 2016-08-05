
package de.factfinder.ffsuggest;

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
    "suggestions"
})
public class FFSuggest {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("suggestions")
    private List<Suggestion> suggestions = new ArrayList<Suggestion>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The suggestions
     */
    @JsonProperty("suggestions")
    public List<Suggestion> getSuggestions() {
        return suggestions;
    }

    /**
     * 
     * (Required)
     * 
     * @param suggestions
     *     The suggestions
     */
    @JsonProperty("suggestions")
    public void setSuggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(suggestions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FFSuggest) == false) {
            return false;
        }
        FFSuggest rhs = ((FFSuggest) other);
        return new EqualsBuilder().append(suggestions, rhs.suggestions).isEquals();
    }

}

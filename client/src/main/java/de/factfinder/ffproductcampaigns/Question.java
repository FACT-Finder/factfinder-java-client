
package de.factfinder.ffproductcampaigns;

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
    "id",
    "text",
    "visible",
    "answers"
})
public class Question {

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
    @JsonProperty("text")
    private String text;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("visible")
    private Boolean visible;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("answers")
    private List<Answer> answers = new ArrayList<Answer>();

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
     *     The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * 
     * (Required)
     * 
     * @param text
     *     The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The visible
     */
    @JsonProperty("visible")
    public Boolean getVisible() {
        return visible;
    }

    /**
     * 
     * (Required)
     * 
     * @param visible
     *     The visible
     */
    @JsonProperty("visible")
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The answers
     */
    @JsonProperty("answers")
    public List<Answer> getAnswers() {
        return answers;
    }

    /**
     * 
     * (Required)
     * 
     * @param answers
     *     The answers
     */
    @JsonProperty("answers")
    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(text).append(visible).append(answers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Question) == false) {
            return false;
        }
        Question rhs = ((Question) other);
        return new EqualsBuilder().append(id, rhs.id).append(text, rhs.text).append(visible, rhs.visible).append(answers, rhs.answers).isEquals();
    }

}

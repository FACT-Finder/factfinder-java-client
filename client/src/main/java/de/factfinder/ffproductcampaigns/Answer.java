
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
    "params",
    "questions"
})
public class Answer {

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
    @JsonProperty("params")
    private String params;
    @JsonProperty("questions")
    private List<Question> questions = new ArrayList<Question>();

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
     *     The params
     */
    @JsonProperty("params")
    public String getParams() {
        return params;
    }

    /**
     * 
     * (Required)
     * 
     * @param params
     *     The params
     */
    @JsonProperty("params")
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * 
     * @return
     *     The questions
     */
    @JsonProperty("questions")
    public List<Question> getQuestions() {
        return questions;
    }

    /**
     * 
     * @param questions
     *     The questions
     */
    @JsonProperty("questions")
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(text).append(params).append(questions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Answer) == false) {
            return false;
        }
        Answer rhs = ((Answer) other);
        return new EqualsBuilder().append(id, rhs.id).append(text, rhs.text).append(params, rhs.params).append(questions, rhs.questions).isEquals();
    }

}

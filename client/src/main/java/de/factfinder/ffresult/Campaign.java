
package de.factfinder.ffresult;

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
    "advisorTree",
    "category",
    "name",
    "activeQuestions",
    "target",
    "pushedProductsRecords",
    "flavour",
    "feedbackTexts"
})
public class Campaign {

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
    @JsonProperty("advisorTree")
    private List<AdvisorTree> advisorTree = new ArrayList<AdvisorTree>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("category")
    private String category;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("activeQuestions")
    private List<Question> activeQuestions = new ArrayList<Question>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("target")
    private Target target;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pushedProductsRecords")
    private List<PushedProductsRecord> pushedProductsRecords = new ArrayList<PushedProductsRecord>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flavour")
    private String flavour;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("feedbackTexts")
    private List<FeedbackText> feedbackTexts = new ArrayList<FeedbackText>();

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
     *     The advisorTree
     */
    @JsonProperty("advisorTree")
    public List<AdvisorTree> getAdvisorTree() {
        return advisorTree;
    }

    /**
     * 
     * (Required)
     * 
     * @param advisorTree
     *     The advisorTree
     */
    @JsonProperty("advisorTree")
    public void setAdvisorTree(List<AdvisorTree> advisorTree) {
        this.advisorTree = advisorTree;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The category
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * 
     * (Required)
     * 
     * @param category
     *     The category
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * (Required)
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
     * (Required)
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
     * (Required)
     * 
     * @return
     *     The activeQuestions
     */
    @JsonProperty("activeQuestions")
    public List<Question> getActiveQuestions() {
        return activeQuestions;
    }

    /**
     * 
     * (Required)
     * 
     * @param activeQuestions
     *     The activeQuestions
     */
    @JsonProperty("activeQuestions")
    public void setActiveQuestions(List<Question> activeQuestions) {
        this.activeQuestions = activeQuestions;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The target
     */
    @JsonProperty("target")
    public Target getTarget() {
        return target;
    }

    /**
     * 
     * (Required)
     * 
     * @param target
     *     The target
     */
    @JsonProperty("target")
    public void setTarget(Target target) {
        this.target = target;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The pushedProductsRecords
     */
    @JsonProperty("pushedProductsRecords")
    public List<PushedProductsRecord> getPushedProductsRecords() {
        return pushedProductsRecords;
    }

    /**
     * 
     * (Required)
     * 
     * @param pushedProductsRecords
     *     The pushedProductsRecords
     */
    @JsonProperty("pushedProductsRecords")
    public void setPushedProductsRecords(List<PushedProductsRecord> pushedProductsRecords) {
        this.pushedProductsRecords = pushedProductsRecords;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The flavour
     */
    @JsonProperty("flavour")
    public String getFlavour() {
        return flavour;
    }

    /**
     * 
     * (Required)
     * 
     * @param flavour
     *     The flavour
     */
    @JsonProperty("flavour")
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The feedbackTexts
     */
    @JsonProperty("feedbackTexts")
    public List<FeedbackText> getFeedbackTexts() {
        return feedbackTexts;
    }

    /**
     * 
     * (Required)
     * 
     * @param feedbackTexts
     *     The feedbackTexts
     */
    @JsonProperty("feedbackTexts")
    public void setFeedbackTexts(List<FeedbackText> feedbackTexts) {
        this.feedbackTexts = feedbackTexts;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(advisorTree).append(category).append(name).append(activeQuestions).append(target).append(pushedProductsRecords).append(flavour).append(feedbackTexts).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Campaign) == false) {
            return false;
        }
        Campaign rhs = ((Campaign) other);
        return new EqualsBuilder().append(id, rhs.id).append(advisorTree, rhs.advisorTree).append(category, rhs.category).append(name, rhs.name).append(activeQuestions, rhs.activeQuestions).append(target, rhs.target).append(pushedProductsRecords, rhs.pushedProductsRecords).append(flavour, rhs.flavour).append(feedbackTexts, rhs.feedbackTexts).isEquals();
    }

}
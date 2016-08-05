
package de.factfinder.ffsuggest;

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
    "hitCount",
    "searchParams",
    "name",
    "image",
    "priority",
    "attributes",
    "type"
})
public class Suggestion {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hitCount")
    private Integer hitCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("searchParams")
    private String searchParams;
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
    @JsonProperty("image")
    private String image;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("priority")
    private Integer priority;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("attributes")
    private Attributes attributes;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The hitCount
     */
    @JsonProperty("hitCount")
    public Integer getHitCount() {
        return hitCount;
    }

    /**
     * 
     * (Required)
     * 
     * @param hitCount
     *     The hitCount
     */
    @JsonProperty("hitCount")
    public void setHitCount(Integer hitCount) {
        this.hitCount = hitCount;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The searchParams
     */
    @JsonProperty("searchParams")
    public String getSearchParams() {
        return searchParams;
    }

    /**
     * 
     * (Required)
     * 
     * @param searchParams
     *     The searchParams
     */
    @JsonProperty("searchParams")
    public void setSearchParams(String searchParams) {
        this.searchParams = searchParams;
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
     *     The image
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     * (Required)
     * 
     * @param image
     *     The image
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The priority
     */
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     * 
     * (Required)
     * 
     * @param priority
     *     The priority
     */
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The attributes
     */
    @JsonProperty("attributes")
    public Attributes getAttributes() {
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
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hitCount).append(searchParams).append(name).append(image).append(priority).append(attributes).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Suggestion) == false) {
            return false;
        }
        Suggestion rhs = ((Suggestion) other);
        return new EqualsBuilder().append(hitCount, rhs.hitCount).append(searchParams, rhs.searchParams).append(name, rhs.name).append(image, rhs.image).append(priority, rhs.priority).append(attributes, rhs.attributes).append(type, rhs.type).isEquals();
    }

}

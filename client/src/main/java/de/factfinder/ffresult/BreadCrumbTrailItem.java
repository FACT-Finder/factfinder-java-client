
package de.factfinder.ffresult;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "text",
    "searchParams",
    "value",
    "associatedFieldName",
    "type"
})
public class BreadCrumbTrailItem {

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
    @JsonProperty("searchParams")
    private String searchParams;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private String value;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("associatedFieldName")
    private String associatedFieldName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private BreadCrumbTrailItem.Type type;

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
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The associatedFieldName
     */
    @JsonProperty("associatedFieldName")
    public String getAssociatedFieldName() {
        return associatedFieldName;
    }

    /**
     * 
     * (Required)
     * 
     * @param associatedFieldName
     *     The associatedFieldName
     */
    @JsonProperty("associatedFieldName")
    public void setAssociatedFieldName(String associatedFieldName) {
        this.associatedFieldName = associatedFieldName;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public BreadCrumbTrailItem.Type getType() {
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
    public void setType(BreadCrumbTrailItem.Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(text).append(searchParams).append(value).append(associatedFieldName).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BreadCrumbTrailItem) == false) {
            return false;
        }
        BreadCrumbTrailItem rhs = ((BreadCrumbTrailItem) other);
        return new EqualsBuilder().append(text, rhs.text).append(searchParams, rhs.searchParams).append(value, rhs.value).append(associatedFieldName, rhs.associatedFieldName).append(type, rhs.type).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public enum Type {

        SEARCH("search"),
        FILTER("filter"),
        ADVISOR("advisor"),
        UNSPECIFIED("unspecified");
        private final String value;
        private final static Map<String, BreadCrumbTrailItem.Type> CONSTANTS = new HashMap<String, BreadCrumbTrailItem.Type>();

        static {
            for (BreadCrumbTrailItem.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static BreadCrumbTrailItem.Type fromValue(String value) {
            BreadCrumbTrailItem.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

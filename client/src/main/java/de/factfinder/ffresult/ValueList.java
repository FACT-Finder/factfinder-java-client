
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
    "value",
    "exclude",
    "type"
})
public class ValueList {

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
    @JsonProperty("exclude")
    private Boolean exclude;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private ValueList.Type type;

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
     *     The exclude
     */
    @JsonProperty("exclude")
    public Boolean getExclude() {
        return exclude;
    }

    /**
     * 
     * (Required)
     * 
     * @param exclude
     *     The exclude
     */
    @JsonProperty("exclude")
    public void setExclude(Boolean exclude) {
        this.exclude = exclude;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public ValueList.Type getType() {
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
    public void setType(ValueList.Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(exclude).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValueList) == false) {
            return false;
        }
        ValueList rhs = ((ValueList) other);
        return new EqualsBuilder().append(value, rhs.value).append(exclude, rhs.exclude).append(type, rhs.type).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public enum Type {

        AND("and"),
        OR("or");
        private final String value;
        private final static Map<String, ValueList.Type> CONSTANTS = new HashMap<String, ValueList.Type>();

        static {
            for (ValueList.Type c: values()) {
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
        public static ValueList.Type fromValue(String value) {
            ValueList.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

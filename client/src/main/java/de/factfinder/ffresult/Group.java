
package de.factfinder.ffresult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "selectedElements",
    "unit",
    "name",
    "groupOrder",
    "detailedLinks",
    "filterStyle",
    "type",
    "elements",
    "showPreviewImages",
    "selectionType"
})
public class Group {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("selectedElements")
    private List<Element> selectedElements = new ArrayList<Element>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("unit")
    private String unit;
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
    @JsonProperty("groupOrder")
    private Integer groupOrder;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("detailedLinks")
    private Integer detailedLinks;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("filterStyle")
    private Group.FilterStyle filterStyle;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private Group.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("elements")
    private List<Element> elements = new ArrayList<Element>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("showPreviewImages")
    private Boolean showPreviewImages;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("selectionType")
    private Group.SelectionType selectionType;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The selectedElements
     */
    @JsonProperty("selectedElements")
    public List<Element> getSelectedElements() {
        return selectedElements;
    }

    /**
     * 
     * (Required)
     * 
     * @param selectedElements
     *     The selectedElements
     */
    @JsonProperty("selectedElements")
    public void setSelectedElements(List<Element> selectedElements) {
        this.selectedElements = selectedElements;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The unit
     */
    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    /**
     * 
     * (Required)
     * 
     * @param unit
     *     The unit
     */
    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
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
     *     The groupOrder
     */
    @JsonProperty("groupOrder")
    public Integer getGroupOrder() {
        return groupOrder;
    }

    /**
     * 
     * (Required)
     * 
     * @param groupOrder
     *     The groupOrder
     */
    @JsonProperty("groupOrder")
    public void setGroupOrder(Integer groupOrder) {
        this.groupOrder = groupOrder;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The detailedLinks
     */
    @JsonProperty("detailedLinks")
    public Integer getDetailedLinks() {
        return detailedLinks;
    }

    /**
     * 
     * (Required)
     * 
     * @param detailedLinks
     *     The detailedLinks
     */
    @JsonProperty("detailedLinks")
    public void setDetailedLinks(Integer detailedLinks) {
        this.detailedLinks = detailedLinks;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The filterStyle
     */
    @JsonProperty("filterStyle")
    public Group.FilterStyle getFilterStyle() {
        return filterStyle;
    }

    /**
     * 
     * (Required)
     * 
     * @param filterStyle
     *     The filterStyle
     */
    @JsonProperty("filterStyle")
    public void setFilterStyle(Group.FilterStyle filterStyle) {
        this.filterStyle = filterStyle;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Group.Type getType() {
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
    public void setType(Group.Type type) {
        this.type = type;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The elements
     */
    @JsonProperty("elements")
    public List<Element> getElements() {
        return elements;
    }

    /**
     * 
     * (Required)
     * 
     * @param elements
     *     The elements
     */
    @JsonProperty("elements")
    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The showPreviewImages
     */
    @JsonProperty("showPreviewImages")
    public Boolean getShowPreviewImages() {
        return showPreviewImages;
    }

    /**
     * 
     * (Required)
     * 
     * @param showPreviewImages
     *     The showPreviewImages
     */
    @JsonProperty("showPreviewImages")
    public void setShowPreviewImages(Boolean showPreviewImages) {
        this.showPreviewImages = showPreviewImages;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The selectionType
     */
    @JsonProperty("selectionType")
    public Group.SelectionType getSelectionType() {
        return selectionType;
    }

    /**
     * 
     * (Required)
     * 
     * @param selectionType
     *     The selectionType
     */
    @JsonProperty("selectionType")
    public void setSelectionType(Group.SelectionType selectionType) {
        this.selectionType = selectionType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(selectedElements).append(unit).append(name).append(groupOrder).append(detailedLinks).append(filterStyle).append(type).append(elements).append(showPreviewImages).append(selectionType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group) == false) {
            return false;
        }
        Group rhs = ((Group) other);
        return new EqualsBuilder().append(selectedElements, rhs.selectedElements).append(unit, rhs.unit).append(name, rhs.name).append(groupOrder, rhs.groupOrder).append(detailedLinks, rhs.detailedLinks).append(filterStyle, rhs.filterStyle).append(type, rhs.type).append(elements, rhs.elements).append(showPreviewImages, rhs.showPreviewImages).append(selectionType, rhs.selectionType).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public enum FilterStyle {

        DEFAULT("DEFAULT"),
        SLIDER("SLIDER"),
        MULTISELECT("MULTISELECT"),
        TREE("TREE");
        private final String value;
        private final static Map<String, Group.FilterStyle> CONSTANTS = new HashMap<String, Group.FilterStyle>();

        static {
            for (Group.FilterStyle c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FilterStyle(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Group.FilterStyle fromValue(String value) {
            Group.FilterStyle constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public enum SelectionType {

        SINGLE_HIDE_UNSELECTED("singleHideUnselected"),
        SINGLE_SHOW_UNSELECTED("singleShowUnselected"),
        MULTI_SELECT_OR("multiSelectOr"),
        MULTI_SELECT_AND("multiSelectAnd");
        private final String value;
        private final static Map<String, Group.SelectionType> CONSTANTS = new HashMap<String, Group.SelectionType>();

        static {
            for (Group.SelectionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SelectionType(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Group.SelectionType fromValue(String value) {
            Group.SelectionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public enum Type {

        NUMBER("number"),
        MULTI("multi"),
        TEXT("text"),
        CATEGORY_PATH("categoryPath");
        private final String value;
        private final static Map<String, Group.Type> CONSTANTS = new HashMap<String, Group.Type>();

        static {
            for (Group.Type c: values()) {
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
        public static Group.Type fromValue(String value) {
            Group.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

package de.factfinder.ffsimilarrecords;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"attributes", "records"})
public class FFSimilarRecords {

	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("attributes")
	private List<Attribute>			attributes	= new ArrayList<Attribute>();
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("records")
	private List<SimilarityRecord>	records		= new ArrayList<SimilarityRecord>();

	/**
	 * 
	 * (Required)
	 * 
	 * @return The attributes
	 */
	@JsonProperty("attributes")
	public List<Attribute> getAttributes() {
		return attributes;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param attributes The attributes
	 */
	@JsonProperty("attributes")
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The records
	 */
	@JsonProperty("records")
	public List<SimilarityRecord> getRecords() {
		return records;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param records The records
	 */
	@JsonProperty("records")
	public void setRecords(List<SimilarityRecord> records) {
		this.records = records;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(attributes).append(records).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof FFSimilarRecords) == false) { return false; }
		FFSimilarRecords rhs = ((FFSimilarRecords) other);
		return new EqualsBuilder().append(attributes, rhs.attributes).append(records, rhs.records).isEquals();
	}

}

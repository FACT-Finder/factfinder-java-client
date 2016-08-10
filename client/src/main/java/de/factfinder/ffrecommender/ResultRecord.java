package de.factfinder.ffrecommender;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import de.factfinder.api.Record;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"id", "record"})
public class ResultRecord {

	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("id")
	private String	id;
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("record")
	private Record	record;

	/**
	 * 
	 * (Required)
	 * 
	 * @return The id
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param id The id
	 */
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The record
	 */
	@JsonProperty("record")
	public Record getRecord() {
		return record;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param record The record
	 */
	@JsonProperty("record")
	public void setRecord(Record record) {
		this.record = record;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(record).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof ResultRecord) == false) { return false; }
		ResultRecord rhs = ((ResultRecord) other);
		return new EqualsBuilder().append(id, rhs.id).append(record, rhs.record).isEquals();
	}

}

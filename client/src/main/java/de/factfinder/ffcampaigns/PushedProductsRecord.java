package de.factfinder.ffcampaigns;

import java.util.ArrayList;
import java.util.List;

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
@JsonPropertyOrder({"id", "record", "simiMalusAdd", "simiMalusMul", "foundWords", "keywords", "position", "searchSimilarity"})
public class PushedProductsRecord {

	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("id")
	private String			id;
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("record")
	private Record			record;
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("simiMalusAdd")
	private Integer			simiMalusAdd;
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("simiMalusMul")
	private Double			simiMalusMul;
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("foundWords")
	private List<String>	foundWords	= new ArrayList<String>();
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("keywords")
	private List<String>	keywords	= new ArrayList<String>();
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("position")
	private Integer			position;
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("searchSimilarity")
	private Double			searchSimilarity;

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

	/**
	 * 
	 * (Required)
	 * 
	 * @return The simiMalusAdd
	 */
	@JsonProperty("simiMalusAdd")
	public Integer getSimiMalusAdd() {
		return simiMalusAdd;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param simiMalusAdd The simiMalusAdd
	 */
	@JsonProperty("simiMalusAdd")
	public void setSimiMalusAdd(Integer simiMalusAdd) {
		this.simiMalusAdd = simiMalusAdd;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The simiMalusMul
	 */
	@JsonProperty("simiMalusMul")
	public Double getSimiMalusMul() {
		return simiMalusMul;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param simiMalusMul The simiMalusMul
	 */
	@JsonProperty("simiMalusMul")
	public void setSimiMalusMul(Double simiMalusMul) {
		this.simiMalusMul = simiMalusMul;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The foundWords
	 */
	@JsonProperty("foundWords")
	public List<String> getFoundWords() {
		return foundWords;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param foundWords The foundWords
	 */
	@JsonProperty("foundWords")
	public void setFoundWords(List<String> foundWords) {
		this.foundWords = foundWords;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The keywords
	 */
	@JsonProperty("keywords")
	public List<String> getKeywords() {
		return keywords;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param keywords The keywords
	 */
	@JsonProperty("keywords")
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The position
	 */
	@JsonProperty("position")
	public Integer getPosition() {
		return position;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param position The position
	 */
	@JsonProperty("position")
	public void setPosition(Integer position) {
		this.position = position;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The searchSimilarity
	 */
	@JsonProperty("searchSimilarity")
	public Double getSearchSimilarity() {
		return searchSimilarity;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param searchSimilarity The searchSimilarity
	 */
	@JsonProperty("searchSimilarity")
	public void setSearchSimilarity(Double searchSimilarity) {
		this.searchSimilarity = searchSimilarity;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(record).append(simiMalusAdd).append(simiMalusMul).append(foundWords).append(keywords).append(position)
									.append(searchSimilarity).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof PushedProductsRecord) == false) { return false; }
		PushedProductsRecord rhs = ((PushedProductsRecord) other);
		return new EqualsBuilder().append(id, rhs.id).append(record, rhs.record).append(simiMalusAdd, rhs.simiMalusAdd).append(simiMalusMul, rhs.simiMalusMul)
									.append(foundWords, rhs.foundWords).append(keywords, rhs.keywords).append(position, rhs.position)
									.append(searchSimilarity, rhs.searchSimilarity).isEquals();
	}

}

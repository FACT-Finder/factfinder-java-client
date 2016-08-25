package de.factfinder.ffresult;

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
@JsonPropertyOrder({"pageCount", "pageLinks", "previousLink", "firstLink", "resultsPerPage", "lastLink", "currentPage", "nextLink"})
public class Paging {

	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("pageCount")
	private Integer		pageCount;
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("pageLinks")
	private List<Link>	pageLinks	= new ArrayList<Link>();
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("previousLink")
	private Link		previousLink;
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("firstLink")
	private Link		firstLink;
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("resultsPerPage")
	private Integer		resultsPerPage;
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("lastLink")
	private Link		lastLink;
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("currentPage")
	private Integer		currentPage;
	/**
	 * 
	 * (Required)
	 * 
	 */
	@JsonProperty("nextLink")
	private Link		nextLink;

	/**
	 * 
	 * (Required)
	 * 
	 * @return The pageCount
	 */
	@JsonProperty("pageCount")
	public Integer getPageCount() {
		return pageCount;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param pageCount The pageCount
	 */
	@JsonProperty("pageCount")
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The pageLinks
	 */
	@JsonProperty("pageLinks")
	public List<Link> getPageLinks() {
		return pageLinks;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param pageLinks The pageLinks
	 */
	@JsonProperty("pageLinks")
	public void setPageLinks(List<Link> pageLinks) {
		this.pageLinks = pageLinks;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The previousLink
	 */
	@JsonProperty("previousLink")
	public Link getPreviousLink() {
		return previousLink;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param previousLink The previousLink
	 */
	@JsonProperty("previousLink")
	public void setPreviousLink(Link previousLink) {
		this.previousLink = previousLink;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The firstLink
	 */
	@JsonProperty("firstLink")
	public Link getFirstLink() {
		return firstLink;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param firstLink The firstLink
	 */
	@JsonProperty("firstLink")
	public void setFirstLink(Link firstLink) {
		this.firstLink = firstLink;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The resultsPerPage
	 */
	@JsonProperty("resultsPerPage")
	public Integer getResultsPerPage() {
		return resultsPerPage;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param resultsPerPage The resultsPerPage
	 */
	@JsonProperty("resultsPerPage")
	public void setResultsPerPage(Integer resultsPerPage) {
		this.resultsPerPage = resultsPerPage;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The lastLink
	 */
	@JsonProperty("lastLink")
	public Link getLastLink() {
		return lastLink;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param lastLink The lastLink
	 */
	@JsonProperty("lastLink")
	public void setLastLink(Link lastLink) {
		this.lastLink = lastLink;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The currentPage
	 */
	@JsonProperty("currentPage")
	public Integer getCurrentPage() {
		return currentPage;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param currentPage The currentPage
	 */
	@JsonProperty("currentPage")
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @return The nextLink
	 */
	@JsonProperty("nextLink")
	public Link getNextLink() {
		return nextLink;
	}

	/**
	 * 
	 * (Required)
	 * 
	 * @param nextLink The nextLink
	 */
	@JsonProperty("nextLink")
	public void setNextLink(Link nextLink) {
		this.nextLink = nextLink;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(pageCount).append(pageLinks).append(previousLink).append(firstLink).append(resultsPerPage).append(lastLink)
									.append(currentPage).append(nextLink).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof Paging) == false) { return false; }
		Paging rhs = ((Paging) other);
		return new EqualsBuilder().append(pageCount, rhs.pageCount).append(pageLinks, rhs.pageLinks).append(previousLink, rhs.previousLink)
									.append(firstLink, rhs.firstLink).append(resultsPerPage, rhs.resultsPerPage).append(lastLink, rhs.lastLink)
									.append(currentPage, rhs.currentPage).append(nextLink, rhs.nextLink).isEquals();
	}

}

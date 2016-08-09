
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
import de.factfinder.ffproductcampaigns.FFCampaign;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "breadCrumbTrailItems",
    "simiLastRecord",
    "searchParams",
    "resultCount",
    "campaigns",
    "resultStatus",
    "simiFirstRecord",
    "refKey",
    "resultsPerPageList",
    "timedOut",
    "sortsList",
    "singleWordResults",
    "searchTime",
    "records",
    "channel",
    "filters",
    "groups",
    "paging",
    "searchControlParams",
    "resultArticleNumberStatus"
})
public class SearchResult {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("breadCrumbTrailItems")
    private List<BreadCrumbTrailItem> breadCrumbTrailItems = new ArrayList<BreadCrumbTrailItem>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("simiLastRecord")
    private Integer simiLastRecord;
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
    @JsonProperty("resultCount")
    private Integer resultCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("campaigns")
    private List<FFCampaign> campaigns = new ArrayList<FFCampaign>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("resultStatus")
    private SearchResult.ResultStatus resultStatus;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("simiFirstRecord")
    private Integer simiFirstRecord;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("refKey")
    private String refKey;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("resultsPerPageList")
    private List<ResultsPerPageList> resultsPerPageList = new ArrayList<ResultsPerPageList>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timedOut")
    private Boolean timedOut;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sortsList")
    private List<SortsList> sortsList = new ArrayList<SortsList>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("singleWordResults")
    private List<SingleWordResult> singleWordResults = new ArrayList<SingleWordResult>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("searchTime")
    private Integer searchTime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("records")
    private List<ResultRecord> records = new ArrayList<ResultRecord>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("channel")
    private String channel;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("filters")
    private List<Filter> filters = new ArrayList<Filter>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("groups")
    private List<Group> groups = new ArrayList<Group>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("paging")
    private Paging paging;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("searchControlParams")
    private SearchControlParams searchControlParams;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("resultArticleNumberStatus")
    private SearchResult.ResultArticleNumberStatus resultArticleNumberStatus;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The breadCrumbTrailItems
     */
    @JsonProperty("breadCrumbTrailItems")
    public List<BreadCrumbTrailItem> getBreadCrumbTrailItems() {
        return breadCrumbTrailItems;
    }

    /**
     * 
     * (Required)
     * 
     * @param breadCrumbTrailItems
     *     The breadCrumbTrailItems
     */
    @JsonProperty("breadCrumbTrailItems")
    public void setBreadCrumbTrailItems(List<BreadCrumbTrailItem> breadCrumbTrailItems) {
        this.breadCrumbTrailItems = breadCrumbTrailItems;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The simiLastRecord
     */
    @JsonProperty("simiLastRecord")
    public Integer getSimiLastRecord() {
        return simiLastRecord;
    }

    /**
     * 
     * (Required)
     * 
     * @param simiLastRecord
     *     The simiLastRecord
     */
    @JsonProperty("simiLastRecord")
    public void setSimiLastRecord(Integer simiLastRecord) {
        this.simiLastRecord = simiLastRecord;
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
     *     The resultCount
     */
    @JsonProperty("resultCount")
    public Integer getResultCount() {
        return resultCount;
    }

    /**
     * 
     * (Required)
     * 
     * @param resultCount
     *     The resultCount
     */
    @JsonProperty("resultCount")
    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The campaigns
     */
    @JsonProperty("campaigns")
    public List<FFCampaign> getCampaigns() {
        return campaigns;
    }

    /**
     * 
     * (Required)
     * 
     * @param campaigns
     *     The campaigns
     */
    @JsonProperty("campaigns")
    public void setCampaigns(List<FFCampaign> campaigns) {
        this.campaigns = campaigns;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The resultStatus
     */
    @JsonProperty("resultStatus")
    public SearchResult.ResultStatus getResultStatus() {
        return resultStatus;
    }

    /**
     * 
     * (Required)
     * 
     * @param resultStatus
     *     The resultStatus
     */
    @JsonProperty("resultStatus")
    public void setResultStatus(SearchResult.ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The simiFirstRecord
     */
    @JsonProperty("simiFirstRecord")
    public Integer getSimiFirstRecord() {
        return simiFirstRecord;
    }

    /**
     * 
     * (Required)
     * 
     * @param simiFirstRecord
     *     The simiFirstRecord
     */
    @JsonProperty("simiFirstRecord")
    public void setSimiFirstRecord(Integer simiFirstRecord) {
        this.simiFirstRecord = simiFirstRecord;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The refKey
     */
    @JsonProperty("refKey")
    public String getRefKey() {
        return refKey;
    }

    /**
     * 
     * (Required)
     * 
     * @param refKey
     *     The refKey
     */
    @JsonProperty("refKey")
    public void setRefKey(String refKey) {
        this.refKey = refKey;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The resultsPerPageList
     */
    @JsonProperty("resultsPerPageList")
    public List<ResultsPerPageList> getResultsPerPageList() {
        return resultsPerPageList;
    }

    /**
     * 
     * (Required)
     * 
     * @param resultsPerPageList
     *     The resultsPerPageList
     */
    @JsonProperty("resultsPerPageList")
    public void setResultsPerPageList(List<ResultsPerPageList> resultsPerPageList) {
        this.resultsPerPageList = resultsPerPageList;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The timedOut
     */
    @JsonProperty("timedOut")
    public Boolean getTimedOut() {
        return timedOut;
    }

    /**
     * 
     * (Required)
     * 
     * @param timedOut
     *     The timedOut
     */
    @JsonProperty("timedOut")
    public void setTimedOut(Boolean timedOut) {
        this.timedOut = timedOut;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The sortsList
     */
    @JsonProperty("sortsList")
    public List<SortsList> getSortsList() {
        return sortsList;
    }

    /**
     * 
     * (Required)
     * 
     * @param sortsList
     *     The sortsList
     */
    @JsonProperty("sortsList")
    public void setSortsList(List<SortsList> sortsList) {
        this.sortsList = sortsList;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The singleWordResults
     */
    @JsonProperty("singleWordResults")
    public List<SingleWordResult> getSingleWordResults() {
        return singleWordResults;
    }

    /**
     * 
     * (Required)
     * 
     * @param singleWordResults
     *     The singleWordResults
     */
    @JsonProperty("singleWordResults")
    public void setSingleWordResults(List<SingleWordResult> singleWordResults) {
        this.singleWordResults = singleWordResults;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The searchTime
     */
    @JsonProperty("searchTime")
    public Integer getSearchTime() {
        return searchTime;
    }

    /**
     * 
     * (Required)
     * 
     * @param searchTime
     *     The searchTime
     */
    @JsonProperty("searchTime")
    public void setSearchTime(Integer searchTime) {
        this.searchTime = searchTime;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The records
     */
    @JsonProperty("records")
    public List<ResultRecord> getRecords() {
        return records;
    }

    /**
     * 
     * (Required)
     * 
     * @param records
     *     The records
     */
    @JsonProperty("records")
    public void setRecords(List<ResultRecord> records) {
        this.records = records;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The channel
     */
    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    /**
     * 
     * (Required)
     * 
     * @param channel
     *     The channel
     */
    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The filters
     */
    @JsonProperty("filters")
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * 
     * (Required)
     * 
     * @param filters
     *     The filters
     */
    @JsonProperty("filters")
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The groups
     */
    @JsonProperty("groups")
    public List<Group> getGroups() {
        return groups;
    }

    /**
     * 
     * (Required)
     * 
     * @param groups
     *     The groups
     */
    @JsonProperty("groups")
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The paging
     */
    @JsonProperty("paging")
    public Paging getPaging() {
        return paging;
    }

    /**
     * 
     * (Required)
     * 
     * @param paging
     *     The paging
     */
    @JsonProperty("paging")
    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The searchControlParams
     */
    @JsonProperty("searchControlParams")
    public SearchControlParams getSearchControlParams() {
        return searchControlParams;
    }

    /**
     * 
     * (Required)
     * 
     * @param searchControlParams
     *     The searchControlParams
     */
    @JsonProperty("searchControlParams")
    public void setSearchControlParams(SearchControlParams searchControlParams) {
        this.searchControlParams = searchControlParams;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The resultArticleNumberStatus
     */
    @JsonProperty("resultArticleNumberStatus")
    public SearchResult.ResultArticleNumberStatus getResultArticleNumberStatus() {
        return resultArticleNumberStatus;
    }

    /**
     * 
     * (Required)
     * 
     * @param resultArticleNumberStatus
     *     The resultArticleNumberStatus
     */
    @JsonProperty("resultArticleNumberStatus")
    public void setResultArticleNumberStatus(SearchResult.ResultArticleNumberStatus resultArticleNumberStatus) {
        this.resultArticleNumberStatus = resultArticleNumberStatus;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(breadCrumbTrailItems).append(simiLastRecord).append(searchParams).append(resultCount).append(campaigns).append(resultStatus).append(simiFirstRecord).append(refKey).append(resultsPerPageList).append(timedOut).append(sortsList).append(singleWordResults).append(searchTime).append(records).append(channel).append(filters).append(groups).append(paging).append(searchControlParams).append(resultArticleNumberStatus).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SearchResult) == false) {
            return false;
        }
        SearchResult rhs = ((SearchResult) other);
        return new EqualsBuilder().append(breadCrumbTrailItems, rhs.breadCrumbTrailItems).append(simiLastRecord, rhs.simiLastRecord).append(searchParams, rhs.searchParams).append(resultCount, rhs.resultCount).append(campaigns, rhs.campaigns).append(resultStatus, rhs.resultStatus).append(simiFirstRecord, rhs.simiFirstRecord).append(refKey, rhs.refKey).append(resultsPerPageList, rhs.resultsPerPageList).append(timedOut, rhs.timedOut).append(sortsList, rhs.sortsList).append(singleWordResults, rhs.singleWordResults).append(searchTime, rhs.searchTime).append(records, rhs.records).append(channel, rhs.channel).append(filters, rhs.filters).append(groups, rhs.groups).append(paging, rhs.paging).append(searchControlParams, rhs.searchControlParams).append(resultArticleNumberStatus, rhs.resultArticleNumberStatus).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public enum ResultArticleNumberStatus {

        NO_ARTICLE_NUMBER_SEARCH("noArticleNumberSearch"),
        NOTHING_FOUND("nothingFound"),
        RESULTS_FOUND("resultsFound");
        private final String value;
        private final static Map<String, SearchResult.ResultArticleNumberStatus> CONSTANTS = new HashMap<String, SearchResult.ResultArticleNumberStatus>();

        static {
            for (SearchResult.ResultArticleNumberStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ResultArticleNumberStatus(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static SearchResult.ResultArticleNumberStatus fromValue(String value) {
            SearchResult.ResultArticleNumberStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public enum ResultStatus {

        RESULTS_FOUND("resultsFound"),
        NOTHING_FOUND("nothingFound"),
        ERROR_OCCURED("errorOccured");
        private final String value;
        private final static Map<String, SearchResult.ResultStatus> CONSTANTS = new HashMap<String, SearchResult.ResultStatus>();

        static {
            for (SearchResult.ResultStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ResultStatus(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static SearchResult.ResultStatus fromValue(String value) {
            SearchResult.ResultStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

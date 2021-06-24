

# Result


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answers** | [**List&lt;Answer&gt;**](Answer.md) | The selected answers of this result. | 
**articleNumberSearch** | **Boolean** | Set to true when an article number search was performed. | 
**breadCrumbTrail** | [**List&lt;BreadCrumbTrailItem&gt;**](BreadCrumbTrailItem.md) | Describes the actions that lead to the current result. This may be used to return to an intermediate search result. | 
**campaigns** | [**List&lt;Campaign&gt;**](Campaign.md) | Contains the active campaigns for this result. | 
**facets** | [**List&lt;Facet&gt;**](Facet.md) | The ASN filters (for after search navigation). | 
**fieldRoles** | **Map&lt;String, String&gt;** | A field to role mapping. For example, a field role may be &#39;brand&#39;, meaning that the field contains the manufacturer&#39;s name. (key &#x3D; field role, value &#x3D; field name) | 
**filters** | [**List&lt;Filter&gt;**](Filter.md) | The filter applied for this result. | 
**followSearch** | **String** | Request linking param for follow-up search requests. Can improve request performance. | 
**geo** | [**Geo**](Geo.md) |  | 
**hits** | [**List&lt;SearchRecord&gt;**](SearchRecord.md) | The relevant products. | 
**paging** | [**Paging**](Paging.md) |  |  [optional]
**scoreFirstHit** | **Double** | The score of the best match in the search result. | 
**scoreLastHit** | **Double** | The score of the worst match in the search result. | 
**searchControlParams** | [**SearchControlParams**](SearchControlParams.md) |  | 
**searchParams** | [**SearchParams**](SearchParams.md) |  |  [optional]
**singleWordResults** | [**List&lt;SingleWordSearchResult&gt;**](SingleWordSearchResult.md) | Contains the result from the single word search. | 
**sortItems** | [**List&lt;DescribedSortItem&gt;**](DescribedSortItem.md) | Contains the available sortings. | 
**timedOut** | **Boolean** | If true, this search took longer than the timeout currently defined. Therefore, the results may not contain all relevant products. | 
**tookTotal** | **Long** | The time required to produce the results in the framework (in ms). | 
**tookWorldmatch** | **Long** | The time required to produce the results in the core (in ms). | 
**totalHits** | **Integer** | Total number of items in the search result. | 




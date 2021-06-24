

# NavigationParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeAbTests** | **Map&lt;String, String&gt;** | The active ab tests variants. |  [optional]
**advisorStatus** | [**AdvisorCampaignStatusHolder**](AdvisorCampaignStatusHolder.md) |  |  [optional]
**channel** | **String** | The channel in which the search should be performed. | 
**customParameters** | [**List&lt;CustomParameter&gt;**](CustomParameter.md) | May be used to provide custom parameters, such as for custom classes. |  [optional]
**excludeProductsNotInRange** | **Boolean** | Overrides the excludeProductsNotInRange setting for the geo search. |  [optional]
**filters** | [**List&lt;Filter&gt;**](Filter.md) | The filters to limit the search result. |  [optional]
**followSearch** | **String** | Optional request linking param from a previous search result or search param object. Can improve request performance. |  [optional]
**hitsPerPage** | **Integer** | Number of products on a single page. |  [optional]
**location** | [**Location**](Location.md) |  |  [optional]
**marketIds** | **List&lt;String&gt;** | Only show products that have values for these market IDs. |  [optional]
**maxCountVariants** | **Integer** | Defines the maximum number of variants to be returned in the result. |  [optional]
**maxDistance** | **Double** | Overrides the maximum distance setting for the geo search. |  [optional]
**page** | **Integer** | The page to be requested within the search result. |  [optional]
**purchaserId** | **String** | The ID of the purchaser. This ID is only needed if the &#39;customer specific pricing&#39; module is activated. Otherwise it will be ignored. |  [optional]
**sortItems** | [**List&lt;SortItem&gt;**](SortItem.md) | Specifies the sort order for the search result. |  [optional]




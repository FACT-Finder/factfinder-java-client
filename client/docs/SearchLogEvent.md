

# SearchLogEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalInfo** | **String** | Additional information that should be logged. |  [optional]
**customSorting** | **Boolean** | Set to true, if the search result was sorted using a custom sorting order, otherwise false. |  [optional]
**filters** | [**List&lt;Filter&gt;**](Filter.md) | The filters active in the search result. | 
**hitCount** | **Integer** | The total number of products in the search result. | 
**id** | **String** | The ID of the product. | 
**masterId** | **String** | Contains the master ID, if the article is a variant and &#39;ID&#39; refers to the variant. |  [optional]
**maxScore** | **Integer** | The score of the first product in the result. | 
**minScore** | **Integer** | The score of the last product in the result. | 
**page** | **Integer** | The page number delivered by the search result. | 
**pageSize** | **Integer** | The maximum number of products on a page. | 
**purchaserId** | **String** | The ID for customer specific pricing. |  [optional]
**query** | **String** | The search term that produced the search result. | 
**searchField** | **String** | Contains the name of the search field, if the search was performed on a specific field. |  [optional]
**searchTime** | **Integer** | The time required to produce the results (in ms). | 
**sid** | **String** | The session ID. | 
**title** | **String** | The title of the product. |  [optional]
**userId** | **String** | The ID of the user who issued the request. |  [optional]




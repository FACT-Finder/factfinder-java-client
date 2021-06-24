

# DescribedSortItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The sorting option description, which should be displayed frontend. | 
**name** | **String** | The name of the field to be sorted by, or &#39;Relevancy&#39;, for score based sorting. | 
**order** | [**OrderEnum**](#OrderEnum) | The sort order direction. | 
**searchParams** | [**SearchParams**](SearchParams.md) |  | 
**selected** | **Boolean** | If true, the sorting is applied to the current search result. | 



## Enum: OrderEnum

Name | Value
---- | -----
ASC | &quot;asc&quot;
DESC | &quot;desc&quot;




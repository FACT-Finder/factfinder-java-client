

# BreadCrumbTrailItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**associatedFieldName** | **String** | Contains the name of the field on which the filter operates. Used for filter type items. |  [optional]
**searchParams** | [**SearchParams**](SearchParams.md) |  |  [optional]
**text** | **String** | The text to be displayed to the user. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Breadcrumb trail item type. | 
**value** | **Object** | Contains information corresponding to the item type (for example, contains the search term for the search type). |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
SEARCH | &quot;search&quot;
FILTER | &quot;filter&quot;
ADVISOR | &quot;advisor&quot;
UNSPECIFIED | &quot;unspecified&quot;






# FacetElement


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**absoluteMaxValue** | **Double** | The absolute maximum value for the overall slider range. |  [optional]
**absoluteMinValue** | **Double** | The absolute minimum value for the overall slider range. |  [optional]
**clusterLevel** | **Integer** | Level in the cluster hierarchy. Corresponding subcategories have a higher (deeper) level. | 
**distance** | **Double** | The distance between the location of the search and the market location associated with this element. |  [optional]
**previewImageURL** | **String** | URL to the preview image to be displayed with the element. |  [optional]
**searchParams** | [**SearchParams**](SearchParams.md) |  |  [optional]
**selected** | [**SelectedEnum**](#SelectedEnum) | TRUE, if the element is currently selected, IMPLICIT, if the selection is implicit, IRRELEVANT means, that the element has been selected by the user, but does not match any record of the search result, otherwise FALSE. | 
**selectedMaxValue** | **Double** | The maximum value of the currently selected slider range. |  [optional]
**selectedMinValue** | **Double** | The minimum value of the currently selected slider range. |  [optional]
**showDistance** | **Boolean** | If &#39;true&#39;, the distance should be added to the element name label by frontend. |  [optional]
**text** | **String** | The text to be displayed to the user. |  [optional]
**totalHits** | **Integer** | The number of products that the search result should contain when this facet element is selected. |  [optional]



## Enum: SelectedEnum

Name | Value
---- | -----
TRUE | &quot;TRUE&quot;
FALSE | &quot;FALSE&quot;
IMPLICIT | &quot;IMPLICIT&quot;
IRRELEVANT | &quot;IRRELEVANT&quot;






# Facet


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**associatedFieldName** | **String** | The name of the field that contains the values represented by this facet. | 
**detailedLinks** | **Integer** | Number of links to be displayed (for the selection menu). | 
**elements** | [**List&lt;FacetElement&gt;**](FacetElement.md) | The elements shown in the filter. | 
**filterStyle** | [**FilterStyleEnum**](#FilterStyleEnum) | The style in which the filter should be displayed. | 
**name** | **String** | Filter name that should be displayed to the user. |  [optional]
**selectedElements** | [**List&lt;FacetElement&gt;**](FacetElement.md) | The elements of the filter that are currently selected. | 
**selectionType** | [**SelectionTypeEnum**](#SelectionTypeEnum) | Defines the way this filter behaves when elements are selected. | 
**showPreviewImages** | **Boolean** | If true, preview images should be displayed to the user. | 
**type** | [**TypeEnum**](#TypeEnum) | The type of the filter elements. |  [optional]
**unit** | **String** | The units to be shown, if filter elements represent (for instance) length, or weight. |  [optional]



## Enum: FilterStyleEnum

Name | Value
---- | -----
DEFAULT | &quot;DEFAULT&quot;
SLIDER | &quot;SLIDER&quot;
MULTISELECT | &quot;MULTISELECT&quot;
TREE | &quot;TREE&quot;



## Enum: SelectionTypeEnum

Name | Value
---- | -----
SINGLEHIDEUNSELECTED | &quot;singleHideUnselected&quot;
SINGLESHOWUNSELECTED | &quot;singleShowUnselected&quot;
MULTISELECTOR | &quot;multiSelectOr&quot;
MULTISELECTAND | &quot;multiSelectAnd&quot;



## Enum: TypeEnum

Name | Value
---- | -----
FLOAT | &quot;FLOAT&quot;
INTEGER | &quot;INTEGER&quot;
MULTI | &quot;MULTI&quot;
TEXT | &quot;TEXT&quot;
CATEGORY_PATH | &quot;CATEGORY_PATH&quot;
BOOLEAN | &quot;BOOLEAN&quot;
DATE | &quot;DATE&quot;
GTIN | &quot;GTIN&quot;
ALPHANUMERIC | &quot;ALPHANUMERIC&quot;
PROPERTY | &quot;PROPERTY&quot;
GEO | &quot;GEO&quot;




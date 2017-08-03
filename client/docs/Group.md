
# Group

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detailedLinks** | **Integer** |  | 
**elements** | [**List&lt;GroupElement&gt;**](GroupElement.md) |  | 
**filterStyle** | [**FilterStyleEnum**](#FilterStyleEnum) |  | 
**groupOrder** | **Integer** |  | 
**name** | **String** |  |  [optional]
**selectedElements** | [**List&lt;GroupElement&gt;**](GroupElement.md) |  | 
**selectionType** | [**SelectionTypeEnum**](#SelectionTypeEnum) |  | 
**showPreviewImages** | **Boolean** |  | 
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**unit** | **String** |  |  [optional]


<a name="FilterStyleEnum"></a>
## Enum: FilterStyleEnum
Name | Value
---- | -----
DEFAULT | &quot;DEFAULT&quot;
SLIDER | &quot;SLIDER&quot;
MULTISELECT | &quot;MULTISELECT&quot;
TREE | &quot;TREE&quot;


<a name="SelectionTypeEnum"></a>
## Enum: SelectionTypeEnum
Name | Value
---- | -----
SINGLEHIDEUNSELECTED | &quot;singleHideUnselected&quot;
SINGLESHOWUNSELECTED | &quot;singleShowUnselected&quot;
MULTISELECTOR | &quot;multiSelectOr&quot;
MULTISELECTAND | &quot;multiSelectAnd&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NUMBER | &quot;number&quot;
MULTI | &quot;multi&quot;
TEXT | &quot;text&quot;
CATEGORYPATH | &quot;categoryPath&quot;




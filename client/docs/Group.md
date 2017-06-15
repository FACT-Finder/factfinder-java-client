
# Group

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detailedLinks** | **Integer** |  |  [optional]
**elements** | [**List&lt;GroupElement&gt;**](GroupElement.md) |  |  [optional]
**filterStyle** | [**FilterStyleEnum**](#FilterStyleEnum) |  |  [optional]
**groupOrder** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**selectedElements** | [**List&lt;GroupElement&gt;**](GroupElement.md) |  |  [optional]
**selectionType** | [**SelectionTypeEnum**](#SelectionTypeEnum) |  |  [optional]
**showPreviewImages** | **Boolean** |  |  [optional]
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




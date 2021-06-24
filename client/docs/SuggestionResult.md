

# SuggestionResult

Contains a list of suggestions, the field role to field name mapping and the information if an article number search is possible.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**articleNumberSearchAllowed** | **Boolean** | True, if the field with &#39;productNumber&#39; field role provides a regex pattern. | 
**fieldRoles** | **Map&lt;String, String&gt;** | A field to role mapping. For example, a field role may be &#39;brand&#39;, meaning that the field contains the manufacturer&#39;s name. (key &#x3D; field role, value &#x3D; field name) | 
**geo** | [**Geo**](Geo.md) |  |  [optional]
**suggestions** | [**List&lt;ResultSuggestion&gt;**](ResultSuggestion.md) | The requested suggestions. | 






# FullRecordsResult

Contains a list of full records with master and variant values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldRoles** | **Map&lt;String, String&gt;** | A field to role mapping. For example, a field role may be &#39;brand&#39;, meaning that the field contains the manufacturer&#39;s name. (key &#x3D; field role, value &#x3D; field name) | 
**records** | [**List&lt;FullRecord&gt;**](FullRecord.md) | A list of found records. Records for IDs which are not present in database will be missing. | 




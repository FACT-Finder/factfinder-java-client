

# RecommendationResultWithFieldRoles


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldRoles** | **Map&lt;String, String&gt;** | A field to role mapping. For example, a field role may be &#39;brand&#39;, meaning that the field contains the manufacturer&#39;s name. (key &#x3D; field role, value &#x3D; field name) | 
**hits** | [**List&lt;TypedFlatRecord&gt;**](TypedFlatRecord.md) | Records of the recommended products. | 
**timedOut** | **Boolean** | Set to true when a timeout occurs. | 




# RecommendationApi

All URIs are relative to *http://{FACT_FINDER_INSTANCE}/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRecommendationUsingGET**](RecommendationApi.md#getRecommendationUsingGET) | **GET** /v1/recommendation/{channel} | Get recommendations


<a name="getRecommendationUsingGET"></a>
# **getRecommendationUsingGET**
> RecommendationResult getRecommendationUsingGET(channel, id, maxResults, sid, idsOnly, usePersonalization)

Get recommendations

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.RecommendationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

RecommendationApi apiInstance = new RecommendationApi();
String channel = "channel_example"; // String | channel
List<String> id = Arrays.asList("id_example"); // List<String> | Use this parameter to pass product ID(s) for which you wish to obtain recommendations.
Integer maxResults = 0; // Integer | Use this parameter to specify the number of recommendations you would like. The default value from the configuration is used if the parameter is not specified.
String sid = "sid_example"; // String | This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to give him personalised recommendations, as well as for FACT-Finder tracking.
Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
Boolean usePersonalization = true; // Boolean | Allows the activation/deactivation of the personalization of queries. true = the search result will be personalized if the personalization module is activated and all other requirements are met; false = the search result will not be personalized.
try {
    RecommendationResult result = apiInstance.getRecommendationUsingGET(channel, id, maxResults, sid, idsOnly, usePersonalization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecommendationApi#getRecommendationUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **id** | [**List&lt;String&gt;**](String.md)| Use this parameter to pass product ID(s) for which you wish to obtain recommendations. |
 **maxResults** | **Integer**| Use this parameter to specify the number of recommendations you would like. The default value from the configuration is used if the parameter is not specified. | [optional] [default to 0]
 **sid** | **String**| This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to give him personalised recommendations, as well as for FACT-Finder tracking. | [optional]
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]
 **usePersonalization** | **Boolean**| Allows the activation/deactivation of the personalization of queries. true &#x3D; the search result will be personalized if the personalization module is activated and all other requirements are met; false &#x3D; the search result will not be personalized. | [optional] [default to true]

### Return type

[**RecommendationResult**](RecommendationResult.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json


# SuggestApi

All URIs are relative to *http://{FACT_FINDER_INSTANCE}/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSuggestionsUsingGET**](SuggestApi.md#getSuggestionsUsingGET) | **GET** /v1/suggest/{channel} | Get suggestions


<a name="getSuggestionsUsingGET"></a>
# **getSuggestionsUsingGET**
> List&lt;ResultSuggestion&gt; getSuggestionsUsingGET(channel, query)

Get suggestions

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.SuggestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SuggestApi apiInstance = new SuggestApi();
String channel = "channel_example"; // String | channel
String query = "query_example"; // String | The search term
try {
    List<ResultSuggestion> result = apiInstance.getSuggestionsUsingGET(channel, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuggestApi#getSuggestionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **query** | **String**| The search term |

### Return type

[**List&lt;ResultSuggestion&gt;**](ResultSuggestion.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json


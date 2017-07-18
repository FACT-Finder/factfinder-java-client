# CompareproductsApi

All URIs are relative to *http://{FACT_FINDER_INSTANCE}/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**compareUsingGET**](CompareproductsApi.md#compareUsingGET) | **GET** /v1/compareproducts/{channel} | compare products


<a name="compareUsingGET"></a>
# **compareUsingGET**
> CompareResult compareUsingGET(channel, id, idsOnly)

compare products

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.CompareproductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CompareproductsApi apiInstance = new CompareproductsApi();
String channel = "channel_example"; // String | channel
List<String> id = Arrays.asList("id_example"); // List<String> | Use this parameter to pass product ID(s) which should be compared.
Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
try {
    CompareResult result = apiInstance.compareUsingGET(channel, id, idsOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompareproductsApi#compareUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **id** | [**List&lt;String&gt;**](String.md)| Use this parameter to pass product ID(s) which should be compared. |
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]

### Return type

[**CompareResult**](CompareResult.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json


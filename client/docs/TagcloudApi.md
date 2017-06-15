# TagcloudApi

All URIs are relative to *http://{FACT_FINDER_INSTANCE}/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTagCloudUsingGET**](TagcloudApi.md#getTagCloudUsingGET) | **GET** /v1/tagcloud/{channel} | Get tag cloud entries


<a name="getTagCloudUsingGET"></a>
# **getTagCloudUsingGET**
> List&lt;TagCloudEntry&gt; getTagCloudUsingGET(channel, wordCount)

Get tag cloud entries

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagcloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TagcloudApi apiInstance = new TagcloudApi();
String channel = "channel_example"; // String | channel
Integer wordCount = 0; // Integer | The amount of tag cloud entries which should returned.
try {
    List<TagCloudEntry> result = apiInstance.getTagCloudUsingGET(channel, wordCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagcloudApi#getTagCloudUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **wordCount** | **Integer**| The amount of tag cloud entries which should returned. | [optional] [default to 0]

### Return type

[**List&lt;TagCloudEntry&gt;**](TagCloudEntry.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json


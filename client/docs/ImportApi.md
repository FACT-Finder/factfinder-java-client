# ImportApi

All URIs are relative to *http://{FACT_FINDER_INSTANCE}/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**startRecommendationImportUsingPOST**](ImportApi.md#startRecommendationImportUsingPOST) | **POST** /v1/import/recommendation | Start recommendation import
[**startSearchImportUsingPOST**](ImportApi.md#startSearchImportUsingPOST) | **POST** /v1/import/search | Start search import
[**startSuggestImportUsingPOST**](ImportApi.md#startSuggestImportUsingPOST) | **POST** /v1/import/suggest | Start suggest import


<a name="startRecommendationImportUsingPOST"></a>
# **startRecommendationImportUsingPOST**
> ImportResult startRecommendationImportUsingPOST(channel, quiet)

Start recommendation import

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ImportApi apiInstance = new ImportApi();
List<String> channel = Arrays.asList("channel_example"); // List<String> | channel
Boolean quiet = false; // Boolean | if true: only receive a filled response if an error occurs during the import otherwise the response is just empty
try {
    ImportResult result = apiInstance.startRecommendationImportUsingPOST(channel, quiet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportApi#startRecommendationImportUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]
 **quiet** | **Boolean**| if true: only receive a filled response if an error occurs during the import otherwise the response is just empty | [optional] [default to false]

### Return type

[**ImportResult**](ImportResult.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

<a name="startSearchImportUsingPOST"></a>
# **startSearchImportUsingPOST**
> ImportResult startSearchImportUsingPOST(channel, download, quiet)

Start search import

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ImportApi apiInstance = new ImportApi();
List<String> channel = Arrays.asList("channel_example"); // List<String> | channel
Boolean download = false; // Boolean | if true: causes the import file to be updated first. If no URL is stored in the FACT-Finder configuration, this parameter has no effect.
Boolean quiet = false; // Boolean | if true: only receive a filled response if an error occurs during the import otherwise the response is just empty
try {
    ImportResult result = apiInstance.startSearchImportUsingPOST(channel, download, quiet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportApi#startSearchImportUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]
 **download** | **Boolean**| if true: causes the import file to be updated first. If no URL is stored in the FACT-Finder configuration, this parameter has no effect. | [optional] [default to false]
 **quiet** | **Boolean**| if true: only receive a filled response if an error occurs during the import otherwise the response is just empty | [optional] [default to false]

### Return type

[**ImportResult**](ImportResult.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

<a name="startSuggestImportUsingPOST"></a>
# **startSuggestImportUsingPOST**
> ImportResult startSuggestImportUsingPOST(channel, quiet)

Start suggest import

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ImportApi apiInstance = new ImportApi();
List<String> channel = Arrays.asList("channel_example"); // List<String> | channel
Boolean quiet = false; // Boolean | if true: only receive a filled response if an error occurs during the import otherwise the response is just empty
try {
    ImportResult result = apiInstance.startSuggestImportUsingPOST(channel, quiet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportApi#startSuggestImportUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]
 **quiet** | **Boolean**| if true: only receive a filled response if an error occurs during the import otherwise the response is just empty | [optional] [default to false]

### Return type

[**ImportResult**](ImportResult.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json


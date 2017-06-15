# RefreshdatabasesApi

All URIs are relative to *http://{FACT_FINDER_INSTANCE}/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**refreshAllDatabasesUsingPOST**](RefreshdatabasesApi.md#refreshAllDatabasesUsingPOST) | **POST** /v1/refreshdatabases/all | Refresh all databases
[**refreshRecommendationDatabasesUsingPOST**](RefreshdatabasesApi.md#refreshRecommendationDatabasesUsingPOST) | **POST** /v1/refreshdatabases/recommendation | Refresh recommendation databases
[**refreshSearchDatabasesUsingPOST**](RefreshdatabasesApi.md#refreshSearchDatabasesUsingPOST) | **POST** /v1/refreshdatabases/search | Refresh search databases
[**refreshSuggestDatabasesUsingPOST**](RefreshdatabasesApi.md#refreshSuggestDatabasesUsingPOST) | **POST** /v1/refreshdatabases/suggest | Refresh suggest databases


<a name="refreshAllDatabasesUsingPOST"></a>
# **refreshAllDatabasesUsingPOST**
> refreshAllDatabasesUsingPOST(channel)

Refresh all databases

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RefreshdatabasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

RefreshdatabasesApi apiInstance = new RefreshdatabasesApi();
List<String> channel = Arrays.asList("channel_example"); // List<String> | channel
try {
    apiInstance.refreshAllDatabasesUsingPOST(channel);
} catch (ApiException e) {
    System.err.println("Exception when calling RefreshdatabasesApi#refreshAllDatabasesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

<a name="refreshRecommendationDatabasesUsingPOST"></a>
# **refreshRecommendationDatabasesUsingPOST**
> refreshRecommendationDatabasesUsingPOST(channel)

Refresh recommendation databases

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RefreshdatabasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

RefreshdatabasesApi apiInstance = new RefreshdatabasesApi();
List<String> channel = Arrays.asList("channel_example"); // List<String> | channel
try {
    apiInstance.refreshRecommendationDatabasesUsingPOST(channel);
} catch (ApiException e) {
    System.err.println("Exception when calling RefreshdatabasesApi#refreshRecommendationDatabasesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

<a name="refreshSearchDatabasesUsingPOST"></a>
# **refreshSearchDatabasesUsingPOST**
> refreshSearchDatabasesUsingPOST(channel)

Refresh search databases

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RefreshdatabasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

RefreshdatabasesApi apiInstance = new RefreshdatabasesApi();
List<String> channel = Arrays.asList("channel_example"); // List<String> | channel
try {
    apiInstance.refreshSearchDatabasesUsingPOST(channel);
} catch (ApiException e) {
    System.err.println("Exception when calling RefreshdatabasesApi#refreshSearchDatabasesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

<a name="refreshSuggestDatabasesUsingPOST"></a>
# **refreshSuggestDatabasesUsingPOST**
> refreshSuggestDatabasesUsingPOST(channel)

Refresh suggest databases

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RefreshdatabasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

RefreshdatabasesApi apiInstance = new RefreshdatabasesApi();
List<String> channel = Arrays.asList("channel_example"); // List<String> | channel
try {
    apiInstance.refreshSuggestDatabasesUsingPOST(channel);
} catch (ApiException e) {
    System.err.println("Exception when calling RefreshdatabasesApi#refreshSuggestDatabasesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json


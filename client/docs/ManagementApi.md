# ManagementApi

All URIs are relative to *http://{FACT_FINDER_INSTANCE}/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**importWhatsHotUsingPOST**](ManagementApi.md#importWhatsHotUsingPOST) | **POST** /v1/management/whatshot | Execute whatshot import(s)
[**reloadConfigurationUsingPOST**](ManagementApi.md#reloadConfigurationUsingPOST) | **POST** /v1/management/reloadConfiguration | Reload the configuration


<a name="importWhatsHotUsingPOST"></a>
# **importWhatsHotUsingPOST**
> importWhatsHotUsingPOST(channel, sendNotifications)

Execute whatshot import(s)

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.ManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ManagementApi apiInstance = new ManagementApi();
List<String> channel = Arrays.asList("channel_example"); // List<String> | channel
Boolean sendNotifications = false; // Boolean | Flag if the generated reports should be sent afterwards as e-mail notifications
try {
    apiInstance.importWhatsHotUsingPOST(channel, sendNotifications);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementApi#importWhatsHotUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]
 **sendNotifications** | **Boolean**| Flag if the generated reports should be sent afterwards as e-mail notifications | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

<a name="reloadConfigurationUsingPOST"></a>
# **reloadConfigurationUsingPOST**
> reloadConfigurationUsingPOST(channel)

Reload the configuration

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.ManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ManagementApi apiInstance = new ManagementApi();
List<String> channel = Arrays.asList("channel_example"); // List<String> | channel
try {
    apiInstance.reloadConfigurationUsingPOST(channel);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementApi#reloadConfigurationUsingPOST");
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


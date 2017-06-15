# RecordsApi

All URIs are relative to *http://{FACT_FINDER_INSTANCE}/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUsingDELETE**](RecordsApi.md#deleteUsingDELETE) | **DELETE** /v1/records/{channel} | Delete records
[**getRecordsUsingGET**](RecordsApi.md#getRecordsUsingGET) | **GET** /v1/records/{channel} | Get records
[**insertRecordsUsingPOST**](RecordsApi.md#insertRecordsUsingPOST) | **POST** /v1/records/{channel} | Insert records
[**updateUsingPUT**](RecordsApi.md#updateUsingPUT) | **PUT** /v1/records/{channel} | Update records


<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> deleteUsingDELETE(channel, recordId, save)

Delete records

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

RecordsApi apiInstance = new RecordsApi();
String channel = "channel_example"; // String | channel
List<String> recordId = Arrays.asList("recordId_example"); // List<String> | The ids from the records which should be deleted.
Boolean save = false; // Boolean | When true: the database will also be saved after the change. If the database persistence is not ensured by saving, changes would be lost when restarting a server or the application.
try {
    apiInstance.deleteUsingDELETE(channel, recordId, save);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **recordId** | [**List&lt;String&gt;**](String.md)| The ids from the records which should be deleted. |
 **save** | **Boolean**| When true: the database will also be saved after the change. If the database persistence is not ensured by saving, changes would be lost when restarting a server or the application. | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

<a name="getRecordsUsingGET"></a>
# **getRecordsUsingGET**
> List&lt;RecordWithId&gt; getRecordsUsingGET(channel, recordId)

Get records

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

RecordsApi apiInstance = new RecordsApi();
String channel = "channel_example"; // String | channel
List<String> recordId = Arrays.asList("recordId_example"); // List<String> | The record ids of the records which should be returned
try {
    List<RecordWithId> result = apiInstance.getRecordsUsingGET(channel, recordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#getRecordsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **recordId** | [**List&lt;String&gt;**](String.md)| The record ids of the records which should be returned |

### Return type

[**List&lt;RecordWithId&gt;**](RecordWithId.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

<a name="insertRecordsUsingPOST"></a>
# **insertRecordsUsingPOST**
> insertRecordsUsingPOST(channel, records, save)

Insert records

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

RecordsApi apiInstance = new RecordsApi();
String channel = "channel_example"; // String | channel
List<RecordWithId> records = Arrays.asList(new RecordWithId()); // List<RecordWithId> | The records which should be inserted
Boolean save = false; // Boolean | When true: the database will also be saved after the change. If the database persistence is not ensured by saving, changes would be lost when restarting a server or the application.
try {
    apiInstance.insertRecordsUsingPOST(channel, records, save);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#insertRecordsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **records** | [**List&lt;RecordWithId&gt;**](RecordWithId.md)| The records which should be inserted |
 **save** | **Boolean**| When true: the database will also be saved after the change. If the database persistence is not ensured by saving, changes would be lost when restarting a server or the application. | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> updateUsingPUT(channel, records, save)

Update records

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

RecordsApi apiInstance = new RecordsApi();
String channel = "channel_example"; // String | channel
List<RecordWithId> records = Arrays.asList(new RecordWithId()); // List<RecordWithId> | The records which should be updated
Boolean save = false; // Boolean | When true: the database will also be saved after the change. If the database persistence is not ensured by saving, changes would be lost when restarting a server or the application.
try {
    apiInstance.updateUsingPUT(channel, records, save);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordsApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **records** | [**List&lt;RecordWithId&gt;**](RecordWithId.md)| The records which should be updated |
 **save** | **Boolean**| When true: the database will also be saved after the change. If the database persistence is not ensured by saving, changes would be lost when restarting a server or the application. | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json


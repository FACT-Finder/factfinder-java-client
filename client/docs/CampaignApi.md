# CampaignApi

All URIs are relative to *http://{FACT_FINDER_INSTANCE}/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPageCampaignsUsingGET**](CampaignApi.md#getPageCampaignsUsingGET) | **GET** /v1/campaign/{channel}/page | Get page campaigns
[**getProductCampaignsUsingGET**](CampaignApi.md#getProductCampaignsUsingGET) | **GET** /v1/campaign/{channel}/product | Get product campaigns
[**getShoppingCartCampaignsUsingGET**](CampaignApi.md#getShoppingCartCampaignsUsingGET) | **GET** /v1/campaign/{channel}/shoppingcart | Get shopping cart campaigns


<a name="getPageCampaignsUsingGET"></a>
# **getPageCampaignsUsingGET**
> List&lt;Campaign&gt; getPageCampaignsUsingGET(channel, pageId, idsOnly, sid, advisorStatus)

Get page campaigns

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CampaignApi apiInstance = new CampaignApi();
String channel = "channel_example"; // String | channel
String pageId = "pageId_example"; // String | Use this parameter to pass a page ID for which you wish to obtain campaigns.
Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
String sid = "sid_example"; // String | This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking.
String advisorStatus = "advisorStatus_example"; // String | For specifying the current campaign id and answer path; format: campaignId-answerPath
try {
    List<Campaign> result = apiInstance.getPageCampaignsUsingGET(channel, pageId, idsOnly, sid, advisorStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#getPageCampaignsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **pageId** | **String**| Use this parameter to pass a page ID for which you wish to obtain campaigns. |
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]
 **sid** | **String**| This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking. | [optional]
 **advisorStatus** | **String**| For specifying the current campaign id and answer path; format: campaignId-answerPath | [optional]

### Return type

[**List&lt;Campaign&gt;**](Campaign.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

<a name="getProductCampaignsUsingGET"></a>
# **getProductCampaignsUsingGET**
> List&lt;Campaign&gt; getProductCampaignsUsingGET(channel, productNumber, idsOnly, sid, advisorStatus)

Get product campaigns

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CampaignApi apiInstance = new CampaignApi();
String channel = "channel_example"; // String | channel
String productNumber = "productNumber_example"; // String | Use this parameter to pass a product ID for which you wish to obtain campaigns.
Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
String sid = "sid_example"; // String | This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking.
String advisorStatus = "advisorStatus_example"; // String | For specifying the current campaign id and answer path; format: campaignId-answerPath
try {
    List<Campaign> result = apiInstance.getProductCampaignsUsingGET(channel, productNumber, idsOnly, sid, advisorStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#getProductCampaignsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **productNumber** | **String**| Use this parameter to pass a product ID for which you wish to obtain campaigns. |
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]
 **sid** | **String**| This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking. | [optional]
 **advisorStatus** | **String**| For specifying the current campaign id and answer path; format: campaignId-answerPath | [optional]

### Return type

[**List&lt;Campaign&gt;**](Campaign.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

<a name="getShoppingCartCampaignsUsingGET"></a>
# **getShoppingCartCampaignsUsingGET**
> List&lt;Campaign&gt; getShoppingCartCampaignsUsingGET(channel, productNumber, idsOnly, sid, advisorStatus)

Get shopping cart campaigns

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CampaignApi apiInstance = new CampaignApi();
String channel = "channel_example"; // String | channel
List<String> productNumber = Arrays.asList("productNumber_example"); // List<String> | Use this parameter to pass product ID(s) for which you wish to obtain campaigns.
Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
String sid = "sid_example"; // String | This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking.
String advisorStatus = "advisorStatus_example"; // String | For specifying the current campaign id and answer path; format: campaignId-answerPath
try {
    List<Campaign> result = apiInstance.getShoppingCartCampaignsUsingGET(channel, productNumber, idsOnly, sid, advisorStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#getShoppingCartCampaignsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **productNumber** | [**List&lt;String&gt;**](String.md)| Use this parameter to pass product ID(s) for which you wish to obtain campaigns. |
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]
 **sid** | **String**| This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking. | [optional]
 **advisorStatus** | **String**| For specifying the current campaign id and answer path; format: campaignId-answerPath | [optional]

### Return type

[**List&lt;Campaign&gt;**](Campaign.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json


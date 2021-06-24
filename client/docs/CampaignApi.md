# CampaignApi

All URIs are relative to *http://!!!DO NOT MANUALLY EDIT THIS FILE!!! Update files in this directory with ./gradlew :itests:default:test -PgenerateSpec*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPageCampaignsUsingGET**](CampaignApi.md#getPageCampaignsUsingGET) | **GET** /rest/v4/campaign/{channel}/page | Get page campaigns
[**getProductCampaignsUsingGET**](CampaignApi.md#getProductCampaignsUsingGET) | **GET** /rest/v4/campaign/{channel}/product | Get product campaigns
[**getShoppingCartCampaignsUsingGET**](CampaignApi.md#getShoppingCartCampaignsUsingGET) | **GET** /rest/v4/campaign/{channel}/shoppingcart | Get shopping cart campaigns


<a name="getPageCampaignsUsingGET"></a>
# **getPageCampaignsUsingGET**
> List&lt;Campaign&gt; getPageCampaignsUsingGET(channel, pageId, idsOnly, purchaserId, sid, latitude, longitude, marketIds)

Get page campaigns

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://!!!DO NOT MANUALLY EDIT THIS FILE!!! Update files in this directory with ./gradlew :itests:default:test -PgenerateSpec");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String channel = "channel_example"; // String | channel
    String pageId = "pageId_example"; // String | Use this parameter to pass a page ID for which you wish to obtain campaigns.
    Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    String sid = "sid_example"; // String | This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking.
    Double latitude = 3.4D; // Double | The latitude coordinate of the current location.
    Double longitude = 3.4D; // Double | The longitude coordinate of the current location.
    List<String> marketIds = Arrays.asList(); // List<String> | Currently selected markets
    try {
      List<Campaign> result = apiInstance.getPageCampaignsUsingGET(channel, pageId, idsOnly, purchaserId, sid, latitude, longitude, marketIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getPageCampaignsUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **pageId** | **String**| Use this parameter to pass a page ID for which you wish to obtain campaigns. |
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]
 **sid** | **String**| This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking. | [optional]
 **latitude** | **Double**| The latitude coordinate of the current location. | [optional]
 **longitude** | **Double**| The longitude coordinate of the current location. | [optional]
 **marketIds** | [**List&lt;String&gt;**](String.md)| Currently selected markets | [optional]

### Return type

[**List&lt;Campaign&gt;**](Campaign.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="getProductCampaignsUsingGET"></a>
# **getProductCampaignsUsingGET**
> List&lt;Campaign&gt; getProductCampaignsUsingGET(channel, id, idsOnly, idType, purchaserId, sid, latitude, longitude, marketIds)

Get product campaigns

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://!!!DO NOT MANUALLY EDIT THIS FILE!!! Update files in this directory with ./gradlew :itests:default:test -PgenerateSpec");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String channel = "channel_example"; // String | channel
    String id = "id_example"; // String | Use this parameter to pass a ID (master or product) for which you wish to obtain campaigns.
    Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
    String idType = "productNumber"; // String | Specifies which type of id is given.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    String sid = "sid_example"; // String | This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking.
    Double latitude = 3.4D; // Double | The latitude coordinate of the current location.
    Double longitude = 3.4D; // Double | The longitude coordinate of the current location.
    List<String> marketIds = Arrays.asList(); // List<String> | Currently selected markets
    try {
      List<Campaign> result = apiInstance.getProductCampaignsUsingGET(channel, id, idsOnly, idType, purchaserId, sid, latitude, longitude, marketIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getProductCampaignsUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **id** | **String**| Use this parameter to pass a ID (master or product) for which you wish to obtain campaigns. |
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]
 **idType** | **String**| Specifies which type of id is given. | [optional] [default to productNumber] [enum: productNumber, id]
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]
 **sid** | **String**| This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking. | [optional]
 **latitude** | **Double**| The latitude coordinate of the current location. | [optional]
 **longitude** | **Double**| The longitude coordinate of the current location. | [optional]
 **marketIds** | [**List&lt;String&gt;**](String.md)| Currently selected markets | [optional]

### Return type

[**List&lt;Campaign&gt;**](Campaign.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="getShoppingCartCampaignsUsingGET"></a>
# **getShoppingCartCampaignsUsingGET**
> List&lt;Campaign&gt; getShoppingCartCampaignsUsingGET(channel, productNumber, idsOnly, purchaserId, sid, latitude, longitude, marketIds)

Get shopping cart campaigns

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://!!!DO NOT MANUALLY EDIT THIS FILE!!! Update files in this directory with ./gradlew :itests:default:test -PgenerateSpec");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<String> productNumber = Arrays.asList(); // List<String> | Use this parameter to pass product ID(s) for which you wish to obtain campaigns.
    Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    String sid = "sid_example"; // String | This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking.
    Double latitude = 3.4D; // Double | The latitude coordinate of the current location.
    Double longitude = 3.4D; // Double | The longitude coordinate of the current location.
    List<String> marketIds = Arrays.asList(); // List<String> | Currently selected markets
    try {
      List<Campaign> result = apiInstance.getShoppingCartCampaignsUsingGET(channel, productNumber, idsOnly, purchaserId, sid, latitude, longitude, marketIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getShoppingCartCampaignsUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **productNumber** | [**List&lt;String&gt;**](String.md)| Use this parameter to pass product ID(s) for which you wish to obtain campaigns. |
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]
 **sid** | **String**| This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking. | [optional]
 **latitude** | **Double**| The latitude coordinate of the current location. | [optional]
 **longitude** | **Double**| The longitude coordinate of the current location. | [optional]
 **marketIds** | [**List&lt;String&gt;**](String.md)| Currently selected markets | [optional]

### Return type

[**List&lt;Campaign&gt;**](Campaign.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |


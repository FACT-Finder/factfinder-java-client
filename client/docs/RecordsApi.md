# RecordsApi

All URIs are relative to *http://!!!DO NOT MANUALLY EDIT THIS FILE!!! Update files in this directory with ./gradlew :itests:default:test -PgenerateSpec*

Method | HTTP request | Description
------------- | ------------- | -------------
[**compareUsingGET**](RecordsApi.md#compareUsingGET) | **GET** /rest/v4/records/{channel}/compare | Compare products
[**deleteCustomerPricesUsingDELETE**](RecordsApi.md#deleteCustomerPricesUsingDELETE) | **DELETE** /rest/v4/records/{channel}/customerprices | Delete customer prices
[**deleteGeoUsingDELETE**](RecordsApi.md#deleteGeoUsingDELETE) | **DELETE** /rest/v4/records/{channel}/geo | Delete geo data
[**deleteMarketUsingDELETE**](RecordsApi.md#deleteMarketUsingDELETE) | **DELETE** /rest/v4/markets/{channel} | Delete geo market
[**deleteUsingDELETE**](RecordsApi.md#deleteUsingDELETE) | **DELETE** /rest/v4/records/{channel} | Delete records
[**getCustomerPricesUsingGET**](RecordsApi.md#getCustomerPricesUsingGET) | **GET** /rest/v4/records/{channel}/customerprices | Get customer specific prices
[**getDetailPageUsingGET**](RecordsApi.md#getDetailPageUsingGET) | **GET** /rest/v4/detail/{channel}/{id} | Get the detail page
[**getFullRecordsUsingGET**](RecordsApi.md#getFullRecordsUsingGET) | **GET** /rest/v4/records/{channel}/full | Get full records
[**getGeoUsingGET**](RecordsApi.md#getGeoUsingGET) | **GET** /rest/v4/records/{channel}/geo | Get geo data
[**getMarketsUsingGET**](RecordsApi.md#getMarketsUsingGET) | **GET** /rest/v4/markets/{channel} | Get markets with location
[**getRecommendationUsingGET**](RecordsApi.md#getRecommendationUsingGET) | **GET** /rest/v4/records/{channel}/recommendation | Get recommendations
[**getRecordMetaGetUsingGET**](RecordsApi.md#getRecordMetaGetUsingGET) | **GET** /rest/v4/records/{channel}/meta | Retrieve record metadata
[**getRecordMetaPostUsingPOST**](RecordsApi.md#getRecordMetaPostUsingPOST) | **POST** /rest/v4/records/{channel}/meta | Retrieve record metadata
[**getRecordsUsingGET**](RecordsApi.md#getRecordsUsingGET) | **GET** /rest/v4/records/{channel} | Get records
[**getSimilarProductsUsingGET**](RecordsApi.md#getSimilarProductsUsingGET) | **GET** /rest/v4/records/{channel}/similar | Get similar products
[**insertRecordsUsingPOST**](RecordsApi.md#insertRecordsUsingPOST) | **POST** /rest/v4/records/{channel} | Insert records
[**updateCustomerPricesUsingPOST**](RecordsApi.md#updateCustomerPricesUsingPOST) | **POST** /rest/v4/records/{channel}/customerprices | Update customer prices
[**updateGeoUsingPOST**](RecordsApi.md#updateGeoUsingPOST) | **POST** /rest/v4/records/{channel}/geo | Update geo data
[**updateMarketsUsingPOST**](RecordsApi.md#updateMarketsUsingPOST) | **POST** /rest/v4/markets/{channel} | Update markets
[**updateUsingPUT**](RecordsApi.md#updateUsingPUT) | **PUT** /rest/v4/records/{channel} | Update records
[**upsertRecordsUsingPUT**](RecordsApi.md#upsertRecordsUsingPUT) | **PUT** /rest/v4/records/{channel}/upsert | Upsert records


<a name="compareUsingGET"></a>
# **compareUsingGET**
> CompareResult compareUsingGET(channel, idsOnly, id, purchaserId)

Compare products

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
    List<String> id = Arrays.asList(); // List<String> | Use this parameter to pass product ID(s) which should be compared.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    try {
      CompareResult result = apiInstance.compareUsingGET(channel, idsOnly, id, purchaserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#compareUsingGET");
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
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]
 **id** | [**List&lt;String&gt;**](String.md)| Use this parameter to pass product ID(s) which should be compared. | [optional]
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]

### Return type

[**CompareResult**](CompareResult.md)

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

<a name="deleteCustomerPricesUsingDELETE"></a>
# **deleteCustomerPricesUsingDELETE**
> List&lt;DeleteResult&gt; deleteCustomerPricesUsingDELETE(channel, id, idType, verbose, deleteRequest)

Delete customer prices

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<String> id = Arrays.asList(); // List<String> | The ids from the records which should be deleted.
    String idType = "productNumber"; // String | Specifies which type of id is given.
    Boolean verbose = false; // Boolean | verbose
    DeleteRequest deleteRequest = new DeleteRequest(); // DeleteRequest | deleteRequest
    try {
      List<DeleteResult> result = apiInstance.deleteCustomerPricesUsingDELETE(channel, id, idType, verbose, deleteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#deleteCustomerPricesUsingDELETE");
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
 **id** | [**List&lt;String&gt;**](String.md)| The ids from the records which should be deleted. | [optional]
 **idType** | **String**| Specifies which type of id is given. | [optional] [default to productNumber] [enum: productNumber, id]
 **verbose** | **Boolean**| verbose | [optional] [default to false]
 **deleteRequest** | [**DeleteRequest**](DeleteRequest.md)| deleteRequest | [optional]

### Return type

[**List&lt;DeleteResult&gt;**](DeleteResult.md)

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

<a name="deleteGeoUsingDELETE"></a>
# **deleteGeoUsingDELETE**
> List&lt;DeleteResult&gt; deleteGeoUsingDELETE(channel, id, verbose, deleteRequest)

Delete geo data

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<String> id = Arrays.asList(); // List<String> | The ids from the records which should be deleted.
    Boolean verbose = false; // Boolean | verbose
    DeleteRequest deleteRequest = new DeleteRequest(); // DeleteRequest | deleteRequest
    try {
      List<DeleteResult> result = apiInstance.deleteGeoUsingDELETE(channel, id, verbose, deleteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#deleteGeoUsingDELETE");
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
 **id** | [**List&lt;String&gt;**](String.md)| The ids from the records which should be deleted. | [optional]
 **verbose** | **Boolean**| verbose | [optional] [default to false]
 **deleteRequest** | [**DeleteRequest**](DeleteRequest.md)| deleteRequest | [optional]

### Return type

[**List&lt;DeleteResult&gt;**](DeleteResult.md)

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

<a name="deleteMarketUsingDELETE"></a>
# **deleteMarketUsingDELETE**
> List&lt;DeleteResult&gt; deleteMarketUsingDELETE(channel, marketId, verbose, deleteMarketRequest)

Delete geo market

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<String> marketId = Arrays.asList(); // List<String> | The ids of the markets which should be deleted.
    Boolean verbose = false; // Boolean | verbose
    DeleteMarketRequest deleteMarketRequest = new DeleteMarketRequest(); // DeleteMarketRequest | deleteMarketRequest
    try {
      List<DeleteResult> result = apiInstance.deleteMarketUsingDELETE(channel, marketId, verbose, deleteMarketRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#deleteMarketUsingDELETE");
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
 **marketId** | [**List&lt;String&gt;**](String.md)| The ids of the markets which should be deleted. | [optional]
 **verbose** | **Boolean**| verbose | [optional] [default to false]
 **deleteMarketRequest** | [**DeleteMarketRequest**](DeleteMarketRequest.md)| deleteMarketRequest | [optional]

### Return type

[**List&lt;DeleteResult&gt;**](DeleteResult.md)

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

<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> List&lt;DeleteResult&gt; deleteUsingDELETE(channel, id, idType, verbose, deleteRequest)

Delete records

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<String> id = Arrays.asList(); // List<String> | The ids from the records which should be deleted.
    String idType = "productNumber"; // String | Specifies the type of id given.
    Boolean verbose = false; // Boolean | verbose
    DeleteRequest deleteRequest = new DeleteRequest(); // DeleteRequest | deleteRequest
    try {
      List<DeleteResult> result = apiInstance.deleteUsingDELETE(channel, id, idType, verbose, deleteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#deleteUsingDELETE");
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
 **id** | [**List&lt;String&gt;**](String.md)| The ids from the records which should be deleted. | [optional]
 **idType** | **String**| Specifies the type of id given. | [optional] [default to productNumber] [enum: productNumber, id]
 **verbose** | **Boolean**| verbose | [optional] [default to false]
 **deleteRequest** | [**DeleteRequest**](DeleteRequest.md)| deleteRequest | [optional]

### Return type

[**List&lt;DeleteResult&gt;**](DeleteResult.md)

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

<a name="getCustomerPricesUsingGET"></a>
# **getCustomerPricesUsingGET**
> List&lt;Map&lt;String, Object&gt;&gt; getCustomerPricesUsingGET(channel, id, idType)

Get customer specific prices

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<String> id = Arrays.asList(); // List<String> | The product numbers of the records for which customer prices should be returned.
    String idType = "productNumber"; // String | Specifies which type of id is given.
    try {
      List<Map<String, Object>> result = apiInstance.getCustomerPricesUsingGET(channel, id, idType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getCustomerPricesUsingGET");
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
 **id** | [**List&lt;String&gt;**](String.md)| The product numbers of the records for which customer prices should be returned. |
 **idType** | **String**| Specifies which type of id is given. | [optional] [default to productNumber] [enum: productNumber, id]

### Return type

[**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)

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

<a name="getDetailPageUsingGET"></a>
# **getDetailPageUsingGET**
> DetailPage getDetailPageUsingGET(channel, id, idType, idsOnly, maxResultsRecommendations, maxResultsSimilarProducts, usePersonalization, sid, purchaserId, latitude, longitude, marketIds, maxCountVariants, withCampaigns, withRecommendations, withSimilarProducts, withRecord)

Get the detail page

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    String id = "id_example"; // String | The id for which the detailpage should be returned.
    String idType = "id"; // String | Specifies which type of id is given.
    Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
    Integer maxResultsRecommendations = 0; // Integer | Use this parameter to specify the number of recommendations you would like. The default value from the configuration is used if the parameter is not specified.
    Integer maxResultsSimilarProducts = 10; // Integer | Use this parameter to specify the number of similar articles you would like. The default value from the configuration is used if the parameter is not specified.
    Boolean usePersonalization = true; // Boolean | Allows the activation/deactivation of the personalization of queries. true = the search result will be personalized if the personalization module is activated and all other requirements are met; false = the search result will not be personalized.
    String sid = "sid_example"; // String | This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    Double latitude = 3.4D; // Double | The latitude coordinate of the current location.
    Double longitude = 3.4D; // Double | The longitude coordinate of the current location.
    List<String> marketIds = Arrays.asList(); // List<String> | Currently selected markets
    Integer maxCountVariants = 5; // Integer | The maximum number of variants to return for every record
    Boolean withCampaigns = true; // Boolean | withCampaigns
    Boolean withRecommendations = true; // Boolean | withRecommendations
    Boolean withSimilarProducts = true; // Boolean | withSimilarProducts
    Boolean withRecord = true; // Boolean | withRecord
    try {
      DetailPage result = apiInstance.getDetailPageUsingGET(channel, id, idType, idsOnly, maxResultsRecommendations, maxResultsSimilarProducts, usePersonalization, sid, purchaserId, latitude, longitude, marketIds, maxCountVariants, withCampaigns, withRecommendations, withSimilarProducts, withRecord);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getDetailPageUsingGET");
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
 **id** | **String**| The id for which the detailpage should be returned. |
 **idType** | **String**| Specifies which type of id is given. | [optional] [default to id] [enum: productNumber, id]
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]
 **maxResultsRecommendations** | **Integer**| Use this parameter to specify the number of recommendations you would like. The default value from the configuration is used if the parameter is not specified. | [optional] [default to 0]
 **maxResultsSimilarProducts** | **Integer**| Use this parameter to specify the number of similar articles you would like. The default value from the configuration is used if the parameter is not specified. | [optional] [default to 10]
 **usePersonalization** | **Boolean**| Allows the activation/deactivation of the personalization of queries. true &#x3D; the search result will be personalized if the personalization module is activated and all other requirements are met; false &#x3D; the search result will not be personalized. | [optional] [default to true]
 **sid** | **String**| This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking. | [optional]
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]
 **latitude** | **Double**| The latitude coordinate of the current location. | [optional]
 **longitude** | **Double**| The longitude coordinate of the current location. | [optional]
 **marketIds** | [**List&lt;String&gt;**](String.md)| Currently selected markets | [optional]
 **maxCountVariants** | **Integer**| The maximum number of variants to return for every record | [optional] [default to 5]
 **withCampaigns** | **Boolean**| withCampaigns | [optional] [default to true]
 **withRecommendations** | **Boolean**| withRecommendations | [optional] [default to true]
 **withSimilarProducts** | **Boolean**| withSimilarProducts | [optional] [default to true]
 **withRecord** | **Boolean**| withRecord | [optional] [default to true]

### Return type

[**DetailPage**](DetailPage.md)

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
**404** | Not Found |  -  |
**500** | Server Error |  -  |

<a name="getFullRecordsUsingGET"></a>
# **getFullRecordsUsingGET**
> FullRecordsResult getFullRecordsUsingGET(channel, id, purchaserId, idType, maxCountVariants)

Get full records

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<String> id = Arrays.asList(); // List<String> | The record ids of the records which should be returned
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    String idType = "id"; // String | Specifies which type of id is given.
    Integer maxCountVariants = 5; // Integer | The maximum number of variants to return for every record
    try {
      FullRecordsResult result = apiInstance.getFullRecordsUsingGET(channel, id, purchaserId, idType, maxCountVariants);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getFullRecordsUsingGET");
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
 **id** | [**List&lt;String&gt;**](String.md)| The record ids of the records which should be returned |
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]
 **idType** | **String**| Specifies which type of id is given. | [optional] [default to id] [enum: productNumber, id]
 **maxCountVariants** | **Integer**| The maximum number of variants to return for every record | [optional] [default to 5]

### Return type

[**FullRecordsResult**](FullRecordsResult.md)

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

<a name="getGeoUsingGET"></a>
# **getGeoUsingGET**
> List&lt;Map&lt;String, Object&gt;&gt; getGeoUsingGET(channel, id)

Get geo data

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<String> id = Arrays.asList(); // List<String> | The product numbers of the records for which geo data should be returned.
    try {
      List<Map<String, Object>> result = apiInstance.getGeoUsingGET(channel, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getGeoUsingGET");
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
 **id** | [**List&lt;String&gt;**](String.md)| The product numbers of the records for which geo data should be returned. |

### Return type

[**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)

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

<a name="getMarketsUsingGET"></a>
# **getMarketsUsingGET**
> List&lt;Map&lt;String, Object&gt;&gt; getMarketsUsingGET(channel, marketId)

Get markets with location

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<String> marketId = Arrays.asList(); // List<String> | The market ids.
    try {
      List<Map<String, Object>> result = apiInstance.getMarketsUsingGET(channel, marketId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getMarketsUsingGET");
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
 **marketId** | [**List&lt;String&gt;**](String.md)| The market ids. | [optional]

### Return type

[**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)

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

<a name="getRecommendationUsingGET"></a>
# **getRecommendationUsingGET**
> RecommendationResultWithFieldRoles getRecommendationUsingGET(channel, id, maxResults, sid, filter, idsOnly, usePersonalization, purchaserId)

Get recommendations

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<String> id = Arrays.asList(); // List<String> | Use this parameter to pass product ID(s) for which you wish to obtain recommendations.
    Integer maxResults = 0; // Integer | Use this parameter to specify the number of recommendations you would like. The default value from the configuration is used if the parameter is not specified.
    String sid = "sid_example"; // String | This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to give him personalised recommendations, as well as for FACT-Finder tracking.
    List<String> filter = Arrays.asList(); // List<String> | Filters for field values of recommended records.
    Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
    Boolean usePersonalization = true; // Boolean | Allows the activation/deactivation of the personalization of queries. true = the search result will be personalized if the personalization module is activated and all other requirements are met; false = the search result will not be personalized.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    try {
      RecommendationResultWithFieldRoles result = apiInstance.getRecommendationUsingGET(channel, id, maxResults, sid, filter, idsOnly, usePersonalization, purchaserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getRecommendationUsingGET");
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
 **id** | [**List&lt;String&gt;**](String.md)| Use this parameter to pass product ID(s) for which you wish to obtain recommendations. |
 **maxResults** | **Integer**| Use this parameter to specify the number of recommendations you would like. The default value from the configuration is used if the parameter is not specified. | [optional] [default to 0]
 **sid** | **String**| This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to give him personalised recommendations, as well as for FACT-Finder tracking. | [optional]
 **filter** | [**List&lt;String&gt;**](String.md)| Filters for field values of recommended records. | [optional]
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]
 **usePersonalization** | **Boolean**| Allows the activation/deactivation of the personalization of queries. true &#x3D; the search result will be personalized if the personalization module is activated and all other requirements are met; false &#x3D; the search result will not be personalized. | [optional] [default to true]
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]

### Return type

[**RecommendationResultWithFieldRoles**](RecommendationResultWithFieldRoles.md)

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

<a name="getRecordMetaGetUsingGET"></a>
# **getRecordMetaGetUsingGET**
> RecordMetaResult getRecordMetaGetUsingGET(channel, id, purchaserId, idType)

Retrieve record metadata

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<String> id = Arrays.asList(); // List<String> | The record ids of the records which should be returned
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    String idType = "id"; // String | Specifies which type of id is given.
    try {
      RecordMetaResult result = apiInstance.getRecordMetaGetUsingGET(channel, id, purchaserId, idType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getRecordMetaGetUsingGET");
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
 **id** | [**List&lt;String&gt;**](String.md)| The record ids of the records which should be returned |
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]
 **idType** | **String**| Specifies which type of id is given. | [optional] [default to id] [enum: productNumber, id]

### Return type

[**RecordMetaResult**](RecordMetaResult.md)

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

<a name="getRecordMetaPostUsingPOST"></a>
# **getRecordMetaPostUsingPOST**
> RecordMetaResult getRecordMetaPostUsingPOST(channel, metaRequest, idType, purchaserId)

Retrieve record metadata

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    MetaRequest metaRequest = new MetaRequest(); // MetaRequest | metaRequest
    String idType = "id"; // String | Specifies which type of id is given.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    try {
      RecordMetaResult result = apiInstance.getRecordMetaPostUsingPOST(channel, metaRequest, idType, purchaserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getRecordMetaPostUsingPOST");
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
 **metaRequest** | [**MetaRequest**](MetaRequest.md)| metaRequest |
 **idType** | **String**| Specifies which type of id is given. | [optional] [default to id] [enum: productNumber, id]
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]

### Return type

[**RecordMetaResult**](RecordMetaResult.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="getRecordsUsingGET"></a>
# **getRecordsUsingGET**
> FlatRecordsResult getRecordsUsingGET(channel, productNumber, purchaserId, verbose)

Get records

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<String> productNumber = Arrays.asList(); // List<String> | The product numbers of the records which should be returned.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    Boolean verbose = false; // Boolean | verbose
    try {
      FlatRecordsResult result = apiInstance.getRecordsUsingGET(channel, productNumber, purchaserId, verbose);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getRecordsUsingGET");
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
 **productNumber** | [**List&lt;String&gt;**](String.md)| The product numbers of the records which should be returned. |
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]
 **verbose** | **Boolean**| verbose | [optional] [default to false]

### Return type

[**FlatRecordsResult**](FlatRecordsResult.md)

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

<a name="getSimilarProductsUsingGET"></a>
# **getSimilarProductsUsingGET**
> SimilarProductsWithFieldRoles getSimilarProductsUsingGET(channel, id, idType, filter, idsOnly, purchaserId, maxResults)

Get similar products

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    String id = "id_example"; // String | Use this parameter to pass the product ID for which you wish to obtain similar products.
    String idType = "idType_example"; // String | Use this parameter to determine the type of id passed to the method.
    List<String> filter = Arrays.asList(); // List<String> | Filters for field values of recommended records.
    Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    Integer maxResults = 10; // Integer | Use this parameter to specify the number of similar articles you would like. The default value from the configuration is used if the parameter is not specified.
    try {
      SimilarProductsWithFieldRoles result = apiInstance.getSimilarProductsUsingGET(channel, id, idType, filter, idsOnly, purchaserId, maxResults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getSimilarProductsUsingGET");
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
 **id** | **String**| Use this parameter to pass the product ID for which you wish to obtain similar products. |
 **idType** | **String**| Use this parameter to determine the type of id passed to the method. | [enum: productNumber, id]
 **filter** | [**List&lt;String&gt;**](String.md)| Filters for field values of recommended records. | [optional]
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]
 **maxResults** | **Integer**| Use this parameter to specify the number of similar articles you would like. The default value from the configuration is used if the parameter is not specified. | [optional] [default to 10]

### Return type

[**SimilarProductsWithFieldRoles**](SimilarProductsWithFieldRoles.md)

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

<a name="insertRecordsUsingPOST"></a>
# **insertRecordsUsingPOST**
> List&lt;DeltaUpdateResult&gt; insertRecordsUsingPOST(channel, records, verbose)

Insert records

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<Map<String, Object>> records = Arrays.asList(new HashMap<String, Object>()); // List<Map<String, Object>> | The records which should be inserted
    Boolean verbose = false; // Boolean | verbose
    try {
      List<DeltaUpdateResult> result = apiInstance.insertRecordsUsingPOST(channel, records, verbose);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#insertRecordsUsingPOST");
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
 **records** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)| The records which should be inserted |
 **verbose** | **Boolean**| verbose | [optional] [default to false]

### Return type

[**List&lt;DeltaUpdateResult&gt;**](DeltaUpdateResult.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="updateCustomerPricesUsingPOST"></a>
# **updateCustomerPricesUsingPOST**
> List&lt;CustomerPriceUpdateResult&gt; updateCustomerPricesUsingPOST(channel, records, verbose)

Update customer prices

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<Map<String, Object>> records = Arrays.asList(new HashMap<String, Object>()); // List<Map<String, Object>> | The records which should be inserted
    Boolean verbose = false; // Boolean | verbose
    try {
      List<CustomerPriceUpdateResult> result = apiInstance.updateCustomerPricesUsingPOST(channel, records, verbose);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#updateCustomerPricesUsingPOST");
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
 **records** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)| The records which should be inserted |
 **verbose** | **Boolean**| verbose | [optional] [default to false]

### Return type

[**List&lt;CustomerPriceUpdateResult&gt;**](CustomerPriceUpdateResult.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="updateGeoUsingPOST"></a>
# **updateGeoUsingPOST**
> List&lt;GeoUpdateResult&gt; updateGeoUsingPOST(channel, records, verbose)

Update geo data

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<Map<String, Object>> records = Arrays.asList(new HashMap<String, Object>()); // List<Map<String, Object>> | The records which should be updated
    Boolean verbose = false; // Boolean | verbose
    try {
      List<GeoUpdateResult> result = apiInstance.updateGeoUsingPOST(channel, records, verbose);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#updateGeoUsingPOST");
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
 **records** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)| The records which should be updated |
 **verbose** | **Boolean**| verbose | [optional] [default to false]

### Return type

[**List&lt;GeoUpdateResult&gt;**](GeoUpdateResult.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="updateMarketsUsingPOST"></a>
# **updateMarketsUsingPOST**
> List&lt;MarketUpdateResult&gt; updateMarketsUsingPOST(channel, markets, verbose)

Update markets

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<Map<String, Object>> markets = Arrays.asList(new HashMap<String, Object>()); // List<Map<String, Object>> | The markets which should be updated
    Boolean verbose = false; // Boolean | verbose
    try {
      List<MarketUpdateResult> result = apiInstance.updateMarketsUsingPOST(channel, markets, verbose);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#updateMarketsUsingPOST");
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
 **markets** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)| The markets which should be updated |
 **verbose** | **Boolean**| verbose | [optional] [default to false]

### Return type

[**List&lt;MarketUpdateResult&gt;**](MarketUpdateResult.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> List&lt;DeltaUpdateResult&gt; updateUsingPUT(channel, records, verbose)

Update records

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<Map<String, Object>> records = Arrays.asList(new HashMap<String, Object>()); // List<Map<String, Object>> | The records which should be updated
    Boolean verbose = false; // Boolean | verbose
    try {
      List<DeltaUpdateResult> result = apiInstance.updateUsingPUT(channel, records, verbose);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#updateUsingPUT");
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
 **records** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)| The records which should be updated |
 **verbose** | **Boolean**| verbose | [optional] [default to false]

### Return type

[**List&lt;DeltaUpdateResult&gt;**](DeltaUpdateResult.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="upsertRecordsUsingPUT"></a>
# **upsertRecordsUsingPUT**
> List&lt;DeltaUpdateResult&gt; upsertRecordsUsingPUT(channel, records, verbose)

Upsert records

Update or insert records; Without variants: inserts records when they do not already exist, or replaces them if they do. With Variants: inserts a master document when it does not exists; inserts a variant and replaces the master values if the variant does not exist; replaces a variant and replaces the master values if the variant does already exist.

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.RecordsApi;

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

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<Map<String, Object>> records = Arrays.asList(new HashMap<String, Object>()); // List<Map<String, Object>> | The records which should be upserted
    Boolean verbose = false; // Boolean | verbose
    try {
      List<DeltaUpdateResult> result = apiInstance.upsertRecordsUsingPUT(channel, records, verbose);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#upsertRecordsUsingPUT");
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
 **records** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)| The records which should be upserted |
 **verbose** | **Boolean**| verbose | [optional] [default to false]

### Return type

[**List&lt;DeltaUpdateResult&gt;**](DeltaUpdateResult.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |


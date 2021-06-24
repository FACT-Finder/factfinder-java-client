# PredbasketApi

All URIs are relative to *http://!!!DO NOT MANUALLY EDIT THIS FILE!!! Update files in this directory with ./gradlew :itests:default:test -PgenerateSpec*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPredictionsUsingGET**](PredbasketApi.md#getPredictionsUsingGET) | **GET** /rest/v4/predictivebasket/{channel} | Get predictions


<a name="getPredictionsUsingGET"></a>
# **getPredictionsUsingGET**
> PredictiveBasketResult getPredictionsUsingGET(channel, userId, maxResults, filter, blacklist, purchaserId, idsOnly)

Get predictions

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.PredbasketApi;

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

    PredbasketApi apiInstance = new PredbasketApi(defaultClient);
    String channel = "channel_example"; // String | channel
    String userId = "userId_example"; // String | This parameter contains a unique user identifier. It is essential for predictive basket results.
    Integer maxResults = 0; // Integer | Limit for the amount of predictions to return.
    List<String> filter = Arrays.asList(); // List<String> | Filters for field values of returned records.
    List<String> blacklist = Arrays.asList(); // List<String> | IDs of products to exclude from predictions.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
    try {
      PredictiveBasketResult result = apiInstance.getPredictionsUsingGET(channel, userId, maxResults, filter, blacklist, purchaserId, idsOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PredbasketApi#getPredictionsUsingGET");
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
 **userId** | **String**| This parameter contains a unique user identifier. It is essential for predictive basket results. |
 **maxResults** | **Integer**| Limit for the amount of predictions to return. | [optional] [default to 0]
 **filter** | [**List&lt;String&gt;**](String.md)| Filters for field values of returned records. | [optional]
 **blacklist** | [**List&lt;String&gt;**](String.md)| IDs of products to exclude from predictions. | [optional]
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]

### Return type

[**PredictiveBasketResult**](PredictiveBasketResult.md)

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


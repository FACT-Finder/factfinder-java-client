# SimilarproductsApi

All URIs are relative to *http://{FACT_FINDER_INSTANCE}/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSimilarProductsUsingGET**](SimilarproductsApi.md#getSimilarProductsUsingGET) | **GET** /v1/similarproducts/{channel} | Get similar products


<a name="getSimilarProductsUsingGET"></a>
# **getSimilarProductsUsingGET**
> SimilarProducts getSimilarProductsUsingGET(channel, id, idsOnly, maxResults)

Get similar products

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SimilarproductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SimilarproductsApi apiInstance = new SimilarproductsApi();
String channel = "channel_example"; // String | channel
String id = "id_example"; // String | Use this parameter to pass the product ID for which you wish to obtain similar products.
Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
Integer maxResults = 10; // Integer | Use this parameter to specify the number of recommendations you would like. The default value from the configuration is used if the parameter is not specified.
try {
    SimilarProducts result = apiInstance.getSimilarProductsUsingGET(channel, id, idsOnly, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimilarproductsApi#getSimilarProductsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **id** | **String**| Use this parameter to pass the product ID for which you wish to obtain similar products. |
 **idsOnly** | **Boolean**| If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]
 **maxResults** | **Integer**| Use this parameter to specify the number of recommendations you would like. The default value from the configuration is used if the parameter is not specified. | [optional] [default to 10]

### Return type

[**SimilarProducts**](SimilarProducts.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json


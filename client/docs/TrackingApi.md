# TrackingApi

All URIs are relative to *http://{FACT_FINDER_INSTANCE}/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trackCartUsingPOST**](TrackingApi.md#trackCartUsingPOST) | **POST** /v1/track/{channel}/cart | Track a cart event
[**trackCheckoutUsingPOST**](TrackingApi.md#trackCheckoutUsingPOST) | **POST** /v1/track/{channel}/checkout | Track a checkout event
[**trackClickUsingPOST**](TrackingApi.md#trackClickUsingPOST) | **POST** /v1/track/{channel}/click | Track a click event
[**trackFeedbackUsingPOST**](TrackingApi.md#trackFeedbackUsingPOST) | **POST** /v1/track/{channel}/feedback | Track a feedback event
[**trackLogUsingPOST**](TrackingApi.md#trackLogUsingPOST) | **POST** /v1/track/{channel}/log | Track a log event
[**trackLoginUsingPOST**](TrackingApi.md#trackLoginUsingPOST) | **POST** /v1/track/{channel}/login | Track a login event
[**trackRecommendationClickUsingPOST**](TrackingApi.md#trackRecommendationClickUsingPOST) | **POST** /v1/track/{channel}/recommendationClick | Track a recommendation click event


<a name="trackCartUsingPOST"></a>
# **trackCartUsingPOST**
> trackCartUsingPOST(channel, events)

Track a cart event

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.TrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TrackingApi apiInstance = new TrackingApi();
String channel = "channel_example"; // String | channel
List<CartOrCheckoutEvent> events = Arrays.asList(new CartOrCheckoutEvent()); // List<CartOrCheckoutEvent> | events
try {
    apiInstance.trackCartUsingPOST(channel, events);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingApi#trackCartUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **events** | [**List&lt;CartOrCheckoutEvent&gt;**](CartOrCheckoutEvent.md)| events |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="trackCheckoutUsingPOST"></a>
# **trackCheckoutUsingPOST**
> trackCheckoutUsingPOST(channel, events)

Track a checkout event

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.TrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TrackingApi apiInstance = new TrackingApi();
String channel = "channel_example"; // String | channel
List<CartOrCheckoutEvent> events = Arrays.asList(new CartOrCheckoutEvent()); // List<CartOrCheckoutEvent> | events
try {
    apiInstance.trackCheckoutUsingPOST(channel, events);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingApi#trackCheckoutUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **events** | [**List&lt;CartOrCheckoutEvent&gt;**](CartOrCheckoutEvent.md)| events |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="trackClickUsingPOST"></a>
# **trackClickUsingPOST**
> trackClickUsingPOST(channel, events)

Track a click event

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.TrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TrackingApi apiInstance = new TrackingApi();
String channel = "channel_example"; // String | channel
List<ClickEvent> events = Arrays.asList(new ClickEvent()); // List<ClickEvent> | events
try {
    apiInstance.trackClickUsingPOST(channel, events);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingApi#trackClickUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **events** | [**List&lt;ClickEvent&gt;**](ClickEvent.md)| events |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="trackFeedbackUsingPOST"></a>
# **trackFeedbackUsingPOST**
> trackFeedbackUsingPOST(channel, events)

Track a feedback event

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.TrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TrackingApi apiInstance = new TrackingApi();
String channel = "channel_example"; // String | channel
List<FeedbackEvent> events = Arrays.asList(new FeedbackEvent()); // List<FeedbackEvent> | events
try {
    apiInstance.trackFeedbackUsingPOST(channel, events);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingApi#trackFeedbackUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **events** | [**List&lt;FeedbackEvent&gt;**](FeedbackEvent.md)| events |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="trackLogUsingPOST"></a>
# **trackLogUsingPOST**
> trackLogUsingPOST(channel, events)

Track a log event

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.TrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TrackingApi apiInstance = new TrackingApi();
String channel = "channel_example"; // String | channel
List<SearchLogEvent> events = Arrays.asList(new SearchLogEvent()); // List<SearchLogEvent> | events
try {
    apiInstance.trackLogUsingPOST(channel, events);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingApi#trackLogUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **events** | [**List&lt;SearchLogEvent&gt;**](SearchLogEvent.md)| events |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="trackLoginUsingPOST"></a>
# **trackLoginUsingPOST**
> trackLoginUsingPOST(channel, events)

Track a login event

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.TrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TrackingApi apiInstance = new TrackingApi();
String channel = "channel_example"; // String | channel
List<LoginEvent> events = Arrays.asList(new LoginEvent()); // List<LoginEvent> | events
try {
    apiInstance.trackLoginUsingPOST(channel, events);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingApi#trackLoginUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **events** | [**List&lt;LoginEvent&gt;**](LoginEvent.md)| events |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="trackRecommendationClickUsingPOST"></a>
# **trackRecommendationClickUsingPOST**
> trackRecommendationClickUsingPOST(channel, events)

Track a recommendation click event

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.TrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TrackingApi apiInstance = new TrackingApi();
String channel = "channel_example"; // String | channel
List<RecommendationClickEvent> events = Arrays.asList(new RecommendationClickEvent()); // List<RecommendationClickEvent> | events
try {
    apiInstance.trackRecommendationClickUsingPOST(channel, events);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingApi#trackRecommendationClickUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **events** | [**List&lt;RecommendationClickEvent&gt;**](RecommendationClickEvent.md)| events |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json


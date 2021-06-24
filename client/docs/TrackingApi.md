# TrackingApi

All URIs are relative to *http://!!!DO NOT MANUALLY EDIT THIS FILE!!! Update files in this directory with ./gradlew :itests:default:test -PgenerateSpec*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trackCartUsingPOST**](TrackingApi.md#trackCartUsingPOST) | **POST** /rest/v4/track/{channel}/cart | Track a cart event
[**trackCheckoutUsingPOST**](TrackingApi.md#trackCheckoutUsingPOST) | **POST** /rest/v4/track/{channel}/checkout | Track a checkout event
[**trackClickUsingPOST**](TrackingApi.md#trackClickUsingPOST) | **POST** /rest/v4/track/{channel}/click | Track a click event
[**trackFeedbackUsingPOST**](TrackingApi.md#trackFeedbackUsingPOST) | **POST** /rest/v4/track/{channel}/feedback | Track a feedback event
[**trackLandingPageClickUsingPOST**](TrackingApi.md#trackLandingPageClickUsingPOST) | **POST** /rest/v4/track/{channel}/landingPageClick | Track a click event for products provided by a campaign on a landing page.
[**trackLogUsingPOST**](TrackingApi.md#trackLogUsingPOST) | **POST** /rest/v4/track/{channel}/log | Track a log event
[**trackLoginUsingPOST**](TrackingApi.md#trackLoginUsingPOST) | **POST** /rest/v4/track/{channel}/login | Track a login event
[**trackPredBasketClickUsingPOST**](TrackingApi.md#trackPredBasketClickUsingPOST) | **POST** /rest/v4/track/{channel}/predbasketClick | Track a predictive basket click event
[**trackRecommendationClickUsingPOST**](TrackingApi.md#trackRecommendationClickUsingPOST) | **POST** /rest/v4/track/{channel}/recommendationClick | Track a recommendation click event


<a name="trackCartUsingPOST"></a>
# **trackCartUsingPOST**
> trackCartUsingPOST(channel, events)

Track a cart event

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.TrackingApi;

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

    TrackingApi apiInstance = new TrackingApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<CartOrCheckoutEvent> events = Arrays.asList(); // List<CartOrCheckoutEvent> | events
    try {
      apiInstance.trackCartUsingPOST(channel, events);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#trackCartUsingPOST");
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
 **events** | [**List&lt;CartOrCheckoutEvent&gt;**](CartOrCheckoutEvent.md)| events |

### Return type

null (empty response body)

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

<a name="trackCheckoutUsingPOST"></a>
# **trackCheckoutUsingPOST**
> trackCheckoutUsingPOST(channel, events)

Track a checkout event

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.TrackingApi;

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

    TrackingApi apiInstance = new TrackingApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<CartOrCheckoutEvent> events = Arrays.asList(); // List<CartOrCheckoutEvent> | events
    try {
      apiInstance.trackCheckoutUsingPOST(channel, events);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#trackCheckoutUsingPOST");
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
 **events** | [**List&lt;CartOrCheckoutEvent&gt;**](CartOrCheckoutEvent.md)| events |

### Return type

null (empty response body)

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

<a name="trackClickUsingPOST"></a>
# **trackClickUsingPOST**
> trackClickUsingPOST(channel, events)

Track a click event

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.TrackingApi;

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

    TrackingApi apiInstance = new TrackingApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<ClickEvent> events = Arrays.asList(); // List<ClickEvent> | events
    try {
      apiInstance.trackClickUsingPOST(channel, events);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#trackClickUsingPOST");
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
 **events** | [**List&lt;ClickEvent&gt;**](ClickEvent.md)| events |

### Return type

null (empty response body)

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

<a name="trackFeedbackUsingPOST"></a>
# **trackFeedbackUsingPOST**
> trackFeedbackUsingPOST(channel, events)

Track a feedback event

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.TrackingApi;

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

    TrackingApi apiInstance = new TrackingApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<FeedbackEvent> events = Arrays.asList(); // List<FeedbackEvent> | events
    try {
      apiInstance.trackFeedbackUsingPOST(channel, events);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#trackFeedbackUsingPOST");
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
 **events** | [**List&lt;FeedbackEvent&gt;**](FeedbackEvent.md)| events |

### Return type

null (empty response body)

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

<a name="trackLandingPageClickUsingPOST"></a>
# **trackLandingPageClickUsingPOST**
> trackLandingPageClickUsingPOST(channel, events)

Track a click event for products provided by a campaign on a landing page.

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.TrackingApi;

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

    TrackingApi apiInstance = new TrackingApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<LandingPageClickEvent> events = Arrays.asList(); // List<LandingPageClickEvent> | events
    try {
      apiInstance.trackLandingPageClickUsingPOST(channel, events);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#trackLandingPageClickUsingPOST");
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
 **events** | [**List&lt;LandingPageClickEvent&gt;**](LandingPageClickEvent.md)| events |

### Return type

null (empty response body)

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

<a name="trackLogUsingPOST"></a>
# **trackLogUsingPOST**
> trackLogUsingPOST(channel, events)

Track a log event

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.TrackingApi;

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

    TrackingApi apiInstance = new TrackingApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<SearchLogEvent> events = Arrays.asList(); // List<SearchLogEvent> | events
    try {
      apiInstance.trackLogUsingPOST(channel, events);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#trackLogUsingPOST");
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
 **events** | [**List&lt;SearchLogEvent&gt;**](SearchLogEvent.md)| events |

### Return type

null (empty response body)

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

<a name="trackLoginUsingPOST"></a>
# **trackLoginUsingPOST**
> trackLoginUsingPOST(channel, events)

Track a login event

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.TrackingApi;

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

    TrackingApi apiInstance = new TrackingApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<LoginEvent> events = Arrays.asList(); // List<LoginEvent> | events
    try {
      apiInstance.trackLoginUsingPOST(channel, events);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#trackLoginUsingPOST");
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
 **events** | [**List&lt;LoginEvent&gt;**](LoginEvent.md)| events |

### Return type

null (empty response body)

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

<a name="trackPredBasketClickUsingPOST"></a>
# **trackPredBasketClickUsingPOST**
> trackPredBasketClickUsingPOST(channel, events)

Track a predictive basket click event

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.TrackingApi;

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

    TrackingApi apiInstance = new TrackingApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<PredBasketClickEvent> events = Arrays.asList(); // List<PredBasketClickEvent> | events
    try {
      apiInstance.trackPredBasketClickUsingPOST(channel, events);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#trackPredBasketClickUsingPOST");
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
 **events** | [**List&lt;PredBasketClickEvent&gt;**](PredBasketClickEvent.md)| events |

### Return type

null (empty response body)

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

<a name="trackRecommendationClickUsingPOST"></a>
# **trackRecommendationClickUsingPOST**
> trackRecommendationClickUsingPOST(channel, events)

Track a recommendation click event

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.TrackingApi;

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

    TrackingApi apiInstance = new TrackingApi(defaultClient);
    String channel = "channel_example"; // String | channel
    List<RecommendationClickEvent> events = Arrays.asList(); // List<RecommendationClickEvent> | events
    try {
      apiInstance.trackRecommendationClickUsingPOST(channel, events);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#trackRecommendationClickUsingPOST");
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
 **events** | [**List&lt;RecommendationClickEvent&gt;**](RecommendationClickEvent.md)| events |

### Return type

null (empty response body)

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


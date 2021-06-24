# ImportApi

All URIs are relative to *http://!!!DO NOT MANUALLY EDIT THIS FILE!!! Update files in this directory with ./gradlew :itests:default:test -PgenerateSpec*

Method | HTTP request | Description
------------- | ------------- | -------------
[**isImportRunningUsingGET**](ImportApi.md#isImportRunningUsingGET) | **GET** /rest/v4/import/running | Check if an import is running in any of the supplied channels
[**refreshRecommendationDatabasesUsingPOST**](ImportApi.md#refreshRecommendationDatabasesUsingPOST) | **POST** /rest/v4/import/refreshRecommendations | Refresh recommendation databases
[**startCustomerSpecificPricingImportUsingPOST**](ImportApi.md#startCustomerSpecificPricingImportUsingPOST) | **POST** /rest/v4/import/customerprices | Start customer specific pricing import
[**startGeoImportUsingPOST**](ImportApi.md#startGeoImportUsingPOST) | **POST** /rest/v4/import/geo | Start geo import
[**startRankingImportUsingPOST**](ImportApi.md#startRankingImportUsingPOST) | **POST** /rest/v4/import/ranking | Start ranking import
[**startRecommendationImportUsingPOST**](ImportApi.md#startRecommendationImportUsingPOST) | **POST** /rest/v4/import/recommendation | Start recommendation import
[**startSearchImportUsingPOST**](ImportApi.md#startSearchImportUsingPOST) | **POST** /rest/v4/import/search | Start search import
[**startSuggestImportUsingPOST**](ImportApi.md#startSuggestImportUsingPOST) | **POST** /rest/v4/import/suggest | Start suggest import


<a name="isImportRunningUsingGET"></a>
# **isImportRunningUsingGET**
> Boolean isImportRunningUsingGET(channel)

Check if an import is running in any of the supplied channels

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.ImportApi;

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    List<String> channel = Arrays.asList(); // List<String> | channel
    try {
      Boolean result = apiInstance.isImportRunningUsingGET(channel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#isImportRunningUsingGET");
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
 **channel** | [**List&lt;String&gt;**](String.md)| channel |

### Return type

**Boolean**

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

<a name="refreshRecommendationDatabasesUsingPOST"></a>
# **refreshRecommendationDatabasesUsingPOST**
> refreshRecommendationDatabasesUsingPOST(channel)

Refresh recommendation databases

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.ImportApi;

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    List<String> channel = Arrays.asList(); // List<String> | channel
    try {
      apiInstance.refreshRecommendationDatabasesUsingPOST(channel);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#refreshRecommendationDatabasesUsingPOST");
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
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]

### Return type

null (empty response body)

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

<a name="startCustomerSpecificPricingImportUsingPOST"></a>
# **startCustomerSpecificPricingImportUsingPOST**
> List&lt;ImportChannelResult&gt; startCustomerSpecificPricingImportUsingPOST(channel, download, cacheFlush, quiet, importStage)

Start customer specific pricing import

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.ImportApi;

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    List<String> channel = Arrays.asList(); // List<String> | channel
    Boolean download = false; // Boolean | if true: causes the import file to be updated first. If no URL is stored in the FACT-Finder configuration, this parameter has no effect.
    Boolean cacheFlush = false; // Boolean | if true: causes a cache flush after a channel has been imported
    Boolean quiet = false; // Boolean | if true: only receive a filled response if an error occurs during the import otherwise the response is just empty
    String importStage = "FULL"; // String | IMPORT_ONLY only fills the intermediate DB, LOAD_ONLY imports that database into memory, and FULL combines both stages
    try {
      List<ImportChannelResult> result = apiInstance.startCustomerSpecificPricingImportUsingPOST(channel, download, cacheFlush, quiet, importStage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#startCustomerSpecificPricingImportUsingPOST");
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
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]
 **download** | **Boolean**| if true: causes the import file to be updated first. If no URL is stored in the FACT-Finder configuration, this parameter has no effect. | [optional] [default to false]
 **cacheFlush** | **Boolean**| if true: causes a cache flush after a channel has been imported | [optional] [default to false]
 **quiet** | **Boolean**| if true: only receive a filled response if an error occurs during the import otherwise the response is just empty | [optional] [default to false]
 **importStage** | **String**| IMPORT_ONLY only fills the intermediate DB, LOAD_ONLY imports that database into memory, and FULL combines both stages | [optional] [default to FULL] [enum: FULL, LOAD_ONLY, IMPORT_ONLY]

### Return type

[**List&lt;ImportChannelResult&gt;**](ImportChannelResult.md)

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

<a name="startGeoImportUsingPOST"></a>
# **startGeoImportUsingPOST**
> List&lt;ImportChannelResult&gt; startGeoImportUsingPOST(channel, download, cacheFlush, quiet, importStage)

Start geo import

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.ImportApi;

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    List<String> channel = Arrays.asList(); // List<String> | channel
    Boolean download = false; // Boolean | if true: causes the import file to be updated first. If no URL is stored in the FACT-Finder configuration, this parameter has no effect.
    Boolean cacheFlush = false; // Boolean | if true: causes a cache flush after a channel has been imported
    Boolean quiet = false; // Boolean | if true: only receive a filled response if an error occurs during the import otherwise the response is just empty
    String importStage = "FULL"; // String | IMPORT_ONLY only fills the intermediate DB, LOAD_ONLY imports that database into memory, and FULL combines both stages
    try {
      List<ImportChannelResult> result = apiInstance.startGeoImportUsingPOST(channel, download, cacheFlush, quiet, importStage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#startGeoImportUsingPOST");
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
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]
 **download** | **Boolean**| if true: causes the import file to be updated first. If no URL is stored in the FACT-Finder configuration, this parameter has no effect. | [optional] [default to false]
 **cacheFlush** | **Boolean**| if true: causes a cache flush after a channel has been imported | [optional] [default to false]
 **quiet** | **Boolean**| if true: only receive a filled response if an error occurs during the import otherwise the response is just empty | [optional] [default to false]
 **importStage** | **String**| IMPORT_ONLY only fills the intermediate DB, LOAD_ONLY imports that database into memory, and FULL combines both stages | [optional] [default to FULL] [enum: FULL, LOAD_ONLY, IMPORT_ONLY]

### Return type

[**List&lt;ImportChannelResult&gt;**](ImportChannelResult.md)

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

<a name="startRankingImportUsingPOST"></a>
# **startRankingImportUsingPOST**
> List&lt;ImportChannelResult&gt; startRankingImportUsingPOST(channel, cacheFlush, quiet)

Start ranking import

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.ImportApi;

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    List<String> channel = Arrays.asList(); // List<String> | channel
    Boolean cacheFlush = false; // Boolean | if true: causes a cache flush after a channel has been imported
    Boolean quiet = false; // Boolean | if true: only receive a filled response if an error occurs during the import otherwise the response is just empty
    try {
      List<ImportChannelResult> result = apiInstance.startRankingImportUsingPOST(channel, cacheFlush, quiet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#startRankingImportUsingPOST");
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
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]
 **cacheFlush** | **Boolean**| if true: causes a cache flush after a channel has been imported | [optional] [default to false]
 **quiet** | **Boolean**| if true: only receive a filled response if an error occurs during the import otherwise the response is just empty | [optional] [default to false]

### Return type

[**List&lt;ImportChannelResult&gt;**](ImportChannelResult.md)

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

<a name="startRecommendationImportUsingPOST"></a>
# **startRecommendationImportUsingPOST**
> List&lt;ImportChannelResult&gt; startRecommendationImportUsingPOST(channel, quiet)

Start recommendation import

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.ImportApi;

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    List<String> channel = Arrays.asList(); // List<String> | channel
    Boolean quiet = false; // Boolean | if true: only receive a filled response if an error occurs during the import otherwise the response is just empty
    try {
      List<ImportChannelResult> result = apiInstance.startRecommendationImportUsingPOST(channel, quiet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#startRecommendationImportUsingPOST");
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
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]
 **quiet** | **Boolean**| if true: only receive a filled response if an error occurs during the import otherwise the response is just empty | [optional] [default to false]

### Return type

[**List&lt;ImportChannelResult&gt;**](ImportChannelResult.md)

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

<a name="startSearchImportUsingPOST"></a>
# **startSearchImportUsingPOST**
> List&lt;ImportChannelResult&gt; startSearchImportUsingPOST(channel, download, cacheFlush, quiet, importStage, includeCustomerPrices)

Start search import

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.ImportApi;

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    List<String> channel = Arrays.asList(); // List<String> | channel
    Boolean download = false; // Boolean | if true: causes the import file to be updated first. If no URL is stored in the FACT-Finder configuration, this parameter has no effect.
    Boolean cacheFlush = false; // Boolean | if true: causes a cache flush after a channel has been imported
    Boolean quiet = false; // Boolean | if true: only receive a filled response if an error occurs during the import otherwise the response is just empty
    String importStage = "FULL"; // String | IMPORT_ONLY only fills the intermediate DB, LOAD_ONLY imports that database into memory, and FULL combines both stages
    Boolean includeCustomerPrices = false; // Boolean | if true: executes a customer specific pricing import after the search import. If customer specific pricing is not enabled for a given channel, this parameter has no effect.
    try {
      List<ImportChannelResult> result = apiInstance.startSearchImportUsingPOST(channel, download, cacheFlush, quiet, importStage, includeCustomerPrices);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#startSearchImportUsingPOST");
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
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]
 **download** | **Boolean**| if true: causes the import file to be updated first. If no URL is stored in the FACT-Finder configuration, this parameter has no effect. | [optional] [default to false]
 **cacheFlush** | **Boolean**| if true: causes a cache flush after a channel has been imported | [optional] [default to false]
 **quiet** | **Boolean**| if true: only receive a filled response if an error occurs during the import otherwise the response is just empty | [optional] [default to false]
 **importStage** | **String**| IMPORT_ONLY only fills the intermediate DB, LOAD_ONLY imports that database into memory, and FULL combines both stages | [optional] [default to FULL] [enum: FULL, LOAD_ONLY, IMPORT_ONLY]
 **includeCustomerPrices** | **Boolean**| if true: executes a customer specific pricing import after the search import. If customer specific pricing is not enabled for a given channel, this parameter has no effect. | [optional] [default to false]

### Return type

[**List&lt;ImportChannelResult&gt;**](ImportChannelResult.md)

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

<a name="startSuggestImportUsingPOST"></a>
# **startSuggestImportUsingPOST**
> List&lt;ImportChannelResult&gt; startSuggestImportUsingPOST(channel, quiet)

Start suggest import

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.ImportApi;

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

    ImportApi apiInstance = new ImportApi(defaultClient);
    List<String> channel = Arrays.asList(); // List<String> | channel
    Boolean quiet = false; // Boolean | if true: only receive a filled response if an error occurs during the import otherwise the response is just empty
    try {
      List<ImportChannelResult> result = apiInstance.startSuggestImportUsingPOST(channel, quiet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#startSuggestImportUsingPOST");
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
 **channel** | [**List&lt;String&gt;**](String.md)| channel | [optional]
 **quiet** | **Boolean**| if true: only receive a filled response if an error occurs during the import otherwise the response is just empty | [optional] [default to false]

### Return type

[**List&lt;ImportChannelResult&gt;**](ImportChannelResult.md)

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


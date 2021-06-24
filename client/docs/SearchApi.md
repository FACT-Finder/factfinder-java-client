# SearchApi

All URIs are relative to *http://!!!DO NOT MANUALLY EDIT THIS FILE!!! Update files in this directory with ./gradlew :itests:default:test -PgenerateSpec*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categoryNavigationUsingGET**](SearchApi.md#categoryNavigationUsingGET) | **GET** /rest/v4/navigation/category/{channel} | Category ASN for Navigation
[**getSuggestionsUsingGET**](SearchApi.md#getSuggestionsUsingGET) | **GET** /rest/v4/suggest/{channel} | Get suggestions
[**getSuggestionsUsingPOST**](SearchApi.md#getSuggestionsUsingPOST) | **POST** /rest/v4/suggest | Get suggestions with POST
[**navigationUsingGET**](SearchApi.md#navigationUsingGET) | **GET** /rest/v4/navigation/{channel} | Navigation
[**navigationUsingPOST**](SearchApi.md#navigationUsingPOST) | **POST** /rest/v4/navigation | Navigation with POST
[**searchUsingGET**](SearchApi.md#searchUsingGET) | **GET** /rest/v4/search/{channel} | Search
[**searchUsingPOST**](SearchApi.md#searchUsingPOST) | **POST** /rest/v4/search | Search with POST


<a name="categoryNavigationUsingGET"></a>
# **categoryNavigationUsingGET**
> CategoryNavigation categoryNavigationUsingGET(channel, sid, startLevel, endLevel, filter, substringFilter, forceAbVariant, marketId, latitude, longitude, maxDistance, excludeProductsNotInRange, purchaserId, useCache, useGeo, useAbTest)

Category ASN for Navigation

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.SearchApi;

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

    SearchApi apiInstance = new SearchApi(defaultClient);
    String channel = "channel_example"; // String | channel
    String sid = "sid_example"; // String | The session id
    Integer startLevel = 56; // Integer | Category start level
    Integer endLevel = 56; // Integer | Category end level
    List<String> filter = Arrays.asList(); // List<String> | Filter for the whole field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) 'and' = \\_\\_\\_ 'or' = ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green = red or not green. If the filter name equals '*', the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix.
    List<String> substringFilter = Arrays.asList(); // List<String> | Filter for a sub string of the field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) 'and' = \\_\\_\\_ 'or' = ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green = red or not green. If the filter name equals '*', the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix.
    List<String> forceAbVariant = Arrays.asList(); // List<String> | Forces to apply certain ab variants to the search result; format: abTestId:AbVariantId; example 1b7f3b1a-600f-4d23-b1bf-ac9978628d17:A
    List<String> marketId = Arrays.asList(); // List<String> | Only show products that have values for these market IDs.
    Double latitude = 3.4D; // Double | The latitude coordinate of the location.
    Double longitude = 3.4D; // Double | The longitude coordinate of the location.
    Double maxDistance = 3.4D; // Double | Use this parameter to override the \"maximum distance\" setting of the geo search.
    Boolean excludeProductsNotInRange = true; // Boolean | Use this parameter to override the \"exclude products not in range\" setting of the geo search.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    Boolean useCache = true; // Boolean | If true, the search result will be returned from cache memory, if a possible matching result exists.
    Boolean useGeo = true; // Boolean | If true geoSearch features will be active.
    Boolean useAbTest = true; // Boolean | If true AbTest features will be active.
    try {
      CategoryNavigation result = apiInstance.categoryNavigationUsingGET(channel, sid, startLevel, endLevel, filter, substringFilter, forceAbVariant, marketId, latitude, longitude, maxDistance, excludeProductsNotInRange, purchaserId, useCache, useGeo, useAbTest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#categoryNavigationUsingGET");
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
 **sid** | **String**| The session id | [optional]
 **startLevel** | **Integer**| Category start level | [optional]
 **endLevel** | **Integer**| Category end level | [optional]
 **filter** | [**List&lt;String&gt;**](String.md)| Filter for the whole field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) &#39;and&#39; &#x3D; \\_\\_\\_ &#39;or&#39; &#x3D; ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green &#x3D; red or not green. If the filter name equals &#39;*&#39;, the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix. | [optional]
 **substringFilter** | [**List&lt;String&gt;**](String.md)| Filter for a sub string of the field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) &#39;and&#39; &#x3D; \\_\\_\\_ &#39;or&#39; &#x3D; ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green &#x3D; red or not green. If the filter name equals &#39;*&#39;, the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix. | [optional]
 **forceAbVariant** | [**List&lt;String&gt;**](String.md)| Forces to apply certain ab variants to the search result; format: abTestId:AbVariantId; example 1b7f3b1a-600f-4d23-b1bf-ac9978628d17:A | [optional]
 **marketId** | [**List&lt;String&gt;**](String.md)| Only show products that have values for these market IDs. | [optional]
 **latitude** | **Double**| The latitude coordinate of the location. | [optional]
 **longitude** | **Double**| The longitude coordinate of the location. | [optional]
 **maxDistance** | **Double**| Use this parameter to override the \&quot;maximum distance\&quot; setting of the geo search. | [optional]
 **excludeProductsNotInRange** | **Boolean**| Use this parameter to override the \&quot;exclude products not in range\&quot; setting of the geo search. | [optional]
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]
 **useCache** | **Boolean**| If true, the search result will be returned from cache memory, if a possible matching result exists. | [optional] [default to true]
 **useGeo** | **Boolean**| If true geoSearch features will be active. | [optional] [default to true]
 **useAbTest** | **Boolean**| If true AbTest features will be active. | [optional] [default to true]

### Return type

[**CategoryNavigation**](CategoryNavigation.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-FF-Timeout - If true, the search is timed out. This can result in a response with 0 hits depending on when the timeout occurred. <br>  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="getSuggestionsUsingGET"></a>
# **getSuggestionsUsingGET**
> SuggestionResult getSuggestionsUsingGET(channel, query, filter, substringFilter, forceAbVariant, marketId, sort, cacheIrrelevant, latitude, longitude, maxDistance, excludeProductsNotInRange, purchaserId, page, hitsPerPage, maxCountVariants, advisorStatus, followSearch, searchField, articleNumberSearch, sid)

Get suggestions

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.SearchApi;

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

    SearchApi apiInstance = new SearchApi(defaultClient);
    String channel = "channel_example"; // String | channel
    String query = "query_example"; // String | The search term
    List<String> filter = Arrays.asList(); // List<String> | Filter for the whole field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) 'and' = \\_\\_\\_ 'or' = ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green = red or not green. If the filter name equals '*', the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix.
    List<String> substringFilter = Arrays.asList(); // List<String> | Filter for a sub string of the field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) 'and' = \\_\\_\\_ 'or' = ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green = red or not green. If the filter name equals '*', the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix.
    List<String> forceAbVariant = Arrays.asList(); // List<String> | Forces to apply certain ab variants to the search result; format: abTestId:AbVariantId; example 1b7f3b1a-600f-4d23-b1bf-ac9978628d17:A
    List<String> marketId = Arrays.asList(); // List<String> | Only show products that have values for these market IDs.
    List<String> sort = Arrays.asList(); // List<String> | Sort the result; use FieldName Relevancy to sort the relevancy; format: FieldName:order order must be either asc or desc; example Manufacturer:asc
    List<String> cacheIrrelevant = Arrays.asList(); // List<String> | Flag parameters as cache irrelevant
    Double latitude = 3.4D; // Double | The latitude coordinate of the location.
    Double longitude = 3.4D; // Double | The longitude coordinate of the location.
    Double maxDistance = 3.4D; // Double | Use this parameter to override the \"maximum distance\" setting of the geo search.
    Boolean excludeProductsNotInRange = true; // Boolean | Use this parameter to override the \"exclude products not in range\" setting of the geo search.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    Integer page = 56; // Integer | If a search result contains many results these will be divided into pages. This limits the amount of data that has to be sent in one go. You can indicate which page should be returned. Page numbering starts at 1.
    Integer hitsPerPage = 56; // Integer | In the FACT-Finder Management Interface you can define how many results will be returned on a page by default. If you prefer another number, you can set it with this parameter.
    Integer maxCountVariants = 56; // Integer | The maximum number of variants to return for every record
    String advisorStatus = "advisorStatus_example"; // String | For specifying the current campaign id and answer path; format: campaignId-answerPath
    String followSearch = "followSearch_example"; // String | Optional request linking param from a previous search result or search param object. Can improve request performance.
    String searchField = "searchField_example"; // String | Normally FACT-Finder searches all fields defined as searchable. However it is possible to search only one specific field as well.
    String articleNumberSearch = "DETECT"; // String | Specifies if the query should be interpreted as article number
    String sid = "sid_example"; // String | the session id from the user
    try {
      SuggestionResult result = apiInstance.getSuggestionsUsingGET(channel, query, filter, substringFilter, forceAbVariant, marketId, sort, cacheIrrelevant, latitude, longitude, maxDistance, excludeProductsNotInRange, purchaserId, page, hitsPerPage, maxCountVariants, advisorStatus, followSearch, searchField, articleNumberSearch, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#getSuggestionsUsingGET");
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
 **query** | **String**| The search term |
 **filter** | [**List&lt;String&gt;**](String.md)| Filter for the whole field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) &#39;and&#39; &#x3D; \\_\\_\\_ &#39;or&#39; &#x3D; ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green &#x3D; red or not green. If the filter name equals &#39;*&#39;, the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix. | [optional]
 **substringFilter** | [**List&lt;String&gt;**](String.md)| Filter for a sub string of the field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) &#39;and&#39; &#x3D; \\_\\_\\_ &#39;or&#39; &#x3D; ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green &#x3D; red or not green. If the filter name equals &#39;*&#39;, the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix. | [optional]
 **forceAbVariant** | [**List&lt;String&gt;**](String.md)| Forces to apply certain ab variants to the search result; format: abTestId:AbVariantId; example 1b7f3b1a-600f-4d23-b1bf-ac9978628d17:A | [optional]
 **marketId** | [**List&lt;String&gt;**](String.md)| Only show products that have values for these market IDs. | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sort the result; use FieldName Relevancy to sort the relevancy; format: FieldName:order order must be either asc or desc; example Manufacturer:asc | [optional]
 **cacheIrrelevant** | [**List&lt;String&gt;**](String.md)| Flag parameters as cache irrelevant | [optional]
 **latitude** | **Double**| The latitude coordinate of the location. | [optional]
 **longitude** | **Double**| The longitude coordinate of the location. | [optional]
 **maxDistance** | **Double**| Use this parameter to override the \&quot;maximum distance\&quot; setting of the geo search. | [optional]
 **excludeProductsNotInRange** | **Boolean**| Use this parameter to override the \&quot;exclude products not in range\&quot; setting of the geo search. | [optional]
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]
 **page** | **Integer**| If a search result contains many results these will be divided into pages. This limits the amount of data that has to be sent in one go. You can indicate which page should be returned. Page numbering starts at 1. | [optional]
 **hitsPerPage** | **Integer**| In the FACT-Finder Management Interface you can define how many results will be returned on a page by default. If you prefer another number, you can set it with this parameter. | [optional]
 **maxCountVariants** | **Integer**| The maximum number of variants to return for every record | [optional]
 **advisorStatus** | **String**| For specifying the current campaign id and answer path; format: campaignId-answerPath | [optional]
 **followSearch** | **String**| Optional request linking param from a previous search result or search param object. Can improve request performance. | [optional]
 **searchField** | **String**| Normally FACT-Finder searches all fields defined as searchable. However it is possible to search only one specific field as well. | [optional]
 **articleNumberSearch** | **String**| Specifies if the query should be interpreted as article number | [optional] [default to DETECT] [enum: DETECT, ALWAYS, NEVER]
 **sid** | **String**| the session id from the user | [optional]

### Return type

[**SuggestionResult**](SuggestionResult.md)

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

<a name="getSuggestionsUsingPOST"></a>
# **getSuggestionsUsingPOST**
> SuggestionResult getSuggestionsUsingPOST(params)

Get suggestions with POST

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.SearchApi;

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

    SearchApi apiInstance = new SearchApi(defaultClient);
    SuggestParams params = new SuggestParams(); // SuggestParams | params
    try {
      SuggestionResult result = apiInstance.getSuggestionsUsingPOST(params);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#getSuggestionsUsingPOST");
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
 **params** | [**SuggestParams**](SuggestParams.md)| params |

### Return type

[**SuggestionResult**](SuggestionResult.md)

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

<a name="navigationUsingGET"></a>
# **navigationUsingGET**
> Result navigationUsingGET(channel, sid, filter, substringFilter, forceAbVariant, marketId, sort, cacheIrrelevant, latitude, longitude, maxDistance, excludeProductsNotInRange, purchaserId, page, hitsPerPage, maxCountVariants, advisorStatus, followSearch, useCache, useGeo, useAbTest, useSearch, useAsn, useFoundWords, useCampaigns, idsOnly, usePersonalization, useSemanticEnhancer, useAso, useDeduplication, deduplicationField, useRanking)

Navigation

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.SearchApi;

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

    SearchApi apiInstance = new SearchApi(defaultClient);
    String channel = "channel_example"; // String | channel
    String sid = "sid_example"; // String | The session id
    List<String> filter = Arrays.asList(); // List<String> | Filter for the whole field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) 'and' = \\_\\_\\_ 'or' = ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green = red or not green. If the filter name equals '*', the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix.
    List<String> substringFilter = Arrays.asList(); // List<String> | Filter for a sub string of the field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) 'and' = \\_\\_\\_ 'or' = ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green = red or not green. If the filter name equals '*', the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix.
    List<String> forceAbVariant = Arrays.asList(); // List<String> | Forces to apply certain ab variants to the search result; format: abTestId:AbVariantId; example 1b7f3b1a-600f-4d23-b1bf-ac9978628d17:A
    List<String> marketId = Arrays.asList(); // List<String> | Only show products that have values for these market IDs.
    List<String> sort = Arrays.asList(); // List<String> | Sort the result; use FieldName Relevancy to sort the relevancy; format: FieldName:order order must be either asc or desc; example Manufacturer:asc
    List<String> cacheIrrelevant = Arrays.asList(); // List<String> | Flag parameters as cache irrelevant
    Double latitude = 3.4D; // Double | The latitude coordinate of the location.
    Double longitude = 3.4D; // Double | The longitude coordinate of the location.
    Double maxDistance = 3.4D; // Double | Use this parameter to override the \"maximum distance\" setting of the geo search.
    Boolean excludeProductsNotInRange = true; // Boolean | Use this parameter to override the \"exclude products not in range\" setting of the geo search.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    Integer page = 56; // Integer | If a search result contains many results these will be divided into pages. This limits the amount of data that has to be sent in one go. You can indicate which page should be returned. Page numbering starts at 1.
    Integer hitsPerPage = 56; // Integer | In the FACT-Finder Management Interface you can define how many results will be returned on a page by default. If you prefer another number, you can set it with this parameter.
    Integer maxCountVariants = 56; // Integer | The maximum number of variants to return for every record
    String advisorStatus = "advisorStatus_example"; // String | For specifying the current campaign id and answer path; format: campaignId-answerPath
    String followSearch = "followSearch_example"; // String | Optional request linking param from a previous search result or search param object. Can improve request performance.
    Boolean useCache = true; // Boolean | If true, the search result will be returned from cache memory, if a possible matching result exists.
    Boolean useGeo = true; // Boolean | If true geoSearch features will be active.
    Boolean useAbTest = true; // Boolean | If true AbTest features will be active.
    Boolean useSearch = true; // Boolean | If true, search will be executed for the query.
    Boolean useAsn = true; // Boolean | If true, filters should be generated for the result.
    Boolean useFoundWords = false; // Boolean | If true, the words that led to the records in the search results will be determined; this may require a large amount of processing time.
    Boolean useCampaigns = true; // Boolean | If true, campaigns corresponding to this search result will be returned.
    Boolean idsOnly = false; // Boolean | If true, the returned records will contain only record IDs.
    Boolean usePersonalization = true; // Boolean | If true, the relevant products in the result will be personalized.
    Boolean useSemanticEnhancer = true; // Boolean | If true, the semantic enhancer will be used.
    Boolean useAso = true; // Boolean | If true, automatic search optimization will be used.
    Boolean useDeduplication = true; // Boolean | If true, the configured deduplication of variants will be used.
    String deduplicationField = "deduplicationField_example"; // String | Specifies on which field variants should be deduplicated.
    Boolean useRanking = true; // Boolean | If true, ranking will be applied.
    try {
      Result result = apiInstance.navigationUsingGET(channel, sid, filter, substringFilter, forceAbVariant, marketId, sort, cacheIrrelevant, latitude, longitude, maxDistance, excludeProductsNotInRange, purchaserId, page, hitsPerPage, maxCountVariants, advisorStatus, followSearch, useCache, useGeo, useAbTest, useSearch, useAsn, useFoundWords, useCampaigns, idsOnly, usePersonalization, useSemanticEnhancer, useAso, useDeduplication, deduplicationField, useRanking);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#navigationUsingGET");
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
 **sid** | **String**| The session id | [optional]
 **filter** | [**List&lt;String&gt;**](String.md)| Filter for the whole field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) &#39;and&#39; &#x3D; \\_\\_\\_ &#39;or&#39; &#x3D; ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green &#x3D; red or not green. If the filter name equals &#39;*&#39;, the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix. | [optional]
 **substringFilter** | [**List&lt;String&gt;**](String.md)| Filter for a sub string of the field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) &#39;and&#39; &#x3D; \\_\\_\\_ &#39;or&#39; &#x3D; ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green &#x3D; red or not green. If the filter name equals &#39;*&#39;, the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix. | [optional]
 **forceAbVariant** | [**List&lt;String&gt;**](String.md)| Forces to apply certain ab variants to the search result; format: abTestId:AbVariantId; example 1b7f3b1a-600f-4d23-b1bf-ac9978628d17:A | [optional]
 **marketId** | [**List&lt;String&gt;**](String.md)| Only show products that have values for these market IDs. | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sort the result; use FieldName Relevancy to sort the relevancy; format: FieldName:order order must be either asc or desc; example Manufacturer:asc | [optional]
 **cacheIrrelevant** | [**List&lt;String&gt;**](String.md)| Flag parameters as cache irrelevant | [optional]
 **latitude** | **Double**| The latitude coordinate of the location. | [optional]
 **longitude** | **Double**| The longitude coordinate of the location. | [optional]
 **maxDistance** | **Double**| Use this parameter to override the \&quot;maximum distance\&quot; setting of the geo search. | [optional]
 **excludeProductsNotInRange** | **Boolean**| Use this parameter to override the \&quot;exclude products not in range\&quot; setting of the geo search. | [optional]
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]
 **page** | **Integer**| If a search result contains many results these will be divided into pages. This limits the amount of data that has to be sent in one go. You can indicate which page should be returned. Page numbering starts at 1. | [optional]
 **hitsPerPage** | **Integer**| In the FACT-Finder Management Interface you can define how many results will be returned on a page by default. If you prefer another number, you can set it with this parameter. | [optional]
 **maxCountVariants** | **Integer**| The maximum number of variants to return for every record | [optional]
 **advisorStatus** | **String**| For specifying the current campaign id and answer path; format: campaignId-answerPath | [optional]
 **followSearch** | **String**| Optional request linking param from a previous search result or search param object. Can improve request performance. | [optional]
 **useCache** | **Boolean**| If true, the search result will be returned from cache memory, if a possible matching result exists. | [optional] [default to true]
 **useGeo** | **Boolean**| If true geoSearch features will be active. | [optional] [default to true]
 **useAbTest** | **Boolean**| If true AbTest features will be active. | [optional] [default to true]
 **useSearch** | **Boolean**| If true, search will be executed for the query. | [optional] [default to true]
 **useAsn** | **Boolean**| If true, filters should be generated for the result. | [optional] [default to true]
 **useFoundWords** | **Boolean**| If true, the words that led to the records in the search results will be determined; this may require a large amount of processing time. | [optional] [default to false]
 **useCampaigns** | **Boolean**| If true, campaigns corresponding to this search result will be returned. | [optional] [default to true]
 **idsOnly** | **Boolean**| If true, the returned records will contain only record IDs. | [optional] [default to false]
 **usePersonalization** | **Boolean**| If true, the relevant products in the result will be personalized. | [optional] [default to true]
 **useSemanticEnhancer** | **Boolean**| If true, the semantic enhancer will be used. | [optional] [default to true]
 **useAso** | **Boolean**| If true, automatic search optimization will be used. | [optional] [default to true]
 **useDeduplication** | **Boolean**| If true, the configured deduplication of variants will be used. | [optional] [default to true]
 **deduplicationField** | **String**| Specifies on which field variants should be deduplicated. | [optional]
 **useRanking** | **Boolean**| If true, ranking will be applied. | [optional] [default to true]

### Return type

[**Result**](Result.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-FF-Timeout - If true, the search is timed out. This can result in a response with 0 hits depending on when the timeout occurred. <br>  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="navigationUsingPOST"></a>
# **navigationUsingPOST**
> Result navigationUsingPOST(navigationRequest)

Navigation with POST

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.SearchApi;

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

    SearchApi apiInstance = new SearchApi(defaultClient);
    NavigationRequest navigationRequest = new NavigationRequest(); // NavigationRequest | navigationRequest
    try {
      Result result = apiInstance.navigationUsingPOST(navigationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#navigationUsingPOST");
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
 **navigationRequest** | [**NavigationRequest**](NavigationRequest.md)| navigationRequest |

### Return type

[**Result**](Result.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-FF-Timeout - If true, the search is timed out. This can result in a response with 0 hits depending on when the timeout occurred. <br>  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="searchUsingGET"></a>
# **searchUsingGET**
> Result searchUsingGET(channel, query, sid, userInput, filter, substringFilter, forceAbVariant, marketId, sort, cacheIrrelevant, latitude, longitude, maxDistance, excludeProductsNotInRange, purchaserId, page, hitsPerPage, maxCountVariants, advisorStatus, followSearch, searchField, articleNumberSearch, useCache, useGeo, useAbTest, useSearch, useAsn, useFoundWords, useCampaigns, idsOnly, usePersonalization, useSemanticEnhancer, useAso, useDeduplication, deduplicationField, useRanking, queryFromSuggest)

Search

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.SearchApi;

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

    SearchApi apiInstance = new SearchApi(defaultClient);
    String channel = "channel_example"; // String | channel
    String query = "query_example"; // String | The search term
    String sid = "sid_example"; // String | The session id
    String userInput = "userInput_example"; // String | Use this parameter to send the characters, the shop user entered until the search query was triggered.
    List<String> filter = Arrays.asList(); // List<String> | Filter for the whole field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) 'and' = \\_\\_\\_ 'or' = ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green = red or not green. If the filter name equals '*', the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix.
    List<String> substringFilter = Arrays.asList(); // List<String> | Filter for a sub string of the field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) 'and' = \\_\\_\\_ 'or' = ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green = red or not green. If the filter name equals '*', the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix.
    List<String> forceAbVariant = Arrays.asList(); // List<String> | Forces to apply certain ab variants to the search result; format: abTestId:AbVariantId; example 1b7f3b1a-600f-4d23-b1bf-ac9978628d17:A
    List<String> marketId = Arrays.asList(); // List<String> | Only show products that have values for these market IDs.
    List<String> sort = Arrays.asList(); // List<String> | Sort the result; use FieldName Relevancy to sort the relevancy; format: FieldName:order order must be either asc or desc; example Manufacturer:asc
    List<String> cacheIrrelevant = Arrays.asList(); // List<String> | Flag parameters as cache irrelevant
    Double latitude = 3.4D; // Double | The latitude coordinate of the location.
    Double longitude = 3.4D; // Double | The longitude coordinate of the location.
    Double maxDistance = 3.4D; // Double | Use this parameter to override the \"maximum distance\" setting of the geo search.
    Boolean excludeProductsNotInRange = true; // Boolean | Use this parameter to override the \"exclude products not in range\" setting of the geo search.
    String purchaserId = "purchaserId_example"; // String | Use this parameter to pass the purchaser ID. This ID is only needed, if the 'customer specific pricing' module is active. Otherwise it will be ignored.
    Integer page = 56; // Integer | If a search result contains many results these will be divided into pages. This limits the amount of data that has to be sent in one go. You can indicate which page should be returned. Page numbering starts at 1.
    Integer hitsPerPage = 56; // Integer | In the FACT-Finder Management Interface you can define how many results will be returned on a page by default. If you prefer another number, you can set it with this parameter.
    Integer maxCountVariants = 56; // Integer | The maximum number of variants to return for every record
    String advisorStatus = "advisorStatus_example"; // String | For specifying the current campaign id and answer path; format: campaignId-answerPath
    String followSearch = "followSearch_example"; // String | Optional request linking param from a previous search result or search param object. Can improve request performance.
    String searchField = "searchField_example"; // String | Normally FACT-Finder searches all fields defined as searchable. However it is possible to search only one specific field as well.
    String articleNumberSearch = "DETECT"; // String | Specifies if the query should be interpreted as article number
    Boolean useCache = true; // Boolean | If true, the search result will be returned from cache memory, if a possible matching result exists.
    Boolean useGeo = true; // Boolean | If true geoSearch features will be active.
    Boolean useAbTest = true; // Boolean | If true AbTest features will be active.
    Boolean useSearch = true; // Boolean | If true, search will be executed for the query.
    Boolean useAsn = true; // Boolean | If true, filters should be generated for the result.
    Boolean useFoundWords = false; // Boolean | If true, the words that led to the records in the search results will be determined; this may require a large amount of processing time.
    Boolean useCampaigns = true; // Boolean | If true, campaigns corresponding to this search result will be returned.
    Boolean idsOnly = false; // Boolean | If true, the returned records will contain only record IDs.
    Boolean usePersonalization = true; // Boolean | If true, the relevant products in the result will be personalized.
    Boolean useSemanticEnhancer = true; // Boolean | If true, the semantic enhancer will be used.
    Boolean useAso = true; // Boolean | If true, automatic search optimization will be used.
    Boolean useDeduplication = true; // Boolean | If true, the configured deduplication of variants will be used.
    String deduplicationField = "deduplicationField_example"; // String | Specifies on which field variants should be deduplicated.
    Boolean useRanking = true; // Boolean | If true, ranking will be applied.
    Boolean queryFromSuggest = true; // Boolean | This parameter indicates that the FACT-Finder query was triggered through a selection from the suggestion list. In this case send the parameter with the value true.
    try {
      Result result = apiInstance.searchUsingGET(channel, query, sid, userInput, filter, substringFilter, forceAbVariant, marketId, sort, cacheIrrelevant, latitude, longitude, maxDistance, excludeProductsNotInRange, purchaserId, page, hitsPerPage, maxCountVariants, advisorStatus, followSearch, searchField, articleNumberSearch, useCache, useGeo, useAbTest, useSearch, useAsn, useFoundWords, useCampaigns, idsOnly, usePersonalization, useSemanticEnhancer, useAso, useDeduplication, deduplicationField, useRanking, queryFromSuggest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchUsingGET");
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
 **query** | **String**| The search term |
 **sid** | **String**| The session id | [optional]
 **userInput** | **String**| Use this parameter to send the characters, the shop user entered until the search query was triggered. | [optional]
 **filter** | [**List&lt;String&gt;**](String.md)| Filter for the whole field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) &#39;and&#39; &#x3D; \\_\\_\\_ &#39;or&#39; &#x3D; ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green &#x3D; red or not green. If the filter name equals &#39;*&#39;, the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix. | [optional]
 **substringFilter** | [**List&lt;String&gt;**](String.md)| Filter for a sub string of the field value; a filter can have multiple values, the values can be separated with the following characters (they are configurable in the config.xml) &#39;and&#39; &#x3D; \\_\\_\\_ &#39;or&#39; &#x3D; ~~~ the filter value can be excluded with the prefix ! format: facetid:value; example Red~~~!Green &#x3D; red or not green. If the filter name equals &#39;*&#39;, the filter will be applied on any field; example: *:Red~~~Green. This filter type does not support the exclusion prefix. | [optional]
 **forceAbVariant** | [**List&lt;String&gt;**](String.md)| Forces to apply certain ab variants to the search result; format: abTestId:AbVariantId; example 1b7f3b1a-600f-4d23-b1bf-ac9978628d17:A | [optional]
 **marketId** | [**List&lt;String&gt;**](String.md)| Only show products that have values for these market IDs. | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sort the result; use FieldName Relevancy to sort the relevancy; format: FieldName:order order must be either asc or desc; example Manufacturer:asc | [optional]
 **cacheIrrelevant** | [**List&lt;String&gt;**](String.md)| Flag parameters as cache irrelevant | [optional]
 **latitude** | **Double**| The latitude coordinate of the location. | [optional]
 **longitude** | **Double**| The longitude coordinate of the location. | [optional]
 **maxDistance** | **Double**| Use this parameter to override the \&quot;maximum distance\&quot; setting of the geo search. | [optional]
 **excludeProductsNotInRange** | **Boolean**| Use this parameter to override the \&quot;exclude products not in range\&quot; setting of the geo search. | [optional]
 **purchaserId** | **String**| Use this parameter to pass the purchaser ID. This ID is only needed, if the &#39;customer specific pricing&#39; module is active. Otherwise it will be ignored. | [optional]
 **page** | **Integer**| If a search result contains many results these will be divided into pages. This limits the amount of data that has to be sent in one go. You can indicate which page should be returned. Page numbering starts at 1. | [optional]
 **hitsPerPage** | **Integer**| In the FACT-Finder Management Interface you can define how many results will be returned on a page by default. If you prefer another number, you can set it with this parameter. | [optional]
 **maxCountVariants** | **Integer**| The maximum number of variants to return for every record | [optional]
 **advisorStatus** | **String**| For specifying the current campaign id and answer path; format: campaignId-answerPath | [optional]
 **followSearch** | **String**| Optional request linking param from a previous search result or search param object. Can improve request performance. | [optional]
 **searchField** | **String**| Normally FACT-Finder searches all fields defined as searchable. However it is possible to search only one specific field as well. | [optional]
 **articleNumberSearch** | **String**| Specifies if the query should be interpreted as article number | [optional] [default to DETECT] [enum: DETECT, ALWAYS, NEVER]
 **useCache** | **Boolean**| If true, the search result will be returned from cache memory, if a possible matching result exists. | [optional] [default to true]
 **useGeo** | **Boolean**| If true geoSearch features will be active. | [optional] [default to true]
 **useAbTest** | **Boolean**| If true AbTest features will be active. | [optional] [default to true]
 **useSearch** | **Boolean**| If true, search will be executed for the query. | [optional] [default to true]
 **useAsn** | **Boolean**| If true, filters should be generated for the result. | [optional] [default to true]
 **useFoundWords** | **Boolean**| If true, the words that led to the records in the search results will be determined; this may require a large amount of processing time. | [optional] [default to false]
 **useCampaigns** | **Boolean**| If true, campaigns corresponding to this search result will be returned. | [optional] [default to true]
 **idsOnly** | **Boolean**| If true, the returned records will contain only record IDs. | [optional] [default to false]
 **usePersonalization** | **Boolean**| If true, the relevant products in the result will be personalized. | [optional] [default to true]
 **useSemanticEnhancer** | **Boolean**| If true, the semantic enhancer will be used. | [optional] [default to true]
 **useAso** | **Boolean**| If true, automatic search optimization will be used. | [optional] [default to true]
 **useDeduplication** | **Boolean**| If true, the configured deduplication of variants will be used. | [optional] [default to true]
 **deduplicationField** | **String**| Specifies on which field variants should be deduplicated. | [optional]
 **useRanking** | **Boolean**| If true, ranking will be applied. | [optional] [default to true]
 **queryFromSuggest** | **Boolean**| This parameter indicates that the FACT-Finder query was triggered through a selection from the suggestion list. In this case send the parameter with the value true. | [optional]

### Return type

[**Result**](Result.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-FF-Timeout - If true, the search is timed out. This can result in a response with 0 hits depending on when the timeout occurred. <br>  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="searchUsingPOST"></a>
# **searchUsingPOST**
> Result searchUsingPOST(searchRequest)

Search with POST

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.SearchApi;

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

    SearchApi apiInstance = new SearchApi(defaultClient);
    SearchRequest searchRequest = new SearchRequest(); // SearchRequest | searchRequest
    try {
      Result result = apiInstance.searchUsingPOST(searchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchUsingPOST");
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
 **searchRequest** | [**SearchRequest**](SearchRequest.md)| searchRequest |

### Return type

[**Result**](Result.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-FF-Timeout - If true, the search is timed out. This can result in a response with 0 hits depending on when the timeout occurred. <br>  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |


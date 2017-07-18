# SearchApi

All URIs are relative to *http://{FACT_FINDER_INSTANCE}/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchUsingGET**](SearchApi.md#searchUsingGET) | **GET** /v1/search/{channel} | Search
[**searchUsingPOST**](SearchApi.md#searchUsingPOST) | **POST** /v1/search | Search with POST


<a name="searchUsingGET"></a>
# **searchUsingGET**
> Result searchUsingGET(channel, sid, userInput, page, productsPerPage, noArticleNumberSearch, searchField, followSearch, seoPath, query, useAsn, useFoundWords, useCampaigns, idsOnly, useKeywords, generateAdvisorTree, disableCache, usePersonalization, useSemanticEnhancer, useAso, filterFACETID, navigation, sortFIELDNAME, queryFromSuggest, advisorStatus)

Search

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SearchApi apiInstance = new SearchApi();
String channel = "channel_example"; // String | channel
String sid = "sid_example"; // String | The session id
String userInput = "userInput_example"; // String | Use this parameter to send the characters, the shop user entered until the search query was triggered.
Integer page = 56; // Integer | If a search result contains many results these will be divided into pages. This limits the amount of data that has to be sent in one go. You can indicate which page should be returned. Page numbering starts at 1.
Integer productsPerPage = 56; // Integer | In the FACT-Finder Management Interface you can define how many results will be returned on a page by default. If you prefer another number, you can set it with this parameter.
Boolean noArticleNumberSearch = true; // Boolean | Normally an article number search is carried out if the search term matches one or more set formats. You can also use parameters to prevent an article number search from being carried out.
String searchField = "searchField_example"; // String | Normally FACT-Finder searches all fields defined as searchable. However it is possible to search only one specific field as well.
Integer followSearch = 56; // Integer | The parameter followSearch is automatically attached to all follow-up parameter sets of a search result. The parameter must not be passed on initial requests. For internal reasons it must be passed for all follow-up requests (sorting, filtering, etc.).
String seoPath = "seoPath_example"; // String | See SEO-Enhancer documentation.
String query = "query_example"; // String | The search term
Boolean useAsn = true; // Boolean | Whether or not the ASN (after-search navigation) block should be created.
Boolean useFoundWords = false; // Boolean | FACT-Finder is able to return the words that were used to find the data record for the located records. Determining these words takes up CPU time. true = generate the search words or false do not generate the search words.
Boolean useCampaigns = true; // Boolean | true = campaigns are evaluated and returned as appropriate, false = campaigns are ignored.
Boolean idsOnly = false; // Boolean | Whether or not to return only record Ids. If you do not need the other information in the results, this will help you to improve performance.
Boolean useKeywords = false; // Boolean | FACT-Finder is able to generate product keywords that can be used for SEO. true = SEO keywords are evaluated and added to the product records, false = SEO keywords are not returned.
Boolean generateAdvisorTree = false; // Boolean | Used in conjunction with advisor campaigns. true = return the complete question/answer tree along with the advisor campaign. false = only the currently active questions and their answers are returned.
Boolean disableCache = false; // Boolean | Whether or not to use the search result cache. true = cache is ignored, false = cache is used. 
Boolean usePersonalization = true; // Boolean | Whether or not personalize the queries.
Boolean useSemanticEnhancer = true; // Boolean | Whether or not use the semantic enhancer.
Boolean useAso = true; // Boolean | Whether or not use automatic search optimization.
String filterFACETID = "filterFACETID_example"; // String | When a filter parameter is sent to FACT-Finder, the Search engine only returns results that correspond to the filter indicated. The filter value will not register a hit if only a partial match is detected.It is also possible to combine field filters using AND or OR.Moreover you can send a filter that excludes the given criteria. For example, return all products that are NOT red. As with the sort criteria, the name of the parameter is composed of a prefix and a fieldname. Here, however, the prefix is filter.The filter value is provided as the value of the parameter. If you want to apply multiple filters, you need to insert a separator string between each of the filter values. To combine the filters using a logical AND operator the separator is normally 3 underscores (\\_\\_\\_). If you want to use a logical OR operator, the separator is 3 tildes (\\~\\~\\~). Example: Red\\~\\~\\~Blue These separator strings can be configured in config.xml. If you want the filter to exclude specific values, you need to add a prefix before the filter value. By default this is an exclamation mark (!). Example: !Red This string is also configured in config.xml
Boolean navigation = false; // Boolean | FACT-Finder can also replicate your entire shop navigation. No search term is necessary if you want to use this function. You simply pass the corresponding request.
String sortFIELDNAME = "sortFIELDNAME_example"; // String | By default the result that is returned has been sorted for relevance However, you can specify a different sort order here. It is also possible to sort by more than one criterion. Each sort criterion is applied sequentially. The parameter is made up of the prefix sort and the name of the field by which the data should sorted (sortFIELDNAME). The sort direction is indicated by the value asc for ascending order and desc for descending order.If you want to sort by similarity as well in the event that multiple sortings are specified the parameter is sortRelevancy=desc.
Boolean queryFromSuggest = true; // Boolean | This parameter indicates that the FACT-Finder query was triggered through a selection from the suggestion list. In this case send the parameter with the value true.
String advisorStatus = "advisorStatus_example"; // String | For specifying the current campaign id and answer path; format: campaignId-answerPath
try {
    Result result = apiInstance.searchUsingGET(channel, sid, userInput, page, productsPerPage, noArticleNumberSearch, searchField, followSearch, seoPath, query, useAsn, useFoundWords, useCampaigns, idsOnly, useKeywords, generateAdvisorTree, disableCache, usePersonalization, useSemanticEnhancer, useAso, filterFACETID, navigation, sortFIELDNAME, queryFromSuggest, advisorStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| channel |
 **sid** | **String**| The session id | [optional]
 **userInput** | **String**| Use this parameter to send the characters, the shop user entered until the search query was triggered. | [optional]
 **page** | **Integer**| If a search result contains many results these will be divided into pages. This limits the amount of data that has to be sent in one go. You can indicate which page should be returned. Page numbering starts at 1. | [optional]
 **productsPerPage** | **Integer**| In the FACT-Finder Management Interface you can define how many results will be returned on a page by default. If you prefer another number, you can set it with this parameter. | [optional]
 **noArticleNumberSearch** | **Boolean**| Normally an article number search is carried out if the search term matches one or more set formats. You can also use parameters to prevent an article number search from being carried out. | [optional]
 **searchField** | **String**| Normally FACT-Finder searches all fields defined as searchable. However it is possible to search only one specific field as well. | [optional]
 **followSearch** | **Integer**| The parameter followSearch is automatically attached to all follow-up parameter sets of a search result. The parameter must not be passed on initial requests. For internal reasons it must be passed for all follow-up requests (sorting, filtering, etc.). | [optional]
 **seoPath** | **String**| See SEO-Enhancer documentation. | [optional]
 **query** | **String**| The search term | [optional]
 **useAsn** | **Boolean**| Whether or not the ASN (after-search navigation) block should be created. | [optional] [default to true]
 **useFoundWords** | **Boolean**| FACT-Finder is able to return the words that were used to find the data record for the located records. Determining these words takes up CPU time. true &#x3D; generate the search words or false do not generate the search words. | [optional] [default to false]
 **useCampaigns** | **Boolean**| true &#x3D; campaigns are evaluated and returned as appropriate, false &#x3D; campaigns are ignored. | [optional] [default to true]
 **idsOnly** | **Boolean**| Whether or not to return only record Ids. If you do not need the other information in the results, this will help you to improve performance. | [optional] [default to false]
 **useKeywords** | **Boolean**| FACT-Finder is able to generate product keywords that can be used for SEO. true &#x3D; SEO keywords are evaluated and added to the product records, false &#x3D; SEO keywords are not returned. | [optional] [default to false]
 **generateAdvisorTree** | **Boolean**| Used in conjunction with advisor campaigns. true &#x3D; return the complete question/answer tree along with the advisor campaign. false &#x3D; only the currently active questions and their answers are returned. | [optional] [default to false]
 **disableCache** | **Boolean**| Whether or not to use the search result cache. true &#x3D; cache is ignored, false &#x3D; cache is used.  | [optional] [default to false]
 **usePersonalization** | **Boolean**| Whether or not personalize the queries. | [optional] [default to true]
 **useSemanticEnhancer** | **Boolean**| Whether or not use the semantic enhancer. | [optional] [default to true]
 **useAso** | **Boolean**| Whether or not use automatic search optimization. | [optional] [default to true]
 **filterFACETID** | **String**| When a filter parameter is sent to FACT-Finder, the Search engine only returns results that correspond to the filter indicated. The filter value will not register a hit if only a partial match is detected.It is also possible to combine field filters using AND or OR.Moreover you can send a filter that excludes the given criteria. For example, return all products that are NOT red. As with the sort criteria, the name of the parameter is composed of a prefix and a fieldname. Here, however, the prefix is filter.The filter value is provided as the value of the parameter. If you want to apply multiple filters, you need to insert a separator string between each of the filter values. To combine the filters using a logical AND operator the separator is normally 3 underscores (\\_\\_\\_). If you want to use a logical OR operator, the separator is 3 tildes (\\~\\~\\~). Example: Red\\~\\~\\~Blue These separator strings can be configured in config.xml. If you want the filter to exclude specific values, you need to add a prefix before the filter value. By default this is an exclamation mark (!). Example: !Red This string is also configured in config.xml | [optional]
 **navigation** | **Boolean**| FACT-Finder can also replicate your entire shop navigation. No search term is necessary if you want to use this function. You simply pass the corresponding request. | [optional] [default to false]
 **sortFIELDNAME** | **String**| By default the result that is returned has been sorted for relevance However, you can specify a different sort order here. It is also possible to sort by more than one criterion. Each sort criterion is applied sequentially. The parameter is made up of the prefix sort and the name of the field by which the data should sorted (sortFIELDNAME). The sort direction is indicated by the value asc for ascending order and desc for descending order.If you want to sort by similarity as well in the event that multiple sortings are specified the parameter is sortRelevancy&#x3D;desc. | [optional] [enum: desc, asc]
 **queryFromSuggest** | **Boolean**| This parameter indicates that the FACT-Finder query was triggered through a selection from the suggestion list. In this case send the parameter with the value true. | [optional]
 **advisorStatus** | **String**| For specifying the current campaign id and answer path; format: campaignId-answerPath | [optional]

### Return type

[**Result**](Result.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

<a name="searchUsingPOST"></a>
# **searchUsingPOST**
> Result searchUsingPOST(searchRequest)

Search with POST

### Example
```java
// Import classes:
//import de.factfinder.client.ApiClient;
//import de.factfinder.client.ApiException;
//import de.factfinder.client.Configuration;
//import de.factfinder.client.auth.*;
//import de.factfinder.client.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

SearchApi apiInstance = new SearchApi();
SearchRequest searchRequest = new SearchRequest(); // SearchRequest | searchRequest
try {
    Result result = apiInstance.searchUsingPOST(searchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchRequest** | [**SearchRequest**](SearchRequest.md)| searchRequest |

### Return type

[**Result**](Result.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json


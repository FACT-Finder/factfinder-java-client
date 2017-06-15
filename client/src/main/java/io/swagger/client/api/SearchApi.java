/*
 * FACT-Finder REST-API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ApiError;
import io.swagger.client.model.Result;
import io.swagger.client.model.SearchRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private ApiClient apiClient;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for searchUsingGET */
    private com.squareup.okhttp.Call searchUsingGETCall(String channel, String sid, String userInput, Integer page, Integer productsPerPage, Boolean noArticleNumberSearch, String searchField, Integer followSearch, String seoPath, String query, Boolean useAsn, Boolean useFoundWords, Boolean useCampaigns, Boolean idsOnly, Boolean useKeywords, Boolean generateAdvisorTree, Boolean disableCache, Boolean usePersonalization, Boolean useSemanticEnhancer, Boolean useAso, String filterFACETID, Boolean navigation, String sortFIELDNAME, Boolean queryFromSuggest, String advisorStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/search/{channel}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "channel" + "\\}", apiClient.escapeString(channel.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (sid != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sid", sid));
        if (userInput != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userInput", userInput));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        if (productsPerPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "productsPerPage", productsPerPage));
        if (noArticleNumberSearch != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "noArticleNumberSearch", noArticleNumberSearch));
        if (searchField != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchField", searchField));
        if (followSearch != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "followSearch", followSearch));
        if (seoPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "seoPath", seoPath));
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
        if (useAsn != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "useAsn", useAsn));
        if (useFoundWords != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "useFoundWords", useFoundWords));
        if (useCampaigns != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "useCampaigns", useCampaigns));
        if (idsOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "idsOnly", idsOnly));
        if (useKeywords != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "useKeywords", useKeywords));
        if (generateAdvisorTree != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "generateAdvisorTree", generateAdvisorTree));
        if (disableCache != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "disableCache", disableCache));
        if (usePersonalization != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "usePersonalization", usePersonalization));
        if (useSemanticEnhancer != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "useSemanticEnhancer", useSemanticEnhancer));
        if (useAso != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "useAso", useAso));
        if (filterFACETID != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[FACET-ID]", filterFACETID));
        if (navigation != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "navigation", navigation));
        if (sortFIELDNAME != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[FIELDNAME]", sortFIELDNAME));
        if (queryFromSuggest != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "queryFromSuggest", queryFromSuggest));
        if (advisorStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "advisorStatus", advisorStatus));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchUsingGETValidateBeforeCall(String channel, String sid, String userInput, Integer page, Integer productsPerPage, Boolean noArticleNumberSearch, String searchField, Integer followSearch, String seoPath, String query, Boolean useAsn, Boolean useFoundWords, Boolean useCampaigns, Boolean idsOnly, Boolean useKeywords, Boolean generateAdvisorTree, Boolean disableCache, Boolean usePersonalization, Boolean useSemanticEnhancer, Boolean useAso, String filterFACETID, Boolean navigation, String sortFIELDNAME, Boolean queryFromSuggest, String advisorStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new ApiException("Missing the required parameter 'channel' when calling searchUsingGET(Async)");
        }
        
        
        com.squareup.okhttp.Call call = searchUsingGETCall(channel, sid, userInput, page, productsPerPage, noArticleNumberSearch, searchField, followSearch, seoPath, query, useAsn, useFoundWords, useCampaigns, idsOnly, useKeywords, generateAdvisorTree, disableCache, usePersonalization, useSemanticEnhancer, useAso, filterFACETID, navigation, sortFIELDNAME, queryFromSuggest, advisorStatus, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Search
     * 
     * @param channel channel (required)
     * @param sid The session id (optional)
     * @param userInput Use this parameter to send the characters, the shop user entered until the search query was triggered. (optional)
     * @param page If a search result contains many results these will be divided into pages. This limits the amount of data that has to be sent in one go. You can indicate which page should be returned. Page numbering starts at 1. (optional)
     * @param productsPerPage In the FACT-Finder Management Interface you can define how many results will be returned on a page by default. If you prefer another number, you can set it with this parameter. (optional)
     * @param noArticleNumberSearch Normally an article number search is carried out if the search term matches one or more set formats. You can also use parameters to prevent an article number search from being carried out. (optional)
     * @param searchField Normally FACT-Finder searches all fields defined as searchable. However it is possible to search only one specific field as well. (optional)
     * @param followSearch The parameter followSearch is automatically attached to all follow-up parameter sets of a search result. The parameter must not be passed on initial requests. For internal reasons it must be passed for all follow-up requests (sorting, filtering, etc.). (optional)
     * @param seoPath See SEO-Enhancer documentation. (optional)
     * @param query The search term (optional)
     * @param useAsn Whether or not the ASN (after-search navigation) block should be created. (optional, default to true)
     * @param useFoundWords FACT-Finder is able to return the words that were used to find the data record for the located records. Determining these words takes up CPU time. true &#x3D; generate the search words or false do not generate the search words. (optional, default to false)
     * @param useCampaigns true &#x3D; campaigns are evaluated and returned as appropriate, false &#x3D; campaigns are ignored. (optional, default to true)
     * @param idsOnly Whether or not to return only record Ids. If you do not need the other information in the results, this will help you to improve performance. (optional, default to false)
     * @param useKeywords FACT-Finder is able to generate product keywords that can be used for SEO. true &#x3D; SEO keywords are evaluated and added to the product records, false &#x3D; SEO keywords are not returned. (optional, default to false)
     * @param generateAdvisorTree Used in conjunction with advisor campaigns. true &#x3D; return the complete question/answer tree along with the advisor campaign. false &#x3D; only the currently active questions and their answers are returned. (optional, default to false)
     * @param disableCache Whether or not to use the search result cache. true &#x3D; cache is ignored, false &#x3D; cache is used.  (optional, default to false)
     * @param usePersonalization Whether or not personalize the queries. (optional, default to true)
     * @param useSemanticEnhancer Whether or not use the semantic enhancer. (optional, default to true)
     * @param useAso Whether or not use automatic search optimization. (optional, default to true)
     * @param filterFACETID When a filter parameter is sent to FACT-Finder, the Search engine only returns results that correspond to the filter indicated. The filter value will not register a hit if only a partial match is detected.It is also possible to combine field filters using AND or OR.Moreover you can send a filter that excludes the given criteria. For example, return all products that are NOT red. As with the sort criteria, the name of the parameter is composed of a prefix and a fieldname. Here, however, the prefix is filter.The filter value is provided as the value of the parameter. If you want to apply multiple filters, you need to insert a separator string between each of the filter values. To combine the filters using a logical AND operator the separator is normally 3 underscores (\\_\\_\\_). If you want to use a logical OR operator, the separator is 3 tildes (\\~\\~\\~). Example: Red\\~\\~\\~Blue These separator strings can be configured in config.xml. If you want the filter to exclude specific values, you need to add a prefix before the filter value. By default this is an exclamation mark (!). Example: !Red This string is also configured in config.xml (optional)
     * @param navigation FACT-Finder can also replicate your entire shop navigation. No search term is necessary if you want to use this function. You simply pass the corresponding request. (optional, default to false)
     * @param sortFIELDNAME By default the result that is returned has been sorted for relevance However, you can specify a different sort order here. It is also possible to sort by more than one criterion. Each sort criterion is applied sequentially. The parameter is made up of the prefix sort and the name of the field by which the data should sorted (sortFIELDNAME). The sort direction is indicated by the value asc for ascending order and desc for descending order.If you want to sort by similarity as well in the event that multiple sortings are specified the parameter is sortRelevancy&#x3D;desc. (optional)
     * @param queryFromSuggest This parameter indicates that the FACT-Finder query was triggered through a selection from the suggestion list. In this case send the parameter with the value true. (optional)
     * @param advisorStatus For specifying the current campaign id and answer path; format: campaignId-answerPath (optional)
     * @return Result
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Result searchUsingGET(String channel, String sid, String userInput, Integer page, Integer productsPerPage, Boolean noArticleNumberSearch, String searchField, Integer followSearch, String seoPath, String query, Boolean useAsn, Boolean useFoundWords, Boolean useCampaigns, Boolean idsOnly, Boolean useKeywords, Boolean generateAdvisorTree, Boolean disableCache, Boolean usePersonalization, Boolean useSemanticEnhancer, Boolean useAso, String filterFACETID, Boolean navigation, String sortFIELDNAME, Boolean queryFromSuggest, String advisorStatus) throws ApiException {
        ApiResponse<Result> resp = searchUsingGETWithHttpInfo(channel, sid, userInput, page, productsPerPage, noArticleNumberSearch, searchField, followSearch, seoPath, query, useAsn, useFoundWords, useCampaigns, idsOnly, useKeywords, generateAdvisorTree, disableCache, usePersonalization, useSemanticEnhancer, useAso, filterFACETID, navigation, sortFIELDNAME, queryFromSuggest, advisorStatus);
        return resp.getData();
    }

    /**
     * Search
     * 
     * @param channel channel (required)
     * @param sid The session id (optional)
     * @param userInput Use this parameter to send the characters, the shop user entered until the search query was triggered. (optional)
     * @param page If a search result contains many results these will be divided into pages. This limits the amount of data that has to be sent in one go. You can indicate which page should be returned. Page numbering starts at 1. (optional)
     * @param productsPerPage In the FACT-Finder Management Interface you can define how many results will be returned on a page by default. If you prefer another number, you can set it with this parameter. (optional)
     * @param noArticleNumberSearch Normally an article number search is carried out if the search term matches one or more set formats. You can also use parameters to prevent an article number search from being carried out. (optional)
     * @param searchField Normally FACT-Finder searches all fields defined as searchable. However it is possible to search only one specific field as well. (optional)
     * @param followSearch The parameter followSearch is automatically attached to all follow-up parameter sets of a search result. The parameter must not be passed on initial requests. For internal reasons it must be passed for all follow-up requests (sorting, filtering, etc.). (optional)
     * @param seoPath See SEO-Enhancer documentation. (optional)
     * @param query The search term (optional)
     * @param useAsn Whether or not the ASN (after-search navigation) block should be created. (optional, default to true)
     * @param useFoundWords FACT-Finder is able to return the words that were used to find the data record for the located records. Determining these words takes up CPU time. true &#x3D; generate the search words or false do not generate the search words. (optional, default to false)
     * @param useCampaigns true &#x3D; campaigns are evaluated and returned as appropriate, false &#x3D; campaigns are ignored. (optional, default to true)
     * @param idsOnly Whether or not to return only record Ids. If you do not need the other information in the results, this will help you to improve performance. (optional, default to false)
     * @param useKeywords FACT-Finder is able to generate product keywords that can be used for SEO. true &#x3D; SEO keywords are evaluated and added to the product records, false &#x3D; SEO keywords are not returned. (optional, default to false)
     * @param generateAdvisorTree Used in conjunction with advisor campaigns. true &#x3D; return the complete question/answer tree along with the advisor campaign. false &#x3D; only the currently active questions and their answers are returned. (optional, default to false)
     * @param disableCache Whether or not to use the search result cache. true &#x3D; cache is ignored, false &#x3D; cache is used.  (optional, default to false)
     * @param usePersonalization Whether or not personalize the queries. (optional, default to true)
     * @param useSemanticEnhancer Whether or not use the semantic enhancer. (optional, default to true)
     * @param useAso Whether or not use automatic search optimization. (optional, default to true)
     * @param filterFACETID When a filter parameter is sent to FACT-Finder, the Search engine only returns results that correspond to the filter indicated. The filter value will not register a hit if only a partial match is detected.It is also possible to combine field filters using AND or OR.Moreover you can send a filter that excludes the given criteria. For example, return all products that are NOT red. As with the sort criteria, the name of the parameter is composed of a prefix and a fieldname. Here, however, the prefix is filter.The filter value is provided as the value of the parameter. If you want to apply multiple filters, you need to insert a separator string between each of the filter values. To combine the filters using a logical AND operator the separator is normally 3 underscores (\\_\\_\\_). If you want to use a logical OR operator, the separator is 3 tildes (\\~\\~\\~). Example: Red\\~\\~\\~Blue These separator strings can be configured in config.xml. If you want the filter to exclude specific values, you need to add a prefix before the filter value. By default this is an exclamation mark (!). Example: !Red This string is also configured in config.xml (optional)
     * @param navigation FACT-Finder can also replicate your entire shop navigation. No search term is necessary if you want to use this function. You simply pass the corresponding request. (optional, default to false)
     * @param sortFIELDNAME By default the result that is returned has been sorted for relevance However, you can specify a different sort order here. It is also possible to sort by more than one criterion. Each sort criterion is applied sequentially. The parameter is made up of the prefix sort and the name of the field by which the data should sorted (sortFIELDNAME). The sort direction is indicated by the value asc for ascending order and desc for descending order.If you want to sort by similarity as well in the event that multiple sortings are specified the parameter is sortRelevancy&#x3D;desc. (optional)
     * @param queryFromSuggest This parameter indicates that the FACT-Finder query was triggered through a selection from the suggestion list. In this case send the parameter with the value true. (optional)
     * @param advisorStatus For specifying the current campaign id and answer path; format: campaignId-answerPath (optional)
     * @return ApiResponse&lt;Result&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Result> searchUsingGETWithHttpInfo(String channel, String sid, String userInput, Integer page, Integer productsPerPage, Boolean noArticleNumberSearch, String searchField, Integer followSearch, String seoPath, String query, Boolean useAsn, Boolean useFoundWords, Boolean useCampaigns, Boolean idsOnly, Boolean useKeywords, Boolean generateAdvisorTree, Boolean disableCache, Boolean usePersonalization, Boolean useSemanticEnhancer, Boolean useAso, String filterFACETID, Boolean navigation, String sortFIELDNAME, Boolean queryFromSuggest, String advisorStatus) throws ApiException {
        com.squareup.okhttp.Call call = searchUsingGETValidateBeforeCall(channel, sid, userInput, page, productsPerPage, noArticleNumberSearch, searchField, followSearch, seoPath, query, useAsn, useFoundWords, useCampaigns, idsOnly, useKeywords, generateAdvisorTree, disableCache, usePersonalization, useSemanticEnhancer, useAso, filterFACETID, navigation, sortFIELDNAME, queryFromSuggest, advisorStatus, null, null);
        Type localVarReturnType = new TypeToken<Result>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search (asynchronously)
     * 
     * @param channel channel (required)
     * @param sid The session id (optional)
     * @param userInput Use this parameter to send the characters, the shop user entered until the search query was triggered. (optional)
     * @param page If a search result contains many results these will be divided into pages. This limits the amount of data that has to be sent in one go. You can indicate which page should be returned. Page numbering starts at 1. (optional)
     * @param productsPerPage In the FACT-Finder Management Interface you can define how many results will be returned on a page by default. If you prefer another number, you can set it with this parameter. (optional)
     * @param noArticleNumberSearch Normally an article number search is carried out if the search term matches one or more set formats. You can also use parameters to prevent an article number search from being carried out. (optional)
     * @param searchField Normally FACT-Finder searches all fields defined as searchable. However it is possible to search only one specific field as well. (optional)
     * @param followSearch The parameter followSearch is automatically attached to all follow-up parameter sets of a search result. The parameter must not be passed on initial requests. For internal reasons it must be passed for all follow-up requests (sorting, filtering, etc.). (optional)
     * @param seoPath See SEO-Enhancer documentation. (optional)
     * @param query The search term (optional)
     * @param useAsn Whether or not the ASN (after-search navigation) block should be created. (optional, default to true)
     * @param useFoundWords FACT-Finder is able to return the words that were used to find the data record for the located records. Determining these words takes up CPU time. true &#x3D; generate the search words or false do not generate the search words. (optional, default to false)
     * @param useCampaigns true &#x3D; campaigns are evaluated and returned as appropriate, false &#x3D; campaigns are ignored. (optional, default to true)
     * @param idsOnly Whether or not to return only record Ids. If you do not need the other information in the results, this will help you to improve performance. (optional, default to false)
     * @param useKeywords FACT-Finder is able to generate product keywords that can be used for SEO. true &#x3D; SEO keywords are evaluated and added to the product records, false &#x3D; SEO keywords are not returned. (optional, default to false)
     * @param generateAdvisorTree Used in conjunction with advisor campaigns. true &#x3D; return the complete question/answer tree along with the advisor campaign. false &#x3D; only the currently active questions and their answers are returned. (optional, default to false)
     * @param disableCache Whether or not to use the search result cache. true &#x3D; cache is ignored, false &#x3D; cache is used.  (optional, default to false)
     * @param usePersonalization Whether or not personalize the queries. (optional, default to true)
     * @param useSemanticEnhancer Whether or not use the semantic enhancer. (optional, default to true)
     * @param useAso Whether or not use automatic search optimization. (optional, default to true)
     * @param filterFACETID When a filter parameter is sent to FACT-Finder, the Search engine only returns results that correspond to the filter indicated. The filter value will not register a hit if only a partial match is detected.It is also possible to combine field filters using AND or OR.Moreover you can send a filter that excludes the given criteria. For example, return all products that are NOT red. As with the sort criteria, the name of the parameter is composed of a prefix and a fieldname. Here, however, the prefix is filter.The filter value is provided as the value of the parameter. If you want to apply multiple filters, you need to insert a separator string between each of the filter values. To combine the filters using a logical AND operator the separator is normally 3 underscores (\\_\\_\\_). If you want to use a logical OR operator, the separator is 3 tildes (\\~\\~\\~). Example: Red\\~\\~\\~Blue These separator strings can be configured in config.xml. If you want the filter to exclude specific values, you need to add a prefix before the filter value. By default this is an exclamation mark (!). Example: !Red This string is also configured in config.xml (optional)
     * @param navigation FACT-Finder can also replicate your entire shop navigation. No search term is necessary if you want to use this function. You simply pass the corresponding request. (optional, default to false)
     * @param sortFIELDNAME By default the result that is returned has been sorted for relevance However, you can specify a different sort order here. It is also possible to sort by more than one criterion. Each sort criterion is applied sequentially. The parameter is made up of the prefix sort and the name of the field by which the data should sorted (sortFIELDNAME). The sort direction is indicated by the value asc for ascending order and desc for descending order.If you want to sort by similarity as well in the event that multiple sortings are specified the parameter is sortRelevancy&#x3D;desc. (optional)
     * @param queryFromSuggest This parameter indicates that the FACT-Finder query was triggered through a selection from the suggestion list. In this case send the parameter with the value true. (optional)
     * @param advisorStatus For specifying the current campaign id and answer path; format: campaignId-answerPath (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchUsingGETAsync(String channel, String sid, String userInput, Integer page, Integer productsPerPage, Boolean noArticleNumberSearch, String searchField, Integer followSearch, String seoPath, String query, Boolean useAsn, Boolean useFoundWords, Boolean useCampaigns, Boolean idsOnly, Boolean useKeywords, Boolean generateAdvisorTree, Boolean disableCache, Boolean usePersonalization, Boolean useSemanticEnhancer, Boolean useAso, String filterFACETID, Boolean navigation, String sortFIELDNAME, Boolean queryFromSuggest, String advisorStatus, final ApiCallback<Result> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchUsingGETValidateBeforeCall(channel, sid, userInput, page, productsPerPage, noArticleNumberSearch, searchField, followSearch, seoPath, query, useAsn, useFoundWords, useCampaigns, idsOnly, useKeywords, generateAdvisorTree, disableCache, usePersonalization, useSemanticEnhancer, useAso, filterFACETID, navigation, sortFIELDNAME, queryFromSuggest, advisorStatus, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Result>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for searchUsingPOST */
    private com.squareup.okhttp.Call searchUsingPOSTCall(SearchRequest searchRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = searchRequest;
        
        // create path and map variables
        String localVarPath = "/v1/search".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchUsingPOSTValidateBeforeCall(SearchRequest searchRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'searchRequest' is set
        if (searchRequest == null) {
            throw new ApiException("Missing the required parameter 'searchRequest' when calling searchUsingPOST(Async)");
        }
        
        
        com.squareup.okhttp.Call call = searchUsingPOSTCall(searchRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Search with POST
     * 
     * @param searchRequest searchRequest (required)
     * @return Result
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Result searchUsingPOST(SearchRequest searchRequest) throws ApiException {
        ApiResponse<Result> resp = searchUsingPOSTWithHttpInfo(searchRequest);
        return resp.getData();
    }

    /**
     * Search with POST
     * 
     * @param searchRequest searchRequest (required)
     * @return ApiResponse&lt;Result&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Result> searchUsingPOSTWithHttpInfo(SearchRequest searchRequest) throws ApiException {
        com.squareup.okhttp.Call call = searchUsingPOSTValidateBeforeCall(searchRequest, null, null);
        Type localVarReturnType = new TypeToken<Result>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search with POST (asynchronously)
     * 
     * @param searchRequest searchRequest (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchUsingPOSTAsync(SearchRequest searchRequest, final ApiCallback<Result> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchUsingPOSTValidateBeforeCall(searchRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Result>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

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


package de.factfinder.client.api;

import de.factfinder.client.ApiCallback;
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.ApiResponse;
import de.factfinder.client.Configuration;
import de.factfinder.client.Pair;
import de.factfinder.client.ProgressRequestBody;
import de.factfinder.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import de.factfinder.client.model.ApiError;
import de.factfinder.client.model.SimilarProducts;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimilarproductsApi {
    private ApiClient apiClient;

    public SimilarproductsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SimilarproductsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getSimilarProductsUsingGET */
    private com.squareup.okhttp.Call getSimilarProductsUsingGETCall(String channel, String id, Boolean idsOnly, Integer maxResults, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/similarproducts/{channel}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "channel" + "\\}", apiClient.escapeString(channel.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
        if (idsOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "idsOnly", idsOnly));
        if (maxResults != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));

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
    private com.squareup.okhttp.Call getSimilarProductsUsingGETValidateBeforeCall(String channel, String id, Boolean idsOnly, Integer maxResults, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new ApiException("Missing the required parameter 'channel' when calling getSimilarProductsUsingGET(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getSimilarProductsUsingGET(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getSimilarProductsUsingGETCall(channel, id, idsOnly, maxResults, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get similar products
     * 
     * @param channel channel (required)
     * @param id Use this parameter to pass the product ID for which you wish to obtain similar products. (required)
     * @param idsOnly If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. (optional, default to false)
     * @param maxResults Use this parameter to specify the number of recommendations you would like. The default value from the configuration is used if the parameter is not specified. (optional, default to 10)
     * @return SimilarProducts
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SimilarProducts getSimilarProductsUsingGET(String channel, String id, Boolean idsOnly, Integer maxResults) throws ApiException {
        ApiResponse<SimilarProducts> resp = getSimilarProductsUsingGETWithHttpInfo(channel, id, idsOnly, maxResults);
        return resp.getData();
    }

    /**
     * Get similar products
     * 
     * @param channel channel (required)
     * @param id Use this parameter to pass the product ID for which you wish to obtain similar products. (required)
     * @param idsOnly If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. (optional, default to false)
     * @param maxResults Use this parameter to specify the number of recommendations you would like. The default value from the configuration is used if the parameter is not specified. (optional, default to 10)
     * @return ApiResponse&lt;SimilarProducts&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SimilarProducts> getSimilarProductsUsingGETWithHttpInfo(String channel, String id, Boolean idsOnly, Integer maxResults) throws ApiException {
        com.squareup.okhttp.Call call = getSimilarProductsUsingGETValidateBeforeCall(channel, id, idsOnly, maxResults, null, null);
        Type localVarReturnType = new TypeToken<SimilarProducts>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get similar products (asynchronously)
     * 
     * @param channel channel (required)
     * @param id Use this parameter to pass the product ID for which you wish to obtain similar products. (required)
     * @param idsOnly If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance. (optional, default to false)
     * @param maxResults Use this parameter to specify the number of recommendations you would like. The default value from the configuration is used if the parameter is not specified. (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSimilarProductsUsingGETAsync(String channel, String id, Boolean idsOnly, Integer maxResults, final ApiCallback<SimilarProducts> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSimilarProductsUsingGETValidateBeforeCall(channel, id, idsOnly, maxResults, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SimilarProducts>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
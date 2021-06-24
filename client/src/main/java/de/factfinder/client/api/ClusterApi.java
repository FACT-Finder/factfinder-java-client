/*
 * FACT-Finder REST-API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
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
import de.factfinder.client.model.DatabaseState;
import de.factfinder.client.model.DeltaUpdateResult;
import de.factfinder.client.model.ImportState;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClusterApi {
    private ApiClient localVarApiClient;

    public ClusterApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClusterApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for fullSyncUsingPOST
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fullSyncUsingPOSTCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/v4/cluster/database/sync/full";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth", "oAuth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call fullSyncUsingPOSTValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = fullSyncUsingPOSTCall(_callback);
        return localVarCall;

    }

    /**
     * Fully synchronize the worldmatch database of this node.
     * Applies missing delta updates to the worldmatch database if this node is on the same databaseVersion as the director. Otherwise it reloads the worldmatch database from postgres.
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public void fullSyncUsingPOST() throws ApiException {
        fullSyncUsingPOSTWithHttpInfo();
    }

    /**
     * Fully synchronize the worldmatch database of this node.
     * Applies missing delta updates to the worldmatch database if this node is on the same databaseVersion as the director. Otherwise it reloads the worldmatch database from postgres.
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> fullSyncUsingPOSTWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = fullSyncUsingPOSTValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Fully synchronize the worldmatch database of this node. (asynchronously)
     * Applies missing delta updates to the worldmatch database if this node is on the same databaseVersion as the director. Otherwise it reloads the worldmatch database from postgres.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fullSyncUsingPOSTAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = fullSyncUsingPOSTValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDatabaseStateUsingGET
     * @param channel channel (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDatabaseStateUsingGETCall(String channel, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/v4/cluster/{channel}/database/state"
            .replaceAll("\\{" + "channel" + "\\}", localVarApiClient.escapeString(channel.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth", "oAuth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDatabaseStateUsingGETValidateBeforeCall(String channel, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new ApiException("Missing the required parameter 'channel' when calling getDatabaseStateUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getDatabaseStateUsingGETCall(channel, _callback);
        return localVarCall;

    }

    /**
     * Show the current state of the worldmatch database.
     * 
     * @param channel channel (required)
     * @return DatabaseState
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public DatabaseState getDatabaseStateUsingGET(String channel) throws ApiException {
        ApiResponse<DatabaseState> localVarResp = getDatabaseStateUsingGETWithHttpInfo(channel);
        return localVarResp.getData();
    }

    /**
     * Show the current state of the worldmatch database.
     * 
     * @param channel channel (required)
     * @return ApiResponse&lt;DatabaseState&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DatabaseState> getDatabaseStateUsingGETWithHttpInfo(String channel) throws ApiException {
        okhttp3.Call localVarCall = getDatabaseStateUsingGETValidateBeforeCall(channel, null);
        Type localVarReturnType = new TypeToken<DatabaseState>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Show the current state of the worldmatch database. (asynchronously)
     * 
     * @param channel channel (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDatabaseStateUsingGETAsync(String channel, final ApiCallback<DatabaseState> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDatabaseStateUsingGETValidateBeforeCall(channel, _callback);
        Type localVarReturnType = new TypeToken<DatabaseState>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getImportStateUsingGET
     * @param channel channel (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getImportStateUsingGETCall(String channel, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/v4/cluster/{channel}/import/state"
            .replaceAll("\\{" + "channel" + "\\}", localVarApiClient.escapeString(channel.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth", "oAuth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getImportStateUsingGETValidateBeforeCall(String channel, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new ApiException("Missing the required parameter 'channel' when calling getImportStateUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getImportStateUsingGETCall(channel, _callback);
        return localVarCall;

    }

    /**
     * Show the import state of this node.
     * 
     * @param channel channel (required)
     * @return ImportState
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ImportState getImportStateUsingGET(String channel) throws ApiException {
        ApiResponse<ImportState> localVarResp = getImportStateUsingGETWithHttpInfo(channel);
        return localVarResp.getData();
    }

    /**
     * Show the import state of this node.
     * 
     * @param channel channel (required)
     * @return ApiResponse&lt;ImportState&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImportState> getImportStateUsingGETWithHttpInfo(String channel) throws ApiException {
        okhttp3.Call localVarCall = getImportStateUsingGETValidateBeforeCall(channel, null);
        Type localVarReturnType = new TypeToken<ImportState>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Show the import state of this node. (asynchronously)
     * 
     * @param channel channel (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getImportStateUsingGETAsync(String channel, final ApiCallback<ImportState> _callback) throws ApiException {

        okhttp3.Call localVarCall = getImportStateUsingGETValidateBeforeCall(channel, _callback);
        Type localVarReturnType = new TypeToken<ImportState>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for pruneUsingPOST
     * @param channel channel (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pruneUsingPOSTCall(String channel, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/v4/cluster/{channel}/database/prune"
            .replaceAll("\\{" + "channel" + "\\}", localVarApiClient.escapeString(channel.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth", "oAuth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call pruneUsingPOSTValidateBeforeCall(String channel, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new ApiException("Missing the required parameter 'channel' when calling pruneUsingPOST(Async)");
        }
        

        okhttp3.Call localVarCall = pruneUsingPOSTCall(channel, _callback);
        return localVarCall;

    }

    /**
     * Prune delta updates.
     * Deletes the delta updates table and increments the databaseVersion. After prune every worker has to reload the worldmatch database once to get in sync with the director. In contrast to a full re-import this does not discard any delta updates which are already applied to the intermediate database.
     * @param channel channel (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public String pruneUsingPOST(String channel) throws ApiException {
        ApiResponse<String> localVarResp = pruneUsingPOSTWithHttpInfo(channel);
        return localVarResp.getData();
    }

    /**
     * Prune delta updates.
     * Deletes the delta updates table and increments the databaseVersion. After prune every worker has to reload the worldmatch database once to get in sync with the director. In contrast to a full re-import this does not discard any delta updates which are already applied to the intermediate database.
     * @param channel channel (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> pruneUsingPOSTWithHttpInfo(String channel) throws ApiException {
        okhttp3.Call localVarCall = pruneUsingPOSTValidateBeforeCall(channel, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Prune delta updates. (asynchronously)
     * Deletes the delta updates table and increments the databaseVersion. After prune every worker has to reload the worldmatch database once to get in sync with the director. In contrast to a full re-import this does not discard any delta updates which are already applied to the intermediate database.
     * @param channel channel (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pruneUsingPOSTAsync(String channel, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = pruneUsingPOSTValidateBeforeCall(channel, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for syncDatabaseUsingPOST
     * @param channel channel (required)
     * @param verbose verbose (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict - The worldmatch database is outdated and an import (LOAD_ONLY) is necessary. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call syncDatabaseUsingPOSTCall(String channel, Boolean verbose, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/v4/cluster/{channel}/database/sync"
            .replaceAll("\\{" + "channel" + "\\}", localVarApiClient.escapeString(channel.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (verbose != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("verbose", verbose));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth", "oAuth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call syncDatabaseUsingPOSTValidateBeforeCall(String channel, Boolean verbose, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new ApiException("Missing the required parameter 'channel' when calling syncDatabaseUsingPOST(Async)");
        }
        

        okhttp3.Call localVarCall = syncDatabaseUsingPOSTCall(channel, verbose, _callback);
        return localVarCall;

    }

    /**
     * Synchronize the worldmatch database of this node.
     * Applies missing delta updates to the worldmatch database if this node is on the same databaseVersion as the director. Otherwise a reload of the worldmatch database is necessary to synchronize this node with the director.
     * @param channel channel (required)
     * @param verbose verbose (optional, default to false)
     * @return List&lt;DeltaUpdateResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict - The worldmatch database is outdated and an import (LOAD_ONLY) is necessary. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public List<DeltaUpdateResult> syncDatabaseUsingPOST(String channel, Boolean verbose) throws ApiException {
        ApiResponse<List<DeltaUpdateResult>> localVarResp = syncDatabaseUsingPOSTWithHttpInfo(channel, verbose);
        return localVarResp.getData();
    }

    /**
     * Synchronize the worldmatch database of this node.
     * Applies missing delta updates to the worldmatch database if this node is on the same databaseVersion as the director. Otherwise a reload of the worldmatch database is necessary to synchronize this node with the director.
     * @param channel channel (required)
     * @param verbose verbose (optional, default to false)
     * @return ApiResponse&lt;List&lt;DeltaUpdateResult&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict - The worldmatch database is outdated and an import (LOAD_ONLY) is necessary. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<DeltaUpdateResult>> syncDatabaseUsingPOSTWithHttpInfo(String channel, Boolean verbose) throws ApiException {
        okhttp3.Call localVarCall = syncDatabaseUsingPOSTValidateBeforeCall(channel, verbose, null);
        Type localVarReturnType = new TypeToken<List<DeltaUpdateResult>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Synchronize the worldmatch database of this node. (asynchronously)
     * Applies missing delta updates to the worldmatch database if this node is on the same databaseVersion as the director. Otherwise a reload of the worldmatch database is necessary to synchronize this node with the director.
     * @param channel channel (required)
     * @param verbose verbose (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict - The worldmatch database is outdated and an import (LOAD_ONLY) is necessary. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call syncDatabaseUsingPOSTAsync(String channel, Boolean verbose, final ApiCallback<List<DeltaUpdateResult>> _callback) throws ApiException {

        okhttp3.Call localVarCall = syncDatabaseUsingPOSTValidateBeforeCall(channel, verbose, _callback);
        Type localVarReturnType = new TypeToken<List<DeltaUpdateResult>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

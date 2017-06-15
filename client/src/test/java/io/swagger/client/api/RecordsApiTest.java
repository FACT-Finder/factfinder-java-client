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

import io.swagger.client.ApiException;
import io.swagger.client.model.ApiError;
import io.swagger.client.model.RecordWithId;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecordsApi
 */
@Ignore
public class RecordsApiTest {

    private final RecordsApi api = new RecordsApi();

    
    /**
     * Delete records
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUsingDELETETest() throws ApiException {
        String channel = null;
        List<String> recordId = null;
        Boolean save = null;
        api.deleteUsingDELETE(channel, recordId, save);

        // TODO: test validations
    }
    
    /**
     * Get records
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRecordsUsingGETTest() throws ApiException {
        String channel = null;
        List<String> recordId = null;
        List<RecordWithId> response = api.getRecordsUsingGET(channel, recordId);

        // TODO: test validations
    }
    
    /**
     * Insert records
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insertRecordsUsingPOSTTest() throws ApiException {
        String channel = null;
        List<RecordWithId> records = null;
        Boolean save = null;
        api.insertRecordsUsingPOST(channel, records, save);

        // TODO: test validations
    }
    
    /**
     * Update records
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUsingPUTTest() throws ApiException {
        String channel = null;
        List<RecordWithId> records = null;
        Boolean save = null;
        api.updateUsingPUT(channel, records, save);

        // TODO: test validations
    }
    
}

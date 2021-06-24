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

import de.factfinder.client.ApiException;
import de.factfinder.client.model.ApiError;
import de.factfinder.client.model.DatabaseState;
import de.factfinder.client.model.DeltaUpdateResult;
import de.factfinder.client.model.ImportState;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClusterApi
 */
@Ignore
public class ClusterApiTest {

    private final ClusterApi api = new ClusterApi();

    
    /**
     * Fully synchronize the worldmatch database of this node.
     *
     * Applies missing delta updates to the worldmatch database if this node is on the same databaseVersion as the director. Otherwise it reloads the worldmatch database from postgres.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fullSyncUsingPOSTTest() throws ApiException {
        api.fullSyncUsingPOST();

        // TODO: test validations
    }
    
    /**
     * Show the current state of the worldmatch database.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDatabaseStateUsingGETTest() throws ApiException {
        String channel = null;
        DatabaseState response = api.getDatabaseStateUsingGET(channel);

        // TODO: test validations
    }
    
    /**
     * Show the import state of this node.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImportStateUsingGETTest() throws ApiException {
        String channel = null;
        ImportState response = api.getImportStateUsingGET(channel);

        // TODO: test validations
    }
    
    /**
     * Prune delta updates.
     *
     * Deletes the delta updates table and increments the databaseVersion. After prune every worker has to reload the worldmatch database once to get in sync with the director. In contrast to a full re-import this does not discard any delta updates which are already applied to the intermediate database.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pruneUsingPOSTTest() throws ApiException {
        String channel = null;
        String response = api.pruneUsingPOST(channel);

        // TODO: test validations
    }
    
    /**
     * Synchronize the worldmatch database of this node.
     *
     * Applies missing delta updates to the worldmatch database if this node is on the same databaseVersion as the director. Otherwise a reload of the worldmatch database is necessary to synchronize this node with the director.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void syncDatabaseUsingPOSTTest() throws ApiException {
        String channel = null;
        Boolean verbose = null;
        List<DeltaUpdateResult> response = api.syncDatabaseUsingPOST(channel, verbose);

        // TODO: test validations
    }
    
}
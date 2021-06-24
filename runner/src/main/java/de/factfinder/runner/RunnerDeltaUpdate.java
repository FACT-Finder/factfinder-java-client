package de.factfinder.runner;

import de.factfinder.client.ApiException;
import de.factfinder.client.api.RecordsApi;
import de.factfinder.client.model.DeltaUpdateResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class RunnerDeltaUpdate {
    private static final Logger LOG = LogManager.getLogger(RunnerDeltaUpdate.class.getSimpleName());

    private static final String RECORD_ID_1 = "036-0184-0119";

    private static final String PURCHASER_ID = null;

    public static void main(final String[] args) {
        final RecordsApi apiInstance = new RecordsApi(Settings.getClient());

        //========================================== GEO =========================================
        final Boolean verbose = true;

        List<Map<String, Object>> records = Collections.emptyList();

        try {
            LOG.info("=== GET Record ===");
            records = apiInstance.getRecordsUsingGET(Settings.getChannel(), Arrays.asList(RECORD_ID_1), PURCHASER_ID, verbose).getRecords();
            LOG.info(records);

        } catch (final ApiException e) {
            LOG.error("Exception when calling RecordsApi#getRecordsUsingGet", e);
        }

        try {
            LOG.info("=== Update Record ===");
            records.get(0).put("Price", 55.3);
            final DeltaUpdateResult result = apiInstance.upsertRecordsUsingPUT(Settings.getChannel(), records, verbose).get(0);
            LOG.info("Update result {}", result.getSuccess());
            LOG.info("Update error {}", result.getError());
        } catch (final ApiException e) {
            LOG.error("Exception when calling RecordsApi#updateRecordsUsingPut", e);
        }

        try {
            LOG.info("=== GET Record again ===");
            records = apiInstance.getRecordsUsingGET(Settings.getChannel(), Arrays.asList(RECORD_ID_1), PURCHASER_ID, verbose).getRecords();
            LOG.info(records);

        } catch (final ApiException e) {
            LOG.error("Exception when calling RecordsApi#getRecordsUsingGet", e);
        }
    }
}

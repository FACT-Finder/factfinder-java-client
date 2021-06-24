package de.factfinder.runner;

import de.factfinder.client.ApiException;
import de.factfinder.client.api.RecordsApi;
import de.factfinder.client.model.CompareResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

/**
 * This class demonstrates the usage of the FACT-Finder REST API to compare products.
 */
public final class RunnerProductCompare {
    private static final Logger LOG = LogManager.getLogger(RunnerProductCompare.class.getSimpleName());

    private RunnerProductCompare() {
    }

    public static void main(final String[] args) {
        final RecordsApi recordsClient = new RecordsApi(Settings.getClient());
        /** Example record ids, this needs to be adjusted according to your data. */
        final List<String> recordIds = Arrays.asList("024-0053", "025-0037-w_43", "036-0185-0121");
        Boolean idsOnly;
        final String purchaserId = "purchaser123";

        try {
            LOG.info("=== BEGIN PRODUCT COMPARISON (NORMAL)===");
            idsOnly = false;
            final CompareResult normalCompareResult = recordsClient.compareUsingGET(Settings.getChannel(), idsOnly, recordIds, purchaserId);
            LOG.info(normalCompareResult);
            LOG.info("=== END PRODUCT COMPARISON (NORMAL) ===");

            LOG.info("=== BEGIN PRODUCT COMPARISON (IDs ONLY)===");
            idsOnly = true;
            final CompareResult idsOnlyCompareResult = recordsClient.compareUsingGET(Settings.getChannel(), idsOnly, recordIds, purchaserId);
            LOG.info(idsOnlyCompareResult);
            LOG.info("=== END PRODUCT COMPARISON (IDs ONLY) ===");
        } catch (final ApiException e) {
            LOG.error("Exception when calling CompareproductsApi#compareUsingGET", e);
        }
    }
}

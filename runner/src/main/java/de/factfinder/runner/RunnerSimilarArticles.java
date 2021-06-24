package de.factfinder.runner;

import de.factfinder.client.ApiException;
import de.factfinder.client.api.RecordsApi;
import de.factfinder.client.model.SimilarProductsWithFieldRoles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;

/**
 * This class demonstrates the usage of the FACT-Finder REST API to get similar products.
 */
public final class RunnerSimilarArticles {
    private static final Logger LOG = LogManager.getLogger(RunnerSimilarArticles.class.getSimpleName());
    private static final int MAX_ARTICLES = 10;
    /**
     * Example record id, this needs to be adjusted according to your data.
     */
    private static final String RECORD_ID = "036-0184-0119";
    private static final String ID_TYPE = "productNumber"; //or id
    private static final String PURCHASER_ID = "purchaser123";

    private RunnerSimilarArticles() {
    }

    public static void main(final String[] args) {
        final RecordsApi recordsClient = new RecordsApi(Settings.getClient());

        try {
            LOG.info("=== BEGIN SIMILAR ARTICLES (NORMAL) ===");
            final boolean idsOnly = false;
            final SimilarProductsWithFieldRoles resultWithAllFields = recordsClient.getSimilarProductsUsingGET(Settings.getChannel(), RECORD_ID, ID_TYPE, Collections.emptyList(),
                    idsOnly, PURCHASER_ID, MAX_ARTICLES);
            LOG.info(resultWithAllFields);
            LOG.info("=== END SIMILAR ARTICLES (NORMAL) ===");
        } catch (final ApiException e) {
            LOG.error("Exception when calling RecordsApi#getSimilarProductsUsingGET", e);
        }
    }
}

package de.factfinder.runner;

import de.factfinder.client.ApiException;
import de.factfinder.client.api.RecordsApi;
import de.factfinder.client.model.RecommendationResultWithFieldRoles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;

/**
 * This class demonstrates the usage of the FACT-Finder REST API to get recommendations for one or multiple products.
 */
public final class RunnerRecommender {
    private static final Logger LOG = LogManager.getLogger(RunnerRecommender.class.getSimpleName());
    private static final int MAX_RETURN_RECORDS = 10;
    private static final String CHANNEL = Settings.getChannel();
    private static final boolean USE_PERSONALIZATION = true;

    /**
     * Example record ids, this needs to be adjusted according to your data.
     */
    private static final String RECORD_ID_1 = "036-0185-0121";
    private static final String SESSION_ID = "sessionid";
    private static final String PURCHASER_ID = "purchaser123";

    private RunnerRecommender() {
    }

    public static void main(final String[] args) {
        final RecordsApi apiInstance = new RecordsApi(Settings.getClient());

        try {
            LOG.info("==== BEGIN RECOMMENDATION RESULT ====");
            final boolean idsOnly = false;
            RecommendationResultWithFieldRoles recommendation = apiInstance.getRecommendationUsingGET(CHANNEL, Collections.singletonList(RECORD_ID_1),
                    MAX_RETURN_RECORDS, SESSION_ID, Collections.emptyList(), idsOnly,
                    USE_PERSONALIZATION, PURCHASER_ID);

            LOG.info(recommendation.getHits());
            LOG.info("==== END RECOMMENDATION RESULT ====");

        } catch (final ApiException e) {
            LOG.error("Exception when calling RecommendationApi#getRecommendationUsingGET", e);
        }
    }
}

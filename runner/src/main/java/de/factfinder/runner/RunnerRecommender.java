package de.factfinder.runner;

import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.runner.print.SearchResultInformationPrinter;
import io.swagger.client.ApiException;
import io.swagger.client.api.RecommendationApi;
import io.swagger.client.model.RecommendationResult;
import io.swagger.client.model.RecordWithId;

import static java.util.Arrays.asList;

/**
 * This class demonstrates the usage of the FACT-Finder REST API to get recommendations for one or multiple products.
 */
public final class RunnerRecommender {
	private static final Logger  LOG                 = LogManager.getLogger(RunnerRecommender.class.getSimpleName());
	private static final int     MAX_RETURN_RECORDS  = 10;
	private static final String  CHANNEL             = Settings.getChannel();
	private static final boolean USE_PERSONALIZATION = true;

	/** Example record ids, this needs to be adjusted according to your data. */
	private static final String RECORD_ID_1 = "41089ef3023a91e9b6dbf0013e319";
	private static final String RECORD_ID_2 = "4651e9e72376cd8110c6155978ffb";
	private static final String SESSION_ID  = "sessionid";

	private RunnerRecommender() {
	}

	public static void main(final String[] args) {
		Settings.setupAuthKeyRefreshingClientWithHigherTimeout();

		final SearchResultInformationPrinter searchResultInfoPrinter = new SearchResultInformationPrinter();

		final RecommendationApi apiInstance = new RecommendationApi();
		boolean idsOnly;

		try {
			LOG.info("==== BEGIN RECOMMENDATION RESULT (NORMAL) ====");
			idsOnly = false;
			RecommendationResult recommendation = apiInstance.getRecommendationUsingGET(CHANNEL, Collections.singletonList(RECORD_ID_1), MAX_RETURN_RECORDS,
																						SESSION_ID, idsOnly, USE_PERSONALIZATION);
			printResult(searchResultInfoPrinter, recommendation.getResultRecords());
			LOG.info("==== END RECOMMENDATION RESULT (NORMAL) ====");

			LOG.info("==== BEGIN RECOMMENDATION RESULT (IDs ONLY) ====");
			idsOnly = true;
			recommendation = apiInstance.getRecommendationUsingGET(CHANNEL, Collections.singletonList(RECORD_ID_1), MAX_RETURN_RECORDS, SESSION_ID, idsOnly,
																   USE_PERSONALIZATION);

			// NOTE: when using the idsOnly-mode, the returned record-id is the value from the matchOnField which might not be the normal record-id.
			printResult(searchResultInfoPrinter, recommendation.getResultRecords());
			LOG.info("==== END RECOMMENDATION RESULT (IDs ONLY) ====");

			LOG.info("==== BEGIN RECOMMENDATION RESULT (MULTI PRODUCTS; IDs ONLY) ====");
			idsOnly = true;
			recommendation = apiInstance.getRecommendationUsingGET(CHANNEL, asList(RECORD_ID_1, RECORD_ID_2), MAX_RETURN_RECORDS, SESSION_ID, idsOnly,
																   USE_PERSONALIZATION);

			printResult(searchResultInfoPrinter, recommendation.getResultRecords());
			LOG.info("==== END RECOMMENDATION RESULT (MULTI PRODUCTS; IDs ONLY) ====");
		} catch (final ApiException e) {
			LOG.error("Exception when calling RecommendationApi#getRecommendationUsingGET", e);
		}
	}

	private static void printResult(final SearchResultInformationPrinter searchResultInfoPrinter, final List<RecordWithId> records) {
		if (records != null && !records.isEmpty()) {
			records.forEach(searchResultInfoPrinter::printRecord);
		} else {
			LOG.info("No recommendations received.");
		}
	}
}

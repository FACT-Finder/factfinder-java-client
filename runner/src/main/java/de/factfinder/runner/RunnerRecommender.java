package de.factfinder.runner;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.ffrecommender.FFRecommender;
import de.factfinder.ffrecommender.ResultRecord;
import de.factfinder.runner.print.SearchResultInformationPrinter;

/**
 * This class demonstrates the usage of the FACT-Finder JSON API to get recommendations for one or multiple products.
 *
 */
public final class RunnerRecommender {
	private static final Logger	LOG					= LogManager.getLogger(RunnerRecommender.class.getSimpleName());
	private static final int	MAX_RETURN_RECORDS	= 10;
	private static final String	CHANNEL				= Settings.getChannel();
	/** Example product id, this needs to be adjusted according to your data. */
	private static final String	RECORD_ID_1		= "41089ef3023a91e9b6dbf0013e319";

	private RunnerRecommender() {
	}

	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());
		final SearchResultInformationPrinter searchResultInfoPrinter = new SearchResultInformationPrinter();

		LOG.info("==== BEGIN RECOMMENDATION RESULT (NORMAL) ====");
		FFRecommender recommendation = api.getRecommendations(CHANNEL, Arrays.asList(RECORD_ID_1), MAX_RETURN_RECORDS, false);
		printResult(searchResultInfoPrinter, recommendation.getResultRecords());
		LOG.info("==== END RECOMMENDATION RESULT (NORMAL) ====");

		LOG.info("==== BEGIN RECOMMENDATION RESULT (IDs ONLY) ====");
		recommendation = api.getRecommendations(CHANNEL, Arrays.asList(RECORD_ID_1), MAX_RETURN_RECORDS, true);

		// NOTE: when using the idsOnly-mode, the returned record-id is the value from the matchOnField which might not be the normal record-id.
		printResult(searchResultInfoPrinter, recommendation.getResultRecords());
		LOG.info("==== END RECOMMENDATION RESULT (IDs ONLY) ====");

		LOG.info("==== BEGIN RECOMMENDATION RESULT (MULTI PRODUCTS; IDs ONLY) ====");
		final String productId2 = "4651e9e72376cd8110c6155978ffb";
		recommendation = api.getRecommendations(CHANNEL, Arrays.asList(RECORD_ID_1, productId2), MAX_RETURN_RECORDS, true);

		printResult(searchResultInfoPrinter, recommendation.getResultRecords());
		LOG.info("==== END RECOMMENDATION RESULT (MULTI PRODUCTS; IDs ONLY) ====");

	}

	private static void printResult(final SearchResultInformationPrinter searchResultInfoPrinter, final List<ResultRecord> records) {
		if (records != null && !records.isEmpty()) {
			for (final ResultRecord rec : records) {
				LOG.info("Record: id=" + rec.getId());
				searchResultInfoPrinter.printRecord(rec.getRecord());
			}
		} else {
			LOG.info("No recommendations received.");
		}
	}
}

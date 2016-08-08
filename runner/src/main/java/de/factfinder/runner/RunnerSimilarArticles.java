package de.factfinder.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.ffsimilarrecords.FFSimilarRecords;
import de.factfinder.ffsimilarrecords.SimilarityRecord;
import de.factfinder.runner.print.SearchResultInformationPrinter;

/**
 * This class demonstrates the usage of the FACT-Finder JSON API to get similar products.
 *
 */
public final class RunnerSimilarArticles {
	private static final Logger	LOG				= LogManager.getLogger(RunnerSimilarArticles.class.getCanonicalName());
	private static final String	CHANNEL			= Settings.getChannel();
	private static final int	MAX_ARTICLES	= 10;
	/** Example product id, this needs to be adjusted according to your data. */
	private static final String	RECORD_ID		= "3c03883d695c0e311c3bd106ba916";

	private RunnerSimilarArticles() {
	}

	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());

		final SearchResultInformationPrinter srip = new SearchResultInformationPrinter();

		LOG.info("=== BEGIN SIMILAR ARTICLES (NORMAL) ===");
		FFSimilarRecords result = api.getSimilarRecords(CHANNEL, RECORD_ID, MAX_ARTICLES);
		print(result, srip);
		LOG.info("=== END SIMILAR ARTICLES (NORMAL) ===");

		LOG.info("=== BEGIN SIMILAR ARTICLES (IDs ONLY) ===");
		result = api.getSimilarRecords(CHANNEL, RECORD_ID, MAX_ARTICLES, true);
		print(result, srip);
		LOG.info("=== END SIMILAR ARTICLES (IDs ONLY) ===");
	}

	private static void print(final FFSimilarRecords result, final SearchResultInformationPrinter srip) {
		for (final SimilarityRecord rec : result.getRecords()) {
			LOG.info("Record: id=" + rec.getId());
			srip.printRecord(rec.getRecord());
		}
	}
}

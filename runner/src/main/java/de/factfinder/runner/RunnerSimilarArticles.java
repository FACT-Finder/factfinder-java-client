package de.factfinder.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.ffsimilarrecords.FFSimilarRecords;
import de.factfinder.ffsimilarrecords.SimilarityRecord;
import de.factfinder.runner.print.SearchResultInformationPrinter;

public class RunnerSimilarArticles {
	private static final Logger	LOG		= LogManager.getLogger(RunnerSimilarArticles.class.getCanonicalName());
	private static final String	CHANNEL	= Settings.getChannel();

	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());

		final SearchResultInformationPrinter srip = new SearchResultInformationPrinter();

		final int maxArticles = 10;
		final String recordId = "3c03883d695c0e311c3bd106ba916";

		FFSimilarRecords result = api.getSimilarRecords(CHANNEL, recordId, maxArticles);

		LOG.info("=== BEGIN SIMILAR ARTICLES (NORMAL) ===");
		print(result, srip);
		LOG.info("=== END SIMILAR ARTICLES (NORMAL) ===");

		LOG.info("=== BEGIN SIMILAR ARTICLES (IDs ONLY) ===");
		result = api.getSimilarRecords(CHANNEL, recordId, maxArticles, true);
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

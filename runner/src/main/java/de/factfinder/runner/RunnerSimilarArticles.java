package de.factfinder.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.runner.print.SearchResultInformationPrinter;
import io.swagger.client.ApiException;
import io.swagger.client.api.SimilarproductsApi;
import io.swagger.client.model.SimilarProducts;

/**
 * This class demonstrates the usage of the FACT-Finder REST API to get similar products.
 */
public final class RunnerSimilarArticles {
	private static final Logger LOG          = LogManager.getLogger(RunnerSimilarArticles.class.getSimpleName());
	private static final int    MAX_ARTICLES = 10;
	/** Example record id, this needs to be adjusted according to your data. */
	private static final String RECORD_ID    = "3c03883d695c0e311c3bd106ba916";

	private RunnerSimilarArticles() {
	}

	public static void main(final String[] args) {
		Settings.setupAuthKeyRefreshingClientWithHigherTimeout();

		final SearchResultInformationPrinter searchResultInfoPrinter = new SearchResultInformationPrinter();

		final SimilarproductsApi apiInstance = new SimilarproductsApi();
		Boolean idsOnly;

		try {
			LOG.info("=== BEGIN SIMILAR ARTICLES (NORMAL) ===");
			idsOnly = false;
			final SimilarProducts resultWithAllFields = apiInstance.getSimilarProductsUsingGET(Settings.getChannel(), RECORD_ID, idsOnly, MAX_ARTICLES);
			resultWithAllFields.getRecords().forEach(searchResultInfoPrinter::printRecord);
			LOG.info("=== END SIMILAR ARTICLES (NORMAL) ===");

			LOG.info("=== BEGIN SIMILAR ARTICLES (IDs ONLY) ===");
			idsOnly = true;
			final SimilarProducts resultWithIdsOnly = apiInstance.getSimilarProductsUsingGET(Settings.getChannel(), RECORD_ID, idsOnly, MAX_ARTICLES);
			resultWithIdsOnly.getRecords().forEach(searchResultInfoPrinter::printRecord);
			LOG.info("=== END SIMILAR ARTICLES (IDs ONLY) ===");
		} catch (final ApiException e) {
			LOG.error("Exception when calling SimilarproductsApi#getSimilarProductsUsingGET", e);
		}
	}
}

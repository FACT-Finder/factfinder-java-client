package de.factfinder.runner;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.api.SearchParams;
import de.factfinder.api.utils.FilterBuilder;
import de.factfinder.ffresult.SearchControlParams;
import de.factfinder.ffresult.SearchResult;
import de.factfinder.runner.print.SearchResultInformationPrinter;

/**
 * This class demonstrates the usage of the FACT-Finder JSON API for search results.
 *
 */
public final class RunnerSearch {
	private static final Logger	LOG	= LogManager.getLogger(RunnerSearch.class.getSimpleName());

	private RunnerSearch() {
	}

	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());

		final SearchParams params = new SearchParams();
		params.setChannel(Settings.getChannel());
		params.setQuery("shoe");
		params.setProductsPerPage(10);

		// if you want to add filters there is a filter builder
		params.setFilters(Arrays.asList(FilterBuilder.withName("Gender").valueIs("Kids").andValueIsNot("Men").orValueIs("Woman").asFilter()));

		final SearchControlParams searchControlParams = new SearchControlParams();
		// if you want to minimize the response size set this to true. This will only return the id's of the records.
		searchControlParams.setIdsOnly(false);

		final SearchResult result = api.search(params, searchControlParams).getSearchResult();

		final SearchResultInformationPrinter searchInfoPrinter = new SearchResultInformationPrinter();

		LOG.info("==== BEGIN SEARCH PARAMETERS SENT ====");
		searchInfoPrinter.printSearchParameters(params);
		LOG.info("==== END SEARCH PARAMETERS SENT ====\n");

		if (result.getResultStatus() == SearchResult.ResultStatus.RESULTS_FOUND) {
			LOG.info("==== BEGIN SEARCH PARAMETERS RETURNED ====");
			LOG.info(result.getSearchParams());
			LOG.info("==== END SEARCH PARAMETERS RETURNED ====\n");

			LOG.info("==== BEGIN SEARCH RESULT ====");
			searchInfoPrinter.printSearchResult(result);
			LOG.info("==== END SEARCH RESULT ====\n");

		} else {
			LOG.info("An unknown error occurred while searching. Please check the logs of the search application.");
		}
	}
}

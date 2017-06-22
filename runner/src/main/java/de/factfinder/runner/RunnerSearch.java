package de.factfinder.runner;

import java.util.Arrays;
import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.runner.print.SearchResultInformationPrinter;
import io.swagger.client.ApiException;
import io.swagger.client.api.SearchApi;
import io.swagger.client.model.Filter;
import io.swagger.client.model.FilterValue;
import io.swagger.client.model.Params;
import io.swagger.client.model.Result;
import io.swagger.client.model.SearchControlParams;
import io.swagger.client.model.SearchRequest;

/**
 * This class demonstrates the usage of the FACT-Finder REST API for search results.
 *
 * The search call uses example search data, you can adjust it according to your search database.
 */
public final class RunnerSearch {
	private static final Logger LOG = LogManager.getLogger(RunnerSearch.class.getSimpleName());

	private RunnerSearch() {
	}

	public static void main(final String[] args) {
		Settings.setupAuthKeyRefreshingClientWithHigherTimeout();

		final SearchResultInformationPrinter searchInfoPrinter = new SearchResultInformationPrinter();

		final SearchApi apiInstance = new SearchApi();
		final Params params = getParams();
		final SearchRequest searchRequest = new SearchRequest();
		searchRequest.setParams(params);
		searchRequest.setSearchControlParams(getSearchControlParams());

		try {
			final Result result = apiInstance.searchUsingPOST(searchRequest);

			LOG.info("==== BEGIN SEARCH PARAMETERS SENT ====");
			searchInfoPrinter.printSearchParameters(params);
			LOG.info("==== END SEARCH PARAMETERS SENT ====\n");

			if (result.getResultStatus() == Result.ResultStatusEnum.RESULTSFOUND) {
				LOG.info("==== BEGIN SEARCH PARAMETERS RETURNED ====");
				LOG.info(result.getSearchParams());
				LOG.info("==== END SEARCH PARAMETERS RETURNED ====\n");

				LOG.info("==== BEGIN SEARCH RESULT ====");
				searchInfoPrinter.printSearchResult(result);
				LOG.info("==== END SEARCH RESULT ====\n");
			} else {
				LOG.info("An unknown error occurred while searching. Please check the logs of the search application.");
			}
		} catch (final ApiException e) {
			LOG.error("Exception when calling SearchApi#searchUsingPOST", e);
		}
	}

	private static SearchControlParams getSearchControlParams() {
		final SearchControlParams searchControlParams = new SearchControlParams();
		// if you want to minimize the response size set this to true. This will only return the id's of the records.
		searchControlParams.setIdsOnly(false);

		return searchControlParams;
	}

	private static Params getParams() {
		final Filter filter = new Filter();
		filter.setName("Gender");
		final FilterValue value1 = new FilterValue();
		value1.setValue("Kids");
		final FilterValue value2 = new FilterValue();
		value2.setValue("Men");
		value2.setExclude(true);
		value2.setType(FilterValue.TypeEnum.AND);
		final FilterValue value3 = new FilterValue();
		value3.setValue("Woman");
		value3.setType(FilterValue.TypeEnum.OR);
		filter.setValueList(Arrays.asList(value1, value2, value3));

		final Params params = new Params();
		params.setQuery("shoe");
		params.setResultsPerPage(10);
		params.setChannel(Settings.getChannel());
		params.setFilters(Collections.singletonList(filter));

		return params;
	}
}

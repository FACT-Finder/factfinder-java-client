package de.factfinder.runner;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.client.ApiException;
import de.factfinder.client.api.SuggestApi;
import de.factfinder.client.model.ResultSuggestion;

/**
 * This class demonstrates the usage of the FACT-Finder REST API for suggest results.
 */
public final class RunnerSuggest {
	private static final Logger LOG = LogManager.getLogger(RunnerSuggest.class.getSimpleName());

	private RunnerSuggest() {
	}

	public static void main(final String[] args) {
		Settings.setupAuthKeyRefreshingClientWithHigherTimeout();

		final SuggestApi apiInstance = new SuggestApi();

		// the search terms are examples for different inputs into the search box
		final List<String> queries = Arrays.asList("sh", "sho", "shoe", "shoes");

		try {
			for (final String query : queries) {
				final List<ResultSuggestion> result = apiInstance.getSuggestionsUsingGET(Settings.getChannel(), query);
				printSuggestions(result, query);
			}
		} catch (final ApiException e) {
			LOG.error("Exception when calling SuggestApi#getSuggestionsUsingGET", e);
		}
	}

	private static void printSuggestions(final List<ResultSuggestion> suggestions, final String query) {
		LOG.info("Found " + suggestions.size() + " suggest entries for search term [" + query + ']');
		for (final ResultSuggestion suggestion : suggestions) {
			LOG.info("\tsearch term=[" + suggestion.getName() + "], type=[" + suggestion.getType() + "], hit count=" + suggestion.getHitCount());
		}
	}
}

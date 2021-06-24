package de.factfinder.runner;

import de.factfinder.client.ApiException;
import de.factfinder.client.api.SearchApi;
import de.factfinder.client.model.ResultSuggestion;
import de.factfinder.client.model.SuggestParams;
import de.factfinder.client.model.SuggestionResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

/**
 * This class demonstrates the usage of the FACT-Finder REST API for suggest results.
 */
public final class RunnerSuggest {
    private static final Logger LOG = LogManager.getLogger(RunnerSuggest.class.getSimpleName());

    private RunnerSuggest() {
    }

    public static void main(final String[] args) {
        final SearchApi suggestClient = new SearchApi(Settings.getClient());

        // the search terms are examples for different inputs into the search box
        final List<String> queries = Arrays.asList("sh", "sho", "shoe", "shoes");

        try {
            for (final String query : queries) {
                final SuggestParams params = new SuggestParams();
                params.setSid("1234");
                params.setQuery(query);
                params.setChannel(Settings.getChannel());

                final SuggestionResult result = suggestClient.getSuggestionsUsingPOST(params);
                printSuggestions(result, query);
            }
        } catch (final ApiException e) {
            LOG.error("Exception when calling SuggestApi#getSuggestionsUsingGET", e);
        }
    }

    private static void printSuggestions(final SuggestionResult suggestionResult, final String query) {
        final List<ResultSuggestion> suggestions = suggestionResult.getSuggestions();
        LOG.info("Found {} suggest entries for search term [{}]", suggestions.size(), query);

        for (final ResultSuggestion suggestion : suggestions) {
            LOG.info("\t{}", suggestion.toString());
        }
    }
}

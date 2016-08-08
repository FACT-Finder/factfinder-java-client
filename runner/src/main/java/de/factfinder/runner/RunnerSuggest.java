package de.factfinder.runner;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.ffsuggest.FFSuggest;
import de.factfinder.ffsuggest.Suggestion;

/**
 * This class demonstrates the usage of the FACT-Finder JSON API for suggest results.
 *
 */
public class RunnerSuggest {
	private static final Logger	LOG	= LogManager.getLogger(RunnerSuggest.class.getSimpleName());

	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());

		final List<String> searchTerms = Arrays.asList("sh", "sho", "shoe", "shoes");

		for (final String searchTerm : searchTerms) {
			final FFSuggest result = api.getSuggestions(Settings.getChannel(), searchTerm);
			printSuggestions(result, searchTerm);
		}
	}

	private static void printSuggestions(final FFSuggest suggest, final String searchTerm) {
		LOG.info("Found " + suggest.getSuggestions().size() + " suggest entries for search term [" + searchTerm + ']');
		for (final Suggestion suggestion : suggest.getSuggestions()) {
			// By default the list is limited to 10 entries. This value can be configured by Omikron.
			LOG.info("search term=[" + suggestion.getName() + "], type=[" + suggestion.getType() + "], hit count=" + suggestion.getHitCount());
		}
	}
}

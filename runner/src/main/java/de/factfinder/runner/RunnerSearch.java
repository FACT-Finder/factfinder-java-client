package de.factfinder.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.api.SearchParams;
import de.factfinder.api.utils.FilterBuilder;
import de.factfinder.ffresult.SearchControlParams;
import de.factfinder.ffresult.SearchResult;
import de.factfinder.ffsuggest.FFSuggest;
import de.factfinder.ffsuggest.Suggestion;
import de.factfinder.runner.print.SearchResultInformationPrinter;

/**
 * This class demonstrates the usage of the FACT-Finder JSON API for search results.
 *
 */
public class RunnerSearch {
	private static final Logger	LOG	= LogManager.getLogger(RunnerSearch.class.getSimpleName());

	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());

		final SearchParams params = new SearchParams();
		params.setQuery("shoe");
		params.setChannel(Settings.getChannel());
		params.setNoArticleNumberSearch(true);
		// if you want to add filters there is a filterbuilder
		params.getFilters().add(FilterBuilder.withName("Gender").valueIs("Kids").andValueIsNot("Men").orValueIs("Woman").asFilter());

		// we can set here search control parameters e.g. deactivate the asn.
		final SearchControlParams searchControlParams = new SearchControlParams();
		// if you want to disable the cache set this to true
		searchControlParams.setDisableCache(true);
		// if you're using the advisor campaign type and want to receive the complete advisor tree set this to true
		searchControlParams.setGenerateAdvisorTree(true);
		// if you want to minimize the response size set this to true. This will only return the id's of the records and not the whole record.
		searchControlParams.setIdsOnly(false);
		// if you want the asn to be generated set this to true.
		searchControlParams.setUseAsn(true);
		// if you want to use the campaign manager set this to true.
		searchControlParams.setUseCampaigns(true);
		// if true a list of found words per record will be generated.
		searchControlParams.setUseFoundWords(true);
		// only relevant if your using SEO. If true this will return keywords related to each record.
		searchControlParams.setUseKeywords(true);

		final SearchResult result = api.search(params, searchControlParams).getSearchResult();

		final SearchResultInformationPrinter searchInfoPrinter = new SearchResultInformationPrinter();

		LOG.info("==== BEGIN SEARCH PARAMETERS SENT ====");
		searchInfoPrinter.printSearchParameters(params);
		LOG.info("==== END SEARCH PARAMETERS SENT ====\n");

		if (result.getResultStatus() == SearchResult.ResultStatus.RESULTS_FOUND) {
			// After searching the search parameters which weren't set before are initialized with default values. I.e. if you don't specify a channel, it
			// will be set with the default channel. Which of your channels is the default channel can be configured by Omikron.
			LOG.info("==== BEGIN SEARCH PARAMETERS RETURNED ====");
			LOG.info(result.getSearchParams());
			LOG.info("==== END SEARCH PARAMETERS RETURNED ====\n");

			// Show the found records of the current page. If you don't want to request the result page by page you can set the "results per page" in the
			// search parameters to a high value like Integer.MAX_VALUE. Please notice that this can lead to huge responses with up to several MB per
			// request. Consider the performance drawback.
			LOG.info("==== BEGIN SEARCH RESULT ====");
			searchInfoPrinter.printSearchResult(result);
			LOG.info("==== END SEARCH RESULT ====\n");

			LOG.info("==== BEGIN RESULT GROUPS ====");
			searchInfoPrinter.printAfterSearchNavigation(result);
			LOG.info("==== END RESULT GROUPS ====");

		} else {
			LOG.info("An unknown error occurred while searching. Please check the logs of the search application.");
		}
	}
}

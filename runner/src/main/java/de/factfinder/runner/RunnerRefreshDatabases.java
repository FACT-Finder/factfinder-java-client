package de.factfinder.runner;

import static java.util.Arrays.asList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.api.FFApiException;

/**
 * This class demonstrates the usage of the FACT-Finder JSON API to refresh the search and suggest databases.
 *
 */
public final class RunnerRefreshDatabases {
	private static final Logger	LOG		= LogManager.getLogger(RunnerRefreshDatabases.class.getSimpleName());
	private static final String	CHANNEL	= Settings.getChannel();

	private RunnerRefreshDatabases() {
	}

	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());

		try {

			LOG.info("Refresh search database for channel: " + CHANNEL);
			api.refreshDatabases(asList(CHANNEL));

			LOG.info("Refresh suggest database for channel: " + CHANNEL);
			api.refreshSuggestDatabases(asList(CHANNEL));

			LOG.info("Refresh recommender database for channel: " + CHANNEL);
			api.refreshRecommenderDatabases(asList(CHANNEL));

			LOG.info("Refresh all databases for channel: " + CHANNEL);
			api.refreshAllDatabases(asList(CHANNEL));

			LOG.info("Refresh all search databases");
			api.refreshDatabases();

			LOG.info("Refresh all suggest databases");
			api.refreshSuggestDatabases();

			LOG.info("Refresh all recommender databases");
			api.refreshRecommenderDatabases();

			LOG.info("Refresh all databases");
			api.refreshAllDatabases();

		} catch (final FFApiException e) {
			LOG.error("An error occurred: " + e.getResponseMessage());
			LOG.error(e.getResponseStacktrace());
		}
	}
}

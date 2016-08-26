package de.factfinder.runner;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;

import static java.util.Arrays.asList;

/**
 * This class demonstrates the usage of the FACT-Finder JSON API to refresh the search and suggest databases.
 *
 */
public final class RunnerRefreshDatabases {
	private static final Logger	LOG	= LogManager.getLogger(RunnerRefreshDatabases.class.getSimpleName());
	private static final String CHANNEL = Settings.getChannel();

	private RunnerRefreshDatabases() {
	}

	public static void main(String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());

		LOG.info("Refresh search database for channel: " + CHANNEL);
		api.refreshDatabases(asList(CHANNEL));

		LOG.info("Refresh suggest database for channel: " + CHANNEL);
		api.refreshSuggestDatabases(asList(CHANNEL));

		LOG.info("Refresh all search databases");
		api.refreshDatabases();

		LOG.info("Refresh all suggest databases");
		api.refreshSuggestDatabases();
	}
}

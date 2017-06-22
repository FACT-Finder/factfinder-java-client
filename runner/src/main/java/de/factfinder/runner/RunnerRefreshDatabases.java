package de.factfinder.runner;

import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.swagger.client.ApiException;
import io.swagger.client.api.RefreshdatabasesApi;

/**
 * This class demonstrates the usage of the FACT-Finder REST API to refresh the search and suggest databases.
 */
public final class RunnerRefreshDatabases {
	private static final Logger LOG     = LogManager.getLogger(RunnerRefreshDatabases.class.getSimpleName());
	private static final String CHANNEL = Settings.getChannel();

	private RunnerRefreshDatabases() {
	}

	public static void main(final String[] args) {
		Settings.setupAuthKeyRefreshingClientWithHigherTimeout();

		final RefreshdatabasesApi apiInstance = new RefreshdatabasesApi();

		try {
			LOG.info("Refresh all databases for channel: " + CHANNEL);
			apiInstance.refreshAllDatabasesUsingPOST(Collections.singletonList(CHANNEL));

			LOG.info("Refresh all databases");
			apiInstance.refreshAllDatabasesUsingPOST(Collections.emptyList());
		} catch (final ApiException e) {
			LOG.error("Exception when calling RefreshdatabasesApi#refreshAllDatabasesUsingPOST", e);
		}

		try {
			LOG.info("Refresh recommender database for channel: " + CHANNEL);
			apiInstance.refreshRecommendationDatabasesUsingPOST(Collections.singletonList(CHANNEL));

			LOG.info("Refresh all recommender databases");
			apiInstance.refreshRecommendationDatabasesUsingPOST(Collections.emptyList());
		} catch (final ApiException e) {
			LOG.error("Exception when calling RefreshdatabasesApi#refreshRecommendationDatabasesUsingPOST", e);
		}

		try {
			LOG.info("Refresh suggest database for channel: " + CHANNEL);
			apiInstance.refreshSuggestDatabasesUsingPOST(Collections.singletonList(CHANNEL));

			LOG.info("Refresh all suggest databases");
			apiInstance.refreshSuggestDatabasesUsingPOST(Collections.emptyList());
		} catch (final ApiException e) {
			LOG.error("Exception when calling RefreshdatabasesApi#refreshSuggestDatabasesUsingPOST", e);
		}

		try {
			LOG.info("Refresh search database for channel: " + CHANNEL);
			apiInstance.refreshSearchDatabasesUsingPOST(Collections.singletonList(CHANNEL));

			LOG.info("Refresh all search databases");
			apiInstance.refreshSearchDatabasesUsingPOST(Collections.emptyList());
		} catch (final ApiException e) {
			LOG.error("Exception when calling RefreshdatabasesApi#refreshSearchDatabasesUsingPOST", e);
		}
	}
}

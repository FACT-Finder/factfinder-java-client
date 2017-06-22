package de.factfinder.runner;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.swagger.client.ApiException;
import io.swagger.client.api.TagcloudApi;
import io.swagger.client.model.TagCloudEntry;

/**
 * This class demonstrates the usage of the FACT-Finder REST API for requesting the tag cloud.
 */
public final class RunnerTagCloud {
	private static final Logger LOG = LogManager.getLogger(RunnerTagCloud.class.getSimpleName());

	private RunnerTagCloud() {
	}

	public static void main(final String[] args) {
		Settings.setupAuthKeyRefreshingClientWithHigherTimeout();

		final TagcloudApi apiInstance = new TagcloudApi();
		final Integer numberOfEntriesToBeReturned = 10;

		try {
			final List<TagCloudEntry> result = apiInstance.getTagCloudUsingGET(Settings.getChannel(), numberOfEntriesToBeReturned);

			LOG.info("=== BEGIN TAGCLOUD ENTRIES ===");
			result.forEach(entry -> LOG.info("entry term=[" + entry.getSearchTerm() + "], weight=[" + entry.getWeight() + "]"));
			LOG.info("=== END TAGCLOUD ENTRIES ===");
		} catch (final ApiException e) {
			LOG.error("Exception when calling TagcloudApi#getTagCloudUsingGET", e);
		}
	}
}

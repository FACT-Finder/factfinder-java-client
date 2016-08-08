package de.factfinder.runner;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.fftagcloud.FFTagCloud;

/**
 * This class demonstrates the usage of the FACT-Finder JSON API for requesting the tag cloud.
 *
 */
public final class RunnerTagCloud {
	private static final Logger	LOG	= LogManager.getLogger(RunnerTagCloud.class.getSimpleName());

	private RunnerTagCloud() {
	}

	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());

		final List<FFTagCloud> result = api.getTagCloud(Settings.getChannel(), 10);

		LOG.info("=== BEGIN TAGCLOUD ENTRIES ===");
		result.forEach(entry -> LOG.info("entry term=[" + entry.getQuery() + "], weight=[" + entry.getWeight() + "]"));
		LOG.info("=== END TAGCLOUD ENTRIES ===");
	}
}

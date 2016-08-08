package de.factfinder.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.ffdatabaseexpiration.FFDatabaseExpiration;

/**
 * This class demonstrates the usage of the FACT-Finder JSON API to check if the channel resources are up-to-date.
 *
 */
public final class RunnerDatabaseExpiration {
	private static final Logger	LOG	= LogManager.getLogger(RunnerDatabaseExpiration.class.getSimpleName());

	private RunnerDatabaseExpiration() {
	}

	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());

		FFDatabaseExpiration result = api.getDatabaseExpiration();

		for (final String channel : result.keySet()) {
			LOG.info("Channel: " + channel);
			result.get(channel).forEach(message -> LOG.info("\t" + message));
		}
	}
}

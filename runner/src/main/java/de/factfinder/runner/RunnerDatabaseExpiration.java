package de.factfinder.runner;

import java.util.ArrayList;
import java.util.Map;

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

		final FFDatabaseExpiration result = api.getDatabaseExpiration();

		for (final Map.Entry<String, ArrayList<String>> entry : result.entrySet()) {
			LOG.info("Channel: " + entry.getKey());
			entry.getValue().forEach(message -> LOG.info("\t" + message));
		}
	}
}

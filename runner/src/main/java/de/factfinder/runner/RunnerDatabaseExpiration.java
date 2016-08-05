package de.factfinder.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.ffdatabaseexpiration.FFDatabaseExpiration;

public class RunnerDatabaseExpiration {
	private static final Logger	LOG	= LogManager.getLogger(RunnerDatabaseExpiration.class.getSimpleName());

	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());

		FFDatabaseExpiration result = api.getDatabaseExpiration();

		for (final String channel : result.keySet()) {
			LOG.info("Channel: " + channel);
			result.get(channel).forEach(message -> LOG.info("\t" + message));
		}

	}
}

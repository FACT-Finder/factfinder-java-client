package de.factfinder.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.ffimport.FFImport;

/**
 * This class demonstrates the usage of the FACT-Finder JSON API to externally trigger product data and suggest imports.
 */
public final class RunnerImport {
	private static final Logger LOG     = LogManager.getLogger(RunnerImport.class.getSimpleName());
	private static final String CHANNEL = Settings.getChannel();

	private RunnerImport() {
	}

	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());

		LOG.info("Start product data import");
		FFImport result = api.startImport(CHANNEL);

		result.getErrors().forEach(LOG::error);
		result.getStatus().forEach(LOG::info);

		LOG.info("Start suggest data import");
		result = api.startSuggestImport(CHANNEL);
		result.getErrors().forEach(LOG::error);
		result.getStatus().forEach(LOG::info);
	}

}

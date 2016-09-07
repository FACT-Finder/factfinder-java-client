package de.factfinder.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.api.FFApiActions;
import de.factfinder.api.FFApiException;
import de.factfinder.api.FFApiTimeoutConfig;
import de.factfinder.ffimport.FFImport;

/**
 * This class demonstrates the usage of the FACT-Finder JSON API to externally trigger product data and suggest imports.
 */
public final class RunnerImport {
	private static final Logger	LOG		= LogManager.getLogger(RunnerImport.class.getSimpleName());
	private static final String	CHANNEL	= Settings.getChannel();

	private RunnerImport() {
	}

	public static void main(final String[] args) {
		final FFApiTimeoutConfig timeoutConfig = new FFApiTimeoutConfig();

		// set read timeout of the import to 10 minutes
		timeoutConfig.setReadTimeout(FFApiActions.IMPORT, 60 * 10);

		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication(), timeoutConfig);

		try {

			LOG.info("Start product data import");
			FFImport result = api.startImport(CHANNEL);
			result.getErrors().forEach(LOG::error);
			result.getStatus().forEach(LOG::info);

			LOG.info("Start suggest data import");
			result = api.startSuggestImport(CHANNEL);
			result.getErrors().forEach(LOG::error);
			result.getStatus().forEach(LOG::info);

		} catch (final FFApiException e) {
			if (e.isTimeout()) {
				LOG.error("Timeout");
			} else {
				LOG.error(e.getMessage());
			}
		}
	}

}

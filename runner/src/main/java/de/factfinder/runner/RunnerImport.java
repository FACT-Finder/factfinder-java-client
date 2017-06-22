package de.factfinder.runner;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.ImportApi;
import io.swagger.client.model.ImportChannelResult;
import io.swagger.client.model.ImportResult;

/**
 * This class demonstrates the usage of the FACT-Finder REST API to externally trigger product data and suggest imports.
 */
public final class RunnerImport {
	private static final Logger LOG     = LogManager.getLogger(RunnerImport.class.getSimpleName());
	private static final String CHANNEL = Settings.getChannel();

	private RunnerImport() {
	}

	public static void main(final String[] args) {
		Settings.setupAuthKeyRefreshingClientWithHigherTimeout();

		final ImportApi apiInstance = new ImportApi();
		final List<String> channel = Collections.singletonList(CHANNEL);
		final Boolean download = false;
		final Boolean quiet = false;

		try {
			LOG.info("Start product data import");
			final ImportResult productImportResult = apiInstance.startSearchImportUsingPOST(channel, download, quiet);

			final ImportChannelResult channelResult = productImportResult.getMessages().get(CHANNEL);
			channelResult.getErrorMessages().forEach(LOG::error);
			channelResult.getStatusMessages().forEach(LOG::info);
		} catch (final ApiException e) {
			LOG.error("Exception when calling ImportApi#startSearchImportUsingPOST", e);
		}

		try {
			LOG.info("Start suggest data import");
			final ImportResult suggestImportResult = apiInstance.startSuggestImportUsingPOST(channel, quiet);

			final ImportChannelResult channelResultForSuggest = suggestImportResult.getMessages().get(CHANNEL);
			channelResultForSuggest.getErrorMessages().forEach(LOG::error);
			channelResultForSuggest.getStatusMessages().forEach(LOG::info);
		} catch (final ApiException e) {
			LOG.error("Exception when calling ImportApi#startSuggestImportUsingPOST", e);
		}
	}
}

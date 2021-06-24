package de.factfinder.runner;

import de.factfinder.client.ApiException;
import de.factfinder.client.api.ImportApi;
import de.factfinder.client.model.ImportChannelResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.List;

/**
 * This class demonstrates the usage of the FACT-Finder REST API to externally trigger product data and suggest imports.
 */
public final class RunnerImport {
    private static final Logger LOG = LogManager.getLogger(RunnerImport.class.getSimpleName());
    private static final String CHANNEL = Settings.getChannel();

    private RunnerImport() {
    }

    public static void main(final String[] args) {
        final ImportApi importClient = new ImportApi(Settings.getClient());

        final List<String> channels = Collections.singletonList(CHANNEL);
        final Boolean download = false;
        final Boolean cacheFlush = false;
        final Boolean quiet = false;
        final String importStage = "IMPORT_ONLY";

        try {
            LOG.info("Start product data import");
            final Boolean includeCustomerPrices = false;
            final List<ImportChannelResult> productImportResult = importClient.startSearchImportUsingPOST(channels, download, cacheFlush, quiet, importStage,
                    includeCustomerPrices);
            printProductImportResult(productImportResult);
        } catch (final ApiException e) {
            LOG.error("Exception when calling ImportApi#startSearchImportUsingPOST", e);
        }

        try {
            LOG.info("Start suggest data import");
            final List<ImportChannelResult> suggestImportResult = importClient.startSuggestImportUsingPOST(channels, quiet);
            printProductImportResult(suggestImportResult);
        } catch (final ApiException e) {
            LOG.error("Exception when calling ImportApi#startSuggestImportUsingPOST", e);
        }
    }

    private static void printProductImportResult(final List<ImportChannelResult> productImportResult) {
        productImportResult.forEach(result -> {
            LOG.info("Import in channel {}", result.getChannel());
            LOG.info("Duration of import: {}", result.getDurationInSeconds());
            LOG.info("Number of imported records: {}", result.getImportedRecords());
            LOG.info("Import type: {}", result.getImportType());
            LOG.info("Import fields: {}", result.getImportedFields());
            LOG.info("Start date: {}", result.getStartDate());
            LOG.info("Number of imported wm documents: {}", result.getImportedWorldmatchDocuments());

            result.getErrorMessages().forEach(LOG::error);
            result.getStatusMessages().forEach(LOG::info);
        });
    }
}

package de.factfinder.runner;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.runner.print.SearchResultInformationPrinter;
import io.swagger.client.ApiException;
import io.swagger.client.api.CompareproductsApi;
import io.swagger.client.model.CompareAttribute;
import io.swagger.client.model.CompareResult;

/**
 * This class demonstrates the usage of the FACT-Finder REST API to compare products.
 */
public final class RunnerProductCompare {
	private static final Logger LOG = LogManager.getLogger(RunnerProductCompare.class.getSimpleName());

	private RunnerProductCompare() {
	}

	public static void main(final String[] args) {
		Settings.setupAuthKeyRefreshingClientWithHigherTimeout();

		final SearchResultInformationPrinter searchResultInfoPrinter = new SearchResultInformationPrinter();

		final CompareproductsApi apiInstance = new CompareproductsApi();
		/** Example record ids, this needs to be adjusted according to your data. */
		final List<String> recordIds = Arrays.asList("d9acc33d8359925d16248664b60e9", "44570eb5b01e11930a2adb8f2b943", "41089ef3023a91e9b6dbf0013e319");
		Boolean idsOnly;

		try {
			LOG.info("=== BEGIN PRODUCT COMPARISON (NORMAL)===");
			idsOnly = false;
			final CompareResult normalCompareResult = apiInstance.compareUsingGET(Settings.getChannel(), recordIds, idsOnly);
			printCompareResult(searchResultInfoPrinter, normalCompareResult);
			LOG.info("=== END PRODUCT COMPARISON (NORMAL) ===");

			LOG.info("=== BEGIN PRODUCT COMPARISON (IDs ONLY)===");
			idsOnly = true;
			final CompareResult idsOnlyCompareResult = apiInstance.compareUsingGET(Settings.getChannel(), recordIds, idsOnly);
			printCompareResult(searchResultInfoPrinter, idsOnlyCompareResult);
			LOG.info("=== END PRODUCT COMPARISON (IDs ONLY) ===");
		} catch (final ApiException e) {
			LOG.error("Exception when calling CompareproductsApi#compareUsingGET", e);
		}
	}

	private static void printCompareResult(final SearchResultInformationPrinter printer, final CompareResult compareResult) {
		for (final CompareAttribute attr : compareResult.getAttributes()) {
			LOG.info("Attribute: '" + attr.getAttributeName() + "', Fieldname: '" + attr.getSourceField() + "', hasDifference: " + attr.getDifferent());
		}
		LOG.info("---");
		compareResult.getRecords().forEach(printer::printRecord);
	}
}

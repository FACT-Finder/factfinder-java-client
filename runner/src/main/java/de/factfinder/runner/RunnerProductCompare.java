package de.factfinder.runner;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.ffcompare.Attribute;
import de.factfinder.ffcompare.FFCompare;
import de.factfinder.ffcompare.CompareRecord;
import de.factfinder.runner.print.SearchResultInformationPrinter;

public class RunnerProductCompare {
	private static final Logger LOG = LogManager.getLogger(RunnerProductCompare.class.getSimpleName());

	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());

		final SearchResultInformationPrinter srip = new SearchResultInformationPrinter();

		final List<String> recordIds = Arrays.asList("d9acc33d8359925d16248664b60e9", "44570eb5b01e11930a2adb8f2b943", "41089ef3023a91e9b6dbf0013e319");

		LOG.info("=== BEGIN PRODUCT COMPARISON (NORMAL)===");
		FFCompare cr = api.getComparedProducts(Settings.getChannel(), recordIds);
		printCompareResult(srip, cr);
		LOG.info("=== END PRODUCT COMPARISON (NORMAL) ===");

		LOG.info("=== BEGIN PRODUCT COMPARISON (IDs ONLY)===");
		// when requesting idsOnly, the records will be returned with its id and the field values of the compare attributes
		cr = api.getComparedProducts(Settings.getChannel(), recordIds, true);
		printCompareResult(srip, cr);
		LOG.info("=== END PRODUCT COMPARISON (IDs ONLY) ===");

	}

	private static void printCompareResult(final SearchResultInformationPrinter srip, final FFCompare cr) {
		for (final Attribute attr : cr.getAttributes()) {
			LOG.info("Attribute: '" + attr.getAttributeName() + "', Fieldname: '" + attr.getSourceField() + "', hasDifference: " + attr.getDifferent());
		}
		LOG.info("---");
		for (final CompareRecord rec : cr.getRecords()) {
			srip.printRecord(rec, "");
		}
	}
}
package de.factfinder.runner;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.ffproductcampaigns.FFProductCampaign;
import de.factfinder.runner.print.CampaignInformationPrinter;
import de.factfinder.runner.print.SearchResultInformationPrinter;

public final class RunnerProductCampaign {
	private static final String			CHANNEL								= Settings.getChannel();
	private static final String			PRODUCT_NUMBER						= "025-0004";
	private static final List<String>	SHOPPING_CART_PRODUCT_NUMBER_LIST	= Arrays.asList("025-0004", "702-0011");
	private static final boolean		IDS_ONLY							= false;
	private static final Logger			LOG									= LogManager.getLogger(RunnerProductCampaign.class);

	/**
	 * Private constructor.
	 */
	private RunnerProductCampaign() {
	}

	/**
	 * Executes the example. Please check the correctness of the constants within this class.
	 *
	 * @param args not used.
	 */
	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());
		final SearchResultInformationPrinter searchResultInfoPrinter = new SearchResultInformationPrinter();
		final CampaignInformationPrinter campaignInfoPrinter = new CampaignInformationPrinter(searchResultInfoPrinter);

		printProductCampaigns(campaignInfoPrinter, api);
		printShoppingCartCampaigns(campaignInfoPrinter, api);
	}

	private static void printProductCampaigns(final CampaignInformationPrinter campaignInfoPrinter, final FFApi api) {
		LOG.info("Product campaigns");
		final List<FFProductCampaign> campaigns = api.getProductCampaigns(CHANNEL, PRODUCT_NUMBER, IDS_ONLY);
		campaignInfoPrinter.printCampaigns(campaigns);
	}

	private static void printShoppingCartCampaigns(final CampaignInformationPrinter campaignInfoPrinter, final FFApi api) {
		LOG.info("Shopping cart campaigns");
		final List<FFProductCampaign> campaigns = api.getShoppingCartCampaigns(CHANNEL, SHOPPING_CART_PRODUCT_NUMBER_LIST, IDS_ONLY);
		campaignInfoPrinter.printCampaigns(campaigns);
	}

}

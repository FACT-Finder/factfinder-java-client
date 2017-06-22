package de.factfinder.runner;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.runner.print.CampaignInformationPrinter;
import de.factfinder.runner.print.SearchResultInformationPrinter;
import io.swagger.client.ApiException;
import io.swagger.client.api.CampaignApi;
import io.swagger.client.model.Campaign;

/**
 * This class demonstrates the usage of the FACT-Finder REST API to check for product campaigns.
 */
public final class RunnerProductCampaign {
	private static final Logger LOG     = LogManager.getLogger(RunnerProductCampaign.class);
	private static final String CHANNEL = Settings.getChannel();

	private static final boolean      IDS_ONLY                          = false;
	/** Example data for getting campaigns. Please adjust it according to your data. */
	private static final String       PRODUCT_NUMBER                    = "025-0004";
	private static final List<String> SHOPPING_CART_PRODUCT_NUMBER_LIST = Arrays.asList(PRODUCT_NUMBER, "702-0011");
	private static final String       PAGE_ID                           = "landingpage";
	private static final String       SESSION_ID                        = "session123";
	private static final String       ADVISOR_STATUS_EXAMPLE            = "advisorStatus_example";

	private RunnerProductCampaign() {
	}

	public static void main(final String[] args) {
		Settings.setupAuthKeyRefreshingClientWithHigherTimeout();

		final SearchResultInformationPrinter searchResultInfoPrinter = new SearchResultInformationPrinter();
		final CampaignInformationPrinter campaignInfoPrinter = new CampaignInformationPrinter(searchResultInfoPrinter);

		final CampaignApi apiInstance = new CampaignApi();

		printProductCampaigns(campaignInfoPrinter, apiInstance);
		printShoppingCartCampaigns(campaignInfoPrinter, apiInstance);
		printPageCampaigns(campaignInfoPrinter, apiInstance);
	}

	private static void printProductCampaigns(final CampaignInformationPrinter campaignInfoPrinter, final CampaignApi apiInstance) {
		try {
			LOG.info("------------------------- Product campaigns -------------------------");
			final List<Campaign> campaigns = apiInstance.getProductCampaignsUsingGET(CHANNEL, PRODUCT_NUMBER, IDS_ONLY, SESSION_ID, ADVISOR_STATUS_EXAMPLE);
			campaignInfoPrinter.printCampaigns(campaigns);
		} catch (final ApiException e) {
			LOG.error("Exception when using CampaignApi#getProductCampaignsUsingGET", e);
		}
	}

	private static void printShoppingCartCampaigns(final CampaignInformationPrinter campaignInfoPrinter, final CampaignApi apiInstance) {
		try {
			LOG.info("------------------------- Shopping cart campaigns -------------------------");
			final List<Campaign> campaigns = apiInstance.getShoppingCartCampaignsUsingGET(CHANNEL, SHOPPING_CART_PRODUCT_NUMBER_LIST, IDS_ONLY, SESSION_ID,
																						  ADVISOR_STATUS_EXAMPLE);
			campaignInfoPrinter.printCampaigns(campaigns);
		} catch (final ApiException e) {
			LOG.error("Exception when using CampaignApi#getShoppingCartCampaignsUsingGET", e);
		}
	}

	private static void printPageCampaigns(final CampaignInformationPrinter campaignInfoPrinter, final CampaignApi apiInstance) {
		try {
			LOG.info("------------------------- Page campaigns -------------------------");
			final List<Campaign> campaigns = apiInstance.getPageCampaignsUsingGET(CHANNEL, PAGE_ID, IDS_ONLY, SESSION_ID, ADVISOR_STATUS_EXAMPLE);
			campaignInfoPrinter.printCampaigns(campaigns);
		} catch (final ApiException e) {
			LOG.error("Exception when using CampaignApi#getPageCampaignsUsingGET", e);
		}
	}
}

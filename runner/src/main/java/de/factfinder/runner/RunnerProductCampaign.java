package de.factfinder.runner;

import de.factfinder.client.ApiException;
import de.factfinder.client.api.CampaignApi;
import de.factfinder.client.model.Campaign;
import de.factfinder.runner.print.CampaignInformationPrinter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrates the usage of the FACT-Finder REST API to check for product campaigns.
 */
public final class RunnerProductCampaign {
    private static final Logger LOG = LogManager.getLogger(RunnerProductCampaign.class);
    private static final String CHANNEL = Settings.getChannel();

    private static final boolean IDS_ONLY = false;
    /**
     * Example data for getting campaigns. Please adjust it according to your data.
     */
    private static final String ID = "025-0004";
    private static final List<String> SHOPPING_CART_PRODUCT_NUMBER_LIST = Arrays.asList(ID, "702-0011");
    private static final String PAGE_ID = "landingpage";
    private static final String SESSION_ID = "session123";
    private static final String PURCHASER_ID = "purchaser123";

    private RunnerProductCampaign() {
    }

    public static void main(final String[] args) {
        final CampaignInformationPrinter campaignInfoPrinter = new CampaignInformationPrinter();

        final CampaignApi campaignClient = new CampaignApi(Settings.getClient());

        printProductCampaigns(campaignInfoPrinter, campaignClient);
        printShoppingCartCampaigns(campaignInfoPrinter, campaignClient);
        printPageCampaigns(campaignInfoPrinter, campaignClient);
    }

    private static void printProductCampaigns(final CampaignInformationPrinter campaignInfoPrinter, final CampaignApi campaignClient) {
        try {
            LOG.info("------------------------- Product campaigns -------------------------");
            final List<Campaign> campaigns = campaignClient.getProductCampaignsUsingGET(CHANNEL, ID, IDS_ONLY, "productNumber", PURCHASER_ID, SESSION_ID, null, null, Collections.emptyList());
            campaignInfoPrinter.printCampaigns(campaigns);
        } catch (final ApiException e) {
            LOG.error("Exception when using CampaignApi#getProductCampaignsUsingGET", e);
        }
    }

    private static void printShoppingCartCampaigns(final CampaignInformationPrinter campaignInfoPrinter, final CampaignApi campaignClient) {
        try {
            LOG.info("------------------------- Shopping cart campaigns -------------------------");
            final List<Campaign> campaigns = campaignClient.getShoppingCartCampaignsUsingGET(CHANNEL, SHOPPING_CART_PRODUCT_NUMBER_LIST, IDS_ONLY, PURCHASER_ID,
                    SESSION_ID, null, null, Collections.emptyList());
            campaignInfoPrinter.printCampaigns(campaigns);
        } catch (final ApiException e) {
            LOG.error("Exception when using CampaignApi#getShoppingCartCampaignsUsingGET", e);
        }
    }

    private static void printPageCampaigns(final CampaignInformationPrinter campaignInfoPrinter, final CampaignApi campaignClient) {
        try {
            LOG.info("------------------------- Page campaigns -------------------------");
            final List<Campaign> campaigns = campaignClient.getPageCampaignsUsingGET(CHANNEL, PAGE_ID, IDS_ONLY, PURCHASER_ID, SESSION_ID, null, null, Collections.emptyList());
            campaignInfoPrinter.printCampaigns(campaigns);
        } catch (final ApiException e) {
            LOG.error("Exception when using CampaignApi#getPageCampaignsUsingGET", e);
        }
    }
}

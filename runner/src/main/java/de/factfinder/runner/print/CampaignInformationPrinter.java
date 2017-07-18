package de.factfinder.runner.print;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.client.model.Answer;
import de.factfinder.client.model.Campaign;
import de.factfinder.client.model.FeedbackText;
import de.factfinder.client.model.Question;
import de.factfinder.client.model.RecordWithId;
import de.factfinder.client.model.Target;

/**
 * Prints information about campaigns.
 */
public final class CampaignInformationPrinter {
	private static final Logger LOG = LogManager.getLogger(CampaignInformationPrinter.class.getSimpleName());

	private final SearchResultInformationPrinter searchResultInfoPrinter;

	/**
	 * Constructor.
	 *
	 * @param searchResultInfoPrinter instance of a {@link SearchResultInformationPrinter}
	 */
	public CampaignInformationPrinter(final SearchResultInformationPrinter searchResultInfoPrinter) {
		this.searchResultInfoPrinter = searchResultInfoPrinter;
	}

	/**
	 * Prints information and content about the given campaigns.
	 * <p>
	 * Campaigns can be used for several concerns:
	 * <ul>
	 * <li>redirect the user to a different site (e.g. "terms and conditions", "brand shop")</li>
	 * <li>put additional content to the search result (e.g. banners, texts, hints)</li>
	 * <li>display additional products (called 'pushed products') next to or inside the search result.</li>
	 * <li>engage customers in a conversation with questions and answers to narrow down the search result.</li>
	 * </ul>
	 * </p>
	 *
	 * @param campaigns a list of campaigns.
	 */
	public void printCampaigns(final List<Campaign> campaigns) {
		LOG.info(campaigns.size() + " campaigns found:");
		for (final Campaign campaign : campaigns) {
			LOG.info("campaign name: [" + campaign.getName() + "] with flavour: [" + campaign.getFlavour() + "]");
			printCampaign(campaign);
		}
	}

	private void printCampaign(final Campaign campaign) {
		switch (campaign.getFlavour()) {
			case ADVISOR:
				printAdvisorCampaign(campaign);
				break;
			case FEEDBACK:
				printFeedbackCampaign(campaign);
				break;
			case REDIRECT:
				printRedirectCampaign(campaign);
				break;
			case PRODUCT:
				printProductCampaign(campaign);
				break;
			default:
				break;
		}
	}

	private void printProductCampaign(final Campaign campaign) {
		printPushedProducts(campaign);
	}

	private void printAdvisorCampaign(final Campaign campaign) {
		LOG.info("\tADVISOR ACTIVE QUESTIONS");
		// if we need the whole tree make sure the search control parameter "generateAdvisorTree" is set and use campaign.getAdvisorTree()
		for (final Question question : campaign.getActiveQuestions()) {
			printQuestion(question);
			question.getAnswers().forEach(this::printAnswer);
		}
	}

	private void printAnswer(final Answer answer) {
		LOG.info("\t\tANSWER id: [" + answer.getId() + "] text: [" + answer.getText() + "] parameter: [" + answer.getParams() + "]");
		answer.getQuestions().forEach(this::printQuestion);
	}

	private void printQuestion(final Question question) {
		LOG.info("\t\tQUESTION id: [" + question.getId() + "] text: [" + question.getText() + "]");
	}

	/**
	 * A campaign of the type feedback can have feedback texts and/or pushed products.
	 *
	 * @param campaign the campaign.
	 */
	private void printFeedbackCampaign(final Campaign campaign) {
		printFeedbackTexts(campaign);
		printPushedProducts(campaign);
	}

	private void printPushedProducts(final Campaign campaign) {
		final List<RecordWithId> pushedProductsRecords = campaign.getPushedProductsRecords();
		if (!pushedProductsRecords.isEmpty()) {
			LOG.info("\tPUSHED PRODUCTS");
			pushedProductsRecords.forEach(searchResultInfoPrinter::printRecord);
		}
	}

	private void printFeedbackTexts(final Campaign campaign) {
		for (final FeedbackText text : campaign.getFeedbackTexts()) {
			LOG.info("\tFEEDBACK TEXT id: [" + text.getId() + "] label: [" + text.getLabel() + "] text: [" + text.getText() + "] HTML-allowed: ["
										 + text.getHtml() + "]");
		}
	}

	private void printRedirectCampaign(final Campaign campaign) {
		final Target target = campaign.getTarget();
		LOG.info("\tREDIRECT name: [" + target.getName() + "] destination: [" + target.getDestination() + "]");
	}
}

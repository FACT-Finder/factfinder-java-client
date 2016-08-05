package de.factfinder.runner.print;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.ffproductcampaigns.Answer;
import de.factfinder.ffproductcampaigns.FFProductCampaign;
import de.factfinder.ffproductcampaigns.FeedbackText;
import de.factfinder.ffproductcampaigns.PushedProductsRecord;
import de.factfinder.ffproductcampaigns.Question;
import de.factfinder.ffproductcampaigns.Target;

/**
 * Prints information about campaigns.
 */
public final class CampaignInformationPrinter {
	private static final Logger						LOG	= LogManager.getLogger(CampaignInformationPrinter.class.getSimpleName());
	private final SearchResultInformationPrinter	searchResultInfoPrinter;

	/**
	 * Constructor.
	 *
	 * @param searchResultInfoPrinter instance of a {@link SearchResultInformationPrinter}
	 */
	public CampaignInformationPrinter(final SearchResultInformationPrinter searchResultInfoPrinter) {
		this.searchResultInfoPrinter = searchResultInfoPrinter;
	}

	/**
	 * Prints some information about the campaigns and additional things like feedback texts and pushed products.
	 * <p>
	 * Campaigns can be used for several concerns:
	 * <ul>
	 * <li>redirect the user to a different site ("hotline", "terms and conditions", "christmas shop")</li>
	 * <li>add some information to the search result (banners, hints)</li>
	 * <li>get additional products which are called 'pushed products'.</li>
	 * <li>trigger an advisor, which contains questions with answers (each answer contains a product-set and can have a follow-up question).</li>
	 * </ul>
	 * </p>
	 *
	 * @param campaigns a list of campaigns.
	 */
	public void printCampaigns(final List<FFProductCampaign> campaigns) {
		LOG.info(campaigns.size() + " campaigns found:");
		for (final FFProductCampaign campaign : campaigns) {
			final String campaignName = "campaign name: [" + campaign.getName() + "]";
			final String startMessage = "=== START " + campaignName + " with flavour: [" + campaign.getFlavour() + "] ===";
			final String endMessage = "=== END " + campaignName + " with flavour: " + campaign.getFlavour() + " ===";
			LOG.info(startMessage);
			if (FFProductCampaign.Flavour.REDIRECT == campaign.getFlavour()) {
				printRedirectCampaign(campaign);
			}
			if (FFProductCampaign.Flavour.FEEDBACK == campaign.getFlavour()) {
				printFeedbackCampaign(campaign);
			}
			if (FFProductCampaign.Flavour.ADVISOR == campaign.getFlavour()) {
				printAdvisorCampaign(campaign);
			}
			LOG.info(endMessage);
		}
	}

	/**
	 * Print the advisor. A campaign of the type advisor will consists of the advisor tree.
	 *
	 * @param campaign the campain.
	 */
	private void printAdvisorCampaign(final FFProductCampaign campaign) {
		LOG.info("ADVISOR ACTIVE QUESTIONS");
		// if we need the whole tree make sure the search control param for that is set and use campaign.getAdvisorTree()
		// (if the search control parameter is not set it will be empty)
		final List<Question> questions = campaign.getActiveQuestions();
		for (final Question question : questions) {
			printQuestion(question);
			final List<Answer> answers = question.getAnswers();
			for (final Answer answer : answers) {
				printAnswer(answer);
			}
		}
	}

	/**
	 * Prints an answer. A answer contains an id, text, params and optional additional questions.
	 *
	 * @param answer the answer to be printed.
	 */
	private void printAnswer(final Answer answer) {
		LOG.info("\tAnswer Id: [" + answer.getId() + "] Answer text: [" + answer.getText() + "]");
		LOG.info("== Start printing answer search params ==");
		LOG.info(answer.getParams());
		LOG.info("== End printing answer search params ==");
		for (final Question question : answer.getQuestions()) {
			printQuestion(question);
		}
	}

	/**
	 * Prints an question. A answer contains an id, text and a list of answers.
	 *
	 * @param question the question to be printed.
	 */
	private void printQuestion(final Question question) {
		LOG.info("\tQuestion Id: [" + question.getId() + "] Question text: [" + question.getText() + "]");
	}

	/**
	 * A campaign of the type feedback can have feedback texts and pushed products.
	 *
	 * @param campaign the campain.
	 */
	private void printFeedbackCampaign(final FFProductCampaign campaign) {
		printFeedbackTexts(campaign);
		printPushedProducts(campaign);
	}

	/**
	 * A campaign may contain a list of pushed products. These can be used if you want to promote special products.
	 *
	 * @param campaign the campaign.
	 */
	private void printPushedProducts(final FFProductCampaign campaign) {
		LOG.info("PUSHED PRODUCTS");
		final List<PushedProductsRecord> products = campaign.getPushedProductsRecords();
		for (final PushedProductsRecord product : products) {
			searchResultInfoPrinter.printRecord(product.getRecord());
		}
	}

	/**
	 * Prints the feedback texts. A feedback text has a unique id to distinguish between them. They have a label which is either a constant 'Text' + the id or a
	 * name which can be configured with the campain manager ui. Furthermore there is the actual text which can be normal text or HTML.
	 *
	 * @param campaign the campaign.
	 */
	private void printFeedbackTexts(final FFProductCampaign campaign) {
		LOG.info("FEEDBACK TEXTS");
		for (final FeedbackText text : campaign.getFeedbackTexts()) {
			LOG.trace("\tId: [" + text.getId() + "] Label: [" + text.getLabel() + "] Text: [" + text.getText() + "] HTML: [" + text.getHtml() + "]");
		}
	}

	/**
	 * Prints the redirect campaign.
	 *
	 * @param campaign the campaign.
	 */
	private void printRedirectCampaign(final FFProductCampaign campaign) {
		// Simply redirect the user to a different site
		LOG.info("REDIRECT");
		final Target target = campaign.getTarget();
		LOG.info("\tName of redirection target is [" + target.getName() + "] Destination of redirection target is [" + target.getDestination() + "]");
	}

}

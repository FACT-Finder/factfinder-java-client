package de.factfinder.runner.print;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.Record;
import de.factfinder.api.SearchParams;
import de.factfinder.api.SortItem;
import de.factfinder.ffcompare.CompareRecord;
import de.factfinder.ffcampaigns.FFCampaign;
import de.factfinder.ffresult.Element;
import de.factfinder.ffresult.Filter;
import de.factfinder.ffresult.Group;
import de.factfinder.ffresult.Group.FilterStyle;
import de.factfinder.ffresult.ResultRecord;
import de.factfinder.ffresult.SearchResult;
import de.factfinder.ffresult.ValueList;

/**
 * Prints information about the search result.
 */
public final class SearchResultInformationPrinter {
	private static final Logger	LOG	= LogManager.getLogger(SearchResultInformationPrinter.class.getSimpleName());

	/**
	 * Prints the search parameters.
	 *
	 * @param params The search parameters.
	 */
	public void printSearchParameters(final SearchParams params) {
		LOG.info("Channel: [" + params.getChannel() + "]");

		LOG.info("Query: [" + params.getQuery() + "]");

		LOG.info("No article number search: [" + bool2Str(params.getNoArticleNumberSearch())
				+ "] (if the query looks like an article number but FACT-Finder should perform a normal search)");

		LOG.info("Result page: [" + params.getPage() + "]");

		LOG.info("Records per page: [" + params.getProductsPerPage() + "]");

		LOG.info("Search field: [" + params.getSearchField()
				+ "] (by default all fields, which are configured as searchable, are used. With this setting it's possible to restrict this to a single field.");

		printSortsList(params);
		printFilters(params);
	}

	private void printFilters(final SearchParams params) {
		if (params.getFilters() != null && !params.getFilters().isEmpty()) {
			final StringBuilder msg = new StringBuilder("Search filters:");
			for (final Filter filter : params.getFilters()) {
				msg.append("\n\tname=[").append(filter.getName()).append("]");

				// If this filter is set to a single value: manufacturer="Atari"
				if (filter.getValueList().size() == 1) {
					msg.append(", value=[").append(filter.getValueList()).append("]");
				}

				// If the filter is set to several values: manufacturer="Atari" or "Apple"
				if (filter.getValueList().size() > 1) {
					msg.append(", multiple values:");
					for (int i = 0; i < filter.getValueList().size(); i++) {
						final ValueList value = filter.getValueList().get(i);
						if (i > 0) {
							msg.append(" ").append(value.getType());
						}
						msg.append(" ").append(value.getValue());
					}
				}
			}
			LOG.info(msg.toString());
		}
	}

	private void printSortsList(final SearchParams params) {
		if (params.getSortsList() != null) {
			final StringBuilder msg = new StringBuilder("Sort options:");
			for (final SortItem item : params.getSortsList()) {
				msg.append("\n\tname=[").append(item.getField()).append("], order=[").append(item.getSortOrder());
			}
			LOG.info(msg.toString());
		}
	}

	/**
	 * Prints a single {@link ResultRecord}.
	 *
	 * @param record The record.
	 */
	public void printResultRecord(final ResultRecord record) {
		LOG.info("Record #" + record.getPosition());
		printRecord(record.getRecord());
	}

	/**
	 * Prints a single {@link CompareRecord}.
	 *
	 * @param record The record.
	 */
	public void printCompareRecord(final CompareRecord record) {
		LOG.info("Record: id=" + record.getId());
		printRecord(record.getRecord());
	}

	/**
	 * Prints a {@link Record}.
	 *
	 * @param record The record.
	 */
	public void printRecord(final Record record) {
		LOG.info("Record content:");
		record.forEach((key, value) -> LOG.info("\t" + key + "=" + value));
	}

	/**
	 * Prints the search result.
	 *
	 * @param result The search result.
	 */
	public void printSearchResult(final SearchResult result) {
		LOG.info("Status: [" + result.getResultStatus() + "]");
		LOG.info("Hit count: " + result.getResultCount());
		LOG.info("Hits on page #" + result.getPaging().getCurrentPage());

		LOG.info("--- START RECORDS ---");
		// This loop gets all the records of the current search result page.
		for (final ResultRecord record : result.getRecords()) {
			printResultRecord(record);
		}
		LOG.info("--- END RECORDS ---");

		printAfterSearchNavigation(result);
		printCampaigns(result);

	}

	private void printCampaigns(final SearchResult result) {
		final List<FFCampaign> campaigns = result.getCampaigns();
		if (!campaigns.isEmpty()) {
			final CampaignInformationPrinter cip = new CampaignInformationPrinter(this);
			LOG.info("--- START CAMPAIGNS ---");
			cip.printCampaigns(campaigns);
			LOG.info("--- END CAMPAIGNS ---");
		}
	}

	/**
	 * Prints the After Search Navigation (ASN) a.k.a. search facets.
	 *
	 * @param result The search result.
	 */
	private void printAfterSearchNavigation(final SearchResult result) {
		LOG.info("--- START ASN / FACETS ---");
		LOG.info("Number of groups: " + result.getGroups().size());
		for (final Group group : result.getGroups()) {
			final StringBuilder groupMsg = new StringBuilder(150);
			groupMsg.append("The group [").append(group.getName()).append("] contains ").append(group.getElements().size()).append(" elements and is ");
			if (group.getSelectedElements().isEmpty()) {
				groupMsg.append("not ");
			}
			groupMsg.append("selected. It should be shown in ").append(group.getFilterStyle()).append("-style, with selectionType '")
					.append(group.getSelectionType()).append("'.");
			LOG.info(groupMsg.toString());

			String unit = group.getUnit();
			if (!unit.isEmpty()) {
				unit = " " + unit;
			}

			if (group.getFilterStyle() == FilterStyle.SLIDER) {
				final Element sliderElement = group.getElements().get(0);
				LOG.info("\tAvailable range [min:" + sliderElement.getAbsoluteMinValue() + "; max:" + sliderElement.getAbsoluteMaxValue() + "]");
				if (sliderElement.getSelected()) {
					LOG.info("\tSelected range [min:" + sliderElement.getSelectedMinValue() + "; max:" + sliderElement.getSelectedMaxValue() + "]");
				}
			} else {
				for (final Element element : group.getElements()) {
					final StringBuilder elementMsg = new StringBuilder(100);
					elementMsg.append("\t").append(element.getName()).append(unit).append(" (").append(element.getRecordCount()).append(")");
					if (element.getSelected()) {
						elementMsg.append(" <= selected");
					}
					LOG.info(elementMsg.toString());
				}
			}
		}
		LOG.info("--- END ASN / FACETS ---");
	}

	private String bool2Str(final Boolean value) {
		return value == null ? "false" : value.toString();
	}
}

package de.factfinder.runner.print;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.client.model.Campaign;
import de.factfinder.client.model.Filter;
import de.factfinder.client.model.FilterValue;
import de.factfinder.client.model.Group;
import de.factfinder.client.model.GroupElement;
import de.factfinder.client.model.Params;
import de.factfinder.client.model.RecordWithId;
import de.factfinder.client.model.Result;
import de.factfinder.client.model.SearchRecord;
import de.factfinder.client.model.SortItem;

/**
 * Prints information about the search result.
 */
public final class SearchResultInformationPrinter {
	private static final Logger LOG = LogManager.getLogger(SearchResultInformationPrinter.class.getSimpleName());

	/**
	 * Prints the search parameters.
	 *
	 * @param params The search parameters.
	 */
	public void printSearchParameters(final Params params) {
		LOG.info("Channel: [" + params.getChannel() + "]");

		LOG.info("Query: [" + params.getQuery() + "]");

		LOG.info("No article number search: [" + bool2Str(params.getNoArticleNumberSearch())
									 + "] (if the query looks like an article number but FACT-Finder should perform a normal search)");

		LOG.info("Result page: [" + params.getPage() + "]");

		LOG.info("Records per page: [" + params.getResultsPerPage() + "]");

		LOG.info("Search field: [" + params.getSearchField()
									 + "] (by default all fields, which are configured as searchable, are used. With this setting it's possible to restrict this to a single field.");

		printSortsList(params);
		printFilters(params);
	}

	private void printFilters(final Params params) {
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
						final FilterValue value = filter.getValueList().get(i);
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

	private void printSortsList(final Params params) {
		if (params.getSortsList() != null) {
			final StringBuilder msg = new StringBuilder("Sort options:");
			for (final SortItem item : params.getSortsList()) {
				msg.append("\n\tname=[").append(item.getName()).append("], order=[").append(item.getOrder());
			}
			LOG.info(msg.toString());
		}
	}

	/**
	 * Prints a single {@link SearchRecord}.
	 *
	 * @param record The record.
	 */
	public void printSearchRecord(final SearchRecord record) {
		LOG.info("Record #" + record.getPosition());
		printRecord(record.getRecord());
	}

	/**
	 * Prints a {@link RecordWithId}.
	 *
	 * @param record The record.
	 */
	public void printRecord(final RecordWithId record) {
		LOG.info("Record: id=" + record.getId());
		printRecord(record.getRecord());
	}

	/**
	 * Prints the records key value pairs.
	 *
	 * @param record The record.
	 */
	public void printRecord(final Map<String, String> record) {
		LOG.info("Record content:");
		record.forEach((key, value) -> LOG.info("\t" + key + "=" + value));
	}

	/**
	 * Prints the search result.
	 *
	 * @param result The search result.
	 */
	public void printSearchResult(final Result result) {
		LOG.info("Status: [" + result.getResultStatus() + "]");
		LOG.info("Hit count: " + result.getResultCount());
		LOG.info("Hits on page #" + result.getPaging().getCurrentPage());

		LOG.info("--- START RECORDS ---");
		// This loop gets all the records of the current search result page.
		result.getRecords().forEach(this::printSearchRecord);
		LOG.info("--- END RECORDS ---");

		printAfterSearchNavigation(result);
		printCampaigns(result);
		printFieldRoles(result);
	}

	private void printFieldRoles(final Result result) {
		LOG.info("--- START FIELDROLES ---");
		result.getFieldRoles().forEach((k, v) -> LOG.info(k + " = " + v));
		LOG.info("--- END FIELDROLES ---");
	}

	private void printCampaigns(final Result result) {
		final List<Campaign> campaigns = result.getCampaignsList();
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
	private void printAfterSearchNavigation(final Result result) {
		LOG.info("--- START ASN / FACETS ---");
		LOG.info("Number of groups: " + result.getAsnGroups().size());
		for (final Group group : result.getAsnGroups()) {
			final StringBuilder groupMsg = new StringBuilder(150);
			groupMsg.append("The group [").append(group.getName()).append("] contains ").append(group.getElements().size()).append(" elements and is ");
			if (group.getSelectedElements().isEmpty()) {
				groupMsg.append("not ");
			}
			groupMsg.append("selected. It should be shown in ")
					.append(group.getFilterStyle())
					.append("-style, with selectionType '")
					.append(group.getSelectionType())
					.append("'.");
			LOG.info(groupMsg.toString());

			String unit = group.getUnit();
			if (!unit.isEmpty()) {
				unit = " " + unit;
			}

			if (group.getFilterStyle() == Group.FilterStyleEnum.SLIDER) {
				final GroupElement sliderElement = group.getElements().get(0);
				LOG.info("\tAvailable range [min:" + sliderElement.getAbsoluteMinValue() + "; max:" + sliderElement.getAbsoluteMaxValue() + "]");
				if (sliderElement.getSelected()) {
					LOG.info("\tSelected range [min:" + sliderElement.getSelectedMinValue() + "; max:" + sliderElement.getSelectedMaxValue() + "]");
				}
			} else {
				for (final GroupElement element : group.getElements()) {
					final StringBuilder elementMsg = new StringBuilder(100);
					elementMsg.append("\t").append(element.getText()).append(unit).append(" (").append(element.getRecordCount()).append(")");
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

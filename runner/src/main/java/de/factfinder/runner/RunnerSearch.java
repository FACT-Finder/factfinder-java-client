package de.factfinder.runner;

import de.factfinder.client.ApiException;
import de.factfinder.client.api.SearchApi;
import de.factfinder.client.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Collections;

/**
 * This class demonstrates the usage of the FACT-Finder REST API for search results.
 * <p>
 * The search call uses example search data, you can adjust it according to your search database.
 */
public final class RunnerSearch {
    private static final Logger LOG = LogManager.getLogger(RunnerSearch.class.getSimpleName());
    private static final String CHANNEL = Settings.getChannel();

    private RunnerSearch() {
    }

    public static void main(final String[] args) {
        final SearchApi searchClient = new SearchApi(Settings.getClient());
        final SearchParams params = getSearchParams();
        final SearchRequest searchRequest = new SearchRequest();
        searchRequest.setParams(params);
        searchRequest.setSearchControlParams(getSearchControlParams());

        try {
            final Result result = searchClient.searchUsingPOST(searchRequest);

            LOG.info("==== BEGIN SEARCH PARAMETERS SENT ====");
            LOG.info(params);
            LOG.info("==== END SEARCH PARAMETERS SENT ====\n");

            if (result.getTotalHits() > 0) {
                LOG.info("==== BEGIN SEARCH PARAMETERS RETURNED ====");
                LOG.info(result.getSearchParams());
                LOG.info("==== END SEARCH PARAMETERS RETURNED ====\n");

                LOG.info("==== BEGIN SEARCH RESULT ====");
                LOG.info("Campaigns:");
                LOG.info(result.getCampaigns());
                LOG.info("Hits:");
                LOG.info(result.getHits());
                LOG.info("Facets:");
                LOG.info(result.getFacets());
                LOG.info("Field Roles:");
                LOG.info(result.getFieldRoles());
                LOG.info("==== END SEARCH RESULT ====\n");
            } else {
                LOG.info("An unknown error occurred while searching. Please check the logs of the search application.");
            }
        } catch (final ApiException e) {
            LOG.error("Exception when calling SearchApi#searchUsingPOST", e);
        }
    }

    private static SearchControlParams getSearchControlParams() {
        final SearchControlParams searchControlParams = new SearchControlParams();
        // if you want to minimize the response size set this to true. This will only return the id's of the records.
        searchControlParams.setIdsOnly(false);

        return searchControlParams;
    }

    private static SearchParams getSearchParams() {
        final SearchParams params = new SearchParams();
        params.setQuery("shoe");
        params.setHitsPerPage(10);
        params.setChannel(CHANNEL);
        params.setFilters(Collections.singletonList(setupFilter()));
        return params;
    }

    private static Filter setupFilter() {
        final Filter filter = new Filter();
        filter.setName("Gender");

        final FilterValue value1 = new FilterValue();
        value1.setValue("Kids");
        value1.setExclude(false);
        value1.setType(FilterValue.TypeEnum.OR);
        final FilterValue value2 = new FilterValue();
        value2.setValue("Men");
        value2.setExclude(true);
        value2.setType(FilterValue.TypeEnum.AND);
        final FilterValue value3 = new FilterValue();
        value3.setValue("Woman");
        value3.setType(FilterValue.TypeEnum.OR);
        value3.setExclude(false);
        filter.setValues(Arrays.asList(value1, value2, value3));

        return filter;
    }
}

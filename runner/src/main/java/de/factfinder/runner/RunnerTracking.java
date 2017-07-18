package de.factfinder.runner;

import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.client.ApiException;
import de.factfinder.client.api.TrackingApi;
import de.factfinder.client.model.CartOrCheckoutEvent;
import de.factfinder.client.model.ClickEvent;
import de.factfinder.client.model.FeedbackEvent;
import de.factfinder.client.model.Filter;
import de.factfinder.client.model.FilterValue;
import de.factfinder.client.model.LoginEvent;
import de.factfinder.client.model.RecommendationClickEvent;
import de.factfinder.client.model.SearchLogEvent;

/**
 * This class demonstrates the usage of the FACT-Finder REST API to track various events.
 */
public final class RunnerTracking {
	private static final Logger LOG = LogManager.getLogger(RunnerTracking.class.getSimpleName());

	private RunnerTracking() {
	}

	public static void main(final String[] args) {
		Settings.setupAuthKeyRefreshingClientWithHigherTimeout();

		final TrackingApi apiInstance = new TrackingApi();

		trackDetailClick(apiInstance);
		trackCart(apiInstance);
		trackBuy(apiInstance);
		trackRecEngineClick(apiInstance);
		trackSearchFeedback(apiInstance);
		trackLogin(apiInstance);
		trackSearchLogEvent(apiInstance);
	}

	private static void trackDetailClick(final TrackingApi apiInstance) {
		final ClickEvent event = new ClickEvent();
		event.setId("3865");
		event.setSid("abc123def456ghi789");
		event.setTitle("BMC streetfire SSW");
		event.setUserId("user123");
		event.setQuery("mountain bike");
		event.setPos(28);
		event.setOrigPos(28);
		event.setPage(3);
		event.setPageSize(12);
		event.setOrigPageSize(12);
		event.setSimi(99.41d);
		event.setMasterId("1234");

		try {
			apiInstance.trackClickUsingPOST(Settings.getChannel(), Collections.singletonList(event));
		} catch (final ApiException e) {
			LOG.error("Exception when calling TrackingApi#trackClickUsingPOST", e);
		}
	}

	private static void trackBuy(final TrackingApi apiInstance) {
		final CartOrCheckoutEvent event = new CartOrCheckoutEvent();
		event.setId("3865");
		event.setSid("abc123def456ghi789");
		event.setTitle("BMC streetfire SSW");
		event.setUserId("user123");
		event.setCount(48);
		event.setPrice(1499d);
		event.setMasterId("1234");

		try {
			apiInstance.trackCheckoutUsingPOST(Settings.getChannel(), Collections.singletonList(event));
		} catch (final ApiException e) {
			LOG.error("Exception when calling TrackingApi#trackCheckoutUsingPOST", e);
		}
	}

	private static void trackCart(final TrackingApi apiInstance) {
		final CartOrCheckoutEvent event = new CartOrCheckoutEvent();
		event.setId("3865");
		event.setSid("abc123def456ghi789");
		event.setTitle("BMC streetfire SSW");
		event.setUserId("user123");
		event.setCount(48);
		event.setPrice(1499d);
		event.setMasterId("1234");

		try {
			apiInstance.trackCartUsingPOST(Settings.getChannel(), Collections.singletonList(event));
		} catch (final ApiException e) {
			LOG.error("Exception when calling TrackingApi#trackCartUsingPOST", e);
		}
	}

	private static void trackRecEngineClick(final TrackingApi apiInstance) {
		final RecommendationClickEvent event = new RecommendationClickEvent();
		event.setId("3865");
		event.setSid("abc123def456ghi789");
		event.setTitle("BMC streetfire SSW");
		event.setUserId("user123");
		event.setMainId("4848");
		event.setMasterId("1234");

		try {
			apiInstance.trackRecommendationClickUsingPOST(Settings.getChannel(), Collections.singletonList(event));
		} catch (final ApiException e) {
			LOG.error("Exception when calling TrackingApi#trackRecommendationClickUsingPOST", e);
		}
	}

	private static void trackSearchFeedback(final TrackingApi apiInstance) {
		final FeedbackEvent event = new FeedbackEvent();
		event.setSid("abc123def456ghi789");
		event.setQuery("mountain bike");
		event.setPositive(true);
		event.setMessage("great products, I really found what I was looking for.");

		try {
			apiInstance.trackFeedbackUsingPOST(Settings.getChannel(), Collections.singletonList(event));
		} catch (final ApiException e) {
			LOG.error("Exception when calling TrackingApi#trackFeedbackUsingPOST", e);
		}

	}

	private static void trackLogin(final TrackingApi apiInstance) {
		final LoginEvent event = new LoginEvent();
		event.setSid("abc123def456ghi789");
		event.setUserId("user123");

		try {
			apiInstance.trackLoginUsingPOST(Settings.getChannel(), Collections.singletonList(event));
		} catch (final ApiException e) {
			LOG.error("Exception when calling TrackingApi#trackLoginUsingPOST", e);
		}
	}

	private static void trackSearchLogEvent(final TrackingApi apiInstance) {
		final SearchLogEvent event = new SearchLogEvent();
		event.setId("3865");
		event.setSid("abc123def456ghi789");
		event.setPage(3);
		event.setPageSize(12);
		event.setQuery("mountain bike");
		event.setHitCount(520);
		event.setSearchTime(128);
		// range of bestSimi and minSimi is 10000 - 0 instead of a percentage
		event.setBestSimi(9941);
		event.setMinSimi(9323);
		event.setFilters(Collections.singletonList(getFilter()));

		try {
			apiInstance.trackLogUsingPOST(Settings.getChannel(), Collections.singletonList(event));
		} catch (final ApiException e) {
			LOG.error("Exception when calling TrackingApi#trackLogUsingPOST", e);
		}
	}

	private static Filter getFilter() {
		final FilterValue filterValue = new FilterValue();
		filterValue.setValue("Cube");

		final Filter filter = new Filter();
		filter.setName("filterBrand");
		filter.setValueList(Collections.singletonList(filterValue));

		return filter;
	}
}

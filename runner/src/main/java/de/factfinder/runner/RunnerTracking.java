package de.factfinder.runner;

import de.factfinder.client.ApiException;
import de.factfinder.client.api.TrackingApi;
import de.factfinder.client.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrates the usage of the FACT-Finder REST API to track various events.
 */
public final class RunnerTracking {
    private static final Logger LOG = LogManager.getLogger(RunnerTracking.class.getSimpleName());

    private RunnerTracking() {
    }

    public static void main(final String[] args) {
        final TrackingApi trackingClient = new TrackingApi(Settings.getClient());

        trackDetailClick(trackingClient);
        trackCart(trackingClient);
        trackBuy(trackingClient);
        trackPredBasketClick(trackingClient);
        trackRecEngineClick(trackingClient);
        trackSearchFeedback(trackingClient);
        trackLandingPageClick(trackingClient);
        trackLogin(trackingClient);
        trackSearchLogEvent(trackingClient);
    }

    private static void trackDetailClick(final TrackingApi trackingClient) {
        final ClickEvent event = new ClickEvent();
        //event.setCampaign("1"); //contains campaignId if product has been added by a campaign
        event.setId("3865");
        event.setSid("abc123def456ghi789");
        event.setTitle("BMC streetfire SSW");
        event.setUserId("user123");
        event.setQuery("mountain bike");
        event.setPos(28);
        event.setPage(3);
        event.setPageSize(12);
        event.setScore(99.41d);
        event.setMasterId("1234");
        event.setPurchaserId("purchaser123");

        try {
            trackingClient.trackClickUsingPOST(Settings.getChannel(), Collections.singletonList(event));
        } catch (final ApiException e) {
            LOG.error("Exception when calling TrackingApi#trackClickUsingPOST", e);
        }
    }

    private static void trackBuy(final TrackingApi trackingClient) {
        final CartOrCheckoutEvent event = new CartOrCheckoutEvent();
        event.setId("3865");
        event.setSid("abc123def456ghi789");
        event.setTitle("BMC streetfire SSW");
        event.setUserId("user123");
        event.setCount(48);
        event.setPrice(1499d);
        event.setMasterId("1234");
        event.setPurchaserId("purchaser123");

        try {
            trackingClient.trackCheckoutUsingPOST(Settings.getChannel(), Collections.singletonList(event));
        } catch (final ApiException e) {
            LOG.error("Exception when calling TrackingApi#trackCheckoutUsingPOST", e);
        }
    }

    private static void trackCart(final TrackingApi trackingClient) {
        final CartOrCheckoutEvent event = new CartOrCheckoutEvent();
        event.setId("3865");
        event.setSid("abc123def456ghi789");
        event.setTitle("BMC streetfire SSW");
        event.setUserId("user123");
        event.setCount(48);
        event.setPrice(1499d);
        event.setPurchaserId("purchaser123");
        event.setMasterId("1234");

        try {
            trackingClient.trackCartUsingPOST(Settings.getChannel(), Collections.singletonList(event));
        } catch (final ApiException e) {
            LOG.error("Exception when calling TrackingApi#trackCartUsingPOST", e);
        }
    }

    private static void trackPredBasketClick(final TrackingApi trackingClient) {
        final List<PredBasketClickEvent> events = new ArrayList<>();
        final PredBasketClickEvent event = new PredBasketClickEvent();
        event.setId("3865");
        event.setSid("abc123def456ghi789");
        event.setTitle("BMC streetfire SSW");
        event.setUserId("user123");
        event.setMasterId("1234");
        event.setPurchaserId("purchaser123");
        events.add(event);
        try {
            trackingClient.trackPredBasketClickUsingPOST(Settings.getChannel(), events);
        } catch (final ApiException e) {
            LOG.error("Exception when calling TrackingApi#trackPredBasketClickUsingPOST", e);
        }
    }

    private static void trackRecEngineClick(final TrackingApi trackingClient) {
        final RecommendationClickEvent event = new RecommendationClickEvent();
        event.setId("3865");
        event.setSid("abc123def456ghi789");
        event.setTitle("BMC streetfire SSW");
        event.setUserId("user123");
        event.setMainId("4848");
        event.setMasterId("1234");
        event.setPurchaserId("purchaser123");

        try {
            trackingClient.trackRecommendationClickUsingPOST(Settings.getChannel(), Collections.singletonList(event));
        } catch (final ApiException e) {
            LOG.error("Exception when calling TrackingApi#trackRecommendationClickUsingPOST", e);
        }
    }

    private static void trackSearchFeedback(final TrackingApi trackingClient) {
        final FeedbackEvent event = new FeedbackEvent();
        event.setSid("abc123def456ghi789");
        event.setQuery("mountain bike");
        event.setPositive(true);
        event.setMessage("great products, I really found what I was looking for.");

        try {
            trackingClient.trackFeedbackUsingPOST(Settings.getChannel(), Collections.singletonList(event));
        } catch (final ApiException e) {
            LOG.error("Exception when calling TrackingApi#trackFeedbackUsingPOST", e);
        }
    }

    private static void trackLandingPageClick(final TrackingApi trackingClient) {
        final LandingPageClickEvent event = new LandingPageClickEvent();
        event.setSid("abc123def456ghi789");
        event.setId("3865");
        event.setTitle("BMC streetfire SSW");
        event.setPurchaserId("purchaser123");
        event.setMasterId("1234");
        event.setUserId("user123");
        event.setPageId("page123");
        event.setCampaign("campaignId");

        try {
            trackingClient.trackLandingPageClickUsingPOST(Settings.getChannel(), Collections.singletonList(event));
        } catch (final ApiException e) {
            LOG.error("Exception when calling TrackingApi#trackLandingPageClickUsingPOST", e);
        }
    }

    private static void trackLogin(final TrackingApi trackingClient) {
        final LoginEvent event = new LoginEvent();
        event.setSid("abc123def456ghi789");
        event.setUserId("user123");

        try {
            trackingClient.trackLoginUsingPOST(Settings.getChannel(), Collections.singletonList(event));
        } catch (final ApiException e) {
            LOG.error("Exception when calling TrackingApi#trackLoginUsingPOST", e);
        }
    }

    private static void trackSearchLogEvent(final TrackingApi trackingClient) {
        final SearchLogEvent event = new SearchLogEvent();
        event.setId("3865");
        event.setSid("abc123def456ghi789");
        event.setPage(3);
        event.setPageSize(12);
        event.setQuery("mountain bike");
        event.setHitCount(520);
        event.setSearchTime(128);
        event.setMaxScore(100);
        event.setMinScore(70);
        event.setFilters(Collections.singletonList(getFilter()));

        try {
            trackingClient.trackLogUsingPOST(Settings.getChannel(), Collections.singletonList(event));
        } catch (final ApiException e) {
            LOG.error("Exception when calling TrackingApi#trackLogUsingPOST", e);
        }
    }

    private static Filter getFilter() {
        final FilterValue filterValue = new FilterValue();
        filterValue.setValue("Cube");
        filterValue.setExclude(false);
        filterValue.setType(FilterValue.TypeEnum.OR);

        final Filter filter = new Filter();
        filter.setName("filterBrand");
        filter.setValues(Collections.singletonList(filterValue));

        return filter;
    }
}

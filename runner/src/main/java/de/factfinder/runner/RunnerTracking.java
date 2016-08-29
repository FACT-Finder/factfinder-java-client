package de.factfinder.runner;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.factfinder.api.FFApi;
import de.factfinder.api.FFApiException;

/**
 * This class demonstrates the usage of the FACT-Finder JSON API to track various events.
 *
 */
public final class RunnerTracking {
	private static final Logger	LOG	= LogManager.getLogger(RunnerTracking.class.getSimpleName());

	private RunnerTracking() {
	}

	public static void main(final String[] args) {
		final FFApi api = new FFApi(Settings.getEndpointUrl(), Settings.getAuthentication());

		trackDetailClick(api);
		trackCart(api);
		trackBuy(api);
		trackRecEngineClick(api);
		trackSearchFeedback(api);
		trackLogin(api);
		trackShopCacheHit(api);
	}

	private static void trackDetailClick(final FFApi api) {
		// general information
		final MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();

		// general information
		map.put("id", "3865");
		// channel id will be passed below
		map.put("sid", "abc123def456ghi789");
		map.put("event", "click");
		map.put("title", "BMC streetfire SSW");
		map.put("userId", "user123");
		// event specific information
		map.put("query", "mountain bike");
		map.put("pos", "28");
		map.put("origPos", "28");
		map.put("page", "3");
		map.put("pageSize", "12");
		map.put("origPageSize", "12");
		map.put("simi", "99.41");
		map.put("masterId", "1234");

		sendTrackingRequest(api, map);
	}

	private static void trackBuy(final FFApi api) {
		final MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();

		// general information
		map.put("id", "3865");
		// channel id will be passed below
		map.put("sid", "abc123def456ghi789");
		map.put("event", "cart");
		map.put("title", "BMC streetfire SSW");
		map.put("userId", "user123");

		// event specific information
		map.put("count", "48");
		map.put("price", "1499");
		map.put("masterId", "1234");

		sendTrackingRequest(api, map);
	}

	private static void trackCart(final FFApi api) {
		final MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();

		// general information
		map.put("id", "3865");
		// channel id will be passed below
		map.put("sid", "abc123def456ghi789");
		map.put("event", "checkout");
		map.put("title", "BMC streetfire SSW");
		map.put("userId", "user123");

		// event specific information
		map.put("count", "48");
		map.put("price", "1499");
		map.put("masterId", "1234");

		sendTrackingRequest(api, map);
	}

	private static void trackRecEngineClick(final FFApi api) {
		final MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();

		// general information
		map.put("id", "3865");
		// channel id will be passed below
		map.put("sid", "abc123def456ghi789");
		map.put("event", "recommendationClick");
		map.put("title", "BMC streetfire SSW");
		map.put("userId", "user123");

		// event specific information
		map.put("mainId", "4848");
		map.put("masterId", "1234");

		sendTrackingRequest(api, map);
	}

	private static void trackSearchFeedback(final FFApi api) {
		final MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();

		// general information
		map.put("id", "3865");
		// channel id will be passed below
		map.put("sid", "abc123def456ghi789");
		map.put("event", "feedback");
		map.put("title", "BMC streetfire SSW");
		map.put("userId", "user123");

		// event specific information
		map.put("query", "mountain bike");
		map.put("positive", "true");
		map.put("message", "great products, I really found what I was looking for.");

		sendTrackingRequest(api, map);

	}

	private static void trackLogin(final FFApi api) {
		final MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();

		// channel id will be passed below
		map.put("event", "login");
		map.put("sid", "abc123def456ghi789");
		map.put("userId", "user123");

		sendTrackingRequest(api, map);
	}

	private static void trackShopCacheHit(FFApi api) {
		final MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();

		// general information
		map.put("id", "3865");
		map.put("sid", "abc123def456ghi789");
		map.put("event", "log");

		// event specific information
		map.put("page", "3");
		map.put("pageSize", "12");
		map.put("query", "mountain bike");
		map.put("hitCount", "520");
		map.put("searchTime", "128");
		// range of bestSimi and minSimi is 10000 - 0 instead of a percentage
		map.put("bestSimi", "9941");
		map.put("minSimi", "9323");

		// optional event specific information (details see integration documentation)
		map.put("filterBrand", "Cube");

		sendTrackingRequest(api, map);
	}

	private static void sendTrackingRequest(final FFApi api, final MultiValuedMap<String, String> parameters) {
		try {
			api.track(Settings.getChannel(), parameters);
			LOG.info("Tracking " + parameters.get("event") + " successful");
		} catch (final FFApiException e) {
			LOG.error("Tracking " + parameters.get("event") + " not successful: " + e.getResponseMessage());
			LOG.error(e.getResponseStacktrace());
		}
	}
}

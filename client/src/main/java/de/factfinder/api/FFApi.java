package de.factfinder.api;

import static de.factfinder.api.utils.FFApiHelper.PROPERTY_CHANNEL;
import static de.factfinder.api.utils.FFApiHelper.PROPERTY_DO;
import static de.factfinder.api.utils.FFApiHelper.addIfNotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.lang3.Validate;
import org.apache.commons.validator.UrlValidator;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.factfinder.api.utils.FFApiHelper;
import de.factfinder.ffcompare.FFCompare;
import de.factfinder.ffdatabaseexpiration.FFDatabaseExpiration;
import de.factfinder.ffimport.FFImport;
import de.factfinder.ffproductcampaigns.FFProductCampaign;
import de.factfinder.ffrecommender.FFRecommender;
import de.factfinder.ffresult.FFResult;
import de.factfinder.ffresult.SearchControlParams;
import de.factfinder.ffsimilarrecords.FFSimilarRecords;
import de.factfinder.ffsuggest.FFSuggest;
import de.factfinder.fftagcloud.FFTagCloud;

public class FFApi {
	public static final String			VERSION			= "7.0";
	private static final UrlValidator	URL_VALIDATOR	= new UrlValidator(new String[] {"http", "https"});
	private static final String			IDS_ONLY		= "idsOnly";

	private final String				endPoint;
	private final Authentication		authentication;
	private final ObjectMapper			mapper			= new ObjectMapper();

	/**
	 * Constructs a new FFApi.
	 *
	 * @param endPoint the endPoint to the fact-finder application
	 * @param authentication the authentication to access fact-finder
	 * @param version the api version
	 */
	public FFApi(final String endPoint,
			final Authentication authentication) {
		Validate.isTrue(URL_VALIDATOR.isValid(endPoint), "The endPoint must be a valid url.");
		this.endPoint = endPoint + (endPoint.endsWith("/") ? "" : "/");
		this.authentication = authentication;
	}

	/**
	 * Search with the given search params
	 *
	 * @param searchParams the search params
	 * @return a search result
	 */
	public FFResult search(final SearchParams searchParams) {
		return search(searchParams, null);
	}

	/**
	 * @param searchParams the search params
	 * @param searchControlParams the search control params
	 * @return a search result
	 */
	public FFResult search(final SearchParams searchParams, final SearchControlParams searchControlParams) {
		Validate.notNull(searchParams, "The searchParams may not be null");
		final MultiValuedMap<String, String> additionalProps = getMapWithChannelAndCustomParams(searchParams.getChannel(), searchParams.getCustomParameters());

		additionalProps.putAll(FFApiHelper.convertToParameters(searchParams));
		if (searchControlParams != null) {
			additionalProps.putAll(FFApiHelper.convertToParameters(searchControlParams));
		}
		return sendRequestAndDeserialize(FFApiActions.SEARCH, additionalProps, new TypeReference<FFResult>() {});
	}

	/**
	 * Start an import.
	 *
	 * @param channel the channel which should be imported
	 * @return the import results
	 */
	public FFImport startImport(final String channel) {
		return startImport(channel, null);
	}

	/**
	 * Start an import.
	 *
	 * @param channel the channel which should be imported
	 * @param download if true downloads the import file from the configured URL inside the search config.
	 * @return the import results
	 */
	public FFImport startImport(final String channel, final Boolean download) {
		return startImport(channel, download, null);
	}

	/**
	 * Start an import.
	 *
	 * @param channel the channel which should be imported
	 * @param download if true downloads the import file from the configured URL inside the search config.
	 * @param customParameters parameters which will be added additional to the request url
	 * @return the import results
	 */
	public FFImport startImport(final String channel, final Boolean download, final List<CustomParameter> customParameters) {
		return startImport(channel, download, customParameters, false);
	}

	/**
	 * Start a suggest import.
	 *
	 * @param channel the channel which should be imported
	 * @return the import results
	 */
	public FFImport startSuggestImport(final String channel) {
		return startSuggestImport(channel, null);
	}

	/**
	 * Start a suggest import.
	 *
	 * @param channel the channel which should be imported
	 * @param download if true downloads the import file from the configured URL inside the suggest config.
	 * @return the import results
	 */
	public FFImport startSuggestImport(final String channel, final Boolean download) {
		return startSuggestImport(channel, download, null);
	}

	/**
	 * Start a suggest import.
	 *
	 * @param channel the channel which should be imported
	 * @param download if true downloads the import file from the configured URL inside the suggest config.
	 * @param customParameters parameters which will be added additional to the request url
	 * @return the import results
	 */
	public FFImport startSuggestImport(final String channel, final Boolean download, final List<CustomParameter> customParameters) {
		return startImport(channel, download, customParameters, true);

	}

	private FFImport startImport(final String channel, final Boolean download, final List<CustomParameter> customParameters, final boolean isSuggest) {
		final MultiValuedMap<String, String> additionalProps = getMapWithChannelAndCustomParams(channel, customParameters);
		addIfNotNull(additionalProps, "download", download);
		addIfNotNull(additionalProps, "type", isSuggest ? "suggest" : null);
		return sendRequestAndDeserialize(FFApiActions.IMPORT, additionalProps, new TypeReference<FFImport>() {});
	}

	/**
	 * Returns relevant product information for each requested article number, as well as information on the attributes being compared,
	 *
	 * @param channel the channel
	 * @param ids the article numbers
	 * @return products and its differences
	 */
	public FFCompare getComparedProducts(final String channel, final List<String> ids) {
		return getComparedProducts(channel, ids, null);
	}

	/**
	 * Returns relevant product information for each requested article number, as well as information on the attributes being compared,
	 *
	 * @param channel the channel
	 * @param ids the article numbers
	 * @param idsOnly if true returns only the different field values and the attributes.
	 * @return products and its differences
	 */
	public FFCompare getComparedProducts(final String channel, final List<String> ids, final Boolean idsOnly) {
		return getComparedProducts(channel, ids, idsOnly, null);
	}

	/**
	 * Returns relevant product information for each requested article number, as well as information on the attributes being compared,
	 *
	 * @param channel the channel
	 * @param ids the article numbers
	 * @param idsOnly if true returns only the different field values and the attributes.
	 * @param customParameters parameters which will be added additional to the request url
	 * @return products and its differences
	 */
	public FFCompare getComparedProducts(final String channel, final List<String> ids, final Boolean idsOnly, final List<CustomParameter> customParameters) {
		final MultiValuedMap<String, String> additionalProps = getMapWithChannelAndCustomParams(channel, customParameters);
		Validate.notNull(ids, "The ids may not be null");
		additionalProps.put("ids", ids.stream().collect(Collectors.joining(";")));
		addIfNotNull(additionalProps, IDS_ONLY, idsOnly);
		return sendRequestAndDeserialize(FFApiActions.COMPARE, additionalProps, new TypeReference<FFCompare>() {});
	}

	/**
	 * Provides terms for the Tag Cloud.
	 *
	 * @param channel the channel
	 * @return the terms for the Tag Cloud
	 */
	public List<FFTagCloud> getTagCloud(final String channel) {
		return getTagCloud(channel, null);
	}

	/**
	 * Provides terms for the Tag Cloud.
	 *
	 * @param channel the channel
	 * @param wordCount limit the terms requested in this request.
	 * @return the terms for the Tag Cloud
	 */
	public List<FFTagCloud> getTagCloud(final String channel, final Integer wordCount) {
		return getTagCloud(channel, wordCount, null);
	}

	/**
	 * Provides terms for the Tag Cloud.
	 *
	 * @param channel the channel
	 * @param wordCount limit the terms requested in this request.
	 * @param customParameters parameters which will be added additional to the request url
	 * @return the terms for the Tag Cloud
	 */
	public List<FFTagCloud> getTagCloud(final String channel, final Integer wordCount, final List<CustomParameter> customParameters) {
		final MultiValuedMap<String, String> additionalProps = getMapWithChannelAndCustomParams(channel, customParameters);
		additionalProps.put("do", "getTagCloud");
		addIfNotNull(additionalProps, "wordCount", wordCount);
		return sendRequestAndDeserialize(FFApiActions.TAG_CLOUD, additionalProps, new TypeReference<List<FFTagCloud>>() {});
	}

	/**
	 * Provides suggested search terms for the given query
	 *
	 * @param channel the channel
	 * @param query the query
	 * @return suggested search terms
	 */
	public FFSuggest getSuggestions(final String channel, final String query) {
		return getSuggestions(channel, query, null);
	}

	/**
	 * Provides suggested search terms for the given query
	 *
	 * @param channel the channel
	 * @param query the query
	 * @param customParameters parameters which will be added additional to the request url
	 * @return suggested search terms
	 */
	public FFSuggest getSuggestions(final String channel, final String query, final List<CustomParameter> customParameters) {
		final MultiValuedMap<String, String> additionalProps = getMapWithChannelAndCustomParams(channel, customParameters);
		Validate.notNull(query, "The query may not be null");
		additionalProps.put("query", query);
		return sendRequestAndDeserialize(FFApiActions.SUGGEST, additionalProps, new TypeReference<FFSuggest>() {});
	}

	/**
	 * Provides similar products for a given product.
	 *
	 * @param channel the channel
	 * @param id the product id
	 * @return similar products
	 */
	public FFSimilarRecords getSimilarRecords(final String channel, final String id) {
		return getSimilarRecords(channel, id, null);
	}

	/**
	 * Provides similar products for a given product.
	 *
	 * @param channel the channel
	 * @param id the product id
	 * @param maxRecordsCount set the number of products which should be returned
	 * @return similar products
	 */
	public FFSimilarRecords getSimilarRecords(final String channel, final String id, final Integer maxRecordsCount) {
		return getSimilarRecords(channel, id, maxRecordsCount, null);
	}

	/**
	 * Provides similar products for a given product.
	 *
	 * @param channel the channel
	 * @param id the product id
	 * @param maxRecordsCount set the number of products which should be returned
	 * @param idsOnly if true request only product ids
	 * @return similar products
	 */
	public FFSimilarRecords getSimilarRecords(final String channel, final String id, final Integer maxRecordsCount, final Boolean idsOnly) {
		return getSimilarRecords(channel, id, maxRecordsCount, idsOnly, null);
	}

	/**
	 * Provides similar products for a given product.
	 *
	 * @param channel the channel
	 * @param id the product id
	 * @param maxRecordsCount set the number of products which should be returned
	 * @param idsOnly if true request only product ids
	 * @param customParameters parameters which will be added additional to the request url
	 * @return similar products
	 */
	public FFSimilarRecords getSimilarRecords(final String channel, final String id, final Integer maxRecordsCount, final Boolean idsOnly,
			final List<CustomParameter> customParameters) {
		final MultiValuedMap<String, String> additionalProps = getMapWithChannelAndCustomParams(channel, customParameters);
		Validate.notNull(id, "The id may not be null");
		additionalProps.put("id", id);
		addIfNotNull(additionalProps, "maxRecordsCount", maxRecordsCount);
		addIfNotNull(additionalProps, IDS_ONLY, idsOnly);
		return sendRequestAndDeserialize(FFApiActions.SIMILAR_RECORDS, additionalProps, new TypeReference<FFSimilarRecords>() {});
	}

	/**
	 * Returns recommendations for the given product ids
	 *
	 * @param channel the channel
	 * @param ids the product ids
	 * @return recommendations
	 */
	public FFRecommender getRecommendations(final String channel, final Collection<String> ids) {
		return getRecommendations(channel, ids, null);
	}

	/**
	 * Returns recommendations for the given product ids
	 *
	 * @param channel the channel
	 * @param ids the product ids
	 * @param maxResults the max results that should be returned
	 * @return recommendations
	 */
	public FFRecommender getRecommendations(final String channel, final Collection<String> ids, final Integer maxResults) {
		return getRecommendations(channel, ids, maxResults, null);
	}

	/**
	 * Returns recommendations for the given product ids
	 *
	 * @param channel the channel
	 * @param ids the product ids
	 * @param maxResults the max results that should be returned
	 * @param idsOnly return only the record ids
	 * @return recommendations
	 */
	public FFRecommender getRecommendations(final String channel, final Collection<String> ids, final Integer maxResults, final Boolean idsOnly) {
		return getRecommendations(channel, ids, maxResults, idsOnly, null);
	}

	/**
	 * Returns recommendations for the given product ids
	 *
	 * @param channel the channel
	 * @param ids the product ids
	 * @param maxResults the max results that should be returned
	 * @param idsOnly return only the record ids
	 * @param customParameters parameters which will be added additional to the request url
	 * @return recommendations
	 */
	public FFRecommender getRecommendations(final String channel, final Collection<String> ids, final Integer maxResults, final Boolean idsOnly,
			final List<CustomParameter> customParameters) {
		final MultiValuedMap<String, String> additionalProps = getMapWithChannelAndCustomParams(channel, customParameters);
		Validate.notNull(ids, "The ids may not be null");

		additionalProps.put(PROPERTY_DO, "getRecommendation");
		ids.forEach(id -> addIfNotNull(additionalProps, "id", id));
		addIfNotNull(additionalProps, "maxResults", maxResults);
		addIfNotNull(additionalProps, IDS_ONLY, idsOnly);
		return sendRequestAndDeserialize(FFApiActions.RECOMMENDER, additionalProps, new TypeReference<FFRecommender>() {});
	}

	/**
	 * Returns products campaigns for the given product.
	 *
	 * @param channel the channel
	 * @param id the product id
	 * @return product campaigns
	 */
	public List<FFProductCampaign> getProductCampaigns(final String channel, final String id) {
		return getProductCampaigns(channel, id, null);
	}

	/**
	 * Returns products campaigns for the given product.
	 *
	 * @param channel the channel
	 * @param id the product id
	 * @param idsOnly if true request only product ids
	 * @return product campaigns
	 */
	public List<FFProductCampaign> getProductCampaigns(final String channel, final String id, final Boolean idsOnly) {
		return getProductCampaigns(channel, id, idsOnly, null);
	}

	/**
	 * Returns products campaigns for the given product.
	 *
	 * @param channel the channel
	 * @param id the product id
	 * @param idsOnly if true request only product ids
	 * @param customParameters parameters which will be added additional to the request url
	 * @return product campaigns
	 */
	public List<FFProductCampaign> getProductCampaigns(final String channel, final String id, final Boolean idsOnly,
			final List<CustomParameter> customParameters) {
		final MultiValuedMap<String, String> additionalProps = getMapWithChannelAndCustomParams(channel, customParameters);
		Validate.notNull(id, "The id may not be null");
		additionalProps.put(PROPERTY_DO, "getProductCampaigns");
		addIfNotNull(additionalProps, "productNumber", id);
		addIfNotNull(additionalProps, IDS_ONLY, idsOnly);
		return sendRequestAndDeserialize(FFApiActions.PRODUCT_CAMPAIGN, additionalProps, new TypeReference<List<FFProductCampaign>>() {});
	}

	/**
	 * Returns shopping cart campaigns for the given products.
	 *
	 * @param channel the channel
	 * @param ids the product ids
	 * @return shopping cart campaigns
	 */
	public List<FFProductCampaign> getShoppingCartCampaigns(final String channel, final Collection<String> ids) {
		return getShoppingCartCampaigns(channel, ids, null);
	}

	/**
	 * Returns shopping cart campaigns for the given products.
	 *
	 * @param channel the channel
	 * @param ids the product ids
	 * @param idsOnly if true request only product ids
	 * @return shopping cart campaigns
	 */
	public List<FFProductCampaign> getShoppingCartCampaigns(final String channel, final Collection<String> ids, final Boolean idsOnly) {
		return getShoppingCartCampaigns(channel, ids, idsOnly, null);
	}

	/**
	 * Returns shopping cart campaigns for the given products.
	 *
	 * @param channel the channel
	 * @param ids the product ids
	 * @param idsOnly if true request only product ids
	 * @param customParameters parameters which will be added additional to the request url
	 * @return shopping cart campaigns
	 */
	public List<FFProductCampaign> getShoppingCartCampaigns(final String channel, final Collection<String> ids, final Boolean idsOnly,
			final List<CustomParameter> customParameters) {
		final MultiValuedMap<String, String> additionalProps = getMapWithChannelAndCustomParams(channel, customParameters);
		Validate.notNull(ids, "The ids may not be null");
		Validate.notEmpty(ids, "The ids may not be empty");
		additionalProps.put(PROPERTY_DO, "getShoppingCartCampaigns");
		ids.forEach(id -> addIfNotNull(additionalProps, "productNumber", id));
		addIfNotNull(additionalProps, IDS_ONLY, idsOnly);
		return sendRequestAndDeserialize(FFApiActions.PRODUCT_CAMPAIGN, additionalProps, new TypeReference<List<FFProductCampaign>>() {});
	}

	/**
	 * @return results if the databases are up-to-date.
	 */
	public FFDatabaseExpiration getDatabaseExpiration() {
		return sendRequestAndDeserialize(FFApiActions.DATABASE_EXPIRATION, new ArrayListValuedHashMap<>(), new TypeReference<FFDatabaseExpiration>() {});
	}

	/**
	 * @param channel the channel
	 * @return results if the database is up-to-date.
	 */
	public FFDatabaseExpiration getDatabaseExpiration(final String channel) {
		return getDatabaseExpiration(channel, null);
	}

	/**
	 * @param channel the channel
	 * @param customParameters parameters which will be added additional to the request url
	 * @return results if the database is up-to-date.
	 */
	public FFDatabaseExpiration getDatabaseExpiration(final String channel, final List<CustomParameter> customParameters) {
		final MultiValuedMap<String, String> additionalProps = getMapWithChannelAndCustomParams(channel, customParameters);
		return sendRequestAndDeserialize(FFApiActions.DATABASE_EXPIRATION, additionalProps, new TypeReference<FFDatabaseExpiration>() {});
	}

	private MultiValuedMap<String, String> getMapWithChannelAndCustomParams(final String channel, final List<CustomParameter> customParameters) {
		Validate.notNull(channel, "The channel may not be null");
		final MultiValuedMap<String, String> map = new ArrayListValuedHashMap<String, String>();
		addIfNotNull(map, PROPERTY_CHANNEL, channel);
		if (customParameters != null) {
			customParameters.forEach(customParameter -> addIfNotNull(map, customParameter.getKey(), customParameter.getValue()));
		}
		return map;
	}

	private String sendRequest(final String action, final MultiValuedMap<String, String> additionalGetParameters) {
		HttpURLConnection connection = null;

		try {
			// Create connection

			final URL url = getUrl(action, additionalGetParameters);
			System.out.println(url);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setRequestProperty("Content-Language", "en-US");

			connection.setUseCaches(false);
			connection.setInstanceFollowRedirects(false);
			connection.setDoOutput(true);

			return readInputStream(connection.getInputStream());
		} catch (final Exception e) {
			throw new RuntimeException("Could not send the request to fact finder.", e);
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}

	private String readInputStream(final InputStream inputStream) throws IOException {
		final BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream));
		final StringBuilder response = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			response.append(line);
			response.append('\r');
		}
		rd.close();

		return response.toString();
	}

	private URL getUrl(final String action, final MultiValuedMap<String, String> additionalGetParameters) {
		final StringBuilder urlParameter = new StringBuilder("?format=json");
		addIfNotNull(additionalGetParameters, "version", VERSION);

		final Consumer<Map.Entry<String, String>> addToUrl = entry -> {
			urlParameter.append("&").append(entry.getKey()).append("=").append(entry.getValue());
		};
		additionalGetParameters.entries().forEach(addToUrl);
		FFApiHelper.convertToParameters(authentication).entries().forEach(addToUrl);

		try {
			return new URL(endPoint + action + urlParameter);
		} catch (final MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	private <T> T sendRequestAndDeserialize(final String urlPart, final MultiValuedMap<String, String> additionalGetParameters, final TypeReference<T> type) {
		final String s = sendRequest(urlPart, additionalGetParameters);
		try {
			return mapper.readValue(s, type);
		} catch (final IOException e) {
			throw new RuntimeException("Could not deserialize response.", e);
		}
	}

}

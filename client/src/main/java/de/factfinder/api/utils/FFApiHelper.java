package de.factfinder.api.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import de.factfinder.api.Authentication;
import de.factfinder.api.SearchParams;
import de.factfinder.ffresult.Filter;
import de.factfinder.ffresult.SearchControlParams;
import de.factfinder.ffresult.ValueList;

/**
 * Contains constants and helper methods.
 */
public final class FFApiHelper {
	public static final String	PROPERTY_DO							= "do";
	public static final String	PROPERTY_CHANNEL					= "channel";
	public static final String	SORT_PREFIX							= "sort";
	public static final String	FILTER_PREFIX						= "filter";
	public static final String	SUBSTRING_FILTER_PREFIX				= "substringFilter";
	public static final String	DEFAULT_FILTER_OR_SEPARATOR			= "~~~";
	public static final String	DEFAULT_FILTER_AND_SEPARATOR		= "___";
	public static final String	DEFAULT_FILTER_EXCLUDE_VALUE_PREFIX	= "!";

	private FFApiHelper() {
	}

	/**
	 * Adds a key value pair to the map only if the value is not null.
	 * 
	 * @param map the map
	 * @param key the key
	 * @param value the value
	 */
	public static void addIfNotNull(final MultiValuedMap<String, String> map, final String key, final Object value) {
		if (value != null) {
			map.put(key, String.valueOf(value));
		}
	}

	public static MultiValuedMap<String, String> convertToParameters(final SearchControlParams searchControlParams) {
		final MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();

		addIfNotNull(map, "useAsn", searchControlParams.getUseAsn());
		addIfNotNull(map, "disableCache", searchControlParams.getDisableCache());
		addIfNotNull(map, "generateAdvisorTree", searchControlParams.getGenerateAdvisorTree());
		addIfNotNull(map, "idsOnly", searchControlParams.getIdsOnly());
		addIfNotNull(map, "useCampaigns", searchControlParams.getUseCampaigns());
		addIfNotNull(map, "useFoundWords", searchControlParams.getUseFoundWords());
		addIfNotNull(map, "useKeywords", searchControlParams.getUseKeywords());
		addIfNotNull(map, "usePersonalization", searchControlParams.getUsePersonalization());
		addIfNotNull(map, "useAso", searchControlParams.getUseAso());
		addIfNotNull(map, "useSemanticEnhancer", searchControlParams.getUseSemanticEnhancer());

		return map;
	}

	public static MultiValuedMap<String, String> convertToParameters(final Authentication authentication) {
		final MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();

		map.put("username", authentication.getUsername());

		final String hashPassword = DigestUtils.md5Hex(authentication.getPassword());
		if (authentication.isAdvancedMode()) {
			final long timeStamp = System.currentTimeMillis();
			map.put("password", DigestUtils.md5Hex(authentication.getPreFix() + timeStamp + hashPassword + authentication.getPostFix()));
			map.put("timestamp", Long.toString(timeStamp));
		} else {
			map.put("password", hashPassword);
		}

		return map;
	}

	public static MultiValuedMap<String, String> convertToParameters(final SearchParams searchParams) {
		final MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();

		addIfNotNull(map, "query", searchParams.getQuery());
		addIfNotNull(map, PROPERTY_CHANNEL, searchParams.getChannel());
		addIfNotNull(map, "page", searchParams.getPage());
		addIfNotNull(map, "productsPerPage", searchParams.getProductsPerPage());

		if (searchParams.getSortsList() != null) {
			searchParams.getSortsList().forEach(sortItem -> addIfNotNull(map, SORT_PREFIX + sortItem.getField(), sortItem.getSortOrder()));
		}

		addFilters(map, searchParams);

		addIfNotNull(map, "searchField", searchParams.getSearchField());
		addIfNotNull(map, "sid", searchParams.getSessionId());
		addIfNotNull(map, "noArticleNumberSearch", searchParams.getNoArticleNumberSearch());

		return map;
	}

	private static void addFilters(final MultiValuedMap<String, String> map, final SearchParams searchParams) {
		if (searchParams.getFilters() != null) {
			searchParams.getFilters().forEach((filter) -> {
				final String key = getKeyFromFilter(filter);

				final StringBuilder value = new StringBuilder();

				if (filter.getValueList() != null) {
					filter.getValueList().forEach(filterValue -> {
						if (value.length() != 0) {
							value.append(getValueSeparator(filterValue));
						}
						value.append(getValue(filterValue));
					});
				}
				addIfNotNull(map, key, value);
			});
		}
	}

	private static String getValue(final ValueList valueList) {
		return (Boolean.TRUE.equals(valueList.getExclude()) ? DEFAULT_FILTER_EXCLUDE_VALUE_PREFIX : "") + valueList.getValue();
	}

	private static String getValueSeparator(final ValueList filterValue) {
		switch (filterValue.getType()) {
			case OR:
				return DEFAULT_FILTER_OR_SEPARATOR;
			case AND:
				return DEFAULT_FILTER_AND_SEPARATOR;
			default:
				throw new IllegalArgumentException("Unknown value list type: " + filterValue.getType());
		}
	}

	private static String getKeyFromFilter(final Filter filter) {
		final String key;
		if (Boolean.TRUE.equals(filter.getSubstring())) {
			key = SUBSTRING_FILTER_PREFIX;
		} else {
			key = FILTER_PREFIX;
		}
		return key + filter.getName();
	}
}

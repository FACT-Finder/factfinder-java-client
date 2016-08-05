package de.factfinder.api.utils;

import de.factfinder.ffresult.Filter;
import de.factfinder.ffresult.ValueList;

/**
 * A builder for the {@link Filter}.
 */
public class FilterBuilder {
	private Filter	filter	= new Filter();

	private FilterBuilder(final String name) {
		filter.setName(name);
	}

	/**
	 * Set the filter to a substring filter
	 * 
	 * @return the builder
	 */
	public FilterBuilder isSubstringFilter() {
		filter.setSubstring(true);
		return this;
	}

	/**
	 * Adds a new value to the filter.
	 *
	 * @param value the filter value
	 * @return the builder
	 */
	public FilterBuilder valueIs(final String value) {
		return newFilterValue(value, ValueList.Type.OR, false);
	}

	/**
	 * Adds a new excluded value to the filter.
	 *
	 * @param value the filter value
	 * @return the builder
	 */
	public FilterBuilder valueIsNot(final String value) {
		return newFilterValue(value, ValueList.Type.OR, true);
	}

	/**
	 * Adds a new value to the filter with the "or" type.
	 *
	 * @param value the filter value
	 * @return the builder
	 */
	public FilterBuilder orValueIs(final String value) {
		return valueIs(value);
	}

	/**
	 * Adds a new excluded value to the filter with the "or" type.
	 *
	 * @param value the filter value
	 * @return the builder
	 */
	public FilterBuilder orValueIsNot(final String value) {
		return valueIsNot(value);
	}

	/**
	 * Adds a new excluded value to the filter with the "and" type.
	 *
	 * @param value the filter value
	 * @return the builder
	 */
	public FilterBuilder andValueIsNot(final String value) {
		return newFilterValue(value, ValueList.Type.AND, true);
	}

	/**
	 * Adds a new value to the filter with the "and" type.
	 * 
	 * @param value the filter value
	 * @return the builder
	 */
	public FilterBuilder andValueIs(final String value) {
		return newFilterValue(value, ValueList.Type.AND, false);
	}

	/**
	 * @return the builded {@link Filter}
	 */
	public Filter asFilter() {
		return filter;
	}

	/**
	 * Start to building a new filter.
	 * 
	 * @param name the name of the filter
	 * @return the builder
	 */
	public static FilterBuilder withName(final String name) {
		return new FilterBuilder(name);
	}

	private FilterBuilder newFilterValue(final String value, final ValueList.Type type, final boolean isExclude) {
		final ValueList valueList = new ValueList();
		valueList.setType(type);
		valueList.setValue(value);
		valueList.setExclude(isExclude);
		filter.getValueList().add(valueList);
		return this;
	}
}

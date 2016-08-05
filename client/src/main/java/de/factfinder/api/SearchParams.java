package de.factfinder.api;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import de.factfinder.ffresult.Filter;

/**
 * Search Params for configuring a search request.
 */
@Data
public class SearchParams {
	private String					query;
	private String					channel;
	private Integer					page			= 1;
	private Integer					productsPerPage	= 0;
	private Boolean					noArticleNumberSearch;
	private List<SortItem>			sortsList;
	private String					sessionId;
	private List<Filter>			filters			= new ArrayList<>();
	private String					searchField;
	private List<CustomParameter>	customParameters;
}

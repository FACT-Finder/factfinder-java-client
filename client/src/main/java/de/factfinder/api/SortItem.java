package de.factfinder.api;

import lombok.Data;

@Data
public class SortItem {
	public static final String	RELEVANCY	= "Relevancy";

	private SortOrder			sortOrder;
	private String				field;

	public enum SortOrder {
		DESC, ASC
	}
}

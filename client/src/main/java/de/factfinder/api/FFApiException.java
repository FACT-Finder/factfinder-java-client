package de.factfinder.api;

import lombok.Getter;

/**
 * Exception will be thrown when an error occurs while connection to fact-finder.
 */
public class FFApiException extends RuntimeException {
	@Getter
	private int		statusCode;
	@Getter
	private String	response;

	public FFApiException(final int statusCode,
			final String response,
			final Throwable e) {
		super("StatusCode: " + statusCode + " Response: " + response, e);
		this.statusCode = statusCode;
		this.response = response;
	}
}

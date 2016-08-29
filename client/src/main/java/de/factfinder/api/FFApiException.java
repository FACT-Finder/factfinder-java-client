package de.factfinder.api;

import lombok.Getter;

/**
 * Exception will be thrown when an error occurs while connection to fact-finder.
 */
public class FFApiException extends RuntimeException {
	private static final long	serialVersionUID	= 1042719219480632336L;
	@Getter
	private final int     statusCode;
	@Getter
	private final String  serializedResponse;
	private final FFError error;

	public FFApiException(final int statusCode,
			final String serializedResponse,
			final FFError error,
			final Throwable e) {
		super("StatusCode: " + statusCode + " Response: " + serializedResponse, e);
		this.statusCode = statusCode;
		this.error = error;
		this.serializedResponse = serializedResponse;
	}

	/**
	 * @return the error message from FACT-Finder
	 */
	public String getResponseMessage() {
		return error != null ? error.getMessage() : getSerializedResponse();
	}

	/**
	 * @return the stacktrace returned from FACT-Finder
	 */
	public String getResponseStacktrace() {
		return error != null ? error.getStacktrace() : null;
	}
}

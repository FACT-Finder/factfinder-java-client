package de.factfinder.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.Validate;

/**
 * The configuration for read and connection timeouts
 */
public class FFApiTimeoutConfig {
	public static final int			DEFAULT_TIMEOUT		= 4;

	private Map<String, Integer>	timeouts			= new HashMap<>();
	private Map<String, Integer>	connectionTimeouts	= new HashMap<>();

	/**
	 * Constructs a new timeout config and sets default timeout values for import.
	 */
	public FFApiTimeoutConfig() {
		setReadTimeout(FFApiActions.IMPORT, 60 * 6);
		setConnectionTimeout(FFApiActions.IMPORT, 10);
		setReadTimeout(FFApiActions.REFRESH_DATABASES, 30);
	}

	/**
	 * Sets the read timeout for a ffApiAction.
	 *
	 * @param ffApiAction the {@link FFApiActions} constant
	 * @param timeout the timeout in seconds
	 */
	public void setReadTimeout(final String ffApiAction, final int timeout) {
		Validate.isTrue(timeout > 1, "Timeout may not be less than 1.");
		timeouts.put(ffApiAction, timeout);
	}

	/**
	 * Gets the read timeout for a ffApiAction.
	 *
	 * @param ffApiAction the {@link FFApiActions} constant
	 * @return the configured timeout or {@link FFApiTimeoutConfig#DEFAULT_TIMEOUT}.
	 */
	public int getReadTimeout(final String ffApiAction) {
		return timeouts.getOrDefault(ffApiAction, DEFAULT_TIMEOUT);
	}

	/**
	 * Sets the connection timeout for a ffApiAction.
	 *
	 * @param ffApiAction the {@link FFApiActions} constant
	 * @param timeout the timeout in seconds
	 */
	public void setConnectionTimeout(final String ffApiAction, final int timeout) {
		Validate.isTrue(timeout > 1, "Timeout may not be less than 1.");
		connectionTimeouts.put(ffApiAction, timeout);
	}

	/**
	 * Gets the connection timeout for a ffApiAction.
	 *
	 * @param ffApiAction the {@link FFApiActions} constant
	 * @return the configured timeout or {@link FFApiTimeoutConfig#DEFAULT_TIMEOUT}.
	 */
	public int getConnectionTimeout(final String ffApiAction) {
		return connectionTimeouts.getOrDefault(ffApiAction, DEFAULT_TIMEOUT);
	}
}

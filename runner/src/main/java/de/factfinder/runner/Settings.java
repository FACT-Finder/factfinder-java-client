package de.factfinder.runner;

import java.util.concurrent.TimeUnit;

import de.factfinder.api.UpdatingAuthKeyClient;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;

public final class Settings {
	private static final String ENDPOINT_URL = "http://{FACT_FINDER_INSTANCE}/rest";
	private static final String CHANNEL      = "channelName";

	// authentication settings for requests
	private static final String  USERNAME      = "admin";
	private static final String  PASSWORD      = "adminpw";
	private static final String  PREFIX        = "FACT-FINDER";
	private static final String  POSTFIX       = "FACT-FINDER";
	private static final boolean ADVANCED_MODE = true;

	private Settings() {
	}

	/**
	 * As the timestamp used in advanced mode is valid for just a short period it is recommended to create a new auth key for each call. Here this is
	 * automatically done by the {@link UpdatingAuthKeyClient}.
	 * The timeout is also increased, because it might take a while for the import to finish. If you are still getting timeouts, try to configure the timeouts
	 * here.
	 */
	public static void setupAuthKeyRefreshingClientWithHigherTimeout() {
		final ApiClient defaultClient = new UpdatingAuthKeyClient(USERNAME, PASSWORD, PREFIX, POSTFIX, ADVANCED_MODE);
		defaultClient.setBasePath(ENDPOINT_URL);
		defaultClient.getHttpClient().setReadTimeout(60, TimeUnit.SECONDS);
		defaultClient.getHttpClient().setWriteTimeout(60, TimeUnit.SECONDS);
		defaultClient.setConnectTimeout(60000);

		Configuration.setDefaultApiClient(defaultClient);
	}

	public static String getChannel() {
		return CHANNEL;
	}
}

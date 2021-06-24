package de.factfinder.runner;

import de.factfinder.client.ApiClient;

import java.util.concurrent.TimeUnit;


public final class Settings {
    private static final String ENDPOINT_URL = "https://example.fact-finder.com/fact-finder";
    private static final String CHANNEL = "channelName";

    // authentication settings for requests
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "adminpw";

    private Settings() {
    }

    public static ApiClient getClient() {
        final ApiClient defaultClient = new ApiClient();
        defaultClient.setUsername(USERNAME);
        defaultClient.setPassword(PASSWORD);
        defaultClient.setBasePath(ENDPOINT_URL);
        defaultClient.setReadTimeout((int) TimeUnit.MINUTES.toMillis(10));

        return defaultClient;
    }

    public static String getChannel() {
        return CHANNEL;
    }
}

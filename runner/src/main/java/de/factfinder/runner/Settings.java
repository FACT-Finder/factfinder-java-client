package de.factfinder.runner;

import de.factfinder.api.Authentication;

public class Settings {
	private static final String	ENDPOINT_URL	= "http://example.com/FACT-Finder";
	private static final String	CHANNEL			= "en";

	// authentication settings for requests
	private static final String  USERNAME      = "user";
	private static final String  PASSWORD      = "userpw";
	private static final String  PREFIX        = "FACT-FINDER";
	private static final String  POSTFIX       = "FACT-FINDER";
	private static final boolean ADVANCED_MODE = true;

	public static Authentication getAuthentication() {
		final Authentication auth = new Authentication();
		auth.setAdvancedMode(ADVANCED_MODE);
		auth.setUsername(USERNAME);
		auth.setPassword(PASSWORD);
		auth.setPreFix(PREFIX);
		auth.setPostFix(POSTFIX);
		return auth;
	}

	public static String getEndpointUrl() {
		return ENDPOINT_URL;
	}

	public static String getChannel() {
		return CHANNEL;
	}
}

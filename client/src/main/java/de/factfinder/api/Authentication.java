package de.factfinder.api;

import lombok.Data;

/**
 * The authentication contains information to authenticate a user for calling the fact-finder api.
 */
@Data
public class Authentication {
	private String	username;
	private String	password;
	private boolean	advancedMode;
	private String	postFix	= "FACT-FINDER";
	private String	preFix	= "FACT-FINDER";
}

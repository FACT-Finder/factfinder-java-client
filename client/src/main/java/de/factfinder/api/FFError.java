package de.factfinder.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
class FFError {
	@JsonProperty("error")
	private final String	message;
	private final String	stacktrace;
}

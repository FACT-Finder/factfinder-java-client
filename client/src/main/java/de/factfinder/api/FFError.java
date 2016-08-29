package de.factfinder.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
class FFError {
	@JsonProperty("error")
	public final String message;
	public final String stacktrace;
}

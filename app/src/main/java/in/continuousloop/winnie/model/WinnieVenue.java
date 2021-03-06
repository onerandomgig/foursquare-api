package in.continuousloop.winnie.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * Model for a single winnie venue
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public @Getter @Setter class WinnieVenue {
}

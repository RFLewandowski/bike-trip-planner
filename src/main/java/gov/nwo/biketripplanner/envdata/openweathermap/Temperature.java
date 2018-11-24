package gov.nwo.biketripplanner.envdata.openweathermap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature {

    @JsonProperty("day")
    private String avgDay;

    @JsonProperty("min")
    private String minDay;

    @JsonProperty("max")
    private String maxDay;

    @JsonProperty("night")
    private String avgNight;

    @JsonProperty("eve")
    private String evening;

    @JsonProperty("morn")
    private String morning;
}

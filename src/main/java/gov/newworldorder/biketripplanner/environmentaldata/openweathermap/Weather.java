package gov.newworldorder.biketripplanner.environmentaldata.openweathermap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    @JsonProperty("id")
    private String conditionId;

    @JsonProperty("main")
    private String generalCondition;

    @JsonProperty("description")
    private String description;

    @JsonProperty("icon")
    private String iconCode;
}

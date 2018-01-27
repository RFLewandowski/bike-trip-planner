package gov.newworldorder.biketripplanner.environmentaldata.openweathermap;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherResponse {

    @JsonProperty("list")
    private WeatherForecast[] weatherForecast;
}

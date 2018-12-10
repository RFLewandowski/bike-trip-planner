package gov.nwo.biketripplanner.envdata.openweathermap;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecast { //TODO rwork all as in zip but keep this name of class as it is named List in json
    @JsonProperty("dt")
    private long timestampOfForcast;

    @JsonProperty("temp")
    private Temperature temperature;

    @JsonProperty("pressure")
    private Double pressure;

    @JsonProperty("humidity")
    private int humidity;

    @JsonProperty("weather")
    private Weather[] weather;

    @JsonProperty("speed")
    private Double windSpeed;

    @JsonProperty("deg")
    private int windDirection;

    @JsonProperty("clouds")
    private int cloudiness;
}
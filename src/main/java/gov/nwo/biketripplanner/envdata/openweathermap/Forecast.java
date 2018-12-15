
package gov.nwo.biketripplanner.envdata.openweathermap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "dt",
    "temp",
    "pressure",
    "humidity",
    "weather",
    "speed",
    "deg",
    "clouds"
})
public class Forecast {

    @JsonProperty("dt")
    public Integer dt;
    @JsonProperty("temp")
    public Temp temp;
    @JsonProperty("pressure")
    public Float pressure;
    @JsonProperty("humidity")
    public Integer humidity;
    @JsonProperty("weather")
    public java.util.List<Weather> weather = null;
    @JsonProperty("speed")
    public Float speed;
    @JsonProperty("deg")
    public Integer deg;
    @JsonProperty("clouds")
    public Integer clouds;

}

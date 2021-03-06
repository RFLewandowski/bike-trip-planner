
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
        "city",
        "cod",
        "message",
        "cnt",
        "list"
})
public class OpenWeatherResponse {

    @JsonProperty("city")
    public City city;
    @JsonProperty("cod")
    public String cod;
    @JsonProperty("message")
    public Float message;
    @JsonProperty("cnt")
    public Integer cnt;
    @JsonProperty("list")
    public java.util.List<Forecast> forecast = null;

}

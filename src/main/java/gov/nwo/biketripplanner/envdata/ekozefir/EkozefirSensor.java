package gov.nwo.biketripplanner.envdata.ekozefir;

//package gov.nwo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "hash",
        "name",
        "lat",
        "lon",
        "airQuality",
        "values"
})
public class EkozefirSensor {

    @JsonProperty("hash")
    public String hash;
    @JsonProperty("name")
    public String name;
    @JsonProperty("lat")
    public Float lat;
    @JsonProperty("lon")
    public Float lon;
    @JsonProperty("airQuality")
    public Integer airQuality;
    @JsonProperty("values")
    public List<Value> values = null;

}
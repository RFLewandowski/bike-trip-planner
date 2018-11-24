package gov.nwo.biketripplanner.envdata.ekozefir;

//package gov.nwo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "name",
        "value",
        "date"
})
public class Value {

    @JsonProperty("name")
    public String name;
    @JsonProperty("value")
    public String value;
    @JsonProperty("date")
    public Integer date;

}
package gov.nwo.biketripplanner.envdata.ekozefir;

//package gov.nwo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
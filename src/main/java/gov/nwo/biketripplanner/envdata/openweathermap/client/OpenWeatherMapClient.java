package gov.nwo.biketripplanner.envdata.openweathermap.client;

import gov.nwo.biketripplanner.envdata.openweathermap.OpenWeatherResponse;
import gov.nwo.biketripplanner.envdata.openweathermap.WeatherForecast;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Slf4j
@Component
public class OpenWeatherMapClient {

    @Value("${openweathermap.api.endpoint.prod}")
    private String openWeatherApiEndpoint;

    @Value("${openweathermap.api.id}")
    private String openWeatherApiId;

    private final RestTemplate restTemplate;

    @Autowired
    public OpenWeatherMapClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherForecast getTomorrowsWeather(String city) {
        URI requestUrl = buildTomorrowsWeatherRequest(city);
        try {
            OpenWeatherResponse openWeatherResponse = restTemplate
                    .getForObject(requestUrl, OpenWeatherResponse.class);
            return openWeatherResponse.getWeatherForecast()[0];
        } catch (RestClientException | NullPointerException e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    private URI buildTomorrowsWeatherRequest(String city) {
        return UriComponentsBuilder
                .fromHttpUrl(openWeatherApiEndpoint + "/forecast/daily" + "?q=" +
                        city + //city from coutry as below
                        ",pl" + //country fixed set - Poland
                        "&cnt=1" + //only one day of forecast
                        "&APPID=" + openWeatherApiId +
                        "&units=metric")
                .build()
                .encode()
                .toUri();
    }
}
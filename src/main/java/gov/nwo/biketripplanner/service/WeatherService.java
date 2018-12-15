package gov.nwo.biketripplanner.service;

import gov.nwo.biketripplanner.envdata.openweathermap.Forecast;
import gov.nwo.biketripplanner.envdata.openweathermap.client.OpenWeatherMapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private final OpenWeatherMapClient openWeatherMapClient;

    @Autowired
    public WeatherService(OpenWeatherMapClient openWeatherMapClient) {
        this.openWeatherMapClient = openWeatherMapClient;
    }

    public Forecast getTomorrowWeather(String city) {
        return openWeatherMapClient.getTomorrowsWeather(city);
    }

}

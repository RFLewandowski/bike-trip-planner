package gov.newworldorder.biketripplanner.service;

import gov.newworldorder.biketripplanner.environmentaldata.openweathermap.WeatherForecast;
import gov.newworldorder.biketripplanner.environmentaldata.openweathermap.client.OpenWeatherMapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private final OpenWeatherMapClient openWeatherMapClient;

    @Autowired
    public WeatherService(OpenWeatherMapClient openWeatherMapClient) {
        this.openWeatherMapClient = openWeatherMapClient;
    }

    public WeatherForecast getTomorrowWeather(String city) {
        return openWeatherMapClient.getTomorrowsWeather(city);
    }

}

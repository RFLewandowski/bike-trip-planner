package gov.nwo.biketripplanner.controller;

import gov.nwo.biketripplanner.envdata.openweathermap.Forecast;
import gov.nwo.biketripplanner.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/weather")
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public Forecast getTomorrowsWeatherForecast(@PathVariable("city") String city) {
        return weatherService.getTomorrowWeather(city);
    }
}

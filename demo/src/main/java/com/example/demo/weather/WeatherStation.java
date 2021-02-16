package com.example.demo.weather;

import java.util.Observer;
public class WeatherStation {
    public static void main(String[] args) {
        RedoWeatherData weatherData = new RedoWeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 80, 23.4f);
        weatherData.setMeasurements(90, 80, 23.4f);
        weatherData.setMeasurements(100, 80, 23.4f);
    }
}

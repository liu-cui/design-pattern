package com.observer;

/**
 * @author cuiliu
 */
public class App {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(19, 97, 0);
        weatherData.setMeasurements(19, 97, 7);
        weatherData.setMeasurements(19, 97, 3);
        weatherData.setMeasurements(19, 97, 1);
    }
}

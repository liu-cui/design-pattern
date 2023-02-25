package com.observerinternal;

import com.observerpattern.DisplayElement;
import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * @author cuiliu
 */
@Slf4j
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private double temperature;
    private double humidity;
    private double pressure;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void display() {
        log.info("Current conditions: " + temperature + " F degrees and " + humidity + " % humidity and " + pressure + " pressure");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}

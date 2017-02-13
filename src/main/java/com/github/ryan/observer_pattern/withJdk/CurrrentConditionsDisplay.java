package com.github.ryan.observer_pattern.withJdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Ryan-hou
 * @description:
 * @className: CurrrentConditionsDisplay
 * @date February 13,2017
 */
public class CurrrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void cancelRegister() {
        observable.deleteObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}

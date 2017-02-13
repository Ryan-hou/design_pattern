package com.github.ryan.observer_pattern.withoutJdk;

/**
 * @author Ryan-hou
 * @description:
 * @className: StatisticsDisplay
 * @date February 13,2017
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " +
                temperature + "/" + temperature + "/" + temperature);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        display();
    }
}

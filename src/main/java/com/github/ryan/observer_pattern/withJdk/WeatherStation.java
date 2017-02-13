package com.github.ryan.observer_pattern.withJdk;

/**
 * @author Ryan-hou
 * @description:
 * @className: WeatherStation
 * @date February 13,2017
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrrentConditionsDisplay currrentConditionsDisplay =
                new CurrrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 60, 90);
        System.out.println("\nCancel register....");
        currrentConditionsDisplay.cancelRegister();
        weatherData.setMeasurements(80, 60, 90);
    }
}

package com.github.ryan.observer_pattern.withoutJdk;

/**
 * @author Ryan-hou
 * @description:
 * @className: WeatherStation
 * @date February 13,2017
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);

        // 采用推模式,把数据推给观察者
        weatherData.setMeasurements(80, 65, 34.1f);
        weatherData.setMeasurements(82.2f, 66, 34);

        System.out.println("\nCurrentConditionsDisplay delete register....");
        currentConditionsDisplay.deleteRegister();
        weatherData.setMeasurements(24.9f, 44, 78);
    }
}

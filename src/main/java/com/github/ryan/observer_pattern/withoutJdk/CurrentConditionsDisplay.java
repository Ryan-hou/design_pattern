package com.github.ryan.observer_pattern.withoutJdk;

/**
 * @author Ryan-hou
 * @description:
 * @className: CurrentConditionsDisplay
 * @date February 13,2017
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        // 保存Subject引用,方便取消注册
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void deleteRegister() {
        weatherData.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}

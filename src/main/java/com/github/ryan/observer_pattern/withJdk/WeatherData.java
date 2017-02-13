package com.github.ryan.observer_pattern.withJdk;

import java.util.Observable;

/**
 * @author Ryan-hou
 * @description:
 * @className: WeatherData
 * @date February 13,2017
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    public void measurementsChanged() {
        /**
         * setChanged方法可以让你在更新观察者时,有更过的弹性,你可以适时的通知观察者
         * 总之,你需要调用setChanged(),以便通知开始运转
         */
        setChanged();
        // 采用拉的模式更新观察者数据
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

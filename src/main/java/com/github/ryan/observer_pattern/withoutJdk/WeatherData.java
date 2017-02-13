package com.github.ryan.observer_pattern.withoutJdk;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ryan-hou
 * @description:
 * @className: WeatherData
 * @date February 13,2017
 */
public class WeatherData implements Subject {
    // 用来记录观察者
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    // 当从气象站获取到新的观测值时,我们通知观察者列表
    public void measurementsChanged() {
        notifyObservers();
    }

    // 模拟获取气象值数据
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

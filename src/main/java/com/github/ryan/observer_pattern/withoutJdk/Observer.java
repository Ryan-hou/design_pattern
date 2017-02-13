package com.github.ryan.observer_pattern.withoutJdk;

/**
 * @author Ryan-hou
 * @description:
 * @className: Observer
 * @date February 13,2017
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}

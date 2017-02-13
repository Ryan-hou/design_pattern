package com.github.ryan.observer_pattern.withoutJdk;

/**
 * @author Ryan-hou
 * @description:
 * @className: Subject
 * @date February 13,2017
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

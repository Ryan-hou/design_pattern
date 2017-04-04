package com.github.ryan.compound_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ryan-hou
 * @description:
 * @className: Observable
 * @date April 04,2017
 */
public class Observable implements QuackObservable {
    List<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }
}

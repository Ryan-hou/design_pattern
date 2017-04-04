package com.github.ryan.compound_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: DuckCall
 * @date April 04,2017
 */
public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "DuckCall{}";
    }
}

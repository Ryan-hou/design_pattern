package com.github.ryan.compound_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: RedheadDuck
 * @date April 04,2017
 */
public class RedheadDuck implements Quackable {
    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public String toString() {
        return "RedheadDuck{}";
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}

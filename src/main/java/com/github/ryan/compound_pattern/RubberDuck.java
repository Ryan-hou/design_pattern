package com.github.ryan.compound_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: RubberDuck
 * @date April 04,2017
 */
public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public String toString() {
        return "RubberDuck{}";
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}

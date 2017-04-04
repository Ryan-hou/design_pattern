package com.github.ryan.compound_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: MallardDuck
 * @date April 04,2017
 */
public class MallardDuck implements Quackable {
    Observable observable;

    @Override
    public String toString() {
        return "MallardDuck{}";
    }

    public MallardDuck() {
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
    public void notifyObservers() {
        observable.notifyObservers();
    }
}

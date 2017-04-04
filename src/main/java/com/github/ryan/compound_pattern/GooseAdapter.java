package com.github.ryan.compound_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: GooseAdapter
 * @date April 04,2017
 */
public class GooseAdapter implements Quackable {

    Observable observable;

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "GooseAdapter{}";
    }
}

package com.github.ryan.compound_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: Quackologist
 * @date April 04,2017
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}

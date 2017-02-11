package com.github.ryan.strategy_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: Squeak
 * @date February 11,2017
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

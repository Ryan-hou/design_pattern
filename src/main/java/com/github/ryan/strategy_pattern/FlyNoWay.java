package com.github.ryan.strategy_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: FlyNoWay
 * @date February 11,2017
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}

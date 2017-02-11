package com.github.ryan.strategy_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: FlyRocketPowered
 * @date February 11,2017
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}

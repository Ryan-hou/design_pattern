package com.github.ryan.strategy_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: MiniDuckSimulator
 * @date February 11,2017
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        System.out.println("下面改变飞行行为!");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

package com.github.ryan.strategy_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: ModelDuck
 * @date February 11,2017
 */
public class ModelDuck extends Duck {
    @Override
    protected void display() {
        System.out.println("I'm a model duck");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}

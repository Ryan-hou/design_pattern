package com.github.ryan.adapter_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: MallardDuck
 * @date February 12,2017
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}

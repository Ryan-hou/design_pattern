package com.github.ryan.factory_pattern.simple_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: CheesePizza
 * @date February 19,2017
 */
public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Cheese pizza: prepare...");
    }

    @Override
    public void bake() {
        System.out.println("Cheese pizza: bake...");
    }

    @Override
    public void cut() {
        System.out.println("Cheese pizza: cut...");
    }

    @Override
    public void box() {
        System.out.println("Cheese pizza: box...");
    }
}

package com.github.ryan.factory_pattern.simple_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: PepperoniPizza
 * @date February 19,2017
 */
public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Pepperoni Pizza: prepare...");
    }

    @Override
    public void bake() {
        System.out.println("Pepperoni Pizza: bake...");
    }

    @Override
    public void cut() {
        System.out.println("Pepperoni Pizza: cut...");
    }

    @Override
    public void box() {
        System.out.println("Pepperoni Pizza: box...");
    }
}

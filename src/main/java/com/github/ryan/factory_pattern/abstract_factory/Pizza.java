package com.github.ryan.factory_pattern.abstract_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: Pizza
 * @date February 20,2017
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Clams clams;

    /**
     * 在这个方法中,我们需要收集比萨所需要的原料,而这些原来则来自原料工厂
     */
    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes.");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

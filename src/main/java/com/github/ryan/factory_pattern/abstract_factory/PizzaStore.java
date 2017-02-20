package com.github.ryan.factory_pattern.abstract_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: PizzaStore
 * @date February 20,2017
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    abstract Pizza createPizza(String type);
}

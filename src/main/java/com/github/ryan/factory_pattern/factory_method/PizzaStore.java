package com.github.ryan.factory_pattern.factory_method;

/**
 * @author Ryan-hou
 * @description:
 * @className: PizzaStore
 * @date February 20,2017
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza  = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // 工厂方法,由子类来具体实现
    protected abstract Pizza createPizza(String type);
}

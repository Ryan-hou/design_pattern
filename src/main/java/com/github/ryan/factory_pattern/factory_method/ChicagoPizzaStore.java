package com.github.ryan.factory_pattern.factory_method;

/**
 * @author Ryan-hou
 * @description:
 * @className: ChicagoPizzaStore
 * @date February 20,2017
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            // return new ChicagoStyleVeggiePizza();
            return null;
        } else {
            return null;
        }
    }
}

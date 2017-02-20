package com.github.ryan.factory_pattern.factory_method;

/**
 * @author Ryan-hou
 * @description:
 * @className: NYPizzaStore
 * @date February 20,2017
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            // return new NYStyleVeggiePizza();
            return null; // 部分未实现
        } else if ("clam".equals(type)) {
            // return new NYStyleClamPizza();
            return null;
        } else {
            return null;
        }
    }
}

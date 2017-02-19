package com.github.ryan.factory_pattern.simple_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: PizzaStoreTestDrive
 * @date February 19,2017
 */
public class PizzaStoreTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        pizzaStore.orderPizza("cheese");
        System.out.println("-------------");
        pizzaStore.orderPizza("veggie");
    }
}

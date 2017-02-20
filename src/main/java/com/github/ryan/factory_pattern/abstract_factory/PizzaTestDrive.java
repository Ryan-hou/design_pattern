package com.github.ryan.factory_pattern.abstract_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: PizzaTestDrive
 * @date February 20,2017
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ryan ordered a " + pizza.getName() + "\n");
    }
}

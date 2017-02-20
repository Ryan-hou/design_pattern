package com.github.ryan.factory_pattern.abstract_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: Onion
 * @date February 20,2017
 */
public class Onion implements Veggies {
    @Override
    public void printIngredient() {
        System.out.println("Veggies: Onion");
    }
}

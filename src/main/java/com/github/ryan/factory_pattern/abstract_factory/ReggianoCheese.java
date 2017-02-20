package com.github.ryan.factory_pattern.abstract_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: ReggianoCheese
 * @date February 20,2017
 */
public class ReggianoCheese implements Cheese {
    @Override
    public void printIngredient() {
        System.out.println("Reggiano cheese");
    }
}

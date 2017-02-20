package com.github.ryan.factory_pattern.abstract_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: MarinaraSauce
 * @date February 20,2017
 */
public class MarinaraSauce implements Sauce {
    @Override
    public void printIngredient() {
        System.out.println("Marinara sauce");
    }
}

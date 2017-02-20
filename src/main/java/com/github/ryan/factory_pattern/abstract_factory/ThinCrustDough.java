package com.github.ryan.factory_pattern.abstract_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: ThinCrustDough
 * @date February 20,2017
 */
public class ThinCrustDough implements Dough {
    @Override
    public void printIngredient() {
        System.out.println("Thin crust dough");
    }
}

package com.github.ryan.factory_pattern.abstract_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: FreshClam
 * @date February 20,2017
 */
public class FreshClam implements Clams {
    @Override
    public void printIngredient() {
        System.out.println("Fresh clam");
    }
}

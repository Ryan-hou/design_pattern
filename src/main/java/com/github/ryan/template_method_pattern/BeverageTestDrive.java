package com.github.ryan.template_method_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: BeverageTestDrive
 * @date February 10,2017
 */
public class BeverageTestDrive {
    public static void main(String[] args) {

        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}

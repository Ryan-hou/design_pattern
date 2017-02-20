package com.github.ryan.factory_pattern.factory_method;

/**
 * @author Ryan-hou
 * @description:
 * @className: NYStyleCheesePizza
 * @date February 20,2017
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}

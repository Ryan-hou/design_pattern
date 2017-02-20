package com.github.ryan.factory_pattern.factory_method;

/**
 * @author Ryan-hou
 * @description:
 * @className: ChicagoStyleCheesePizza
 * @date February 20,2017
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicage Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    // 覆盖父类的默认实现
    void cut() {
        System.out.println("Cutting the pizza into square slices.");
    }
}

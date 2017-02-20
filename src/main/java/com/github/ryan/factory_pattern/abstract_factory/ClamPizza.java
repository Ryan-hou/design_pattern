package com.github.ryan.factory_pattern.abstract_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: ClamPizza
 * @date February 20,2017
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        dough.printIngredient();
        sauce = ingredientFactory.createSauce();
        sauce.printIngredient();
        cheese = ingredientFactory.createCheese();
        cheese.printIngredient();
        clams = ingredientFactory.createClam();
        clams.printIngredient();
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices.");
    }
}

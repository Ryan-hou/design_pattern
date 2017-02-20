package com.github.ryan.factory_pattern.abstract_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: PizzaIngredientFactory
 * @date February 20,2017
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Clams createClam();

}

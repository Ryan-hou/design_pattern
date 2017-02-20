package com.github.ryan.factory_pattern.abstract_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: NYPizzaStore
 * @date February 20,2017
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        // 纽约店会用到纽约原料工厂,该原料工厂负责生产所有纽约风味比萨所需的原料
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            /**
             * 对于每一种pizza,我们实例化一个新的披萨,并传进该pizza所需的工厂,
             * 以便pizza获得他的原料
             */
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } /*else if ( ..... ) */
        return pizza;
    }
}

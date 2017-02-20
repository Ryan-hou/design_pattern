package com.github.ryan.factory_pattern.abstract_factory;

import com.github.ryan.factory_pattern.factory_method.PizzaStore;

/**
 * @author Ryan-hou
 * @description:
 * @className: CheesePizza
 * @date February 20,2017
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    /**
     * 使用原料工厂生产pizza原料,代码中使用抽象类型的接口,把客户从使用的实际具体产品中解耦
     */
    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}

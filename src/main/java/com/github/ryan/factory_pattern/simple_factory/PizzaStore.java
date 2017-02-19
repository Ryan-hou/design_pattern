package com.github.ryan.factory_pattern.simple_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: PizzaStore
 * @date February 19,2017
 */
public class PizzaStore {
    /**
     * Pizza工厂的客户,这里要注意,Pizza工厂可能有多个客户,所以我们才把创建pizza的代码抽出来,
     * 这样创建pizza的代码在一点维护,工厂的客户只需要向工厂获得对象即可
     */
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

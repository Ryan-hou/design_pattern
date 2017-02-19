package com.github.ryan.factory_pattern.simple_factory;

/**
 * @author Ryan-hou
 * @description:
 * @className: SimplePizzaFactory
 * @date February 19,2017
 */
public class SimplePizzaFactory {
    /**
     * 注:这里可以使用静态方法,即静态工厂;
     * 好处是可以避免实例化工厂类,坏处是不能通过继承来改变创建方法的行为(静态方法在编译器期进行类型绑定,不能提供多态)
     * @param type
     * @return
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}

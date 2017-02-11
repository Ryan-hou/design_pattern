package com.github.ryan.decorator_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: StarbuzzCoffee
 * @date February 11,2017
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverageOne = new HouseBlend();
        beverageOne = new Soy(beverageOne);
        beverageOne = new Mocha(beverageOne);
        beverageOne = new Whip(beverageOne);
        System.out.println(beverageOne.getDescription() + " $" + beverageOne.cost());
    }
}

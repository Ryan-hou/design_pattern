package com.github.ryan.decorator_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: Espresso
 * @date February 11,2017
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    // 需要计算Espresso的价钱,现在不需要管调料的价格,直接返回Espresso的价格即可
    @Override
    public double cost() {
        return 1.99;
    }
}

package com.github.ryan.decorator_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: HouseBlend
 * @date February 11,2017
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}

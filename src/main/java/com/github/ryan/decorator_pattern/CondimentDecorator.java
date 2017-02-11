package com.github.ryan.decorator_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: CondimentDecorator
 * @date February 11,2017
 */
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}

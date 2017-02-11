package com.github.ryan.decorator_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: Mocha
 * @date February 11,2017
 */
public class Mocha extends CondimentDecorator {

    /**
     * 通过一个实例变量记录被装饰者,并由构造器把被装饰者记录到实例变量
     */
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}

package com.github.ryan.compound_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: AbstractDuckFactory
 * @date April 04,2017
 */

/**
 * 抽象工厂模式: 通过工厂来控制创建对象的操作,提供一些质量控制
 * 此工厂应该生产各种不同类型的鸭子的产品家族
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}

package com.github.ryan.compound_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: QuackCounter
 * @date April 04,2017
 */
public class QuackCounter implements Quackable {
    // 装饰者模式: 包装Quackable接口,增加统计鸭子叫次数的功能

    private Quackable duck;
    private static int numberOfQuacks;

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        // 这里把方法调用委托给鸭子,鸭子又通过组合的方式委托给Observable
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}

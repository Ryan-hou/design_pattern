package com.github.ryan.strategy_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: Duck
 * @date February 11,2017
 */
public abstract class Duck {

    // 使用组合而不是继承
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    protected abstract void display();

    public void performFly() {
        // 委托给行为类
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public final void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    // 用于动态改变行为类
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}

package com.github.ryan.adapter_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: TurkeyAdapter
 * @date February 12,2017
 */
public class TurkeyAdapter implements Duck {

    /**
     * 首先,需要实现想转换成的类型接口,也就是你的客户所期望看到的接口
     * 接着需要取得要适配的对象引用
     */
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // 要让鸭子的飞行和火鸡的飞行能够对应,必须连续调用五次火鸡的fly()来完成
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}

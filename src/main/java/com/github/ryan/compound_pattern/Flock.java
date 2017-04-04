package com.github.ryan.compound_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ryan-hou
 * @description:
 * @className: Flock
 * @date April 04,2017
 */

// 使用组合模式管理鸭子集合: 叶节点为 Quackable, 组合节点为 Flock
public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();

    /**
     * add 方法只在组合节点中定义,这样设计比较安全,你不会调用无意义的方法,但是透明性比较差
     * 现在客户想调用add(),得先确定该Quackable对象是Flock才行;
     * 在 OO 设计中,折中一般是避免不了的
     */
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
            quacker.notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable duck = iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}

package com.github.ryan.compound_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: QuackObservable
 * @date April 04,2017
 */

/**
 * 观察者模式: 任何想被观察的Quackable都必须实现QuackObservable接口(QuackObservable即相当于主题Subject)
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}

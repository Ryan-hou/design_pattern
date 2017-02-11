package com.github.ryan.singleton_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: SingletonLazyFormat
 * @date February 11,2017
 */
public class SingletonLazyFormat {
    /**
     * 懒汉模式实现单例: 依赖JVM在加载这个类时马上创建此唯一的单例实例.
     * JVM保证任何线程访问uniqueInstance静态变量之前,一定先创建此实例
     * 优点: 避免了多线程带来的创建了多个实例的情况
     * 缺点: 不能延迟实例化;如果该类实例化需要的资源很多,也会导致程序的性能问题
     */
    private static SingletonLazyFormat uniqueInstance = new SingletonLazyFormat();

    private SingletonLazyFormat() {}

    public static SingletonLazyFormat getInstance() {
        return uniqueInstance;
    }
}

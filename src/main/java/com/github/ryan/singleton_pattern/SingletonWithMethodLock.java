package com.github.ryan.singleton_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: SingletonWithMethodLock
 * @date February 11,2017
 */
public class SingletonWithMethodLock {
    private static SingletonWithMethodLock uniqueInstance;

    private SingletonWithMethodLock() {}

    /**
     * 通过在方法签名上增加 synchronized 关键字,迫使每个线程在进入方法之前,先等候别的方法
     * 离开该方法.也就是说,不能有两个线程同时进入这个方法
     * 优点: 简单有效
     * 缺点: 效率低,同步一个方法可能造成执行效率下降100倍;而且这个方法只有在第一次执行时,才真正需要
     * 同步,一旦设置好 uniqueInstance 变量,就不再需要同步这个方法了
     * @return
     */
    public static synchronized SingletonWithMethodLock getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonWithMethodLock();
        }
        return uniqueInstance;
    }
}

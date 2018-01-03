package com.github.ryan.singleton_pattern;

/**
 * @author Ryan-hou
 * @description: 使用 double-checked locking 减少使用同步
 * @className: SingletonWithDoubleCheck
 * @date February 11,2017
 */
public class SingletonWithDoubleCheck {

    // volatile 关键字确保当 uniqueInstance 变量被初始化为 singleton 实例时,多个
    // 线程正确的处理 uniqueInstance 变量
    private volatile static SingletonWithDoubleCheck uniqueInstance;

    private SingletonWithDoubleCheck() {}

    public static SingletonWithDoubleCheck getInstance() {
        if (uniqueInstance == null) {
            // 检查实例,如果不存在,才进入同步区块
            synchronized (SingletonWithDoubleCheck.class) {
                if (uniqueInstance == null) {
                    // 再次检查是否存在实例,不存在时才创建实例
                    // volatile 保证了new实例指令不被重排序
                    uniqueInstance = new SingletonWithDoubleCheck();
                }
            }
        }
        return uniqueInstance;
    }

}

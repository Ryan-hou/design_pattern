package com.github.ryan.singleton_pattern;

/**
 * @author ryan.houyl@gmail.com
 * @description:
 * On demand holder idiom: which is thread-safe and a lot easier to understand
 * @className: SingletonOnDemandHolder
 * @date January 03,2018
 */
public class SingletonOnDemandHolder {

    private static class LazySingletonHolder {
        public static SingletonOnDemandHolder singleton = new SingletonOnDemandHolder();
    }

    /**
     * This code is guaranteed to be correct because of the initialization guarantees
     * for static fields; if a field is set in a static initializer, it it guaranteed
     * to be made visible, correctly, to any thread that accesses that class.
     * @return
     */
    public static SingletonOnDemandHolder getInstance() {
        return LazySingletonHolder.singleton;
    }

}

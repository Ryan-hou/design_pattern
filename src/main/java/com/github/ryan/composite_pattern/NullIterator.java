package com.github.ryan.composite_pattern;

import java.util.Iterator;

/**
 * @author Ryan-hou
 * @description:
 * @className: NullIterator
 * @date February 16,2017
 */
public class NullIterator implements Iterator {
    /**
     * 菜单项内没有什么可以遍历的,那么如何实现菜单项的 createIterator() 方法呢?
     * 1) 该方法返回 null,但是客户端代码需要判断该调用是否为null
     * 2) 返回一个迭代器,而这个迭代器的hasNext() 方法永远返回 false,其作用是"没有用"
     * 显然2更好
     */

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}

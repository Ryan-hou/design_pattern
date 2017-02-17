package com.github.ryan.composite_pattern;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author Ryan-hou
 * @description:
 * @className: CompositeIterator
 * @date February 16,2017
 */
public class CompositeIterator implements Iterator {
    /**
     * 实现组合迭代器: 栈加递归的使用
     */

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        /**
         * 初始化组合迭代器,把目前组合的迭代器传给构造器
         * 注:这里传入的相当于一个"虚根节点",类比迭代器的 hasNext 和 next 方法:迭代器的起始节点其实不在迭代器内,所以才会
         * 先判断 hasNext,如果 hasNext 为 true,然后next方法取得集合的第一个元素
         */
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
       if (stack.empty()) {
           // 递归出口
           return false;
       } else {
           Iterator iterator = (Iterator) stack.peek();
           if (!iterator.hasNext()) {
               // 出栈操作对应着 next 方法中的入栈操作来理解
               stack.pop();
               // 递归调用
               return hasNext();
           } else {
               return true;
           }
       }
    }

    @Override
    public Object next() {
        /**
         * 注: 这里 next 的递归调用会导致数据多次被重复入栈的问题,导致打印结果重复
         */
        Iterator iterator = (Iterator) stack.peek();
        MenuComponent menuComponent = (MenuComponent) iterator.next();
        if (menuComponent instanceof Menu) {
            stack.push(menuComponent.createIterator());
        }
        return menuComponent;
        /*if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        } else {
            return null;
        }*/
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

package com.github.ryan.composite_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: MenuComponent
 * @date February 16,2017
 */
public abstract class MenuComponent {
    /**
     * 因为有些方法只对菜单项有意义,而有些只对菜单有意义,默认实现是
     * 抛出 UnsupportedOperationException
     */

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    // print() 是一个操作方法,这个方法同时被菜单和菜单项实现,我们这里还是提供了默认实现
    public void print() {
        throw new UnsupportedOperationException();
    }
}

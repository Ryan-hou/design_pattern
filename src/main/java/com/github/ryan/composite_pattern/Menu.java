package com.github.ryan.composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Ryan-hou
 * @description: 组合类:组合类可以持有菜单项和其他菜单
 * @className: Menu
 * @date February 16,2017
 */
public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    /**
     * print不仅打印出菜单本身的信息,还会打印菜单内所有组件的内容:其他菜单和菜单项
     * 菜单和菜单项类都实现了print方法,这里可以递归调用
     */
    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-----------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}

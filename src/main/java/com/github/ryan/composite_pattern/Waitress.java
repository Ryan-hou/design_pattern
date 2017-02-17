package com.github.ryan.composite_pattern;

import java.util.Iterator;

/**
 * @author Ryan-hou
 * @description:
 * @className: Waitress
 * @date February 16,2017
 */
public class Waitress {
    // allMenus 为最顶层的菜单组件,将它交给Waitress类,即可打印所有的菜单内容
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        // 使用组合迭代器
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n---------");
        while (iterator.hasNext()) {
            MenuComponent menuComponent =
                    (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
                /**
                 * 注: try-catch 作为异常处理,一般不应该处理程序逻辑.但是为了保证对客户代码的透明性,我们把
                 * Menu 和 MenuItem 都归一化为 MenuComponent 来处理,在 Menu 类中是不该使用 isVegetarian 方法的,
                 * 所以我们可以:
                 * 1) 在 Menu 类中,让该方法返回 false
                 * 2) 这里我们使用异常,是想明确传达isVegetarian() 是Menu没有支持的方法,和返回false是不一样的;
                 * 这样的做法也允许后来人为 Menu实现一个合理的 isVegetarian方法
                 */
            }
        }
    }
}

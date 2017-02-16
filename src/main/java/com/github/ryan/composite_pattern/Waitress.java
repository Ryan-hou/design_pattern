package com.github.ryan.composite_pattern;

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
}

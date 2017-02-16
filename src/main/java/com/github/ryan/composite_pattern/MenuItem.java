package com.github.ryan.composite_pattern;

/**
 * @author Ryan-hou
 * @description: 菜单项类,在组合类图里的叶类,她实现组合元素内的行为
 * @className: MenuItem
 * @date February 16,2017
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
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
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(V)");
        }
        System.out.print(", " + getPrice());
        System.out.println(" --- " + getDescription());
    }
}

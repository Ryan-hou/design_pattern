package com.github.ryan.iterator_pattern.withoutJdk;

import java.util.ArrayList;

/**
 * @author Ryan-hou
 * @description:
 * @className: PancakeHouseMenu
 * @date February 15,2017
 */
public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancake made with fresh blueberries",
                true,
                8);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.3);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}

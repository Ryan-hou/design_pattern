package com.github.ryan.iterator_pattern.withoutJdk;

/**
 * @author Ryan-hou
 * @description:
 * @className: DinerMenu
 * @date February 13,2017
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Bacon wiht lettce & tomato on whole wheat", true, 22.3f);
        addItem("Soup of the day", "Soup of the day, with a side of patato", false, 38);
        addItem("Hotdog", "Just a hotdog", false, 1.2f);
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}

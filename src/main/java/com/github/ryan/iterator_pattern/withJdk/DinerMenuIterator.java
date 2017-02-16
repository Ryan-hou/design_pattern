package com.github.ryan.iterator_pattern.withJdk;

import java.util.Iterator;

/**
 * @author Ryan-hou
 * @description:
 * @className: DinerMenuIterator
 * @date February 16,2017
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException(
                    "You can't remove an item until you've done at least one next()"
            );
        }
        if (menuItems[position - 1] != null) {
            for (int i = position - 1; i < menuItems.length -1; i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}

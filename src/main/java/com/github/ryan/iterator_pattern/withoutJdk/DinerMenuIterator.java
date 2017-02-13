package com.github.ryan.iterator_pattern.withoutJdk;

/**
 * @author Ryan-hou
 * @description:
 * @className: DinerMenuIterator
 * @date February 13,2017
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position = position + 1;
        return item;
    }
}

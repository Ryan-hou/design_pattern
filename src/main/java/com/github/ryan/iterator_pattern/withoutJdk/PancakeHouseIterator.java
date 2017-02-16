package com.github.ryan.iterator_pattern.withoutJdk;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ryan-hou
 * @description:
 * @className: PancakeHouseIterator
 * @date February 13,2017
 */
public class PancakeHouseIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeHouseIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) items.get(position);
        position += 1;
        return menuItem;
    }

//    public static void main(String[] args) {
//        List list = new ArrayList<>();
//        list.add(null);
//        list.add(null);
//        list.add("Hello World");
//        java.util.Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            if (next == null) {
//                System.out.println(next + " is removed.");
//                iterator.remove();
//            } else {
//                System.out.println(next);
//            }
//        }
//        System.out.println(list.size());
//    }
}

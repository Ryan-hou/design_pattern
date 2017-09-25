package com.github.ryan.vistor_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author yanlin.hou@ucarinc.com
 * @description:
 * @className: ShoppingCart
 * @date September 23,2017
 */

public class ShoppingCart {

    // normal shopping cart stuff
    private List<Visitable> items;

    public double calculatePostage() {
        if (Objects.isNull(items)) {
            return 0.0;
        }

        // create a visitor
        PostageVisitor visitor = new PostageVisitor();
        // iterate through all items
        for (Visitable visitable : items) {
            visitable.accept(visitor);
        }
        double postage = visitor.getTotalPostage4Cart();
        return postage;
    }

    public void addVisitable(Visitable visitable) {
        if (Objects.isNull(items)) {
            items = new ArrayList<>();
            items.add(visitable);
        } else {
            items.add(visitable);
        }
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Book book = new Book(1.0, 2);
        shoppingCart.addVisitable(book);
        CD cd = new CD(2.5);
        shoppingCart.addVisitable(cd);
        System.out.println("Total postage: " + shoppingCart.calculatePostage());
    }
}

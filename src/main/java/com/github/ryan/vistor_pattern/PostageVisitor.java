package com.github.ryan.vistor_pattern;

/**
 * @author ryan.houyl@gmail.com
 * @description:
 * @className: PostageVisitor
 * @date September 23,2017
 */
public class PostageVisitor implements Visitor {

    private double totalPostage4Cart;

    // collect the data about the book
    @Override
    public void visit(Book book) {
        // assume we have a calculation here related to weight and price
        // free postage for a book over 10
        if (book.getPrice() < 10.0) {
            totalPostage4Cart += book.getWeight() * 2;
        }
    }

    // add other visitors here

    @Override
    public void visit(CD cd) {
        totalPostage4Cart += cd.getPrice();
    }

    // return the internal state
    public double getTotalPostage4Cart() {
        return totalPostage4Cart;
    }
}

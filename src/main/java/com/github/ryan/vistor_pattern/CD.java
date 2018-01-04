package com.github.ryan.vistor_pattern;

/**
 * @author ryan.houyl@gmail.com
 * @description:
 * @className: CD
 * @date September 23,2017
 */
public class CD implements Visitable {

    private double price;

    public double getPrice() {
        return price;
    }

    public CD(double price) {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

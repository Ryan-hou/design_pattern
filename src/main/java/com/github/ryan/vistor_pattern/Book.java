package com.github.ryan.vistor_pattern;

/**
 * @author yanlin.hou@ucarinc.com
 * @description: Concrete element
 * @className: Book
 * @date September 23,2017
 */
public class Book implements Visitable {

    private double price;
    private double weight;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Book(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}

package com.github.ryan.vistor_pattern;

/**
 * @author yanlin.hou@ucarinc.com
 * @description:
 * @className: Visitor
 * @date September 23,2017
 */
public interface Visitor {

    void visit(Book book);
    // visit other concrete items
    void visit(CD cd);
}

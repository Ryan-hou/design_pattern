package com.github.ryan.vistor_pattern;

/**
 * @author ryan.houyl@gmail.com
 * @description: Element interface
 * @className: Visitable
 * @date September 23,2017
 */
public interface Visitable {

    void accept(Visitor visitor);
}

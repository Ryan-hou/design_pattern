package com.github.ryan.state_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: State
 * @date February 22,2017
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}

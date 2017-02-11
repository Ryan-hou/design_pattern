package com.github.ryan.strategy_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: MuteQuack
 * @date February 11,2017
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

package com.github.ryan.adapter_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: WildTurkey
 * @date February 12,2017
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}

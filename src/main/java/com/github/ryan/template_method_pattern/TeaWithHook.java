package com.github.ryan.template_method_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: TeaWithHook
 * @date February 10,2017
 */
public class TeaWithHook extends CaffeineBeverageWithHook {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public boolean customerWantsCondiments() {
        return false;
    }
}

package com.github.ryan.template_method_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: CaffeineBeverageWithHook
 * @date February 10,2017
 */
public abstract class CaffeineBeverageWithHook {

    // 模版方法,定义算法骨架和子类扩展点
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        // 提供钩子方法,控制部分算法的执行,由子类决定是否覆盖该钩子方法
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    public final void boilWater() {
        System.out.println("Boiling water");
    }

    public final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 定义一个钩子方法,通常是空的缺省实现,由子类决定是否覆盖
     */
    public boolean customerWantsCondiments() {
        return true;
    }

}

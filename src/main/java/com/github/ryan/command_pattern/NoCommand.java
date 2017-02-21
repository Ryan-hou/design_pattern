package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: NoCommand
 * @date February 21,2017
 */
public class NoCommand implements Command {
    /**
     * 空对象:当你不想返回一个有意义的对象时,空对象是一个很有用的例子
     * 当调用他的execute方法时,什么都不做; 这样避免了在代码中处理null的操作
     */

    @Override
    public void execute() {}
}

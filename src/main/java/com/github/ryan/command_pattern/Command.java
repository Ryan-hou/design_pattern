package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: Command
 * @date February 21,2017
 */
public interface Command {
    void execute();
    void undo();
}

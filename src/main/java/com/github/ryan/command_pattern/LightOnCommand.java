package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: LightOnCommand
 * @date February 21,2017
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
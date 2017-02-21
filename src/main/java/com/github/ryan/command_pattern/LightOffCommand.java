package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: LightOffCommand
 * @date February 21,2017
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}

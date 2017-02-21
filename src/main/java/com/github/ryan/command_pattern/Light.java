package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: Light
 * @date February 21,2017
 */
public class Light {
    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}

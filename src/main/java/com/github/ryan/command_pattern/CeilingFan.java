package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: CeilingFan
 * @date February 21,2017
 */
public class CeilingFan {
    private String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " ceiling fan is on high");
    }

    public void off() {
        System.out.println(location + " ceiling fan is off");
    }
}

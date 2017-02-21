package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: Stereo
 * @date February 21,2017
 */
public class Stereo {
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void off() {
        System.out.println(location + " stereo is off");
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }

    public void setCD() {
        System.out.println(location + " is set for CD input");
    }

    public void setVolume(int volume) {
        System.out.println(location + " volume set to " + volume);
    }
}

package com.github.ryan.facade_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: Amplifier
 * @date February 12,2017
 */
public class Amplifier {

    void on() {
        System.out.println("Amplifier on.");
    }

    void setDvd(DvdPlayer dvd) {
        System.out.println("Amplifier set dvd player");
    }

    void setSurroundSound() {
        System.out.println("Amplifier set surround sound!!!");
    }

    void setVolume(int volume) {
        System.out.println("Amplifier set volume: " + volume);
    }
}

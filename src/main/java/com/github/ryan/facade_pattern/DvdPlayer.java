package com.github.ryan.facade_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: DvdPlayer
 * @date February 12,2017
 */
public class DvdPlayer {

    void on() {
        System.out.println("Dvd player on.");
    }

    void play(String movieName) {
        System.out.println("Play movie: " + movieName);
    }
}

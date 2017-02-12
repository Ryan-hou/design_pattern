package com.github.ryan.facade_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: HomeTheaterTestDrive
 * @date February 12,2017
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        CdPlayer cdPlayer = new CdPlayer();
        DvdPlayer dvdPlayer = new DvdPlayer();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        Tuner tuner = new Tuner();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner, dvdPlayer,
                cdPlayer, projector, lights, screen, popcornPopper);
        homeTheater.watchMovie("Forrest Gump");
    }
}

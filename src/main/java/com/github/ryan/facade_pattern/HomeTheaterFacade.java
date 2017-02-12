package com.github.ryan.facade_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: HomeTheaterFacade
 * @date February 12,2017
 */
public class HomeTheaterFacade {
    // 使用组合
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amp,
                         Tuner tuner,
                         DvdPlayer dvd,
                         CdPlayer cd,
                         Projector projector,
                         TheaterLights lights,
                         Screen screen,
                         PopcornPopper popcornPopper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    // 为客户提供的接口,接口内部调用具体的组合类实现接口功能
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }
}

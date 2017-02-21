package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: StereoOnWithCDCommand
 * @date February 21,2017
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}

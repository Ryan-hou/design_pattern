package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: StereoOffCommand
 * @date February 21,2017
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}

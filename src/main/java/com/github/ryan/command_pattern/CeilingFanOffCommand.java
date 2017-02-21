package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: CeilingFanOffCommand
 * @date February 21,2017
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}

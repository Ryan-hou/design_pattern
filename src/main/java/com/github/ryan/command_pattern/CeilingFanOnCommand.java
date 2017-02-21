package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: CeilingFanOnCommand
 * @date February 21,2017
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}

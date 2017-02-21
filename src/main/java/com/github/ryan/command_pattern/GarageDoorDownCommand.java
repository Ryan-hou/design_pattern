package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: GarageDoorDownCommand
 * @date February 21,2017
 */
public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}

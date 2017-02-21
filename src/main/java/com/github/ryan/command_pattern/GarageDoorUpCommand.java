package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: GarageDoorUpCommand
 * @date February 21,2017
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}

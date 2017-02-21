package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: MacroCommand
 * @date February 22,2017
 */
public class MacroCommand implements Command {
    /**
     * 在宏命令中,用数组来保存一堆命令
     */
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}

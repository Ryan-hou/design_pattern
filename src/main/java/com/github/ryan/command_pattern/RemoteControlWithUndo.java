package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: RemoteControlWithUndo
 * @date February 21,2017
 */
public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    // 纪录前一个命令
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        //  初始化Command对象为空对象
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--------- Remote Control ------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName()
            + "  " + offCommands[i].getClass().getName() + "\n");
        }
        sb.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return sb.toString();
    }
}

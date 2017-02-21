package com.github.ryan.command_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: RemoteLoader
 * @date February 21,2017
 */
public class RemoteLoader {
    public static void main(String[] args) {

        // 构造接收者(也就是命令接口方法的真正实现者)
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        // 创建电灯的命令对象,命令对象中含有接收者:电灯
        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        // 构造吊扇开和关的命令
        CeilingFanOnCommand ceilingFanOnCommand =
                new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand =
                new CeilingFanOffCommand(ceilingFan);

        // 构造车库门上与下的命令
        GarageDoorUpCommand garageDoorUpCommand =
                new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand =
                new GarageDoorDownCommand(garageDoor);

        // 构造音响的开与关命令
        StereoOnWithCDCommand stereoOnWithCDCommand =
                new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand =
                new StereoOffCommand(stereo);

        // 构造调用者,设置命令对象
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Command[] partyOn = {livingRoomLightOn, kitchenLightOn, stereoOnWithCDCommand};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff, stereoOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControlWithUndo.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControlWithUndo);
        System.out.println("--------- Pushing Macro On ---------");
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println("--------- Pushing Macro Off --------");
        remoteControlWithUndo.offButtonWasPushed(0);

        /*remoteControlWithUndo.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControlWithUndo.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControlWithUndo.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControlWithUndo.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControlWithUndo);

        // 调用者通过命令对象调用相应的方法
        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        // 撤销上一步操作,也就是开灯
        remoteControlWithUndo.undoButtonWasPushed();
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        // 关灯
        remoteControlWithUndo.undoButtonWasPushed();*/

        /*remoteControlWithUndo.onButtonWasPushed(1);
        remoteControlWithUndo.offButtonWasPushed(1);
        remoteControlWithUndo.onButtonWasPushed(2);
        remoteControlWithUndo.offButtonWasPushed(2);
        remoteControlWithUndo.onButtonWasPushed(3);
        remoteControlWithUndo.offButtonWasPushed(3);*/

    }
}

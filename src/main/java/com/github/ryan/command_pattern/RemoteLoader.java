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
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);

        // 调用者通过命令对象调用相应的方法
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

    }
}

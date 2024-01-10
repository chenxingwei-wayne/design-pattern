package com.learning.wayne.designpatterns.commandmode2;

// 这个一个相对完整的命令模式的实现。
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light2 livingRoomLight = new Light2("living room");
        Light2 kitchenLight = new Light2("Kitchen");

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor(" ");
        Stereo stereo = new Stereo("Living Room");


        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        // 在remoteControl设置好挡位的信息。slot 0， 设置了什么的开关挡位。
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);
        // 然后就可以调用remote的control的两个方法onButtonWasPushed以及offButtonWasPushed进行调用，通过看点的是哪个槽位出发不同的操作。
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

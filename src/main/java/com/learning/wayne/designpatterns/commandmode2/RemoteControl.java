package com.learning.wayne.designpatterns.commandmode2;

public class RemoteControl {
    Command2[] onCommands;
    Command2[] offCommands;
    Command2 undoCommand;


    public RemoteControl() {
        this.onCommands = new Command2[7];
        this.offCommands = new Command2[7];

        Command2 noCommand = new NoCommand();
        // 开关各7个槽位全部初始化为noCommand
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        // 还有一个撤销命令，但是目前的撤销命令还是比较局限，只能撤销上一步的操作。
        undoCommand = noCommand;
    }

    public void setCommand(int slots, Command2 onCommand, Command2 offCommand) {
        onCommands[slots] = onCommand;
        offCommands[slots] = offCommand;
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

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("\n------ Remote control -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}

package com.learning.wayne.designpatterns.commandmode;

public class SimpleRemoteControl {
    Command1 slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command1 command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}

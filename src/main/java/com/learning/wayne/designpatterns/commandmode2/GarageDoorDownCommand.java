package com.learning.wayne.designpatterns.commandmode2;

public class GarageDoorDownCommand implements Command2 {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}

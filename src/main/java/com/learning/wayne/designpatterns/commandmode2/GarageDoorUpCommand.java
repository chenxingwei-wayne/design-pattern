package com.learning.wayne.designpatterns.commandmode2;

public class GarageDoorUpCommand implements Command2 {

    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}

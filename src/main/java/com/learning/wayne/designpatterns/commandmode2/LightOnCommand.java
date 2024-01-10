package com.learning.wayne.designpatterns.commandmode2;

public class LightOnCommand implements Command2 {

    Light2 light;

    public LightOnCommand(Light2 light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

package com.learning.wayne.designpatterns.commandmode2;

public class LightOffCommand implements Command2 {
    Light2 light;

    public LightOffCommand(Light2 light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

}

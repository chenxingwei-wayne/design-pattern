package com.learning.wayne.designpatterns.commandmode;


public class LightOnCommand implements Command1 {

    Light1 light;

    public LightOnCommand(Light1 light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

package com.learning.wayne.designpatterns.commandmode2;

public class CeilingFanOffCommand implements Command2 {
    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {

    }
}

package com.learning.wayne.designpatterns.commandmode2;

public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        System.out.println("stereo is on");
    }

    @Override
    public void undo() {

    }
}

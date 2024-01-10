package com.learning.wayne.designpatterns.commandmode2;

public class StereoOffCommand implements Command2 {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        System.out.println("stereo is off");
    }

    @Override
    public void undo() {

    }
}

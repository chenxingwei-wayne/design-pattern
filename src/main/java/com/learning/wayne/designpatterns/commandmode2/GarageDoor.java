package com.learning.wayne.designpatterns.commandmode2;

public class GarageDoor {
    public String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("GarageDoor is on");
    }

    public void off() {
        System.out.println("GarageDoor is off");
    }
}

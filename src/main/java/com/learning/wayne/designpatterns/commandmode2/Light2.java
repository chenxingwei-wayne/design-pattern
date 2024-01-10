package com.learning.wayne.designpatterns.commandmode2;

public class Light2 {

    public String location;

    public Light2(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("light is on");
    }

    public void off() {
        System.out.println("light is off");
    }
}

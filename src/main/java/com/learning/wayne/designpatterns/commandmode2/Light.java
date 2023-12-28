package com.learning.wayne.designpatterns.commandmode2;

public class Light {

    public String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("light is on");
    }

    public void off() {
        System.out.println("light is off");
    }
}

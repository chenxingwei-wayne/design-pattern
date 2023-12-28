package com.learning.wayne.designpatterns.commandmode2;

public class CeilingFan {
    public String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("CeilingFan is on");
    }

    public void off() {
        System.out.println("CeilingFan is off");
    }
}

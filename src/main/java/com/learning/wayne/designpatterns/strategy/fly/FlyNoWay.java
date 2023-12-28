package com.learning.wayne.designpatterns.strategy.fly;

public class  FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}

package com.learning.wayne.designpatterns.strategy.duck;

import com.learning.wayne.designpatterns.strategy.fly.FlyWithWings;
import com.learning.wayne.designpatterns.strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}

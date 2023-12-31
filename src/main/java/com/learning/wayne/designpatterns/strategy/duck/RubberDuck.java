package com.learning.wayne.designpatterns.strategy.duck;

import com.learning.wayne.designpatterns.strategy.fly.FlyBehavior;
import com.learning.wayne.designpatterns.strategy.fly.FlyNoWay;
import com.learning.wayne.designpatterns.strategy.quack.QuackBehavior;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior =()-> System.out.println("Squeak");
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    void display() {
        System.out.println("I am a rubber duckie");
    }
}

package com.learning.wayne.designpatterns.strategy.duck;

import com.learning.wayne.designpatterns.strategy.fly.FlyNoWay;
import com.learning.wayne.designpatterns.strategy.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior =new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I am a model duck");
    }
}

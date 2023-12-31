package com.learning.wayne.designpatterns.strategy.duck;

import com.learning.wayne.designpatterns.strategy.fly.FlyWithWings;
import com.learning.wayne.designpatterns.strategy.quack.Quack;

public class MallardDuck extends Duck {

    // 初始化实例变量的做法还是不够具有弹性。
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}

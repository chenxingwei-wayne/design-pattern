package com.learning.wayne.designpatterns.strategy.fly;

// 由行为类而不是由Duck类来实现行为接口。
public class  FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}

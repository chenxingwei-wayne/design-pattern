package com.learning.wayne.designpatterns.strategy.duck;

import com.learning.wayne.designpatterns.strategy.fly.FlyBehavior;
import com.learning.wayne.designpatterns.strategy.quack.QuackBehavior;

// 然后由Duck抽象类来组装这些行为。
public abstract class Duck {
    // 鸭子飞的行为
    FlyBehavior flyBehavior;
    // 鸭子叫的行为
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    // 抽象的display方法
    abstract void display();
    // 公共的飞的方法
    public void performFly() {
        flyBehavior.fly();
    }
    // 公共的叫的方法
    public void performQuack() {
        quackBehavior.quack();
    }
    // 公共的游泳的方法
    public void swim() {
        System.out.println("All ducks floats, even decoys!");
    }
}

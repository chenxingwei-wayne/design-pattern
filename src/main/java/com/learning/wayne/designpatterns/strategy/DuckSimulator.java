package com.learning.wayne.designpatterns.strategy;

import com.learning.wayne.designpatterns.strategy.duck.DecoyDuck;
import com.learning.wayne.designpatterns.strategy.duck.MallardDuck;
import com.learning.wayne.designpatterns.strategy.duck.ModelDuck;
import com.learning.wayne.designpatterns.strategy.duck.RubberDuck;
import com.learning.wayne.designpatterns.strategy.fly.FlyBehavior;
import com.learning.wayne.designpatterns.strategy.fly.FlyRocketPowered;
import com.learning.wayne.designpatterns.strategy.quack.QuackBehavior;

/**
 * 类之间的关系可以时IS-A（是一个）、HAS-A（有一个）、Implements(实现），有一个可能比是一个更好，多用组合少用继承。
 * 鸭子模拟器其实是使用的策略模式。
 */

public class DuckSimulator {
    public static void main(String[] args) throws InterruptedException {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        System.out.println("--------------------------------------------");

        FlyBehavior cantFly = ()-> System.out.println("I can't fly");
        QuackBehavior squeak=()-> System.out.println("Squeak");
        RubberDuck rubberDuck =new RubberDuck(cantFly, squeak);
        rubberDuck.performQuack();
        System.out.println("---------------------------------------------");

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.performQuack();

        System.out.println("---------------------------------------------");
        // 在运行时改变鸭子的行为，只需要调用鸭子的setter方法就可以了。
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }
}

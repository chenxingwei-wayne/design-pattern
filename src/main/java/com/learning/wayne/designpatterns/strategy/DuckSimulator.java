package com.learning.wayne.designpatterns.strategy;

import com.learning.wayne.designpatterns.strategy.duck.DecoyDuck;
import com.learning.wayne.designpatterns.strategy.duck.MallardDuck;
import com.learning.wayne.designpatterns.strategy.duck.ModelDuck;
import com.learning.wayne.designpatterns.strategy.duck.RubberDuck;
import com.learning.wayne.designpatterns.strategy.fly.FlyBehavior;
import com.learning.wayne.designpatterns.strategy.fly.FlyRocketPowered;
import com.learning.wayne.designpatterns.strategy.quack.QuackBehavior;
public class DuckSimulator {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000000);
        MallardDuck mallardDuck = new MallardDuck();
        FlyBehavior cantFly = ()-> System.out.println("I can't fly");
        QuackBehavior squeak=()-> System.out.println("Squeak");
        RubberDuck rubberDuck =new RubberDuck(cantFly, squeak);
        DecoyDuck decoyDuck = new DecoyDuck();
        ModelDuck modelDuck = new ModelDuck();
        mallardDuck.performQuack();
        rubberDuck.performQuack();
        decoyDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }
}

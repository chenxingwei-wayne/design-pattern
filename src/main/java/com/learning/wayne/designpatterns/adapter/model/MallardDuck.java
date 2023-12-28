package com.learning.wayne.designpatterns.adapter.model;

import com.learning.wayne.designpatterns.adapter.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}

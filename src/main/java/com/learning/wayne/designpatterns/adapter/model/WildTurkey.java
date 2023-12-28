package com.learning.wayne.designpatterns.adapter.model;

import com.learning.wayne.designpatterns.adapter.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gooble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}

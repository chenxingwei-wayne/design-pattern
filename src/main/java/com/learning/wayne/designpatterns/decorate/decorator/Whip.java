package com.learning.wayne.designpatterns.decorate.decorator;

import com.learning.wayne.designpatterns.decorate.beverage.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return 1.00;
    }
}

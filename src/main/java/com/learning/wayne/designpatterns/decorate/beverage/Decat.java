package com.learning.wayne.designpatterns.decorate.beverage;

public class Decat extends Beverage {
    public Decat() {
        description = "Decat Coffee";
    }

    @Override
    public double cost() {
        return 1.89;
    }
}

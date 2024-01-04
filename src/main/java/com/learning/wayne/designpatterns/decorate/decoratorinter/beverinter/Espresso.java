package com.learning.wayne.designpatterns.decorate.decoratorinter.beverinter;

public class Espresso implements YinLiao {


    private String description;
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return 0.99;
    }
}

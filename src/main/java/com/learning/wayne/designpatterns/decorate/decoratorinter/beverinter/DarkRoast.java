package com.learning.wayne.designpatterns.decorate.decoratorinter.beverinter;

public class DarkRoast implements YinLiao{
    private String description;

    public DarkRoast() {
        this.description = "Dark Roast Coffee";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

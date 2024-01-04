package com.learning.wayne.designpatterns.decorate.decoratorinter.beverinter;

public class Decat implements YinLiao {

    private String description;

    public Decat() {
        this.description = "Decat Coffee";
    }
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return 1.89;
    }
}

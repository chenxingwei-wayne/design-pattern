package com.learning.wayne.designpatterns.decorate.decoratorinter.beverinter;

public class HouseBlend implements YinLiao {

    private String description;
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public String getDescription() {
        return this.description;
    }


    @Override
    public double cost() {
        return .89;
    }
}

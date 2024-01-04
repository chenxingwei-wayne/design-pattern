package com.learning.wayne.designpatterns.decorate.decoratorinter.beverinter;

public interface YinLiao {

    default String getDescription() {
        return "Unknown Beverage";
    }

    double cost();
}

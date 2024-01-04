package com.learning.wayne.designpatterns.decorate.decoratorinter;


import com.learning.wayne.designpatterns.decorate.decoratorinter.beverinter.YinLiao;

public class Soy implements CondimentDecorator {
    YinLiao yinliao;

    public Soy(YinLiao yinliao) {
        this.yinliao = yinliao;
    }

    @Override
    public String getDescription() {
        return yinliao.getDescription() + ", soy";
    }

    @Override
    public double cost() {
        return .11;
    }
}

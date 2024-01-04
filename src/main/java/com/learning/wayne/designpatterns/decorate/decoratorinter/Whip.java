package com.learning.wayne.designpatterns.decorate.decoratorinter;

import com.learning.wayne.designpatterns.decorate.decoratorinter.beverinter.YinLiao;

public class Whip implements CondimentDecorator {
    YinLiao yinliao;

    public Whip(YinLiao yinliao) {
        this.yinliao = yinliao;
    }

    @Override
    public String getDescription() {
        return yinliao.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return 1.00;
    }
}

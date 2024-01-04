package com.learning.wayne.designpatterns.decorate.decoratorinter;

import com.learning.wayne.designpatterns.decorate.decoratorinter.beverinter.YinLiao;

/**
 * 利用继承达到类型匹配，而不是利用继承获得行为。行为来自装饰者和基础组件，或与其他装饰者之间的组合关系。
 *
 */
public class Mocha implements CondimentDecorator {

    YinLiao yinLiao;
    public Mocha(YinLiao yinLiao) {
        this.yinLiao = yinLiao;
    }

    @Override
    public String getDescription() {
        return yinLiao.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + yinLiao.cost();
    }
}

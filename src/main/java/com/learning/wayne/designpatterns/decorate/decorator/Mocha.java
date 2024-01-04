package com.learning.wayne.designpatterns.decorate.decorator;

import com.learning.wayne.designpatterns.decorate.beverage.Beverage;

/**
 * 利用继承达到类型匹配，而不是利用继承获得行为。行为来自装饰者和基础组件，或与其他装饰者之间的组合关系。
 *
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}

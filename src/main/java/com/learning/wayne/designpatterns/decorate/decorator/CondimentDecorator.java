package com.learning.wayne.designpatterns.decorate.decorator;

import com.learning.wayne.designpatterns.decorate.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}

package com.learning.wayne.designpatterns.factorymode2.store;


import com.learning.wayne.designpatterns.factorymode2.pizza.Pizza;

public abstract class PizzaStore {
    // 实现了所有操作产品的方法，但是不实现工厂方法。vb分布广泛和你写个报告v刚刚吃饭出现了7888.
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}

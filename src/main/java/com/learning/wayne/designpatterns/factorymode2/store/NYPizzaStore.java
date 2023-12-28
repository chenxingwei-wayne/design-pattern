package com.learning.wayne.designpatterns.factorymode2.store;

import com.learning.wayne.designpatterns.factorymode2.pizza.NYStyleCheesePizza;
import com.learning.wayne.designpatterns.factorymode2.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}

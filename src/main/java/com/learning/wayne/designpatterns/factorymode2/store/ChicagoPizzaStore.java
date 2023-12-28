package com.learning.wayne.designpatterns.factorymode2.store;

import com.learning.wayne.designpatterns.factorymode2.pizza.ChicagoStyleCheesePizza;
import com.learning.wayne.designpatterns.factorymode2.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}

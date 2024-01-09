package com.learning.wayne.designpatterns.factorymode2;

import com.learning.wayne.designpatterns.factorymode2.pizza.Pizza;
import com.learning.wayne.designpatterns.factorymode2.store.ChicagoPizzaStore;
import com.learning.wayne.designpatterns.factorymode2.store.NYPizzaStore;
import com.learning.wayne.designpatterns.factorymode2.store.PizzaStore;

public class FactoryModeTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyPizza.getName() + "\n");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + chicagoPizza.getName() + "\n");
    }
}

package com.learning.wayne.designpatterns.factorymode3.ingredient;

import com.learning.wayne.designpatterns.factorymode3.ingredient.compoents.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperroni();
    public Clams createClams();
}

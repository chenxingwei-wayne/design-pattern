package com.learning.wayne.designpatterns.decorate;

import com.learning.wayne.designpatterns.decorate.beverage.Beverage;
import com.learning.wayne.designpatterns.decorate.beverage.DarkRoast;
import com.learning.wayne.designpatterns.decorate.beverage.Espresso;
import com.learning.wayne.designpatterns.decorate.beverage.HouseBlend;
import com.learning.wayne.designpatterns.decorate.decorator.Mocha;
import com.learning.wayne.designpatterns.decorate.decorator.Soy;
import com.learning.wayne.designpatterns.decorate.decorator.Whip;
// 咖啡
public class StartBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());


        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}

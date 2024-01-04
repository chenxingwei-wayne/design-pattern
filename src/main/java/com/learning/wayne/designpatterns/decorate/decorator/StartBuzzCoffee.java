package com.learning.wayne.designpatterns.decorate.decorator;

import com.learning.wayne.designpatterns.decorate.beverage.Beverage;
import com.learning.wayne.designpatterns.decorate.beverage.DarkRoast;
import com.learning.wayne.designpatterns.decorate.beverage.Espresso;
import com.learning.wayne.designpatterns.decorate.beverage.HouseBlend;
import com.learning.wayne.designpatterns.decorate.decorator.Mocha;
import com.learning.wayne.designpatterns.decorate.decorator.Soy;
import com.learning.wayne.designpatterns.decorate.decorator.Whip;

/**
 * 装饰者模式
 * 拿到一个DarkRoast咖啡，用奶泡以及摩卡来装饰它，可以依赖委托将调料的钱加上去。
 *
 * 装饰者模式动态的将责任附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案。
 *  只有在针对抽象组件编程时，才不会因为装饰着模式受到影响。
 */
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

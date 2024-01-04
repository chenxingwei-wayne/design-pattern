package com.learning.wayne.designpatterns.decorate.decoratorinter;

import com.learning.wayne.designpatterns.decorate.decoratorinter.beverinter.DarkRoast;
import com.learning.wayne.designpatterns.decorate.decoratorinter.beverinter.Espresso;
import com.learning.wayne.designpatterns.decorate.decoratorinter.beverinter.HouseBlend;
import com.learning.wayne.designpatterns.decorate.decoratorinter.beverinter.YinLiao;

/**
 * 装饰者模式
 * 下面是使用接口模式实现的一个装饰器模式。
 *
 */
public class StartBuzzCoffee {
    public static void main(String[] args) {
        YinLiao yinliao = new Espresso();
        System.out.println(yinliao.getDescription() + " $" + yinliao.cost());
        YinLiao yinliao2 = new DarkRoast();
        yinliao2 = new Mocha(yinliao2);
        yinliao2 = new Mocha(yinliao2);
        yinliao2 = new Whip(yinliao2);
        System.out.println(yinliao2.getDescription() + " $" + yinliao2.cost());

        YinLiao yinliao3 = new HouseBlend();
        yinliao3 = new Soy(yinliao3);
        yinliao3 = new Mocha(yinliao3);
        yinliao3 = new Whip(yinliao3);
        System.out.println(yinliao3.getDescription() + " $" + yinliao3.cost());
    }
}

package com.learning.wayne.designpatterns.factorymode;

/**
 * 有时我们会利用静态方法来定义一个简单的工厂，常称为静态工厂。但是也有缺点，不能通过继承来改变创建方法的行为。
 * 下面讲的简单工厂其实不是一种设计模式，更像是一种编程习惯。
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}

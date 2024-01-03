package com.learning.wayne.designpatterns.observermode.newway;
// 这是一个观察者模式的实现。

/**
 * 主题对象管理某些数据。
 * 当主题对象的数据改变就会通知观察者。
 * 观察者已经订阅（注册）主题以便在主题数据改变时能够收到更新；
 *
 * 观察者模式定义对象的一对多依赖，这样依赖，当一个对象改变状态时，它的所有依赖都会收到通知并自动更新。
 *
 * 下面这种其实时自我实现的，jdk本身页也提供了observer以及observable。但是已经在java9被弃用了。
 * 主要由以下三个原因：
 * 1. 不可序列化 2. 没有线程安全，这些方法可以被子类覆盖，事件通知可以一不同的顺序发生。3. 提供的东西少：没有给应用程序提供足够丰富的事件模型。
 * 本示例在之前的基础上使用最新的PropertyChangeEvent以及PropertyChangeListener实现了观察者模式。
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData =  WeatherData.getInstance();
        weatherData.addPropertyChangeListener(new CurrentConditionDisplay());
        weatherData.setPressure(30.4F);
        weatherData.setTemperature(70F);
        weatherData.setHumidity(78F);
    }
}
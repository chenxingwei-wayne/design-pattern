package com.learning.wayne.designpatterns.observermode.fromearlyjdk;
// 这是一个观察者模式的实现。

import com.learning.wayne.designpatterns.observermode.fromorigin.CurrentConditionDisplay;
import com.learning.wayne.designpatterns.observermode.fromorigin.WeatherData;

/**
 * 主题对象管理某些数据。
 * 当主题对象的数据改变就会通知观察者。
 * 观察者已经订阅（注册）主题以便在主题数据改变时能够收到更新；
 *
 * 观察者模式定义对象的一对多依赖，这样依赖，当一个对象改变状态时，它的所有依赖都会收到通知并自动更新。
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        com.learning.wayne.designpatterns.observermode.fromorigin.CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
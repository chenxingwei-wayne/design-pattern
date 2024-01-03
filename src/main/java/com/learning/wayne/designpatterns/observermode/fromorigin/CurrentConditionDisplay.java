package com.learning.wayne.designpatterns.observermode.fromorigin;

public class CurrentConditionDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float message) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}

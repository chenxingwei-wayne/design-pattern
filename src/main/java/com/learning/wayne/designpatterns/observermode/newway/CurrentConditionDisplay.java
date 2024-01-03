package com.learning.wayne.designpatterns.observermode.newway;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CurrentConditionDisplay implements DisplayElement, PropertyChangeListener {

    private float temperature;
    private float humidity;

    public CurrentConditionDisplay() {
        WeatherData.getInstance().addPropertyChangeListener(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("temperature")) {
            this.temperature = (float) evt.getNewValue();
        }
        if (evt.getPropertyName().equals("humidity")) {
            this.humidity = (float) evt.getNewValue();
        }
        display();
    }
}

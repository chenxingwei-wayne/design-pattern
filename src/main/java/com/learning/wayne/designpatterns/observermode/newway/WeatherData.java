package com.learning.wayne.designpatterns.observermode.newway;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class WeatherData {

    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static WeatherData weatherData;

    public static WeatherData getInstance() {
        if (weatherData == null) {
            weatherData = new WeatherData();
        }
        return weatherData;
    }

    private Float temperature;
    private Float humidity;
    private Float pressure;

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temp) {
        Float oldValue = temperature;
        this.temperature = temp;
        changeSupport.firePropertyChange("temperature", oldValue, temp);
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humid) {
        Float oldValue = humidity;
        this.humidity = humid;
        changeSupport.firePropertyChange("humidity", oldValue, humid);
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float press) {
        Float oldValue = pressure;
        this.pressure = press;
        changeSupport.firePropertyChange("pressure", oldValue, press);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}

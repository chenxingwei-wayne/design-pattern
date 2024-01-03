package com.learning.wayne.designpatterns.observermode.newway;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}

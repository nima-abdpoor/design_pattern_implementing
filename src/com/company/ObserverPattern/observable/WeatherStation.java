package com.company.ObserverPattern.observable;

import com.company.ObserverPattern.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

    private int Temperature;
    List<IObserver> observers = new ArrayList<>();

    @Override
    public boolean Add(IObserver observer) {
        this.observers.add(observer);
        return true;
    }

    @Override
    public boolean Remove(IObserver observer) {
        if (this.observers.contains(observer)) {
            this.observers.remove(observer);
            return true;
        } else
            return false;
    }

    @Override
    public boolean Notify() {
        for (IObserver observer : observers) {
            observer.Update();
        }
        if (observers.isEmpty())
            return false;
        else
            return true;
    }

    @Override
    public int getTemperature() {
        return Temperature;
    }
    public void setTemperature(int temperature) {
        Temperature = temperature;
    }

}

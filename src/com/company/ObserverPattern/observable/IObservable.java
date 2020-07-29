package com.company.ObserverPattern.observable;

import com.company.ObserverPattern.observers.IObserver;

public interface IObservable {
    boolean Add(IObserver observer);
    boolean Remove(IObserver observer);
    boolean Notify();
    int getTemperature();
}

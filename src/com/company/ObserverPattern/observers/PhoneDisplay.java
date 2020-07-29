package com.company.ObserverPattern.observers;


import com.company.ObserverPattern.observable.WeatherStation;

public class PhoneDisplay implements IObserver {
    WeatherStation station;

    public PhoneDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void Update() {
        System.out.println(this.station.getTemperature());
    }
}

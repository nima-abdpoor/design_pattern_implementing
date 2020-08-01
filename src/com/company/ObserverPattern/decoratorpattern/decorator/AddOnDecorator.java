package com.company.ObserverPattern.decoratorpattern.decorator;

import com.company.ObserverPattern.decoratorpattern.Beverage.Beverage;

public abstract class AddOnDecorator extends Beverage {
    public abstract int cost();
}

package com.company.decoratorpattern.decorator;

import com.company.decoratorpattern.Beverage.Beverage;

public abstract class AddOnDecorator extends Beverage {
    public abstract int cost();
}

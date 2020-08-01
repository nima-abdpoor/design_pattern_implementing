package com.company.ObserverPattern.decoratorpattern.decorator;

import com.company.ObserverPattern.decoratorpattern.Beverage.Beverage;

public class Caramel extends AddOnDecorator {
    Beverage beverage;

    public Caramel(Beverage b){
        this.beverage=b;
    }
    @Override
    public int cost() {
        return this.beverage.cost()+2;
    }
}

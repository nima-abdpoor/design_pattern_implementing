package com.company.decoratorpattern.Beverage;

import com.company.decoratorpattern.decorator.AddOnDecorator;

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

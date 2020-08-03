package com.company.decoratorpattern.decorator;

import com.company.decoratorpattern.Beverage.Beverage;

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

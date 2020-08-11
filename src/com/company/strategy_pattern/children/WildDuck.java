package com.company.strategy_pattern.children;

import com.company.strategy_pattern.Interfaces.IDisplay;
import com.company.strategy_pattern.Interfaces.IFly;

public class WildDuck implements IDisplay, IFly {

    @Override
    public void fly() {
        System.out.println("Fling like a jet...");
    }

    @Override
    public void display() {
        System.out.println("very strong");
    }
}

package com.company.strategy_pattern.DependetClasses;

import com.company.strategy_pattern.Interfaces.IDisplay;

public class RealDisplay implements IDisplay {
    @Override
    public void display() {
        System.out.println("i'm very Strong and real!!!!!!!!!!");
    }
}

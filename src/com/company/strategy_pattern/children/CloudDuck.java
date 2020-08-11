package com.company.strategy_pattern.children;

import com.company.strategy_pattern.Interfaces.IDisplay;
import com.company.strategy_pattern.Interfaces.IFly;

public class CloudDuck implements IFly, IDisplay {

    @Override
    public void display() {
        System.out.println("(----)");
    }

    @Override
    public void fly() {
        System.out.println("very fast");
    }
}

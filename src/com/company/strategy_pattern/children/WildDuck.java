package com.company.strategy_pattern.children;

import com.company.strategy_pattern.Father.Duck;
import com.company.strategy_pattern.DependetClasses.JetFlying;
import com.company.strategy_pattern.DependetClasses.RealDisplay;
import com.company.strategy_pattern.DependetClasses.simpleQuack;

public class WildDuck extends Duck {
    @Override
    public void quack() {
        simpleQuack simpleQuack =new simpleQuack();
        simpleQuack.quack();
    }

    @Override
    public void fly() {
        JetFlying jetFlying=new JetFlying();
        jetFlying.fly();
    }

    @Override
    public void display() {
        RealDisplay realDisplay=new RealDisplay();
        realDisplay.display();
    }
}

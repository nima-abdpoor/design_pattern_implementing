package com.company.strategy_pattern.DependetClasses;

import com.company.strategy_pattern.Interfaces.IFly;

public class JetFlying implements IFly {
    @Override
    public void fly() {
        System.out.println("i fly like a jet!!!!!!!!!");
    }
}

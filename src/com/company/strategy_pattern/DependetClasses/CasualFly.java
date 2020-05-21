package com.company.strategy_pattern.DependetClasses;

import com.company.strategy_pattern.Interfaces.IFly;

public class CasualFly implements IFly {
    @Override
    public void fly() {
        System.out.println("I fly like kaftar :)");
    }
}

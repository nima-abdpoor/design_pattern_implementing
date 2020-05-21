package com.company.strategy_pattern.DependetClasses;

import com.company.strategy_pattern.Interfaces.IFly;

public class NoFly implements IFly {
    @Override
    public void fly() {
        System.out.println("i dont fly anyway.");
    }
}

package com.company.strategy_pattern.DependetClasses;

import com.company.strategy_pattern.Interfaces.IQuack;

public class simpleQuack implements IQuack {
    @Override
    public void quack() {
        System.out.println("quack quack quack ... ");
    }
}

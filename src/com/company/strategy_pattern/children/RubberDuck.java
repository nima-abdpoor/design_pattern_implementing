package com.company.strategy_pattern.children;

import com.company.strategy_pattern.Interfaces.IQuack;
import com.company.strategy_pattern.Interfaces.Ieat;

public class RubberDuck implements Ieat, IQuack {
    @Override
    public void eat() {
        System.out.println("yammmmmmmmmm...");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}

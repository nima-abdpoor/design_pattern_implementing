package com.company.strategy_pattern.DependetClasses;

import com.company.strategy_pattern.Interfaces.IDisplay;

public class Fakedisplay implements IDisplay {
    @Override
    public void display() {
        System.out.println("i look fake :(");
    }
}

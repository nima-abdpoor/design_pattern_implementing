package com.company.strategy_pattern.DependetClasses;

import com.company.strategy_pattern.Interfaces.Ieat;

public class Noeat implements Ieat {

    @Override
    public void eat() {
        System.out.println("i dont eat anything");
    }
}

package com.company.strategy.behavior.imp;

import com.company.strategy.behavior.IEat;

public class vegeterian implements IEat {
    @Override
    public void eat() {
        System.out.println("i am eating vegetable!!");
    }
}

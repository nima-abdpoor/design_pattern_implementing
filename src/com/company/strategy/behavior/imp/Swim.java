package com.company.strategy.behavior.imp;

import com.company.strategy.behavior.IMove;

public class Swim implements IMove {

    @Override
    public void move() {
        System.out.println("i am swimming!");
    }
}

package com.company.strategy.behavior.imp;

import com.company.strategy.behavior.ISpeak;

public class NoSpeak implements ISpeak {
    @Override
    public void speak() {
        System.out.println("i dont speak :(");
    }
}

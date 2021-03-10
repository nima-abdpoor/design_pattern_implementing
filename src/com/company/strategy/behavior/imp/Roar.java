package com.company.strategy.behavior.imp;

import com.company.strategy.behavior.ISpeak;

public class Roar implements ISpeak {
    @Override
    public void speak() {
        System.out.println("i am roaring!!!!!!!!!!");
    }
}

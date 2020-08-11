package com.company.strategy_pattern.children;
import com.company.strategy_pattern.Interfaces.IDisplay;
import com.company.strategy_pattern.Interfaces.IFly;
import com.company.strategy_pattern.Interfaces.IQuack;
import com.company.strategy_pattern.Interfaces.Ieat;

public class CityDuck implements IDisplay,Ieat,IFly,IQuack {
    @Override
    public void eat() {
        System.out.println("Yam Yam Yam...");
    }

    @Override
    public void display() {
        System.out.println("- ____ -");
    }

    @Override
    public void fly() {
        System.out.println("fast");
    }

    @Override
    public void quack() {
        System.out.println("Quack quack");
    }
}


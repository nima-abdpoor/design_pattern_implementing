package com.company.strategy_pattern.children;

import com.company.strategy_pattern.DependetClasses.CasualFly;
import com.company.strategy_pattern.DependetClasses.NoFly;
import com.company.strategy_pattern.DependetClasses.RealDisplay;
import com.company.strategy_pattern.Father.Duck;
import com.company.strategy_pattern.DependetClasses.simpleQuack;
import com.company.strategy_pattern.Interfaces.IDisplay;
import com.company.strategy_pattern.Interfaces.IFly;
import com.company.strategy_pattern.Interfaces.IQuack;
import com.company.strategy_pattern.Interfaces.Ieat;

public class CityDuck extends Duck {
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void display() {
        RealDisplay realDisplay=new RealDisplay();
        realDisplay.display();
    }

    @Override
    public void fly() {
        CasualFly casualFly=new CasualFly();
        casualFly.fly();
    }

    @Override
    public void quack() {
        simpleQuack simpleQuack=new simpleQuack();
        simpleQuack.quack();
    }
}


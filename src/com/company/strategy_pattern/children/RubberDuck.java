package com.company.strategy_pattern.children;

import com.company.strategy_pattern.DependetClasses.FakeQuack;
import com.company.strategy_pattern.DependetClasses.Fakedisplay;
import com.company.strategy_pattern.DependetClasses.NoFly;
import com.company.strategy_pattern.DependetClasses.Noeat;
import com.company.strategy_pattern.Father.Duck;

public class RubberDuck extends Duck {
    @Override
    public void eat() {
        Noeat noeat=new Noeat();
        noeat.eat();
    }

    @Override
    public void quack() {
        FakeQuack fakeQuack=new FakeQuack();
        fakeQuack.quack();
    }

    @Override
    public void display() {
        Fakedisplay fakedisplay=new Fakedisplay();
        fakedisplay.display();
    }

    @Override
    public void fly() {
        NoFly noFly=new NoFly();
        noFly.fly();
    }
}

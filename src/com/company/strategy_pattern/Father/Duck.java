package com.company.strategy_pattern.Father;

import com.company.strategy_pattern.Interfaces.IDisplay;
import com.company.strategy_pattern.Interfaces.IFly;
import com.company.strategy_pattern.Interfaces.IQuack;
import com.company.strategy_pattern.Interfaces.Ieat;

public class Duck {
    IFly fly;
    Ieat eat;
    IDisplay display;
    IQuack quack;

    public Duck(IFly fly, Ieat eat, IDisplay display, IQuack quack) {
        this.fly = fly;
        this.eat = eat;
        this.display = display;
        this.quack = quack;
    }
    public void fly(){
        this.fly.fly();
    }
    public void eat(){
        this.eat.eat();
    }
    public void display(){
        this.display.display();
    }
    public void quack(){
        this.quack.quack();
    }
}

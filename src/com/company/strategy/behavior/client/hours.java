package com.company.strategy.behavior.client;

import com.company.strategy.behavior.IEat;
import com.company.strategy.behavior.IMove;
import com.company.strategy.behavior.ISpeak;

public class hours implements IClient{
    private IEat eat;
    private ISpeak speak;
    private IMove move;

    public hours(IEat eat, ISpeak speak, IMove move) {
        this.eat = eat;
        this.speak = speak;
        this.move = move;
    }
    public void show(){
        eat.eat();
        speak.speak();
        move.move();
    }
}

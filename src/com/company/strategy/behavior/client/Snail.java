package com.company.strategy.behavior.client;

import com.company.strategy.behavior.IEat;
import com.company.strategy.behavior.IMove;

public class Snail implements IClient{
    private IEat eat;
    private IMove move;

    public Snail(IEat eat, IMove move) {
        this.eat = eat;
        this.move = move;
    }
    public void show(){
        eat.eat();
        move.move();
    }
}

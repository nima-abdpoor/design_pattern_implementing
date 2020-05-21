package com.company;

import com.company.strategy_pattern.Father.Duck;
import com.company.strategy_pattern.Interfaces.Ieat;
import com.company.strategy_pattern.children.CityDuck;
import com.company.strategy_pattern.children.CloudDuck;
import com.company.strategy_pattern.children.RubberDuck;
import com.company.strategy_pattern.children.WildDuck;

public class Main {

    public static void main(String[] args) {
        strategypattern();
    }
    public static void strategypattern(){
        WildDuck wildDuck=new WildDuck();
        CityDuck cityDuck=new CityDuck();
        RubberDuck rubberDuck=new RubberDuck();
        CloudDuck cloudDuck=new CloudDuck();
        Duck[] ducks={wildDuck,cityDuck,rubberDuck,cloudDuck};
        for (Duck duck: ducks){
            System.out.println(duck.getClass().descriptorString());
            duck.display();
            duck.eat();
            duck.quack();
            duck.fly();
            System.out.println();
        }
    }
}

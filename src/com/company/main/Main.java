package com.company.main;

import com.company.FactoryMethodPattern.Animal.Animal;
import com.company.FactoryMethodPattern.Factory.AnimalFactory;
import com.company.FactoryMethodPattern.Factory.BalanceAnimalFactory;
import com.company.FactoryMethodPattern.Factory.RandomAnimalFactory;
import com.company.decoratorpattern.Beverage.Beverage;
import com.company.decoratorpattern.Beverage.Espresso;
import com.company.decoratorpattern.decorator.Caramel;
import com.company.ObserverPattern.observable.WeatherStation;
import com.company.ObserverPattern.observers.PhoneDisplay;
import com.company.strategy_pattern.Father.Duck;
import com.company.strategy_pattern.children.CityDuck;
import com.company.strategy_pattern.children.CloudDuck;
import com.company.strategy_pattern.children.RubberDuck;
import com.company.strategy_pattern.children.WildDuck;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //FactoryMethodPattern();
        //strategypattern();
        //observerPattern();
        //decoratorPattern();
    }

    private static void FactoryMethodPattern() {
        RandomAnimalFactory randomAnimalFactory = new RandomAnimalFactory();
        BalanceAnimalFactory balanceAnimalFactory = new BalanceAnimalFactory();
        AnimalFactory animalFactory;
        for (int i=0;i<10;++i){
            animalFactory = randomAnimalFactory;
            System.out.println(animalFactory.CreateAnimal().GetSound());
            animalFactory = balanceAnimalFactory;
            System.out.println(animalFactory.CreateAnimal().GetSound());
        }
    }

    private static void decoratorPattern() {
        Espresso espresso = new Espresso();
        Beverage beverage = new Caramel(espresso);
        System.out.println(beverage.cost());
    }

    private static void observerPattern() {
        WeatherStation station = new WeatherStation();
        PhoneDisplay display = new PhoneDisplay(station);
        station.Add(display);
        station.setTemperature(10);
        station.Notify();
        station.setTemperature(20);
        station.Notify();
        station.setTemperature(30);
        station.Notify();
        station.setTemperature(40);
        station.Notify();
    }

    public static void strategypattern() {
        WildDuck wildDuck = new WildDuck();
        CityDuck cityDuck = new CityDuck();
        RubberDuck rubberDuck = new RubberDuck();
        CloudDuck cloudDuck = new CloudDuck();
        Duck[] ducks = {wildDuck, cityDuck, rubberDuck, cloudDuck};
        for (Duck duck : ducks) {
            System.out.println(duck.getClass().descriptorString());
            duck.display();
            duck.eat();
            duck.quack();
            duck.fly();
            System.out.println();
        }
    }
}

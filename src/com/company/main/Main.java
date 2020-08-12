package com.company.main;

import com.company.FactoryMethodPattern.Factory.AnimalFactory;
import com.company.FactoryMethodPattern.Factory.BalanceAnimalFactory;
import com.company.FactoryMethodPattern.Factory.RandomAnimalFactory;
import com.company.Singleton.Singleton;
import com.company.abstractFactoryPattern.ThemeFactory.DarkTheme;
import com.company.abstractFactoryPattern.ThemeFactory.LightTheme;
import com.company.decoratorpattern.Beverage.Beverage;
import com.company.decoratorpattern.Beverage.Espresso;
import com.company.decoratorpattern.Beverage.Tea;
import com.company.ObserverPattern.observable.WeatherStation;
import com.company.ObserverPattern.observers.PhoneDisplay;
import com.company.strategy_pattern.Father.Duck;
import com.company.strategy_pattern.children.CityDuck;

public class Main {

    public static void main(String[] args) {
        //AbstractFactoryPattern();
        //FactoryMethodPattern();
        //strategypattern();
        //observerPattern();
        //decoratorPattern();
        singleton();
    }

    private static void singleton() {
        Singleton singleton = Singleton.getInstance();
        singleton.testString = "this is singleton" ;
        System.out.println(singleton.testString);
        singleton = Singleton.getInstance();
        System.out.println(singleton.testString);
    }

    private static void AbstractFactoryPattern() {
        DarkTheme darkTheme=new DarkTheme();
        System.out.println("DARK:");
        System.out.println(darkTheme.TEXT_COLOR().getColor());
        System.out.println(darkTheme.BACKGROUND_COLOR().getColor());
        LightTheme lightTheme=new LightTheme();
        System.out.println("LIGHT:");
        System.out.println(lightTheme.BACKGROUND_COLOR().getColor());
        System.out.println(lightTheme.TEXT_COLOR().getColor());
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
        //Espresso espresso = new Espresso();
        //Beverage beverage = new Tea(espresso);
        //System.out.println(beverage.cost());
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
        CityDuck cityDuck = new CityDuck();
        Duck duck = new Duck(cityDuck,cityDuck,cityDuck,cityDuck);
        duck.fly();
    }
}

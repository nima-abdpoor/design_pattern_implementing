package com.company;

import com.company.ObserverPattern.decoratorpattern.Beverage.Beverage;
import com.company.ObserverPattern.decoratorpattern.Beverage.Espresso;
import com.company.ObserverPattern.decoratorpattern.Beverage.Tea;
import com.company.ObserverPattern.decoratorpattern.decorator.Caramel;
import com.company.ObserverPattern.observable.WeatherStation;
import com.company.ObserverPattern.observers.PhoneDisplay;
import com.company.strategy_pattern.Father.Duck;
import com.company.strategy_pattern.children.CityDuck;
import com.company.strategy_pattern.children.CloudDuck;
import com.company.strategy_pattern.children.RubberDuck;
import com.company.strategy_pattern.children.WildDuck;

public class Main {

    public static void main(String[] args) {


        //strategypattern();
        //observerPattern();
        decoratorPattern();
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

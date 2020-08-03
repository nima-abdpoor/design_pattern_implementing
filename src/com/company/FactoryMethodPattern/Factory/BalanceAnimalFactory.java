package com.company.FactoryMethodPattern.Factory;

import com.company.FactoryMethodPattern.Animal.Animal;
import com.company.FactoryMethodPattern.Animal.Cat;
import com.company.FactoryMethodPattern.Animal.Dog;
import com.company.FactoryMethodPattern.Animal.Duck;

public class BalanceAnimalFactory implements AnimalFactory {
    int times = 0;
    Dog dog ;
    Cat cat;
    Duck duck;
    @Override
    public Animal CreateAnimal() {
        times++;
        if (times%2==0)
            return dog =new Dog();
        else return cat =new Cat();
    }
}

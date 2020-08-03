package com.company.FactoryMethodPattern.Factory;

import com.company.FactoryMethodPattern.Animal.Animal;
import com.company.FactoryMethodPattern.Animal.Cat;
import com.company.FactoryMethodPattern.Animal.Dog;
import com.company.FactoryMethodPattern.Animal.Duck;

import java.util.Random;

public class RandomAnimalFactory implements AnimalFactory {
    Dog dog;
    Cat cat;
    Duck duck;
    int randomNumber;

    @Override
    public Animal CreateAnimal() {
        Random random = new Random();
        randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                return dog = new Dog();
            case 1:
                return cat = new Cat();
            case 2:
                return duck = new Duck();
            default:return null;
        }
    }
}

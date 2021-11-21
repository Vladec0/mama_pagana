package com.backbase.vladikproject.controller;

import com.backbase.vladikproject.model.Animal;
import com.backbase.vladikproject.model.Cat;
import com.backbase.vladikproject.model.Dog;
import com.backbase.vladikproject.model.Elephant;
import com.backbase.vladikproject.model.Mouse;

import java.util.ArrayList;
import java.util.List;

public class SelectCatJob {

    public void execute() {

        Mouse mouse1 = new Mouse("Mouse1");
        Elephant elephant2 = new Elephant("Dibil Tato");
        Dog dog3 = new Dog("barsik");
        Cat cat4 = new Cat("mavka");
        Cat cat5 = new Cat("shvabra");
        Cat cat6 = new Cat("hulka");
        Cat cat7 = new Cat("shpulka");

        List<Animal> list = new ArrayList<>();
        (list).add(cat7);
        list.add(mouse1);
        list.add(cat6);
        list.add(elephant2);
        list.add(cat5);
        list.add(dog3);
        list.add(cat4);


        List<Cat> cats = new ArrayList<>();

        for (Animal nextAnimal : list) {
            if (nextAnimal instanceof Cat) {
                Cat nextCat = (Cat) nextAnimal;
                cats.add(nextCat);
                System.out.println("name = " + nextCat.getName());
            }
        }

        System.out.println("Cats list size = " + cats.size());

        for  (Cat nextCat : cats) {
            System.out.println("name of the cat is = " + nextCat.getName());
        }

    }


}

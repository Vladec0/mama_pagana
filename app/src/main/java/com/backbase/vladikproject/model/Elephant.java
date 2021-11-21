package com.backbase.vladikproject.model;

public class Elephant extends Animal {

    public Elephant(String name) {
        this.name = name;
    }

    public Elephant(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void scream() {
        System.out.println(name + " screams uuuurttt!!!");
    }

    public void eat() {
        super.eat();
        System.out.println("but ");

    }
}
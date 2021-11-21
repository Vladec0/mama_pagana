package com.backbase.vladikproject.model;

public abstract class Animal implements Inhabitans {

    private int id;
    protected int weight;
    private int age;
    protected String name;

    public String getName(){
        return name;
    }

    public  void eat(){
        System.out.println("i am eating");
    }

    public int getWeight () {
        return weight;
    }
}

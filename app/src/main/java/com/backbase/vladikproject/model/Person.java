package com.backbase.vladikproject.model;


public class Person {

    private int id;
    private String name;
    private String secondName;
    private int age;
    private Person father;
    private Person mother;
    private int money;

    private String biography;


    public int getAge() {
        return age;
    }

    public Person getFather() {
        return father;
    }

    public String showAge() {
        return "My age is 36 years";
    }

    public void setFather(Person nokia){
        father = nokia;
    }

    public Person (int id, String name){
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age, int money){
        this.id = id;
        this.name = name;
        this.age = age;
        this.money = money;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void say () {
        System.out.println("I LOOOX");

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}


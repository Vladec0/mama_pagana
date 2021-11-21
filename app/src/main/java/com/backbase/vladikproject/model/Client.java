package com.backbase.vladikproject.model;

public class Client extends Person implements Inhabitans {

    private int weight;
    private int money;

    public Client(int id, String name, int age, int money) {
        super(id, name, age);
        this.money = money;
        this.weight = 70;
    }

    public Client(int id, String name, int weight, int age, int money) {
        super(id, name, age);
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getWeight() {
        return weight;
    }
}

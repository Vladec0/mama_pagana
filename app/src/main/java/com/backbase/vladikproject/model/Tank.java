package com.backbase.vladikproject.model;

public class Tank {

    private int id;
    private String name;
    private Canon canon;
    private Armor armor;
    private Country country;
    private int healht;
    private boolean hasBan;

    public Tank(int id, String name, Canon canon, Armor armor, int health, Country country) {
        this.id = id;
        this.name = name;
        this.armor = armor;
        this.canon = canon;
        this.healht = health;
        this.country = country;
        this.hasBan = false;
    }

    public void shoot(Tank enemy) {

        if (enemy == null) {
            System.out.println("no damage");
        } else {


        }

    }


}

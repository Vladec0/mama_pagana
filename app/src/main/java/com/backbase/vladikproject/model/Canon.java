package com.backbase.vladikproject.model;

public class Canon {

    private int caliber;
    private int id;
    private String name;
    private boolean hasMuffler;
    private int damage;

    public Canon(int id, String name, boolean hasMufflermuffler,int damage, int caliber) {
        this.id = id;
        this.name = name;
        this.hasMuffler = hasMufflermuffler;
        this.damage = damage;
        this.caliber = caliber;

    }
}
package com.backbase.vladikproject.model;

public class OldCar {

    private int power;
    private String name;
    private int propertyId;
    private int weight;

    public OldCar(int parameterId, int power, String name, int weight) {
        this.propertyId = parameterId;
        this.name = name;
        this.power = power;
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return propertyId;
    }

    public int getWeight() {
        return weight;
    }

    public int calculateMaxSpeed() {
        int maxSpeed = 0;
        int powerCoefficient = power * 20;
        int weightCoefficient = weight / 100;
        maxSpeed = powerCoefficient / weightCoefficient;

        return maxSpeed;
    }
}
package com.backbase.vladikproject.controller;

import com.backbase.vladikproject.model.Car;

import java.util.ArrayList;
import java.util.List;

public class MaxSpeedJob {

    public void execute() {

        Car car0 = new Car(0, 80, "Fusion", 840);
        Car car1 = new Car(1, 180, "Kuguar", 1600);
        Car car2 = new Car(2, 100, "Fiesta", 1000);

        List<Car> carList = new ArrayList<>();

        carList.add(car0);
        carList.add(car1);
        carList.add(car2);

        int maxSpeed = 0;

        for (Car eachCar : carList) {
            int eachSpeed = eachCar.calculateMaxSpeed();
            System.out.println("Max Speed for " + eachCar.getName() + " speed = " + eachSpeed);
            if (eachSpeed > maxSpeed) {
                maxSpeed = eachSpeed;
            } else  {
                //  do nothing
            }
        }
        System.out.println("max speed = " + maxSpeed);
    }
}

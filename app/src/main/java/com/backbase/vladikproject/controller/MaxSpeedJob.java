package com.backbase.vladikproject.controller;

import com.backbase.vladikproject.model.OldCar;

import java.util.ArrayList;
import java.util.List;

public class MaxSpeedJob {

    public void execute() {

        OldCar oldCar0 = new OldCar(0, 80, "Fusion", 840);
        OldCar oldCar1 = new OldCar(1, 180, "Kuguar", 1600);
        OldCar oldCar2 = new OldCar(2, 100, "Fiesta", 1000);

        List<OldCar> oldCarList = new ArrayList<>();

        oldCarList.add(oldCar0);
        oldCarList.add(oldCar1);
        oldCarList.add(oldCar2);

        int maxSpeed = 0;

        for (OldCar eachOldCar : oldCarList) {
            int eachSpeed = eachOldCar.calculateMaxSpeed();
            System.out.println("Max Speed for " + eachOldCar.getName() + " speed = " + eachSpeed);
            if (eachSpeed > maxSpeed) {
                maxSpeed = eachSpeed;
            } else  {
                //  do nothing
            }
        }
        System.out.println("max speed = " + maxSpeed);



    }
}

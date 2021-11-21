package com.backbase.vladikproject.controller;

import com.backbase.vladikproject.model.Cat;
import com.backbase.vladikproject.model.Elephant;
import com.backbase.vladikproject.model.Mouse;

public class AnimalJob {

    public void execute (){
        Cat tom = new Cat("Vlad chudo");
        Mouse jerry = new Mouse("Jerry");

        Elephant vaska = new Elephant("Vaska");
        vaska.scream();

        vaska = new Elephant("NE-Vaska");
        vaska.scream();



    }

}

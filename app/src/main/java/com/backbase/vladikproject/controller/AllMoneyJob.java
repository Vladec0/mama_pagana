package com.backbase.vladikproject.controller;

import android.widget.TextView;

import com.backbase.vladikproject.model.Person;

import java.util.ArrayList;
import java.util.List;

public class AllMoneyJob {

    public void execute (TextView resultTextView){
        Person person1 = new Person(7,"Oleg", 45, 3800);
        Person person2 = new Person(8,"Vladik", 10, 5);
        Person person3 = new Person(9,"Olexa", 25, 300);
        Person person4 = new Person(10,"Natalia", 36, 2800);


        List<Person> family = new ArrayList<>();

        family.add(person1);
        family.add(person2);
        family.add(person3);
        family.add(person4);

        int allMoney = 0;
        for(Person eachPerson : family ){
            int eachMoney = eachPerson.getMoney();
            allMoney = allMoney + eachMoney;

        }
        System.out.println("All Money of our Family = "+allMoney);
        resultTextView.setText("All Money of our Family = "+allMoney);
    }




}


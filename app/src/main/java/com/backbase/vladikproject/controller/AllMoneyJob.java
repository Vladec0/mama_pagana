package com.backbase.vladikproject.controller;

import android.widget.TextView;

import com.backbase.vladikproject.model.Client;
import com.backbase.vladikproject.model.Drag;
import com.backbase.vladikproject.model.Person;

import java.util.ArrayList;
import java.util.List;

public class AllMoneyJob {

    public void execute (TextView resultTextView){
        Client person1 = new Client(7,"Oleg", 45, 3800);
        Client person2 = new Client(8,"Vladik", 10, 5);
        Client person3 = new Client(9,"Olexa",  65,  300);
        Client person4 = new Client(10,"Natalia", 36, 2800);


        List<Client> family = new ArrayList<>();

        family.add(person1);
        family.add(person2);
        family.add(person3);
        family.add(person4);

        int allMoney = 0;
        for(Client eachPerson : family ){
            int eachMoney = eachPerson.getMoney();
            allMoney = allMoney + eachMoney;

        }
        System.out.println("All Money of our Family = "+allMoney);
        resultTextView.setText("All Money of our Family = "+allMoney);

        Drag drag1 = new Drag(1,"ketanov",80);

        drag1.setNarckotick(true);



    }




}


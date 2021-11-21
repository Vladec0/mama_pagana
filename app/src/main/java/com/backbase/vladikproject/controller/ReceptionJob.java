package com.backbase.vladikproject.controller;

import com.backbase.vladikproject.model.Animal;
import com.backbase.vladikproject.model.Cat;
import com.backbase.vladikproject.model.Client;
import com.backbase.vladikproject.model.Doctor;
import com.backbase.vladikproject.model.Dog;
import com.backbase.vladikproject.model.Drag;
import com.backbase.vladikproject.model.Elephant;
import com.backbase.vladikproject.model.Mouse;
import com.backbase.vladikproject.model.Reception;

import java.util.ArrayList;
import java.util.List;

public class ReceptionJob {


    public void  execute(){

        Client client1 = new Client(1,"Boris Ivanovich Zelensky", 78, 1000);

        Doctor doctorOleh =  new Doctor(2, "Oleh Vasilovich Kotetsky", 41 );

        Drag drag1 = new Drag(10,"ketanov",80);
        Drag drag2 = new Drag(20,"aktivovane vogilia",30);
        Drag drag3 = new Drag(30,"enterosgel",110);
        Drag drag4 = new Drag(40,"zelenka",15);
        Drag drag5 = new Drag(50,"spasmolgin",45);

        List<Drag> drags = new ArrayList<>(5);
        drags.add(drag1);
        drags.add(drag2);
        drags.add(drag3);
        drags.add(drag4);
        drags.add(drag5);

        Reception reseption5 = new Reception(doctorOleh,client1,drags);


        Dog alma = new Dog("Alfa");
        Elephant hrich = new Elephant("Hrich");
        Mouse maus = new Mouse("Maus");
        Cat hallcat = new Cat("hall cat");

        List<Animal> animals = new ArrayList<>();
        animals.add(alma);
        animals.add(hrich);
        animals.add(maus);
        animals.add(hallcat);

        List<Cat> catList = new ArrayList<>();
        catList.add(hallcat);

        Cat heavenCat = new Cat("havencat");
        Dog heavenDog = new Dog("havendog");
        Elephant theBiggestElephant = new Elephant("The Biggest Elephant");




        
    }

}


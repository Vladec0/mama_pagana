package com.backbase.vladikproject.controller;

import com.backbase.vladikproject.model.Animal;
import com.backbase.vladikproject.model.Cat;
import com.backbase.vladikproject.model.Client;
import com.backbase.vladikproject.model.Dog;
import com.backbase.vladikproject.model.Inhabitans;
import com.backbase.vladikproject.model.Mouse;

import java.util.ArrayList;
import java.util.List;

public class ClientAnimalJob {

    public void execute () {

        Client client1 = new Client(1, "Kolan", 100, 65, 30000);
        Client client2 = new Client(2, "Dima", 80, 120, 20000);
        Client client3 = new Client(3, "Petya", 70, 90, 10000);

        Animal animal1 = new Mouse("Serushka", 56);
        Animal animal2 = new Cat("Mavka", 34);
        Animal animal3 = new Dog("Buldog", 12);

        List<Client> clients = new ArrayList<>();

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        List<Animal> animals = new ArrayList<>();

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

        List<Inhabitans> inhebitans = new ArrayList<>();
        inhebitans.add(client1);
        inhebitans.add(animal2);
        inhebitans.add(animal1);
        inhebitans.add(client3);
        inhebitans.add(animal3);
        inhebitans.add(client2);

        System.out.println("-------------------------------------------------");

        List<Client> extractedClients = new ArrayList<>();

        for (Inhabitans eachInhebitans : inhebitans ) {

          if (eachInhebitans instanceof Client){
              extractedClients.add((Client) eachInhebitans);
              System.out.println("extracted client name is " + ((Client) eachInhebitans).getName());
          }
        }

    }
}

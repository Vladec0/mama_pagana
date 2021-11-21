package com.backbase.vladikproject.controller;

import com.backbase.vladikproject.model.Client;
import com.backbase.vladikproject.model.Order;
import com.backbase.vladikproject.model.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderJob {

    public void execute() {
        Client client = new Client(1, "Ivan Pertovich", 24, 5000);

        Product product1 = new Product(11, "VideoCard Radeon 3600", 100);
        Product product2 = new Product(12, "Corpus Logic Power", 60);
        Product product3 = new Product(13, "Mouse Logitech", 50);
        Product product4 = new Product(14, "SSD HyperX 256Gb", 67);
        Product product5 = new Product(15, "Monitor Philips 22 PH3433", 131);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        Order order = new Order(1, "23Aug01",productList );

        int cost = 0;

        for (Product eachProduct : productList){
                cost = cost + eachProduct.getPrice();
        }

        int money = client.getMoney();

        if (money > cost ) {
            System.out.println("Your Order CONFIRMED !!! Cost = " + cost);
        }else {
            System.out.println("Not enought money !!! You have only " + money);
        }

    }

}

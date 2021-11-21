package com.backbase.vladikproject.controller;

import com.backbase.vladikproject.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductPriceJob {

    public void execute() {
        Product product1 = new Product(1, "Iphone 12 Mini", 1000);
        Product product2 = new Product(2, "Mack Book Pro ", 2500);
        Product product3 = new Product(3, "Iphone 13 Mini", 1200);
        Product product4 = new Product(4, "MacBook 13 Pro Max", 1800);
        Product product5 = new Product(5, "MacBook 16 Retina Pro Max", 2600);

        List<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);

        List<Product> selected = new ArrayList<>();
        for (Product eachProduct : list) {
            int eachPrice = eachProduct.getPrice();
            if (eachPrice >= 1200 && eachPrice <= 1800) {
                selected.add(eachProduct);
            }
        }
    }
}

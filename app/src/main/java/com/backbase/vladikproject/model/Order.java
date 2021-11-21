package com.backbase.vladikproject.model;

import java.util.List;

public class Order {

    private int id;
    private String name;
    private List<Product> products;

    public Order(int id, String name, List<Product> products) {
    this.id = id;
    this.name = name;
    this.products = products;
    }
}

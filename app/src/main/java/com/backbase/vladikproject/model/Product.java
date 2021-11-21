package com.backbase.vladikproject.model;

public class Product {

    private int id;
    private String name;
    private String articular;
    private int price;

    public Product(int id, String name,int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getName (){
        return name;
    }


}

package com.backbase.vladikproject.controller;


import com.backbase.vladikproject.model.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class PerimeterJob {

    public void execute(List<Rectangle> someRectangleList){

        System.out.println("Start job ------- !!!!");
        Rectangle rectangle1 = new Rectangle(3,5);
        Rectangle rectangle2 = new Rectangle(6,5);
        Rectangle rectangle3 = new Rectangle(10,5);


        int c = 123;


        List<Rectangle>  rectangles = new ArrayList<>();
        rectangles.add(rectangle1);
        rectangles.add(rectangle2);
        rectangles.add(rectangle3);

        for (Rectangle eachRectangle : rectangles){

            int p = eachRectangle.calculatePerimeter();
        }
    }

}


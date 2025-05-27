package com.pluralsight.order;

import java.util.List;

public class Drink{
    private int size;
    private String name;

    public Drink(String name, int size) {
        this.name = name;
        this.size = size;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }


    public static void getPrice() {
        System.out.println("get DrinkPrice");
    }
}

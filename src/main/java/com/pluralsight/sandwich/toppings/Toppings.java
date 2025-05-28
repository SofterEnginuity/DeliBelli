package com.pluralsight.sandwich.toppings;

import com.pluralsight.sandwich.Sandwich;

public abstract class Toppings {
    private String name;

    public Toppings(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public abstract double getPrice( int size);

    @Override
    public String toString() {
        return "Toppings:" + name + '\'';
    }
}

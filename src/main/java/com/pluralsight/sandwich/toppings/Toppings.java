package com.pluralsight.sandwich.toppings;

public abstract class Toppings {
    private String name;

    public Toppings(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public abstract double getPrice( int size);

    @Override
    public String toString() {
        return "Toppings:" + name + '\'';
    }
}

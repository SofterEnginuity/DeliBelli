package com.pluralsight.sandwich.toppings;

import com.pluralsight.sandwich.Sandwich;

public abstract class Toppings extends Sandwich {
    private String name;

    public Toppings(String bread, int size, boolean toasted, boolean extraMeat, boolean extraCheese, String name) {
        super(bread, size, toasted, extraMeat, extraCheese);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public abstract double getPrice( int size);

}

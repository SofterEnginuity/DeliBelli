package com.pluralsight.sandwich.toppings;

public class Regular extends Toppings {
    public Regular(String name) {
        super(name);
    }

    @Override
    public double getPrice(int size) {
        return 0;
    }
}

package com.pluralsight.sandwich.toppings;

public class Regular extends Toppings {
    public Regular(String bread, int size, boolean toasted, boolean extraMeat, boolean extraCheese, String name) {
        super(bread, size, toasted, extraMeat, extraCheese, name);
    }

    @Override
    public double getPrice(int size) {
        return 0;
    }
}

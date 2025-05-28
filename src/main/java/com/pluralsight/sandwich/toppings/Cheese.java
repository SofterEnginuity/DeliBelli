package com.pluralsight.sandwich.toppings;

public class Cheese extends Toppings{

    public Cheese(String bread, int size, boolean toasted, boolean extraMeat, boolean extraCheese, String name) {
        super(bread, size, toasted, extraMeat, extraCheese, name);
    }

    @Override
    public double getPrice(int size) {
        double cheesePrice = 0;
        if (size == 4) {
            cheesePrice = .75;
        } else if (size == 8) {
            cheesePrice = 1.50;
        } else if (size == 12) {
            cheesePrice = 2.25;
        }return cheesePrice;
    }
}

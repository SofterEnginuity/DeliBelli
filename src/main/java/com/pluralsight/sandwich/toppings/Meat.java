package com.pluralsight.sandwich.toppings;

public class Meat extends Toppings{
    public Meat(String bread, int size, boolean toasted, boolean extraMeat, boolean extraCheese, String name) {
        super(bread, size, toasted, extraMeat, extraCheese, name);
    }

    @Override
    public double getPrice(int size) {
        double meatPrice = 0;
        if (size == 4) {
            meatPrice = 1.00;
        } else if (size == 8) {
            meatPrice = 2.00;
        } else if (size == 12) {
            meatPrice = 3.00;
        }return meatPrice;
    }
}

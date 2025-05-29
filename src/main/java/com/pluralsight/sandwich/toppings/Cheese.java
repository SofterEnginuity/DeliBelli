package com.pluralsight.sandwich.toppings;

import java.util.Arrays;

public class Cheese extends Toppings{

    public Cheese(String[] name) {
        super(Arrays.toString(name));
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

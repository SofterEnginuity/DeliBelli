package com.pluralsight.sandwich.toppings;

import java.util.Arrays;

public class Sauce extends Toppings {
    public Sauce(String[] name) {
        super(Arrays.toString(name));
    }

    @Override
    public double getPrice(int size) {
        return 0;
    }
}

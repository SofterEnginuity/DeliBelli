package com.pluralsight.sandwich.toppings;

import java.util.Arrays;

public class Meat extends Toppings{
    public Meat(String[] name) {
        super(Arrays.toString(name));
    }

    @Override
    public double getPrice(int size) {
        double price = 0;
        double  meatPrice = price;
        if (size == 4) {
           meatPrice = 1.00;
        } else if (size == 8) {
            meatPrice = 2.00;
        } else if (size == 12) {
            meatPrice = 3.00;
        }return meatPrice;
    }
}

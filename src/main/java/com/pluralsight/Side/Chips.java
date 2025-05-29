package com.pluralsight.Side;


public class Chips {
    private String brand;

    public Chips(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public double getChipPrice() {
        return 1.50;
    }
    @Override
    public String toString() {
        return brand +
                " - " + getChipPrice();
    }
}

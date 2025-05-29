package com.pluralsight.Side;

//import com.pluralsight.Sandwich.Sandwich;

public class Chips {
    private String brand;

    public Chips(String brand) {
        this.brand = brand;
    }
    //does this need to be a super or not?? bc its breaks Home:57

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

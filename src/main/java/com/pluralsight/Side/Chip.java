package com.pluralsight.Side;

//import com.pluralsight.Sandwich.Sandwich;

public class Chip {
private String brand;

    public Chip(String brand) {
        this.brand = brand;
    }
    //does this need to be a super or not?? bc its breaks Home:57

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public static void getPrice() {
        System.out.println("get ChipsPrice");
    }
}

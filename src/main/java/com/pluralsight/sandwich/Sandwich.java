package com.pluralsight.sandwich;

import java.util.ArrayList;
import java.util.List;
//import java.util.List;

public class Sandwich {
private String bread;
private int size;
private boolean toasted;
private boolean extraMeat;
private boolean extraCheese;

//private List<Topping> toppings;

    public Sandwich(String bread, int size, boolean toasted, boolean extraMeat, boolean extraCheese) {
        this.bread = bread;
        this.size = size;
        this.toasted = toasted;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
//        this.toppings = toppings; // List<Topping> toppings
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

//    public List<Topping> getToppings() {
//        return toppings;
//    }
//
//    public void setToppings(List<Topping> toppings) {
//        this.toppings = toppings;
//    }
}

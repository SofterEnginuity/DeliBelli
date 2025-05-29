package com.pluralsight.sandwich;

import com.pluralsight.sandwich.toppings.Meat;
import com.pluralsight.sandwich.toppings.Toppings;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
private String bread;
private int size;
private boolean toasted;
private boolean extraMeat;
private boolean extraCheese;

private List<Toppings> toppings;



    public Sandwich(String bread, int size, boolean toasted) {
        this.bread = bread;
        this.size = size;
        this.toasted = toasted;
        this.toppings  = new ArrayList<>();

    }



    public List<Toppings> getToppings() {
        return toppings;
    }
    public String getToppingsList() {
        String result = "";
        for (Toppings topping : toppings) {
            if (!result.isEmpty()) {
                result += ", ";
            }
            result += topping.getName();
        }
        return result;
    }
//    public List<String> getToppingsList() {
//        List<String> result = new ArrayList<>();
//        for (Toppings topping : toppings) {
//            result.add(topping.getName());
//        }
//        return result;
//    }

    public void addTopping(Toppings topping) {
        toppings.add(topping);
    }
    public double fullSandwichPrice() {
        double basePrice = 0;
        if (size == 4) {
            basePrice = 5.00;
        } else if (size == 8) {
            basePrice = 7.00;
        } else if (size == 12) {
            basePrice = 8.50;
        }

        double toppingPrice = 0;
        for (Toppings topping : toppings) {
            toppingPrice += topping.getPrice(size);
        }

        if (extraMeat) {
            if (size == 4) toppingPrice += 1.00;
            else if (size == 8) toppingPrice += 2.00;
            else if (size == 12) toppingPrice += 3.00;
        }

        if (extraCheese) {
            if (size == 4) toppingPrice += 0.75;
            else if (size == 8) toppingPrice += 1.50;
            else if (size == 12) toppingPrice += 2.25;
        }
       double sandwichPrice = basePrice + toppingPrice;
        return sandwichPrice;
   }

    @Override
    public String toString() {
        String result = "";
        result += "Bread: " + bread + "\n";
        result += "Size: " + size + "\n";
        result += "Toasted: " + (toasted ? "Yes" : "No") + "\n";
        result += "Toppings: " + getToppingsList() + "\n";
//        result += "Meats: " + getMeatList() + "\n";
        result += "Extra Meat: " + (extraMeat ? "Yes" : "No") + "\n";
//        result += "Cheese: " + getCheeseList() + "\n";
        result += "Extra Cheese: " + (extraCheese ? "Yes" : "No") + "\n";
        result += String.format("Price: $%.2f", fullSandwichPrice());
        return result;
    }
}

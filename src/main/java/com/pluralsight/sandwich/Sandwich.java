package com.pluralsight.sandwich;

import com.pluralsight.Side.Chips;
import com.pluralsight.Side.Drink;
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

    public Sandwich(String bread, int size, boolean toasted, boolean extraMeat, boolean extraCheese) {
        this.bread = bread;
        this.size = size;
        this.toasted = toasted;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
        this.toppings  = new ArrayList<>();

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
    public List<Toppings> getToppings() {
return toppings;
    }
//Potato Sensei helping me to print list in UI
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


    //need to actually add to sandwich
    public void addTopping(Toppings topping) {
        toppings.add(topping);
    }
//
   public double calculatePrice(double price){
//    double price = Toppings.getPrice();
 //how do iu access the prices???
     return price;
   }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", size=" + size +
                ", toasted=" + toasted +
                ", extraMeat=" + extraMeat +
                ", extraCheese=" + extraCheese +
                ", toppings=" + toppings +
                '}';
    }
}

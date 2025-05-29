package com.pluralsight.Side;

public class Drink{
    private int size;
    private String name;

    public Drink(String name, int size) {
        this.name = name;
        this.size = size;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }


    public double getDrinkPrice() {
       double drinkPrice = 0;
       if(size == 1){
           drinkPrice = 2.00;
        } else if (size==2) {
           drinkPrice = 2.50;
        }else if(size == 3 ){
           drinkPrice = 3.00;
        }
       return drinkPrice;
    }
    @Override
    public String toString() {
        return  name +
                " - " + getDrinkPrice();
    }
}

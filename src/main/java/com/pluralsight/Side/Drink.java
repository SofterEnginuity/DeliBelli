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
        if(size == 1){
           return 2.00;
        } else if (size==2) {
            return 2.50;
        }else if(size == 3 ){
            return 3.00;
        }else{
            System.out.println("Please make a valid selection.");
        }
        return 0;
    }
}

package com.pluralsight.OrderManagement;

import com.pluralsight.Side.Chips;
import com.pluralsight.Side.Drink;
import com.pluralsight.sandwich.Sandwich;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;


    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips =new ArrayList<>();
    }

    public List<Sandwich> getSandwich() {
            return sandwiches;
    }
    public void setSandwiches(List<Sandwich> sandwiches) {
            this.sandwiches = sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }

    public void addSandwich(Sandwich sandwich){
        sandwiches.add(sandwich);
    }
    public void addDrink(Drink drink){
        drinks.add(drink);
    }
    public void addChips(Chips chip){
        chips.add(chip);
    }

    public double totalPrice(){
//return  getDrinkPrice() + getChipsPrice();
        //do a for loop for those
//get price of chips and drink to start and test
        double sandwichPrice
        if (sandwichSize == 4) {
            sandwichPrice = 1.00;
        } else if (sandwichSize == 8) {
            sandwichPrice = 2.00;
        } else if (sandwichSize == 12) {
            sandwichPrice = 3.00;
        }

        return 0;
 }

    public void getOrderDetails(){
        System.out.println(drinks);
        System.out.println(chips);
    }

//    checkOut();
//    printReceipt();
}

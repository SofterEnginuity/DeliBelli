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
        double basePrice = 0;

        for (Sandwich sandwich : sandwiches) {
            basePrice += sandwich.fullSandwichPrice(sandwich.getSize());
        }
        for (Drink drink : drinks) {
            basePrice += drink.getDrinkPrice();
        }
        for (Chips chip : chips) {
            basePrice += chip.getChipPrice();
        }
        return basePrice;

 }

    public void getOrderDetails(){
        for (Sandwich sandwich : sandwiches) {
            System.out.println(sandwich);
            System.out.println(sandwich.fullSandwichPrice(sandwich.getSize()));
        }
        for (Drink drink : drinks) {
            System.out.println(  drink.getName() + " - " + drink.getDrinkPrice());
        }
        for (Chips chip : chips) {
            System.out.println(chip.getBrand() + " - " + chip.getChipPrice());
        }

        System.out.println("Total:" + totalPrice());

    }

//    printReceipt();


    @Override
    public String toString() {
        return "Order:\n" +
                "Sandwiches:" + sandwiches +
                ", Drinks:" + drinks +
                ", Chips:" + chips +
                '}';
    }
}

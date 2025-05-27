package com.pluralsight.OrderManagement;

import com.pluralsight.Side.Chips;
import com.pluralsight.Side.Drink;

import java.util.List;

public class Order {

    //    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;
    //
    public Order(List<Drink> drinks, List<Chips> chips) {
//            List<Sandwich> sandwiches,
//            this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    //    public List<Sandwich> getSandwiches() {
    //        return sandwiches;
    //    }
    //
    //    public void setSandwiches(List<Sandwich> sandwiches) {
    //        this.sandwiches = sandwiches;
    //    }

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

    public void addDrink(Drink drink){
        drinks.add(drink);
    }
    public void addChips(Chips chip){
        chips.add(chip);
    }

    public void totalPrice(){
//return  getDrinkPrice() + getChipsPrice();
//get price of chips and drink to start and test
 }

    public void getOrderDetails(){
        System.out.println(drinks);
        System.out.println(chips);
    }
}
